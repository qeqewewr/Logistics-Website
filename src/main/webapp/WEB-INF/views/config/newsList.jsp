<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<html>
<head>
	<script>
		$(document).ready(function() {
			$("#web").addClass("active");
			$("#web").addClass("open");
			$("#webul").removeClass("closed");
		});
	</script>
</head>

<body>
	
	<c:if test="${not empty message}">
		<div id="message" class="alert alert-success"><button data-dismiss="alert" class="close">×</button>${message}</div>
	</c:if>
				<div class="row-fluid">
				<div class="span12">
					<div class="box">
						<div class="box-head tabs">
							<h3>新闻管理</h3>
							<ul class='nav nav-tabs'>
								<li class='active'>
									<a href="#basic" data-toggle="tab">Basic</a>
								</li>
								<li>
									<a href="#nohead" data-toggle="tab">No header</a>
								</li>
							</ul>
						</div>
						<div class="box-content box-nomargin">
							<div class="tab-content">
									<div class="tab-pane active" id="basic">
										<table class='table table-striped dataTable table-bordered'>
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
		</div>
									<div class="tab-pane" id="nohead">
										<table class='table table-striped dataTable dataTable-noheader table-bordered'>
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
		</div>
							</div>
						</div>
					</div>
				</div>
			</div>
												
												
	
</body>
</html>
