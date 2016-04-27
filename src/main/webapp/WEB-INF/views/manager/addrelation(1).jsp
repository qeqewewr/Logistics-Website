<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sitemesh" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html>
  <head>

  </head>

  <body>
	<h3>客户关系</h3>
    <form id="inputForm" action="${ctx}/addrelation" method="post" class="form-horizontal">
		<fieldset>
			<legend><small>增加客户</small></legend>
			
			<div class="control-group">
			   <label for="controller" class="control-label">所属主管</label>
			   <span class="help-inline" style="padding:5px 25px">${controller.name}</span>
			   <div class="controls">
			       <input type="hidden" name="controllerID" value="${controller.id}"/>
			   </div>
			</div>	
			
			<div class="control-group">
			   <label for="name" class="control-label">姓名</label>
			   <div class="controls">
			       <input type="text" id="name" name="name" class="input-large required"/>
			   </div>
			</div>	
			
			<div class="control-group">
			   <label for="sex" class="control-label">性别</label>
			   <div class="controls">
			       <input type="text" id="sex" name="sex" class="input-large required"/>
			   </div>
			</div>	
			
			<div class="control-group">
			   <label for="age" class="control-label">年龄</label>
			   <div class="controls">
			       <input type="text" id="age" name="age" class="input-large required"/>
			   </div>
			</div>	
			
			<div class="control-group">
			   <label for="phone" class="control-label">电话</label>
			   <div class="controls">
			       <input type="text" id="phone" name="phone" class="input-large required"/>
			   </div>
			</div>	
			
			<div class="control-group">
			   <label for="email" class="control-label">邮箱</label>
			   <div class="controls">
			       <input type="text" id="email" name="email" class="input-large required"/>
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
