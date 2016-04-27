<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />

<html>
<head>
<title>车船管理 </title>

</head>

<body>
	<h3>车船管理</h3>

	<form id="inputForm" action="${ctx}/story/vehicle/addvehicle" method="post" class="form-horizontal">
		<fieldset>
			<legend><small>增加运力</small></legend>
			
				<div class="control-group">
			    <label for="controller" class="control-label">车主:</label>
			    <span class="help-inline"  style="padding:5px 25px">${owner.name}</span>
			    <div class="controls">
			       <input type="hidden" name="ownerID" value="${owner.id}"/>
			    </div>
			    </div>	
				
				<div class="control-group">
				<label class="control-label">运力牌号:</label>
				<div class="controls"  >
					<input type="text" id="number" name="number"  class="input-large required"/>
				</div>
				</div>
				
				<div class="control-group">
				<label class="control-label">运力类型:</label>
				<div class="controls"  >
					<select name="type" id="type">
					 <option value="车" ${vehicle.type=="车"?"selected":"" }>车</option>
					 <option value="船" ${vehicle.type=="船"?"selected":"" }>船</option>
					</select>
				</div>
				</div>
				
				<div class="control-group">
				<label class="control-label">运力容量:</label>
				<div class="controls"  >
					<input type="text" id="volume" name="volume"  class="input-large required"/>
				</div>
				</div>
    
			<div class="form-actions" style="background-color:transparent">
				<input id="submit_btn" class="btn btn-primary" type="submit" value="完成"/>&nbsp;	
				<input id="cancel_btn" class="btn" type="button" value="返回" onclick="history.back()"/>
			</div>
		</fieldset>
	</form>
</body>
</html>