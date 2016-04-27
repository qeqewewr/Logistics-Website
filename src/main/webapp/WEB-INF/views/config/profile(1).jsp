<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<html>
<head>
	<title>联系方式</title>
	<script type="text/javascript" charset="utf-8" src="${ctx }/static/ueditor/ueditor.config.js"></script>
    <script type="text/javascript" charset="utf-8" src="${ctx }/static/ueditor/ueditor.all.min.js"></script>
    <script type="text/javascript" src="${ctx }/static/ueditor/lang/zh-cn/zh-cn.js"></script>
  <link rel="stylesheet" type="text/css" href="${ctx }/static/ueditor/themes/default/css/ueditor.css" />
  
  <script type="text/javascript">
  $(document).ready(function() {
		$("#web").addClass("active");
		$("#web").addClass("open");
		$("#webul").removeClass("closed");
	});
  </script>
  
</head>

<body>
<div class="row-fluid">
				<div class="span12">
					<div class="box">
						<div class="box-head">
							<h3>联系方式</h3>
						</div>
						<div class="box-content box-nomargin">
	<form id="inputForm" action="${ctx}/admin/config/profile/edit" method="post" class="form-horizontal">
		<fieldset>
			<legend></legend>
			
    <script type="text/plain" id="myEditor">${content}
  </script>
<script type="text/javascript">
var editor = new baidu.editor.ui.Editor();
editor.render('myEditor');
</script>
<div class="form-actions">
				<button class="btn btn-primary" type="submit">完成</button>
				<input type="reset" class='btn btn-danger' value="重置">
			</div>
		</fieldset>
	</form>
	
	</div>
					</div>
				</div>
			</div>
</body>
</html>
