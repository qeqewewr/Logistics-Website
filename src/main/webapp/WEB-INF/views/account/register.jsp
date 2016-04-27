<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<html>
<head>
	<title>用户注册</title>
	
	<script>
		$(document).ready(function() {
			$("#account-tab").addClass("active");
			$("#account-tab").addClass("open");
			$("#account").removeClass("closed");
			
			
			//聚焦第一个输入框
			$("#name").focus();
			//为inputForm注册validate函数
			$("#inputForm").validate({
				rules: {
					username: {
						remote: "${ctx}/admim/admin/checkLoginName"
					}
				},
				messages: {
					username: {
						remote: "用户登录名已存在"
					}
				}
			});
		});
	</script>
</head>

<body>
<div class="row-fluid">
				<div class="span12">
					<div class="box">
						<div class="box-head">
							<h3>添加管理员</h3>
						</div>
						<div class="box-content">

	<form id="inputForm" action="${ctx}/admin/admin" method="post" class="form-horizontal">
		
			<div class="control-group">
				<label for="name" class="control-label">用户名:</label>
				<div class="controls">
					<input type="text" id="name" name="username" class="input-large required"/>
				</div>
			</div>
			<div class="control-group">
				<label for="plainPassword" class="control-label">密码:</label>
				<div class="controls">
					<input type="password" id="password" name="password" class="input-large required"/>
				</div>
			</div>
			<div class="control-group">
				<label for="confirmPassword" class="control-label">确认密码:</label>
				<div class="controls">
					<input type="password" id="confirmPassword" name="confirmPassword" class="input-large required" equalTo="#password"/>
				</div>
			</div>
			<div class="form-actions">
				<button class="btn btn-primary" type="submit">完成</button>
				<input type="reset" class='btn btn-danger' value="重置">
			</div>
		
	</form>
		</div>
					</div>
				</div>
			</div>
	
</body>
</html>
