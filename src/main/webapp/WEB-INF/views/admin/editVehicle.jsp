<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<html>
<head>
	<title>添加运力</title>
		
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
							<h3>添加运力</h3>
						</div>
						<div class="box-content">

	<form id="inputForm" action="${ctx}/admin/vehicle/update" method="post" class="form-horizontal">
			<input type="hidden" id="id" name="id" value="${vehicle.id }"> 
		<fieldset>
			<legend></legend>
			<div class="control-group">
				<label for="number" class="control-label">车牌号:</label>
				<div class="controls">
					<input type="text" id="number" name="number" value="${vehicle.number }" class="input-large required"/>
				</div>
			</div>
			<div class="control-group">
				<label for="type" class="control-label">类型:</label>
				<div class="controls">
					<select name="type" id="type">
					 <option value="车" ${vehicle.type=="车"?"selected":"" }>车</option>
					 <option value="船" ${vehicle.type=="船"?"selected":"" }>船</option>
					</select>
				</div>
			</div>
			<div class="control-group">
				<label for="volume" class="control-label">载重:</label>
				<div class="controls">
					<input type="text" id="volume" name="volume" value="${vehicle.volume }" class="input-large required number" placeholder="单位（吨）"/>
				</div>
			</div>
			<div class="control-group">
				<label for="lead" class="control-label">车主:</label>
				<div class="controls">
					<select name="owner" id="owner">
					<c:forEach items="${owners}" var="owner">
					<option value="${ owner.id}" ${vehicle.wlOwner.id==owner.id?"selected":"" }>${owner.wlUser.name}</option>
					</c:forEach>
		</select>
				</div>
			</div>
		
			
			<div class="form-actions">
				<input id="submit_btn" class="btn btn-primary" type="submit" value="提交"/>&nbsp;	
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
