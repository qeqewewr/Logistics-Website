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
	<form id="inputForm" action="${ctx}/account/profile" method="post" class="form-horizontal">
		<input type="hidden" name="id" value="${user.id}"/>
		
			<div class="control-group">
				<label for="name" class="control-label">用户名:</label>
				<div class="controls">
					<input type="text" id="name" name="name" value="${user.name}" class="input-large required"/>
				</div>
			</div>
			<div class="control-group">
				<label for="plainPassword" class="control-label">性别:</label>
				<div class="controls">
					<input type="password" id="plainPassword" name="plainPassword" class="input-large" placeholder="...Leave it blank if no change"/>
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
	<script>
		$(document).ready(function() {
			//聚焦第一个输入框
			$("#name").focus();
			//为inputForm注册validate函数
			$("#inputForm").validate();
		});
	</script>
</body>
</html>
