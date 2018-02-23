<%--
  Created by IntelliJ IDEA.
  Date: 2018/2/9
  Time: 20:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="common/head.jsp"%>
    <title>修改密码</title>
</head>
<body>

<div style="margin: 60px 200px auto 300px;">

    <form id = "editForm"  method = "post" style="margin: 50px 0 0 100px">
        <table class="table table-bordered" style="width: 350px">
            <input type="hidden" name = "id">
            <tr style="height: 30px;">
                <td>原来密码：
                    <%--<input  data-options="required:true," class="easyui-validatebox" type ="password" name ="name" />--%>
                    <input  type="password" name="password" class="easyui-textbox" data-options="iconCls:'icon-lock',required:true" >
                </td>

            </tr>
            <tr style="height: 30px">
                <td>新的密码：
                    <input  id = "newPassword" type="password" name="newPassword" class="easyui-textbox" data-options="iconCls:'icon-lock',required:true" >
                </td>
            </tr>
            <tr style="height: 30px">
                <td>确认密码：
                    <input id = "newPassword2"  type="password" name="newPassword2"class="easyui-textbox" data-options="iconCls:'icon-lock',required:true" >
                </td>
            </tr>
            <tr>
                <td>
                    <a style="margin: 15px 20px 15px 65px" id = "submitBtn" href="javascript:void(0);" class="easyui-linkbutton" data-options="text:'保存',iconCls:'icon-save'"/>

                    <a  style="margin: 15px auto 15px 65px"id = "resetBtn" href="javascript:void(0);" class="easyui-linkbutton" data-options="text:'重置',iconCls:'icon-save'"/>
                </td>
            </tr>
        </table>
    </form>
</div>
</body>
<script type="text/javascript">

    function checkedPassword(){
        var newPassword = $("#newPassword").val();
        var newPassword2 = $("#newPassword2").val();
        if(newPassword == null || newPassword.length <= 0){
            $.messager.alert('输入错误','不能为空!','info');
            return false;
        }
        if(newPassword != newPassword2 ){
            $.messager.alert('输入错误','两次密码输入不一样','info');
            $("#newPassword2").val("");
            return false;
        }else{
            return true;
        }
    }
    $(function () {

        //重置表单
        $("#resetBtn").click(function(){
            $("#editForm").form("reset");
        });

        //提交表单
        $("#submitBtn").click(function () {

            $('#editForm').form('submit', {
                url:"admin/submitResetPwd",
                onSubmit: function(){
                    var isValid = $(this).form('validate'); //判断表单是否无效
                    isValid = checkedPassword(); //检查输入的两次密码是否一样
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
                }
            });
        });



    });

</script>
</html>
