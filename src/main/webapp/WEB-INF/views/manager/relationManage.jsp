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
			<th>主管编号</th>
			<th>姓名</th>
			<th>性别</th>
			<th>年龄</th>
			<th>电话</th>
			<th>邮箱</th>
			<th>所属客户</th>
		</tr>
	</thead>
	<tbody>
	
		<c:forEach items="${contros}" var="contro">
			<tr class="odd gradeX">
				<td>${contro.id}&nbsp;</td>
				<td>${contro.wlUser.name}&nbsp;</td>
				<td>${contro.sex}&nbsp;</td>
				<td>${contro.age}&nbsp;</td>
				<td>${contro.phone}&nbsp;</td>
				<td>${contro.wlUser.email}&nbsp;</td>
				<td><a href="${ctx}/relatedCustomer/${contro.id}">点击查看</a></td>
			</tr>
		</c:forEach>
		
	</tbody>
	</table>	

  </body>
</html>
