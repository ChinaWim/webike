<%--
  Created by IntelliJ IDEA.
  User: Ming
  Date: 2018/2/12
  Time: 15:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="common/head.jsp"%>
    <title>用户管理页面</title>
    <style>
        tr{
            height: 40px;
        }
    </style>
</head>

<body>
<!--表单弹出层-->
<div id="win" class="easyui-window" title="用户" style="width:600px;height:460px"
     data-options="iconCls:'icon-edit',modal:true,closed:true">
    <div align="center" style="padding-top: 20px">
        <form id = "editForm"  method = "post" enctype="multipart/form-data">
            <table >
                <!--提交修改的时候要传入-->
                <input type="hidden" name = "aid" id = "aid">
                <input type="hidden" name = "aIcon" id = "aIcon">
                <tr class="mTr">
                    <td>图片</td>
                    <td>
                        <input class="easyui-filebox"  name="adminIcon" style="width:220px">
                    </td>

                </tr>
                <tr class="mTr">
                    <td>真实姓名：</td><td><input  data-options="required:true,validType:'length[0,20]' " class="easyui-validatebox" type ="text" name ="aRealName" /></td>
                </tr>
                <tr class="mTr">
                    <td>用户账号：</td><td><input  data-options="required:true,validType:'length[0,20]'" class="easyui-validatebox" type ="text" name ="aUsername" /></td>
                </tr>
                <tr class="mTr">
                    <td>用户密码：</td><td><input  data-options="required:true,validType:'length[0,64]'" class="easyui-validatebox" type ="password" name ="aPassword" /></td>
                </tr>
                <tr>
                    <td>用户电话：</td><td> <input type="text" class="easyui-numberbox" name="aPhone" data-options="min:1,precision:0,required:true,validType:'length[0,30]'"/></td>
                </tr>
                <tr class="mTr">
                    <td>服务点名称：</td>
                    <td>
                        <input id="aPid" class="easyui-combobox" name="aPid"
                               data-options="editable:false,valueField:'pid',textField:'pName',url:'admin/loadPlace',required:true" />
                    </td>
                </tr>
                <tr class="mTr">
                    <td>角色：</td><td><input type="radio" name = "aRole" value="超级管理员">超级管理员<input type="radio"  name = "aRole" value="普通管理员">普通管理员</td>
                </tr>
                <tr class="mTr">
                    <td>
                        <a id = "submitBtn" href="javascript:void(0);" class="easyui-linkbutton" data-options="text:'保存',iconCls:'icon-save',plain:true"/>
                        <a id = "resetBtn" href="javascript:void(0);" class="easyui-linkbutton" data-options="text:'重置',iconCls:'icon-save',plain:true"/>
                    </td>
                </tr>
            </table>
        </form>
    </div>
</div>



<!--操作表格-->
<div id="toolbar">
    <a id = "addBtn" href="javascript:void(0);" class="easyui-linkbutton" data-options="text:'添加',iconCls:'icon-add',plain:true"> </a>
    <a id = "updateBtn" href="javascript:void(0);" class="easyui-linkbutton" data-options="text:'修改用户',iconCls:'icon-edit',plain:true"> </a>
    <a id = "removeBtn" href="javascript:void(0);" class="easyui-linkbutton" data-options="text:'移除用户',iconCls:'icon-remove',plain:true"> </a>
</div>
<!--用户表格-->
<table id="dg"></table>
</body>
<script type="text/javascript">
    $(function () {

        $('#dg').datagrid({
            url:'admin/showAll',
            columns:[[
                {field:'aIcon',title:'头像',width:100,align:'center',formatter: function(value,row,index){
                    return '<img alt="未上传图片" align="center" height="60px"   src='+value+' />';
                }    },
                {field:'aid',title:'用户ID',width:50,align:'center'},
                {field:'aUsername',title:'用户账号',width:100,align:'center'},
                {field:'aRealName',title:'姓名',width:80,align:'center'},
                {field:'aPhone',title:'电话',width:100,align:'center'},
                {field:'aRole',title:'角色',width:50,align:'center'},
                {field:'aPid',title:'分配服务点ID',width:50,align:'center'},
                {field:'aLoginTime',title:'上次登陆时间',width:100,align:'center',formatter: function(value,row,index){
                    value = new Date(value).pattern("yyyy-MM-dd HH:mm:ss");
                    return value;
                }    },
                {field:'aComment',title:'备注',width:100,align:'center'},
            ]],
            singleSelect:true,
            fitColumns:true,
            pageNumber:1,
            pageSize:15,
            pageList:[10,15,20,25,30],
            pagination:true,
            toolbar:'#toolbar',
            fit:true

        });
        //启用过滤
        $('#dg').datagrid('enableFilter');
        //重置按钮
        $("#resetBtn").click(function () {
            $("#editForm").form("reset");
        });

        //添加用户按钮 显示编辑用户窗口
        $("#addBtn").click(function () {
            $("#editForm").form("clear");
            //hidden的属性全部要清空才能add一个全新的
            $("#aid").val("");
            $("#aIcon").val("");
            $("#win").window("open");
        });

        //更新用户按钮 显示编辑用户窗口
        $("#updateBtn").click(function () {

            var admin = $('#dg').datagrid('getSelected');
            if(!admin){
                $.messager.alert('错误提醒','请选择一个用户！','info');
                return false;
            }
            if(admin.aRole == '超级管理员'){
                $.messager.alert('错误提醒','你不可以选择超级管理员！','error');
                return false;
            }

            $("#editForm").form("load","admin/loadForm?username=" + admin.aUsername);
            $("#win").window("open");
        });


        //点击弹框确认
        $("#submitBtn").click(function () {
            $('#editForm').form('submit', {
                url:"admin/addOrUpdate",
                onSubmit: function(){
                    var isValid = $(this).form('validate'); //判断表单是否无效
                    return isValid;	// 返回false终止表单提交
                },
                success:function(data){
                    var data = eval('(' + data + ')');  // change the JSON string to javascript object
                    $.messager.show({
                        title:'消息',
                        msg:data.message,
                        timeout:3000,
                        showType:'slide',
                        height:120,
                        width:200
                    });
                    $('#dg').datagrid('reload');//刷新表格
                    $("#win").window("close");
                }
            });

        });

        //删除用户
        $('#removeBtn').bind('click', function(){
            //拿到一个json的数组对象
            var admin = $('#dg').datagrid('getSelected');
            if(!admin || admin.length == 0){
                $.messager.alert('错误提醒','请选择一个用户！','info');
                return false;
            }
            if(admin.aRole == '超级管理员'){
                $.messager.alert('错误提醒','你不可以选择超级管理员！','error');
                return false;
            }

            $.messager.confirm('确认','您确认想删除该用户吗？',function(r){
                if (r){
                    $.post('admin/remove',{"aid":admin.aid},function (data) {
                        $.messager.show({
                            title:'消息',
                            msg:data.message,
                            timeout:3000,
                            showType:'slide',
                            height:120,
                            width:200
                        });
                    });
                    $('#dg').datagrid('reload');//刷新表格
                }
            },'json');
        });

    });


</script>