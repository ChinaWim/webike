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
    <title>单车管理页面</title>
    <style>
        .mTr{
            height: 40px;
        }
    </style>
</head>

<body>
<!--表单弹出层-->
<div id="win" class="easyui-window" title="单车" style="width:600px;height:460px"
     data-options="iconCls:'icon-edit',modal:true,closed:true">
    <div align="center" style="padding-top: 20px">
        <form id = "editForm"  method = "post" enctype="multipart/form-data">
            <table >
                <!--提交修改的时候要传入-->
                <input type="hidden" name = "bid" id = "bid">
                <input type="hidden" name = "bIcon" id = "bIcon">
                <tr class="mTr">
                    <td>图片</td>
                    <td>
                        <input class="easyui-filebox"  name="bikeIcon" style="width:220px">
                    </td>

                </tr>
                <tr class="mTr">
                    <td>车昵称：</td><td><input  data-options="required:true,validType:'length[0,20]'" class="easyui-validatebox" type ="text" name ="bName" /></td>
                </tr>
                <tr class="mTr">
                    <td>类别：</td>
                    <td>
                        <input id="bCid" class="easyui-combobox" name="bCid"
                               data-options="valueField:'cid',textField:'cName',url:'bike/loadCategory',required:true,editable:false" />
                    </td>
                </tr>
                <tr>
                    <td>数量：</td>
                    <td>
                        <input type="text" id = "bCount" class="easyui-numberbox" name="bCount" data-options="min:1,max:1000,precision:0,required:true"/>
                    </td>
                </tr>
                <tr class="mTr">
                    <td>目前状态：</td>
                    <td>
                        <select id="bState" class="easyui-combobox" data-options="required:true,editable:false "  name="bState" style="width:220px;">
                            <option value="未借" >未借</option>
                            <option value="已借">已借</option>
                            <option value="需维修">需维修</option>
                            <option value="报废">报废</option>
                        </select>
                    </td>
                </tr>
                <tr height="50px">
                    <!--此tr不能用css设置高度设置的话会破坏date的日期控件高度-->
                    <td>购入时间：</td><td><input data-options="editable:false" name="bInTime" id="bInTime"  type= "text" class= "easyui-datebox" required ="required"/></td>
                </tr>
                <tr class="mTr">
                    <td>备注：</td><td><textarea name="bComment" style="width: 220px;height:100px"></textarea></td>
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
    <a id = "updateBtn" href="javascript:void(0);" class="easyui-linkbutton" data-options="text:'修改单车',iconCls:'icon-edit',plain:true"> </a>
    <a id = "removeBtn" href="javascript:void(0);" class="easyui-linkbutton" data-options="text:'移除单车',iconCls:'icon-remove',plain:true"> </a>
</div>
<!--单车表格-->
<table id="dg"></table>
</body>
<script type="text/javascript">
    $(function () {

        $('#dg').datagrid({
            url:'bike/showAll',
            columns:[[
                {field:'bIcon',title:'图片',width:100,align:'center',formatter: function(value,row,index){
                    return '<img alt="未上传图片" align="center" height="60px"   src='+value+' />';
                }    },
                {field:'bid',title:'单车号',width:100,align:'center'},
                {field:'bName',title:'单车名',width:100,align:'center'},
                {field:'bCid',title:'单车类别',width:50,align:'center'},
                {field:'bInTime',title:'购入时间',width:100,align:'center'},
                {field:'bState',title:'目前状态',width:100,align:'center',formatter: function(value,row,index){
                    if(value == "未借")  return '<font color="green">'+value+'</font>';
                      return '<font color="red">'+value+'</font>';

                }    },
                {field:'bComment',title:'备注',width:100,align:'center'},
            ]],
            singleSelect:false,
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

        //添加单车按钮 显示编辑单车窗口
        $("#addBtn").click(function () {
            $("#editForm").form("clear");
            //hidden的属性全部要清空才能add一个全新的
            $("#bid").val("");
            $("#bIcon").val("");
            //不能设置单车的默认状态 (默认为未借)
            $('#bState').combobox("disable");
            $('#bCount').numberbox("enable");
            $("#win").window("open");
        });

        //更新单车按钮 显示编辑单车窗口
        $("#updateBtn").click(function () {

            var bike = $('#dg').datagrid('getSelected');
            if(!bike){
                $.messager.alert('错误提醒','请选择一个单车！','info');
                return false;
            }
            $("#editForm").form("load","bike/loadForm?bid="+bike.bid);
            $('#bState').combobox("enable");
            $('#bCount').numberbox("disable");
            $("#win").window("open");
        });


        //点击弹框确认
        $("#submitBtn").click(function () {
            $('#editForm').form('submit', {
                url:"bike/addOrUpdate",
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

        //删除单车
        $('#removeBtn').bind('click', function(){
            //拿到一个json的数组对象
            var bikes = $('#dg').datagrid('getSelections');
            if(!bikes || bikes.length == 0){
                $.messager.alert('错误提醒','请选择一个单车！','info');
                return false;
            }
            var bids = new Array();
            var cids = new Array();
            bids.push()
            for (var i = 0; i < bikes.length; i++) {
                bids.push(bikes[i].bid);
                cids.push(bikes[i].bCid);
            }
            bids.join(",");cids.join(",");

            $.messager.confirm('确认','您确认想删除该单车吗？',function(r){
                if (r){
                    $.post('bike/remove',{"bids":bids.toString(),"cids":cids.toString()},function (data) {
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