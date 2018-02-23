<%--
  Created by IntelliJ IDEA.
  User: Ming
  Date: 2018/2/12
  Time: 22:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="common/head.jsp"%>
    <title>订单订单页面</title>
    <style>
        tr{
            height: 60px;
        }
    </style>
</head>

<body>
<!--表单弹出层-->
<div id="win" class="easyui-window" title="订单" style="width:600px;height:460px"
     data-options="iconCls:'icon-edit',modal:true,closed:true">
    <div align="center" style="padding-top: 20px">
        <form id = "editForm"  method = "post" enctype="multipart/form-data">
            <table >
                <!--提交修改的时候要传入-->
                <input type="hidden" name = "oid" id = "oid">
                <input type="hidden" name = "oBorrowTime" id = "oBorrowTime">
                <input type="hidden" name = "oCash" id = "oCash">
                <input type="hidden"  id = "h_oSno" name = "oSno">
                <input type="hidden"  id = "h_oBid" name = "oBid">
                <tr class="mTr">
                    <td>学号：</td><td><input id="oSno" data-options="required:true,validType:'length[0,30]'" class="easyui-validatebox" type ="text" name ="oSno" /></td>
                </tr>
                <tr class="mTr">
                    <td>单车号：</td><td><input id="oBid" data-options="required:true,validType:'length[0,30]'" class="easyui-validatebox" type ="text" name ="oBid" /></td>
                </tr>
                <tr class="mTr">
                    <td>目前状态：</td>
                    <td>
                        <select id="oState" class="easyui-combobox" data-options="editable:false,required:true"  name="oState" style="width:220px;">
                            <option value="归还,单车完好">归还,单车完好</option>
                            <option value="归还,单车需维修">归还,单车需维修</option>
                            <option value="归还,单车已报废">归还,单车已报废</option>
                        </select>
                    </td>
                </tr>
                <tr class="mTr">
                    <td>备注：</td><td><textarea name="oComment" style="width: 220px;height:100px"></textarea></td>
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
    <a id = "addBtn" href="javascript:void(0);" class="easyui-linkbutton" data-options="text:'添加订单',iconCls:'icon-add',plain:true"> </a>
    <a id = "updateBtn" href="javascript:void(0);" class="easyui-linkbutton" data-options="text:'归还单车',iconCls:'icon-edit',plain:true"> </a>
    <a id = "removeBtn" href="javascript:void(0);" class="easyui-linkbutton" data-options="text:'移除订单',iconCls:'icon-remove',plain:true"> </a>
</div>
<!--订单表格-->
<table id="dg"></table>
</body>
<script type="text/javascript">
    $(function () {

        $('#dg').datagrid({
            url:'orders/showAll',
            columns:[[
                {field:'oid',title:'订单号',width:50,align:'center'},
                {field:'oSno',title:'学生学号',width:50,align:'center'},
                {field:'oBid',title:'单车号',width:50,align:'center'},
                {field:'oCash',title:'单车押金(元)',width:50,align:'center'},
                {field:'oRealRent',title:'实付租金',width:50,align:'center'},
                {field:'oState',title:'目前状态',width:50,align:'center',formatter: function(value,row,index){
                    if(value == "归还,单车完好")  return '<font color="green">'+value+'</font>';
                    return '<font color="red">'+value+'</font>';

                }    },
                {field:'oBorrowTime',title:'借车时间',width:80,align:'center'},
                {field:'oReturnTime',title:'还车时间',width:80,align:'center'},
                {field:'oComment',title:'备注',width:100,align:'center'}
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

        //添加订单按钮 显示编辑订单窗口
        $("#addBtn").click(function () {
            $("#editForm").form("clear");
            //hidden的属性全部要清空才能add一个全新的
            $("#oid").val("");
            $("#oBorrowTime").val("");
            $("#oCash").val("");
            //不能设置订单的状态 (默认为未归还)
            $('#oState').combobox("disable");
            $('#oSno').validatebox("enable");
            $('#oBid').validatebox("enable");
            $('#h_oSno').attr("disabled","true");
            $('#h_oBid').attr("disabled","true");
            $("#win").window("open");
        });

        //修改订单按钮 显示编辑订单窗口
        $("#updateBtn").click(function () {
            var orders = $('#dg').datagrid('getSelected');
            if(!orders){
                $.messager.alert('错误提醒','请选择一个订单！','info');
                return false;
            }
            if(orders.oState != "未归还"){
                $.messager.alert('错误提醒','请选择一个未归还的订单！','error');
                return false;
            }

            $.messager.confirm('提醒','注意！完好单车退回押金,需要维修单车只退押金50%,报废单车押金没得退回!',function(r){
                if (r){
                    $("#editForm").form("load","orders/loadForm?oid="+orders.oid);
                    $('#oState').combobox("enable");
                    $('#oSno').validatebox("disable");
                    $('#oBid').validatebox("disable");
                    $('#h_oSno').removeAttr("disabled");
                    $('#h_oBid').removeAttr("disabled");
                    $("#win").window("open");
                }
            });
        });

        //点击弹框确认
        $("#submitBtn").click(function () {
            $('#editForm').form('submit', {
                url:"orders/addOrUpdate",
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

        //删除订单
        $('#removeBtn').bind('click', function(){
            //拿到一个json的数组对象
            var orders = $('#dg').datagrid('getSelected');
            if(!orders || orders.length == 0){
                $.messager.alert('错误提醒','请选择一个订单！','info');
                return false;
            }
            if(orders.oState != "未归还"){
                $.messager.alert('错误提醒','请选择一个未归还的订单！','error');
                return false;
            }
            $.messager.confirm('确认','您确认想删除该订单吗？',function(r){
                if (r){
                    $.post('orders/remove',{"oid":orders.oid,"oBid":orders.oBid,"oState":orders.oState},function (data) {
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
            });
        });

    });


</script>
</html>