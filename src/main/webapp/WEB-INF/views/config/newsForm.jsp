<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<html>
<head>
	<title>新闻编辑</title>
	<script type="text/javascript" src="${ctx}/static/ueditor/ueditor.config.js"></script>
	<script type="text/javascript" src="${ctx}/static/ueditor/ueditor.all.js"></script>
	<script type="text/javascript" src="${ctx}/static/ueditor/lang/zh-cn/zh-cn.js"></script>
	<link rel="stylesheet" type="text/css" href="${ctx}/static/ueditor/themes/default/ueditor.css"/>
	
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
							<h3>新闻编辑</h3>
						</div>
						<div class="box-content box-nomargin">

	<form id="inputForm" action="${ctx}/admin/news/update" method="post" class="form-horizontal">
		<fieldset>
			<legend><small></small></legend>
			<input type="hidden" name="id" value="${news.id }"/>
			
			<div class="control-group">
				<label class="control-label">标题:</label>
				<div class="controls">
					<input type="text" id="title" name="title" value="${news.title}" class="input-large required" disabled/>
				</div>
			</div>
			
			<div class="control-group">
				<label class="control-label">内容:</label>
				<div class="controls">
  <script type="text/plain" id="myEditor">${news.content}
  </script>
  </div>
			</div>
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
