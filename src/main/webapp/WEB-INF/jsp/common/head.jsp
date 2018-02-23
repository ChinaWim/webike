<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
    String basePath = request.getScheme()+"://"+
            request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/";

%>
<meta charset="UTF-8">
<base href="<%=basePath%>" >
<script src="easyui/jquery.min.js"></script>
<script src="easyui/jquery.easyui.min.js"></script>
<script src="easyui/locale/easyui-lang-zh_CN.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/datagrid-filter.js"></script>
<script src="js/utils.js"></script>
<link href="css/bootstrap.min.css" rel="stylesheet">
<link id = "styleId" href="easyui/themes/gray/easyui.css" rel="stylesheet">
<link href="easyui/themes/icon.css" rel="stylesheet">
