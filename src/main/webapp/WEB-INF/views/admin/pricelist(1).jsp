<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<html>
<head>
	<title>价格管理</title>
	<script>
		$(document).ready(function() {
			$("#goodsprice-tab").addClass("active");
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
							<h3>价格管理</h3>
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
			<th>地点</th>
			<th>货物</th>
			<th>质量</th>
			<th>体积</th>
			<th>价格</th>
			<th>操作</th>	
			
			
		</tr>
		</thead>
		<tbody>
		<c:forEach items="${lst}" var="price">
			<tr>
			
				<td>${price.id}&nbsp;</td>
				<td>${price.wlLocation.city}&nbsp;</td>
				<td>${price.wlGood.type}&nbsp;</td>
				<td>${price.wlGood.weight}&nbsp;</td>
				<td>${price.wlGood.volume}&nbsp;</td>
				<td>${price.price}&nbsp;</td>
				<td>
				<a href="${ctx}/admin/price/update/${price.id}">修改</a>
				<a href="${ctx}/admin/price/delete/${price.id}">删除</a>
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
			<th>地点</th>
			<th>货物</th>
			<th>质量</th>
			<th>体积</th>
			<th>价格</th>
			<th>操作</th>	
			
			
		</tr>
		</thead>
		<tbody>
		<c:forEach items="${lst}" var="price">
			<tr>
			
				<td>${price.id}&nbsp;</td>
				<td>${price.wlLocation.city}&nbsp;</td>
				<td>${price.wlGood.type}&nbsp;</td>
				<td>${price.wlGood.weight}&nbsp;</td>
				<td>${price.wlGood.volume}&nbsp;</td>
				<td>${price.price}&nbsp;</td>
				<td>
				<a href="${ctx}/admin/price/update/${price.id}">修改</a>
				<a href="${ctx}/admin/price/delete/${price.id}">删除</a>
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
	
	<div><a class="btn" href="${ctx}/admin/addprice">添加价格行情</a></div>
</body>
</html>
