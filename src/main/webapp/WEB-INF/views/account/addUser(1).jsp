<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<html>
<head>
	<title>用户管理</title>
		
	<script>
		$(document).ready(function() {
			
			$("#account-tab").addClass("active");
			$("#account-tab").addClass("open");
			$("#account").removeClass("closed");

			
			//聚焦第一个输入框
			$("#loginname").focus();
			//为inputForm注册validate函数
			$("#inputForm").validate(
			{
			rules: {
					loginName: {
						remote: "${ctx}/admin/user/checkLoginName"
					}/*,
					email:{
					 required:ture,
					 email:ture
					}*/
				},
				messages:{
					loginName: {
						remote: "用户登录名已存在"
					}/*,
					email: {
					required: "请输入Email地址",
					email: "请输入正确的email地址"
					}*/
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
							<h3>添加用户</h3>
						</div>
						<div class="box-content">
							<form id="inputForm" action="${ctx}/admin/user/addform" method="post" class="form-horizontal">
<div class="control-group">
				<label class="control-label">登录名:</label>
				<div class="controls">
					<input type="text" id="loginName" name="loginName" value="${user.loginName}" class="input-large required"/>
				</div>
			</div>
			<div class="control-group">
				<label class="control-label">用户名:</label>
				<div class="controls">
					<input type="text" id="name" name="name" value="${user.name}" class="input-large required"/>
				</div>
			</div>
			<div class="control-group">
				<label for="plainPassword" class="control-label">密码:</label>
				<div class="controls">
					<input type="password" id="plainPassword" name="plainPassword" class="input-large" placeholder="...Leave it blank if no change"/>
				</div>
			</div>
			<div class="control-group">
				<label for="confirmPassword" class="control-label">确认密码:</label>
				<div class="controls">
					<input type="password" id="confirmPassword" name="confirmPassword" class="input-large" equalTo="#plainPassword" />
				</div>
			</div>
			<div class="control-group">
				<label for="email" class="control-label">电子邮件:</label>
				<div class="controls">
					<input type="text" id="email" name="email" value="${user.email}" class="input-large required email"/>
				</div>
			</div>
			<div class="control-group">
				<label for="roleid" class="control-label">角色:</label>
				<div class="controls">
				 	<select id="type" name="type">
				 	<option value="3">经理</option>
				 	<option value="1">主管</option>
				 	<option value="4">车（船）主</option>
				 	<option value="2">客户</option>
				 	</select>
				</div>
			</div>
		
			
			<div class="form-actions">
			<button class="btn btn-primary" type="submit">下一步</button>
				<input type="reset" class='btn btn-danger' value="重置">
			</div>
							</form>
						</div>
					</div>
				</div>
			</div>


</body>
</html>
