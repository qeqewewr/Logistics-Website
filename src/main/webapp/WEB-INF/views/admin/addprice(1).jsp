<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<html>
<head>
	<title>价格管理</title>
		
	<script>
		$(document).ready(function() {

			//为inputForm注册validate函数
			$("#inputForm").validate();
		});
	</script>
	
</head>

<body>

<div class="row-fluid">
				<div class="span12">
					<div class="box">
						<div class="box-head">
							<h3>添加价格行情</h3>
						</div>
						<div class="box-content">
	<form id="inputForm" action="${ctx}/admin/price/add" method="post" class="form-horizontal">
		<fieldset>
			<legend></legend>
			<div class="control-group">
				<label class="control-label">地点:</label>
				<div class="controls">
					<select name="location">
					<c:forEach items="${loclst }" var="location"> 
					   <option value="${location.id}">${location.city }</option>
					   </c:forEach>
					</select>
				</div>
			</div>
			
			<div class="control-group">
				<label class="control-label">货物信息:</label>
				<div class="controls">
					<select name="good">
					<c:forEach items="${goodlst }" var="good"> 
					   <option value="${good.id}">${good.id}--${good.type}--${good.weight}</option>
					   </c:forEach>
					</select>
				</div>
			</div>
			
			<div class="control-group">
				<label class="control-label">价格:</label>
				<div class="controls">
					<input type="text" id="price" name="price" class="input-large required number"/>
				</div>
			</div>
		
			
			<div class="form-actions">
				<input id="submit_btn" class="btn btn-primary" type="submit" value="完成"/>&nbsp;	
				<input id="cancel_btn" class="btn" type="button" value="返回" onclick="history.back()"/>
			</div>
		</fieldset>
	</form>
	</div>
					</div>
				</div>
			</div>
</body>
</html>
