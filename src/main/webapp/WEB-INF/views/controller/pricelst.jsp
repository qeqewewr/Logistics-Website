<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<html>
<head>
	<title>货物价格</title>
	<script>
		$(document).ready(function() {
			$("#goodsprice-tab").addClass("active");
		});
	</script>
</head>

<body>
	<h3>货物价格</h3>
	<c:if test="${not empty message}">
		<div id="message" class="alert alert-success"><button data-dismiss="alert" class="close">×</button>${message}</div>
	</c:if>
	
			
	<table id="contentTable" class="table table-bordered table-condensed">
		<thead>
		<tr>
			
			<th>编号</th>
			<th>地点</th>
			<th>货物</th>
			<th>质量</th>
			<th>体积</th>
			<th>价格</th>
			<shiro:hasAnyRoles  name="manager">
			<th>操作</th>	
			</shiro:hasAnyRoles>
			
			
			
			
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
				<shiro:hasAnyRoles  name="manager">
				<td>
				<a href="${ctx}/frontpage/price/update/${price.id}">修改</a>
				<a href="${ctx}/frontpage/price/delete/${price.id}">删除</a>
				</td>
				</shiro:hasAnyRoles>
								
			</tr>
		</c:forEach>
		</tbody>		
	</table>
	
	<shiro:hasAnyRoles  name="manager">
	<div><a class="btn" href="${ctx}/frontpage/addprice">添加价格行情</a></div>
	</shiro:hasAnyRoles>
</body>
</html>
