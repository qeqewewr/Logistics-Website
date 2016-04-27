<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sitemesh" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html>
  <head>

  </head>

  <body>
	<h3>客户关系</h3>
    <c:if test="${not empty message}">
		<div id="message" class="alert alert-success"><button data-dismiss="alert" class="close">×</button>${message}</div>
	</c:if>
	
	<table cellpadding="0" cellspacing="0" border="0" class="table table-bordered" id="example">
	<thead>
		<tr>
			<th>客户编号</th>
			<th>姓名</th>
			<th>性别</th>
			<th>年龄</th>
			<th>电话</th>
			<th>邮箱</th>
			<th>操作</th>
		</tr>
	</thead>
	<tbody>
	
		<c:forEach items="${customers}" var="customer">
			<tr class="odd gradeX">
				<td>${customer.id}&nbsp;</td>
				<td>${customer.name}&nbsp;</td>
				<td>${customer.sex}&nbsp;</td>
				<td>${customer.age}&nbsp;</td>
				<td>${customer.phone}&nbsp;</td>
				<td>${customer.email}&nbsp;</td>
				<td><a href="${ctx}/relatedCustomer/delete/${controller.id}/${customer.id}" class="btn btn-danger" type="button">删除</a></td>
			</tr>
		</c:forEach>
		
	</tbody>
	</table>	
	<a href="${ctx}/relatedCustomer/add/${controller.id}" class="btn btn-primary" type="button">增加客户</a>
  </body>
</html>
