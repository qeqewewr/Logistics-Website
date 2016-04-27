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
    
	<table cellpadding="0" cellspacing="0" border="0" class="table table-bordered" id="example">
	<thead>
		<tr>
			<th>客户编号</th>
			<th>姓名</th>
			<th>性别</th>
			<th>年龄</th>
			<th>电话</th>
			<th>邮箱</th>
		</tr>
	</thead>
	<tbody>
	
		<c:forEach items="${customers}" var="customer">
			<tr class="odd gradeX">
				<td>${customer.id}&nbsp;</td>
				<td>${customer.wlUser.name}&nbsp;</td>
				<td>${customer.sex}&nbsp;</td>
				<td>${customer.age}&nbsp;</td>
				<td>${customer.phone}&nbsp;</td>
				<td>${customer.wlUser.email}&nbsp;</td>
			</tr>
		</c:forEach>
		
	</tbody>
	</table>	

  </body>
</html>
