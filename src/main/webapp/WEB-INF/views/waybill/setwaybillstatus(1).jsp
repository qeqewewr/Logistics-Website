<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<html>
<head>
	<title>发货</title>

	
</head>

<body>
	<form id="inputForm" action="${ctx}/frontpage/waybillstatus/setform" method="post" class="form-horizontal">
	<input type="hidden" value="${waybill.id }" name="waybillid" >
		<fieldset>
			<legend><small>发货状态更新</small></legend>
			
			<div class="control-group">
				<label class="control-label">重量:</label>
				<div class="controls">
					<span class="help-inline" style="padding:5px 0px">${waybill.weight } 吨
					  </span>
				</div>
			</div>
			
			
			<div class="control-group">
				<label class="control-label">体积:</label>
				<div class="controls">
					<span class="help-inline" style="padding:5px 0px">${waybill.volume } 立方
					  </span>
				</div>
			</div>
					
			
			<div class="control-group">
				<label class="control-label">当前地点:</label>
				<div class="controls">
					<select name="location">
					<c:forEach items="${locations }" var="loc">
					<option value="${loc.id }">${loc.city}</option>
					</c:forEach>
					</select>
				</div>
			</div>
			<div class="control-group">
				<label class="control-label">运力编号:</label>
				<div class="controls">
					<select name="veh">
					<c:forEach items="${vehicles }" var="vehi">
					<option value="${vehi.id }">${vehi.number }</option>
					</c:forEach>
					</select>
				</div>
			</div>
		
			<div class="control-group">
				<label class="control-label">运送状态:</label>
				<div class="controls">
					<input name="status" type="text" value="分派车辆中" readonly="readonly">
					
				</div>
			</div>
		
			<div class="form-actions">
				<input id="submit_btn" class="btn btn-primary" type="submit" value="完成"/>&nbsp;	
				<input id="cancel_btn" class="btn" type="button" value="返回" onclick="history.back()"/>
			</div>
		</fieldset>
	</form>

</body>
</html>
