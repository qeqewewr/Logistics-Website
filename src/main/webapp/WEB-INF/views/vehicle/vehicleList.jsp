<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />

<html>
<head>
<title>车船管理 </title>

</head>

<body>
	<h3>我的运力</h3>
	<c:if test="${not empty message}">
		<div id="message" class="alert alert-success"><button data-dismiss="alert" class="close">×</button>${message}</div>
	</c:if>

	<table cellpadding="0" cellspacing="0" border="0" class="table table-bordered" id="example">
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
			<tr class="odd gradeX">
				<td>${vehicle.id}&nbsp;</td>
				<td>${vehicle.wlOwner.name}&nbsp;</td>
				<td>${vehicle.number}&nbsp;</td>
				<td>${vehicle.type}&nbsp;</td>
				<td>${vehicle.volume}&nbsp;</td>
				<td>
					<a href="${ctx}/story/vehicle/update/${vehicle.id}" id="editLink-${vehicle.id}">修改</a>
					<a href="${ctx}/story/vehicle/delete/${vehicle.id}" id="editLink-${vehicle.id}">删除</a>
				</td>
				
			</tr>
		</c:forEach>
				
	</tbody>
	</table>
	
	<div><a class="btn" href="${ctx}/story/vehicle/add">添加运力</a></div>
	
</body>
</html>