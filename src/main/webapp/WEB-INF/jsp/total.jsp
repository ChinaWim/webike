<%--
  Created by IntelliJ IDEA.
  Date: 2018/2/13
  Time: 22:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE>
<html>
<head>
    <%@include file="common/head.jsp"%>
    <base href="<%=basePath%>">
    <title>汇总页面</title>
    <style type="text/css">
        td{
            height: 50px;
        }
        tr{
            height: 80px;
        }
        *{
            margin: 0px;
            padding: 0px;
        }

    </style>
</head>
<body>
<div style="margin: 35px 0 0 180px">

    <table  class="table" style="width: 930px">

        <tr>
            <td >租金流水：</td><td><mark>${total.rentCount}</mark></td>
            <td>保有押金(元)：</td>
            <td><mark>${total.haveCash}</mark></td>
        </tr>
        <tr>
            <td>车辆总计：</td><td><mark>${total.totalBikeCount}</mark></td>
            <td>在库车辆：</td><td><mark>${total.inStoreBikeCount}</mark></td>
        </tr>
        <tr>
            <td>需要维修车辆：</td><td><mark>${total.repairBikeCount}</mark></td>
            <td>已报废车辆：</td><td><mark>${total.beakdownBikeCount}</mark></td>
        </tr>
        <tr>
            <td>学生人数：</td><td><mark>${total.totalStudentCount}</mark></td>
            <td>借车人次：</td><td><mark>${total.borrowedCount}</mark></td>
        </tr>
        <tr>
            <td>报废损失(元)：</td><td><mark>${total.beakdownMoney}</mark></td>
            <td>总盈利(元)：</td><td><font color="red">${total.profitMoney}</font></td>
        </tr>
    </table>
</div>

</body>
<script type="text/javascript">

</script>

</html>
