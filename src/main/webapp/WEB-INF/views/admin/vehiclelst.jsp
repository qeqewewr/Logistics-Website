<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<html>
<head>
	<title>运力管理</title>
	<script>
		$(document).ready(function() {
			$("#veh-tab").addClass("active");
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
							<h3>运力管理</h3>
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
			<th>运力编号</th>
			<th>车主</th>
			<th>运力牌号</th>
			<th>运力类型</th>
			<th>运力容量</th>	
			<th>操作</th>	
			
			
		</tr>
		</thead>
		<tbody>
		<c:forEach items="${vehicles}" var="vehicle">
			<tr>

				
				
				<td>${vehicle.id}&nbsp;</td>
				<td>${vehicle.wlOwner.wlUser.name}&nbsp;</td>
				<td>${vehicle.number}&nbsp;</td>
				<td>${vehicle.type}&nbsp;</td>
				<td>${vehicle.volume}&nbsp;</td>
				<td>
				<a href="${ctx}/admin/vehicle/update/${vehicle.id}">修改</a>
				<a href="${ctx}/admin/vehicle/delete/${vehicle.id}">删除</a>
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
		<th>运力编号</th>
			<th>车主</th>
			<th>运力牌号</th>
			<th>运力类型</th>
			<th>运力容量</th>	
			<th>操作</th>	
			
			
		</tr>
		</thead>
		<tbody>
		<c:forEach items="${vehicles}" var="vehicle">
			<tr>

				
				
				<td>${vehicle.id}&nbsp;</td>
				<td>${vehicle.wlOwner.wlUser.name}&nbsp;</td>
				<td>${vehicle.number}&nbsp;</td>
				<td>${vehicle.type}&nbsp;</td>
				<td>${vehicle.volume}&nbsp;</td>
				<td>
				<a href="${ctx}/admin/vehicle/update/${vehicle.id}">修改</a>
				<a href="${ctx}/admin/vehicle/delete/${vehicle.id}">删除</a>
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
	
	
	<div><a class="btn" href="${ctx}/admin/addvehicles">添加运力</a></div>
</body>
</html>
