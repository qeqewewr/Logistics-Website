<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<html>
<head>
	<title>用户管理</title>
		
	<script>
		$(document).ready(function() {
			//为inputForm注册validate函数
				$("#account-tab").addClass("active");
		$("#account-tab").addClass("open");
		$("#account").removeClass("closed");

			var id=$("#roleid").val();
			if(id==3||id==2){
			$("#lead").remove();
			}
			if(id!=2){
				$("#div_crm").remove();
			}
			
			
			$("#inputForm").validate();
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

	<form id="inputForm" action="${ctx}/admin/user/add1" method="post" class="form-horizontal">
			<input type="hidden" id="roleid" name="id" value="${roleid}"/>
			<input type="hidden" id="userid" name="userid" value="${userid}">
		
			<div class="control-group">
				<label class="control-label">性别:</label>
				<div class="controls">
					<select name="sex" id="sex">
					<option value="男">男</option>
					<option value="女">女</option>
		</select>
				</div>
			</div>
			<div class="control-group">
				<label for="plainPassword" class="control-label">年龄:</label>
				<div class="controls">
					<input type="text" id="age" name="age" class="input-large"/>
				</div>
			</div>
			<div class="control-group">
				<label for="phone" class="control-label">电话:</label>
				<div class="controls">
					<input type="text" id="phone" name="phone" class="input-large"/>
				</div>
			</div>
			<div id="lead" class="control-group">
				<label for="lead" class="control-label">上级领导:</label>
				<div class="controls">
					<select name="lead" id="lead">
					<c:forEach items="${leads}" var="lead">
					<option value="${lead.id}">${lead.wlUser.name}</option>
					</c:forEach>
		</select>
				</div>
			</div>
		
		<div id="div_crm" class="control-group">
				<label for="crm" class="control-label">负责人:</label>
				<div class="controls">
					<select name="crm" id="crm">
					<c:forEach items="${controller}" var="crm">
					<option value="${crm.id}">${crm.wlUser.name}</option>
					</c:forEach>
		</select>
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
