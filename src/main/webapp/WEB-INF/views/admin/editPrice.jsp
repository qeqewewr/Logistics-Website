<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<html>
<head>
	<title>价格管理</title>
		
	<script>
		$(document).ready(function() {
			//聚焦第一个输入框
			
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
							<h3>编辑价格行情</h3>
						</div>
						<div class="box-content">

	<form id="inputForm" action="${ctx}/admin/price/edit" method="post" class="form-horizontal">
	  <input type="hidden" name="id" value="${price.id }"/>
	
		<fieldset>
			<legend></legend>
			<div class="control-group">
				<label class="control-label">地点:</label>
				<div class="controls">
					<span class="help-inline" style="padding:5px 0px">${price.wlLocation.city }</span>
				</div>
			</div>
			
			<div class="control-group">
				<label class="control-label">货物信息:</label>
				<div class="controls">
					<span class="help-inline" style="padding:5px 0px">${price.wlGood.id}--${price.wlGood.type}--${price.wlGood.weight}
					  </span>
				</div>
			</div>
			
			<div class="control-group">
				<label class="control-label">价格:</label>
				<div class="controls">
					<input type="text" id="price" name="price" value="${price.price }" class="input-large required number"/>
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
