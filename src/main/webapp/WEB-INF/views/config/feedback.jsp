<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sitemesh" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html>
  <head>
	<title>公司简介</title>
	<script type="text/javascript">
  $(document).ready(function() {
		$("#web").addClass("active");
		$("#web").addClass("open");
		$("#webul").removeClass("closed");
	});
  </script>
	
	
  </head>

  <body>
  
    <h3 style="color:#013791;">留言反馈</h3>
  
  	<form id="inputForm" action="${ctx}/frontpage/addfeedback" method="post" class="form-horizontal">
  	<div class="control-group">
			   <label for="name" class="control-label" style="width:80px">您的姓名：</label>
			   <div class="controls">
			      <input type="text" id="name" name="name" class="input-large required" style="margin-left:-80px"/>
				  
			   </div>
	</div>
	
	<div class="control-group">
			   <label for="phone" class="control-label" style="width:80px">您的号码：</label>
			   <div class="controls">
			      <input type="text" id="phone" name="phone" class="input-large required" style="margin-left:-80px"/>
				  
			  </div>
	</div>
	
	<div class="control-group">
			   <label for="content" class="control-label"style="width:80px">留言：</label>
			   <div class="controls">
			      <textarea id="content" name="content" style="width:400px;height:200px;margin-left:-80px"></textarea>
				  
			   </div>
	</div>
	
	<div class="form-actions" style="background-color:transparent;">
				<input id="submit_btn" class="btn btn-primary" type="submit" value="提交" style="margin-left:-80px">&nbsp;	
				<input id="cancel_btn" class="btn" type="button" value="返回" onclick="history.back()"/>
	</div>
  
	</form>

  </body>
</html>
