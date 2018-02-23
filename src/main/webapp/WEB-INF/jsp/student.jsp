<%--
  Created by IntelliJ IDEA.
  User: Ming
  Date: 2018/2/9
  Time: 22:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="common/head.jsp"%>
    <title>学生管理页面</title>
    <style>
        tr{
            height: 30px;
        }
    </style>
</head>

<body>

<!--表单弹出层-->
<div id="win" class="easyui-window" title="学生" style="width:600px;height:460px"
     data-options="iconCls:'icon-edit',modal:true,closed:true">
    <div align="center" style="padding-top: 20px">
        <form id = "editForm"  method = "post" enctype="multipart/form-data">
            <table >
                <input type="hidden" name = "sid" id = "sid">
                <input type="hidden" name = "sIcon" id = "sIcon">
                <tr>
                    <%--<td>头像</td><td><input  style="font-size: 8px" type="file" name="studentIcon"></td>--%>
                    <td>头像</td><td><input class="easyui-filebox"  name="studentIcon" style="width:220px"></td>
                </tr>
                <tr>
                    <td>学号：</td><td><input  data-options="required:true,validType:'length[0,20]'" class="easyui-validatebox" type ="text" name ="sno" /></td>
                </tr>
                <tr>
                    <td>姓名：</td><td><input type ="text" name ="sName" data-options="required:true,validType:'length[0,20]'" class="easyui-validatebox" /></td>
                </tr>
                <tr>
                    <td>性别：</td><td>男&nbsp;&nbsp;<input type="radio"  value="男" name="sSex" style="margin-right:50px" checked >女&nbsp;&nbsp;<input   type="radio" value="女" name="sSex"></td>
                </tr>
                <tr>
                    <td>身份证：</td><td><input class="easyui-validatebox" data-options="validType:'length[0,30]'"  type ="text" name ="sIdCard" /></td>
                </tr>
                <tr>
                    <td>邮箱：</td><td>
                    <input name ="sEmail" class="easyui-validatebox" data-options="validType:'email'" />
                </td>
                </tr>
                <tr>
                    <td>电话：</td>
                    <td>
                        <input type="text" class="easyui-numberbox" name="sPhone" data-options="min:0,max:9999999999999,precision:0,validType:'length[0,30]'"/>
                    </td>
                </tr>
                <tr>
                    <td>院系：</td><td><input data-options="required:true,validType:'length[0,30]'"  class="easyui-validatebox" type ="text" name ="sDepartment" /></td>
                </tr>
                <tr>
                    <td>专业：</td><td><input data-options="required:true,validType:'length[0,30]'"  class="easyui-validatebox" type ="text" name ="sMajor" /></td>
                </tr>
                <tr>
                    <td>备注：</td><td><textarea name = "sComment" style="width: 220px;height: 80px" ></textarea></td>
                </tr>
                <tr>
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

    <a id = "addBtn" href="javascript:void(0);" class="easyui-linkbutton" data-options="text:'添加学生',iconCls:'icon-add',plain:true"> </a>
    <a id = "updateBtn" href="javascript:void(0);" class="easyui-linkbutton" data-options="text:'修改学生',iconCls:'icon-edit',plain:true"> </a>
    <a id = "removeBtn" href="javascript:void(0);" class="easyui-linkbutton" data-options="text:'移除学生',iconCls:'icon-remove',plain:true"> </a>
</div>
<!--学生表格-->
<table id="dg"></table>

</body>
<script type="text/javascript">
    $(function () {

        $('#dg').datagrid({
            url:'student/showAll',
            columns:[[
                {field:'sIcon',title:'头像',width:100,align:'center',formatter: function(value,row,index){
                    return '<img alt="未上传头像"  align="center"  height="60px"  src='+value+' />';
                }    },
                {field:'sno',title:'学生号',width:100,align:'center'},
                {field:'sName',title:'学生名',width:100,align:'center'},
                {field:'sSex',title:'性别',width:50,align:'center'},
                {field:'sIdCard',title:'身份证',width:100,align:'center'},
                {field:'sEmail',title:'邮箱',width:100,align:'center'},
                {field:'sPhone',title:'电话',width:100,align:'center'},
                {field:'sDepartment',title:'院系',width:100,align:'center'},
                {field:'sMajor',title:'专业',width:100,align:'center'},
                {field:'sComment',title:'备注',width:100,align:'center'},
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

        //点击添加学生按钮 显示编辑学生窗口
        $("#addBtn").click(function () {
            $("#editForm").form("clear");
            //hidden的属性全部要清空才能add一个全新的
            $("#sid").val("");
            $("#sIcon").val("");
            $("#win").window("open");
        });
        //点击修改学生按钮 显示编辑学生窗口
        $("#updateBtn").click(function () {
            var student = $('#dg').datagrid('getSelected');
            if(!student){
                $.messager.alert('错误提醒','请选择一个学生！','info');
                return false;
            }
            $("#editForm").form("load","student/loadForm?sid="+student.sid);

            $("#win").window("open");
        });


        //点击弹框确认
        $("#submitBtn").click(function () {
            $('#editForm').form('submit', {
                url:"student/addOrUpdate",
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

        //删除学生
        $('#removeBtn').bind('click', function(){
            var student = $('#dg').datagrid('getSelected');
            if(!student){
                $.messager.alert('错误提醒','请选择一个学生！','info');
                return false;
            }
            $.messager.confirm('确认','您确认想删除该学生吗？',function(r){
                if (r){
                    $.post('student/remove',{"sid":student.sid},function (data) {
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
            },"application/json;charset=utf-8");
        });

    });

</script>
</html>