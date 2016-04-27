<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%> 

<c:set var="ctx" value="${pageContext.request.contextPath}" />
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<html>
<head>
<title>订单管理 </title>

</head>

<body>
	<h3>我的订单</h3>
    
    	<c:if test="${not empty message}">
		<div id="message" class="alert alert-success"><button data-dismiss="alert" class="close">×</button>${message}</div>
	</c:if>
    
	<table cellpadding="0" cellspacing="0" border="0" class="table table-bordered table-condensed" >
	<thead>
		<tr>
			<th>编号</th>
			<th>收件人</th>
			<th>发件人</th>
	        <th>存放方式</th>
	        <th>价格</th>
	   	     <th>付款方式</th>	
	        <th>状态</th>
			<shiro:hasRole name="controller">
			<th>操作</th>
			<th>配送状态</th>
			
			</shiro:hasRole>		
		</tr>
	</thead>
	<tbody>
	
		<c:forEach items="${waybills}" var="wlWaybill">
			<tr class="odd gradeX">
				<td><a href="${ctx}/frontpage/waybilldetail/${wlWaybill.id}">${wlWaybill.number}&nbsp;</a></td>		
				<td>${wlWaybill.receiver}&nbsp;</td>
				<td>${wlWaybill.sender}&nbsp;</td>
				<td>${wlWaybill.storemode}&nbsp;</td>
				<td>${wlWaybill.price}&nbsp;</td>
				<td>${wlWaybill.payment}&nbsp;</td>
				<td>
				<c:if test="${wlWaybill.status eq '1' }">已通过</c:if>
				<c:if test="${wlWaybill.status eq '2' }">待审核</c:if>
				<c:if test="${wlWaybill.status eq '0' }">未通过</c:if>
				</td>
				<shiro:hasRole name="controller"><td>
			
				<a href="${ctx}/frontpage/waybill/update/${wlWaybill.id}">修改</a>
				<c:if test="${wlWaybill.status eq '2' }">
				<a href="${ctx}/frontpage/waybill/abolish/${wlWaybill.id}">废除</a>
				<a href="${ctx}/frontpage/waybill/through/${wlWaybill.id}">通过</a>
				</c:if>
				<a href="${ctx}/frontpage/waybill/delete/${wlWaybill.id}">删除</a>
				</td>
				<td>
<% int count=0; %>
				<c:if test="${fn:length(wlWaybill.wlWaybillstatuses) eq 0  }">等待配送</c:if>
				<c:forEach items="${wlWaybill.wlWaybillstatuses}" var="tmpwaybillstatu">
				<% if(count==0) {%>
				<c:if test="${tmpwaybillstatu.status eq '配送完成' }">完成配送<% count++; %></c:if>
				<%} %>
				<!--<c:if test="${fn:length(wlWaybill.wlWaybillstatuses) ne 0  }"><a href="${ctx }/frontpage/waybill/finish/${wlWaybill.id}">完成配送</a></c:if>-->
				</c:forEach>
				
				<% if(count==0) {%>
				<a href="${ctx }/frontpage/waybill/finish/${wlWaybill.id}">完成配送</a>
				<%} %>
				
				
				</td>
				</shiro:hasRole>
			</tr>
		</c:forEach>
		
	</tbody>
	</table>
	<shiro:hasRole name="controller"><div><a class="btn" href="${ctx}/frontpage/waybill/add">下单</a></div></shiro:hasRole>
	<shiro:hasRole name="customer"><div><a class="btn" href="${ctx}/frontpage/waybill/addbycust">下单</a></div></shiro:hasRole>
</body>
</html>
