<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<html>
<head>
	<title>综合演示用例</title>
	<script>
		$(document).ready(function() {
			$("#news-tab").addClass("active");
		});
	</script>
</head>

<body>
	<h1>帐号管理</h1>
	<c:if test="${not empty message}">
		<div id="message" class="alert alert-success"><button data-dismiss="alert" class="close">×</button>${message}</div>
	</c:if>
	
			
	<table id="contentTable" class="table table-striped table-bordered table-condensed">
		<thead>
		<tr>
			<th>编号</th>
			<th>标题</th>
			<th>时间</th>
			<th>操作</th>
		</tr>
		</thead>
		<tbody>
		<c:forEach items="${lst}" var="news">
			<tr>
				<td>${news.id}&nbsp;</td>
				<td>${news.title}&nbsp;</td>
				<td>
				<fmt:formatDate value="${news.date}" pattern="yyyy年MM月dd日  HH时mm分ss秒" /></td>
				<td>
				<a href="${ctx}/admin/news/update/${news.id}" id="editLink-${news.title}">修改</a>
				<a href="${ctx}/admin/news/delete/${news.id}" id="editLink-${news.title}">删除</a>
				</td>
			</tr>
		</c:forEach>
		</tbody>		
	</table>
	
	<div><a class="btn" href="${ctx}/admin/warehouse/add">添加新闻</a></div>
</body>
</html>
