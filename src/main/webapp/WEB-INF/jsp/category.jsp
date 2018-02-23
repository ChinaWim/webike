<%--
  Created by IntelliJ IDEA.
  User: Ming
  Date: 2018/2/11
  Time: 20:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="common/head.jsp"%>
    <title>分类管理页面</title>
    <style>
        tr{
            height: 50px;
        }
    </style>
</head>

<body>

<!--表单弹出层-->
<div id="win" class="easyui-window" title="分类" style="width:600px;height:460px"
     data-options="iconCls:'icon-edit',modal:true,closed:true">
    <div align="center" style="padding-top: 20px">
        <form id = "editForm"  method = "post" enctype="multipart/form-data">
            <table >
                <input type="hidden" name = "cid" id = "cid">
                <input type="hidden" name = "cRemain" id = "cRemain">
                <tr>
                    <td>分类名：</td><td><input type ="text" name ="cName" data-options="required:true," class="easyui-validatebox" /></td>
                </tr>
                <tr>
                    <td>押金(元)：</td><td> <input type="text" class="easyui-numberbox" name="cCash" data-options="min:50,precision:1,required:true"/></td>
                </tr>
                <tr>
                    <td>租金(元/小时)：</td><td> <input type="text" class="easyui-numberbox" name="cRent" data-options="min:0,precision:1,required:true"/></td>
                </tr>
                <tr>
                    <td>采购单价(元)：</td><td> <input type="text" class="easyui-numberbox" name="cPrice" data-options="min:0,precision:1,required:true"/></td>
                </tr>
                <tr>
                    <td>备注：</td><td><textarea name = "cComment" style="width: 220px;height: 80px" ></textarea></td>
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

    <a id = "addBtn" href="javascript:void(0);" class="easyui-linkbutton" data-options="text:'添加分类',iconCls:'icon-add',plain:true"> </a>
    <a id = "updateBtn" href="javascript:void(0);" class="easyui-linkbutton" data-options="text:'修改分类',iconCls:'icon-edit',plain:true"> </a>
    <a id = "removeBtn" href="javascript:void(0);" class="easyui-linkbutton" data-options="text:'移除分类',iconCls:'icon-remove',plain:true"> </a>
</div>
<!--分类表格-->
<table id="dg"></table>

</body>
<script type="text/javascript">
    $(function () {

        $('#dg').datagrid({
            url:'category/showAll',
            columns:[[
                {field:'cid',title:'分类号',width:100,align:'center'},
                {field:'cName',title:'分类名',width:100,align:'center'},
                {field:'cRemain',title:'剩余量',width:50,align:'center'},
                {field:'cCash',title:'押金(元)',width:100,align:'center'},
                {field:'cRent',title:'租金(元/小时)',width:100,align:'center'},
                {field:'cPrice',title:'采购单价(元)',width:100,align:'center'},
                {field:'cComment',title:'备注',width:100,align:'center'},
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

        //点击添加分类按钮 显示编辑分类窗口
        $("#addBtn").click(function () {
            $("#editForm").form("clear");
            //hidden的属性全部要清空才能add一个全新的
            $("#cid").val("");
            $("#cRemain").val("");
            $("#win").window("open");
        });
        //点击修改分类按钮 显示编辑分类窗口
        $("#updateBtn").click(function () {
            var category = $('#dg').datagrid('getSelected');
            if(!category){
                $.messager.alert('错误提醒','请选择一个分类！','info');
                return false;
            }
            $("#editForm").form("load","category/loadForm?cid="+category.cid);

            $("#win").window("open");
        });


        //点击弹框确认
        $("#submitBtn").click(function () {
            $('#editForm').form('submit', {
                url:"category/addOrUpdate",
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

        //删除分类
        $('#removeBtn').bind('click', function(){
            var category = $('#dg').datagrid('getSelected');
            if(!category){
                $.messager.alert('错误提醒','请选择一个分类！','info');
                return false;
            }
            $.messager.confirm('确认','删除后该分类的单车会全部删除!<br/>您确认想删除该分类吗？',function(r){
                if (r){
                    $.post('category/remove',{"cid":category.cid},function (data) {
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