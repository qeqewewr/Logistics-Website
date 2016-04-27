<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<html>
<head>
	<title>货物管理</title>
		
	<script>
		$(document).ready(function() {
			//聚焦第一个输入框
			$("#number").focus();
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
							<h3>货物管理</h3>
						</div>
						<div class="box-content">
	<form id="inputForm" action="${ctx}/admin/editgoods" method="post" class="form-horizontal">
	<input type="hidden" name="id" value="${good.id }"/>
	<input type="hidden" name="number" value="${good.number }"/>
	
		<fieldset>
			<legend></legend>
			<div class="control-group">
				<label for="number" class="control-label">货物编号:</label>
				<div class="controls">
					<input type="text" id="number" name="number" value="${good.number }" class="input-large required number" disabled/>
				</div>
			</div>
			<div class="control-group">
				<label for="type" class="control-label">类型:</label>
				<div class="controls">
					<input type="text" id="type" name="type" value="${good.type }" class="input-large required"/>
				</div>
			</div>
			
			<div class="control-group">
			<label for="source" class="control-label">产地：</label>
			<div class="controls">
                <input type="text" id="source" name="source" value="${good.source }" class="input-large required"/> 
			</div>
			</div>
			
			<div class="control-group">
			   <label for="volume" class="control-label">体积：</label>
			   <div class="controls">
			      <input type="text" id="volume" name="volume" value="${good.volume }" class="input-large required number"/>
			   </div>
			</div>
			
			<div class="control-group">
			   <label for="weight" class="control-label">重量：</label>
			   <div class="controls">
			       <input type="text" id="weight" name="weight" value="${good.weight }" class="input-large required number"/>
			   </div>
			</div>
		
				
			<div class="control-group">
			   <label for="transportmode" class="control-label">托运方式：</label>
			   <div class="controls">
			       <select id="transportmode" name="transportmode">
			         <option value="车" ${good.transportmode=="车"?"selected":"" }>车</option>
			         <option value="船" ${good.transportmode=="船"?"selected":"" }>船</option>
			       </select>
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
