<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sitemesh" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<c:set var="ctx" value="${pageContext.request.contextPath}" />

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>物流管理平台<sitemesh:title/></title>
<meta http-equiv="Content-Type" content="text/html;charset=utf-8" />
<meta http-equiv="Cache-Control" content="no-store" />
<meta http-equiv="Pragma" content="no-cache" />
<meta http-equiv="Expires" content="0" />

<meta name="description" content="">

<meta name="viewport" content="width=device-width">

<link rel="stylesheet" href="${ctx}/static/neat/css/bootstrap.css">
<link rel="stylesheet" href="${ctx}/static/neat/css/jquery.fancybox.css">
<link rel="stylesheet" href="${ctx}/static/neat/css/bootstrap-responsive.css">
<link rel="stylesheet" href="${ctx}/static/neat/css/uniform.default.css">
<link rel="stylesheet" href="${ctx}/static/neat/css/bootstrap.datepicker.css">
<link rel="stylesheet" href="${ctx}/static/neat/css/jquery.cleditor.css">
<link rel="stylesheet" href="${ctx}/static/neat/css/jquery.plupload.queue.css">
<link rel="stylesheet" href="${ctx}/static/neat/css/jquery.tagsinput.css">
<link rel="stylesheet" href="${ctx}/static/neat/css/jquery.ui.plupload.css">
<link rel="stylesheet" href="${ctx}/static/neat/js/tableTools/css/TableTools.css">
<link rel="stylesheet" href="${ctx}/static/neat/css/chosen.css">
<link rel="stylesheet" href="${ctx}/static/neat/css/style.css">


<script src="${ctx}/static/neat/js/jquery.js"></script>
<script src="${ctx}/static/neat/js/less.js"></script>
<script src="${ctx}/static/neat/js/bootstrap.min.js"></script>
<script src="${ctx}/static/neat/js/jquery.peity.js"></script>
<script src="${ctx}/static/neat/js/jquery.fancybox.js"></script>
<script src="${ctx}/static/neat/js/jquery.flot.js"></script>
<script src="${ctx}/static/neat/js/jquery.color.js"></script>
<script src="${ctx}/static/neat/js/jquery.flot.resize.js"></script>
<script src="${ctx}/static/neat/js/jquery.cookie.js"></script>
<script src="${ctx}/static/neat/js/jquery.cookie.js"></script>

<script src="${ctx}/static/neat/js/jquery.uniform.min.js"></script>
<script src="${ctx}/static/neat/js/bootstrap.timepicker.js"></script>
<script src="${ctx}/static/neat/js/bootstrap.datepicker.js"></script>
<script src="${ctx}/static/neat/js/chosen.jquery.min.js"></script>
<script src="${ctx}/static/neat/js/plupload/plupload.full.js"></script>
<script src="${ctx}/static/neat/js/plupload/jquery.plupload.queue/jquery.plupload.queue.js"></script>
<script src="${ctx}/static/neat/js/jquery.cleditor.min.js"></script>
<script src="${ctx}/static/neat/js/jquery.inputmask.min.js"></script>
<script src="${ctx}/static/neat/js/jquery.tagsinput.min.js"></script>
<script src="${ctx}/static/neat/js/jquery.mousewheel.js"></script>
<script src="${ctx}/static/neat/js/jquery.dataTables.min.js"></script>
<script src="${ctx}/static/neat/js/jquery.dataTables.bootstrap.js"></script>
<script src="${ctx}/static/neat/js/jquery.textareaCounter.plugin.js"></script>
<script src="${ctx}/static/neat/js/ui.spinner.js"></script>
<script src="${ctx}/static/neat/js/jquery.cookie.js"></script>
<script src="${ctx}/static/neat/js/tableTools/js/TableTools.min.js"></script>
<script src="${ctx}/static/neat/js/custom.js"></script>
<script src="${ctx}/static/neat/js/demo.js"></script>


<script src="${ctx}/static/neat/js/jquery.jgrowl_minimized.js"></script>
<script src="${ctx}/static/neat/js/jquery.form.js"></script>
<script src="${ctx}/static/neat/js/jquery.validate.min.js"></script>
<script src="${ctx}/static/neat/js/bbq.js"></script>
<script src="${ctx}/static/neat/js/jquery-ui-1.8.22.custom.min.js"></script>
<script src="${ctx}/static/neat/js/jquery.form.wizard-min.js"></script>
<script src="${ctx}/static/neat/js/jquery.metadata.js"></script>


<sitemesh:head />

</head>

<body>

	<%@ include file="/WEB-INF/layouts/header.jsp"%>
	<div class="breadcrumbs">
	<div class="main">
	<div class="container-fluid">
		<ul class="bread pull-left">
			<li>
				<a><i class="icon-home icon-white"></i></a>
			</li>
			<li>
				<a href="#">
					
				</a>
			</li>
		</ul>
    </div>
	<%@ include file="/WEB-INF/layouts/left.jsp"%>
			
			<div class="content">
				<sitemesh:body />
			</div>
		
	</div>
	
</div>


</body>
</html>