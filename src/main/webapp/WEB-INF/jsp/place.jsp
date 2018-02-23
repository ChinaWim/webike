<%--
  Created by IntelliJ IDEA.
  User: Ming
  Date: 2018/2/12
  Time: 21:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="common/head.jsp"%>
    <title>服务点管理页面</title>
    <style>
        tr{
            height: 50px;
        }
    </style>
</head>

<body>

<!--表单弹出层-->
<div id="win" class="easyui-window" title="服务点" style="width:600px;height:460px"
     data-options="iconCls:'icon-edit',modal:true,closed:true">
    <div align="center" style="padding-top: 20px">
        <form id = "editForm"  method = "post" enctype="multipart/form-data">
            <table >
                <input type="hidden" name = "pid" id = "pid">
                <tr>
                    <td>服务点名：</td><td><input type ="text" name ="pName" data-options="required:true,validType:'length[0,30]'" class="easyui-validatebox" /></td>
                </tr>
                <tr>
                    <td>地址：</td><td> <input type="text" data-options="required:true,validType:'length[0,150]'" class="easyui-validatebox" name="pAddress" /></td>
                </tr>
                <tr>
                    <td>服务电话：</td><td> <input type="text" class="easyui-numberbox" name="pPhone" data-options="min:1,precision:0,required:true,validType:'length[0,20]'"/></td>
                </tr>
                <tr>
                    <td>备注：</td><td><textarea name = "pComment" style="width: 220px;height: 80px" ></textarea></td>
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

    <a id = "addBtn" href="javascript:void(0);" class="easyui-linkbutton" data-options="text:'添加服务点',iconCls:'icon-add',plain:true"> </a>
    <a id = "updateBtn" href="javascript:void(0);" class="easyui-linkbutton" data-options="text:'修改服务点',iconCls:'icon-edit',plain:true"> </a>
    <a id = "removeBtn" href="javascript:void(0);" class="easyui-linkbutton" data-options="text:'移除服务点',iconCls:'icon-remove',plain:true"> </a>
</div>
<!--服务点表格-->
<table id="dg"></table>

</body>
<script type="text/javascript">
    $(function () {

        $('#dg').datagrid({
            url:'place/showAll',
            columns:[[
                {field:'pid',title:'服务点ID',width:100,align:'center'},
                {field:'pName',title:'服务点名称',width:100,align:'center'},
                {field:'pAddress',title:'地址',width:100,align:'center'},
                {field:'pPhone',title:'服务电话',width:100,align:'center'},
                {field:'pComment',title:'备注',width:100,align:'center'},
            ]],
            singleSelect:true,
            fitColumns:true,
            /*            pageNumber:1,
             pageSize:15,
             pageList:[10,15,20,25,30],
             pagination:false,*/
            toolbar:'#toolbar',
            fit:true

        });
        //启用过滤
        $('#dg').datagrid('enableFilter');
        //重置按钮
        $("#resetBtn").click(function () {
            $("#editForm").form("reset");
        });

        //点击添加服务点按钮 显示编辑服务点窗口
        $("#addBtn").click(function () {
            $("#editForm").form("clear");
            //hidden的属性全部要清空才能add一个全新的
            $("#pid").val("");
            $("#win").window("open");
        });
        //点击修改服务点按钮 显示编辑服务点窗口
        $("#updateBtn").click(function () {
            var place = $('#dg').datagrid('getSelected');
            if(!place){
                $.messager.alert('错误提醒','请选择一个服务点！','info');
                return false;
            }
            $("#editForm").form("load","place/loadForm?pid="+place.pid);

            $("#win").window("open");
        });


        //点击弹框确认
        $("#submitBtn").click(function () {
            $('#editForm').form('submit', {
                url:"place/addOrUpdate",
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

        //删除服务点
        $('#removeBtn').bind('click', function(){
            var place = $('#dg').datagrid('getSelected');
            if(!place){
                $.messager.alert('错误提醒','请选择一个服务点！','info');
                return false;
            }
            $.messager.confirm('确认','您确认想删除该服务点吗？',function(r){
                if (r){
                    $.post('place/remove',{"pid":place.pid},function (data) {
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
</html>