<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<html>
<head>
	<title>资料修改</title>
	<script type="text/javascript">
	$(document).ready(function() {
		$("#account-tab").addClass("active");
		$("#account-tab").addClass("open");
		$("#account").removeClass("closed");
	});
	</script>
	
</head>

<body>
	
	
	
				<div class="row-fluid">
				<div class="span12">
					<div class="box">
						<div class="box-head">
							<h3>资料修改</h3>
						</div>
						<div class="box-content">
							<form id="inputForm" action="${ctx}/admin/profile" method="post" class="form-horizontal">
									<div class="control-group">
										<label class="control-label">用户名:</label>
										<div class="controls">
											<input type="text" id="name" name="name" value="${admin.username}" disabled class='input-square'>
										</div>
									</div>
			
									<div class="control-group">
										<label for="plainPassword" class="control-label">密码:</label>
										<div class="controls">
											<input type="password" id="plainPassword" name="password" class="input-large" placeholder="...Leave it blank if no change"/>
										</div>
									</div>
									<div class="control-group">
										<label for="confirmPassword" class="control-label">确认密码:</label>
				<div class="controls">
					<input type="password" id="confirmPassword" name="confirmPassword" class="input-large" equalTo="#plainPassword" />
				</div>
									</div>
									<div class="form-actions">
										<button class="btn btn-primary" type="submit">提交</button>
										<input type="reset" class='btn btn-danger' value="重置">
									</div>
							</form>
						</div>
					</div>
				</div>
			</div>
	<script>
		$(document).ready(function() {
			//聚焦第一个输入框
			//为inputForm注册validate函数
			$("#inputForm").validate();
		});
	</script>
</body>
</html>
