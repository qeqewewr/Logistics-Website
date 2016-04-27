<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import="org.apache.shiro.web.filter.authc.FormAuthenticationFilter"%>
<%@ page import="org.apache.shiro.authc.ExcessiveAttemptsException"%>
<%@ page import="org.apache.shiro.authc.IncorrectCredentialsException"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;charset=utf-8" />
<meta http-equiv="Cache-Control" content="no-store" />
<meta http-equiv="Pragma" content="no-cache" />
<meta http-equiv="Expires" content="0" />

<link type="image/x-icon" href="${ctx}/static/images/favicon.ico" rel="shortcut icon">
<link rel="stylesheet" href="${ctx}/static/neat/css/bootstrap.css">
<link rel="stylesheet" href="${ctx}/static/neat/css/jquery.fancybox.css">
<link rel="stylesheet" href="${ctx}/static/neat/css/login.css">

    <title>管理中心</title>
    

</head>

<body>

<body class="login_body">
	<div class="wrap">
	
		<h2>物流管理系统</h2>
		<h4>欢迎进入登录页</h4>
	<form id="loginForm" action="${ctx}/login" method="post" class="form-horizontal">
	<%
	String error = (String) request.getAttribute(FormAuthenticationFilter.DEFAULT_ERROR_KEY_ATTRIBUTE_NAME);
	if(error != null){
	%>
		<div class="alert alert-error">
			<strong>Error!</strong> 请输入正确的用户名密码！
		</div>
	<%
	}
	%>
		<div class="login">
			<div class="email">
				<label for="user">用户名</label>
				<div class="email-input">
				  <div class="control-group">
				    <div class="input-prepend">
				      <span class="add-on">
				       <i class="icon-user"></i>
				      </span>
				<input type="text" id="username" name="username"  value="${username}" class="input-medium required"/>
			 </div>
				   </div>
				  </div>
			</div>
			<div class="pw">
			<label for="pw">密码</label><div class="pw-input"><div class="control-group"><div class="input-prepend"><span class="add-on"><i class="icon-lock"></i></span>
				<input type="password" id="password" name="password" class="input-medium required"/>
		</div></div></div>
			</div>
			
			
		</div>
	
		<div class="submit">
			<button class="btn btn-red5">Login</button>
		</div>
		
	</form>
	<div class="social-shadow-hider"></div>
	</div>
	<script src="${ctx}/static/neat/js/jquery.js"></script>
<script src="${ctx}/static/neat/js/jquery.validate.min.js"></script>
<script src="${ctx}/static/neat/js/jquery.metadata.js"></script>
<script src="${ctx}/static/neat/js/error.js"></script>
</body>
</html>
