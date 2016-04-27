<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />

<html>
<head>
<title>用户管理</title>
<script type="text/javascript">
$(document).ready(function() {
	$("#account-tab").addClass("active");
	$("#account-tab").addClass("open");
	$("#account").removeClass("closed");
});
</script>
</head>

<body>
	<c:if test="${not empty message}">
		
							<div class="alert alert-info alert-block">
								<a class="close" data-dismiss="alert" href="#">×</a>
  								<h4 class="alert-heading">提示!</h4>
  								${message}
							</div>
			
	</c:if>	
		<div class="row-fluid">
				<div class="span12">
					<div class="box">
						<div class="box-head tabs">
							<h3>用户列表</h3>
							<ul class='nav nav-tabs'>
								<li class='active'>
									<a href="#basic" data-toggle="tab">基本</a>
								</li>
								<li>
									<a href="#nohead" data-toggle="tab">无表头</a>
								</li>
							</ul>
						</div>
						<div class="box-content box-nomargin">
							<div class="tab-content">
									<div class="tab-pane active" id="basic">
										<table class='table table-striped dataTable table-bordered'>
											<thead>
												<th>编号</th>
				<th>用户名</th>
				<th>管理</th>
											</thead>
											<tbody>
											<c:forEach items="${users}" var="user">
				<tr>
					<td><a href="${ctx}/admin/user/update/${user.id}">${user.id}</a></td>
					<td>${user.name}</td>
					
					<td><a href="${ctx}/admin/user/delete/${user.id}">删除</a></td>
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
				<th>用户名</th>
				<th>管理</th>
												</tr>
											</thead>
											<tbody>
												<c:forEach items="${users}" var="user">
				<tr>
					<td><a href="${ctx}/admin/user/update/${user.id}">${user.id}</a></td>
					<td>${user.name}</td>
					
					<td><a href="${ctx}/admin/user/delete/${user.id}">删除</a></td>
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
