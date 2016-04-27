<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<html>
<head>
	<title>用户管理</title>
		
	<script>
		$(document).ready(function() {
			//聚焦第一个输入框
			$("#city").focus();
			//为inputForm注册validate函数
			$("#inputForm").validate(
			{
			rules: {
					city: {
						remote: "${ctx}/admin/checkcity"
					}/*,
					email:{
					 required:ture,
					 email:ture
					}*/
				},
				messages:{
					city: {
						remote: "该地区已经存在"
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
							<h3>添加地点</h3>
						</div>
						<div class="box-content">
	<form id="inputForm" action="${ctx}/admin/addlocation" method="post" class="form-horizontal">
		<fieldset>
			<legend></legend>
			<div class="control-group">
				<label class="control-label">名称:</label>
				<div class="controls">
					<input type="text" id="city" name="city" class="input-large required"/>
				</div>
			</div>
			<div class="control-group">
				<label class="control-label">距离:</label>
				<div class="controls">
					<input type="text" id="distance" name="distance" placeholder="距离公司的距离（KM）" class="input-large required number"/>
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
