<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import="org.apache.shiro.web.filter.authc.FormAuthenticationFilter"%>
<%@ page import="org.apache.shiro.authc.ExcessiveAttemptsException"%>
<%@ page import="org.apache.shiro.authc.IncorrectCredentialsException"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html;charset=utf-8" />
<meta http-equiv="Cache-Control" content="no-store" />
<meta http-equiv="Pragma" content="no-cache" />
<meta http-equiv="Expires" content="0" />

<link type="image/x-icon" href="${ctx}/static/images/favicon.ico" rel="shortcut icon">
    <title>管理中心</title>
   <script type="text/javascript">
	$(document).ready(function() {
		$("#account-tab").addClass("active");
		$("#account-tab").addClass("open");
		$("#account").removeClass("closed");
	});
	</script>
</head>

<body>
<div style="width:200px;margin:0 auto;">
<p style="margin-top:60px">
<a class="btn btn-large btn-primary" href="${ctx}/admin/profile">修改密码</a>
</p>
<p>
<a class="btn btn-large" href="${ctx}/admin/user">用户管理</a>
</p>
<p>
<a class="btn btn-large" href="${ctx}/admin/admin">管理员管理</a>
</p>
</div>
</body>
</html>
