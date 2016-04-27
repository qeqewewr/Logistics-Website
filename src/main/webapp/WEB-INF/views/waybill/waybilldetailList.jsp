<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />

<html>
<head>
<title>订单管理 </title>

</head>

<body>
	<h3>我的订单</h3>

	<table cellpadding="0" cellspacing="0" border="0" class="table table-bordered" id="example">
	<tbody>
	<tr><th>运单编号:</th><td>${waybill.number }</td></tr>
	<tr><th>客户编号:</th><td>${waybill.wlCustomer.id}</td></tr>
	<tr><th>客户姓名:</th><td>${waybill.wlCustomer.wlUser.name}</td></tr>
	<tr><th>客户电话:</th><td>${waybill.wlCustomer.phone}</td></tr>
	<tr><th>客户邮箱:</th><td>${waybill.wlCustomer.wlUser.email}</td></tr>
	<tr><th>发件人:</th><td>${waybill.sender }</td></tr>
	<tr><th>发件人号码:</th><td>${waybill.senderphone }</td></tr>
	<tr><th>发件人地址:</th><td>${waybill.sendaddress }</td></tr>
	<tr><th>收件人:</th><td>${waybill.receiver }</td></tr>
	<tr><th>收件人号码:</th><td>${waybill.receiverphone }</td></tr>
	<tr><th>收件人地址:</th><td>${waybill.receiveaddress }</td></tr>
	<tr><th>重量:</th><td>${waybill.weight }</td></tr>
	<tr><th>体积:</th><td>${waybill.volume }</td></tr>
	<tr><th>存放方式:</th><td>${waybill.storemode }</td></tr>
	<tr><th>运单价格:</th><td>${waybill.price }</td></tr>
	<tr><th>发件时间:</th><td><fmt:formatDate value="${waybill.sendtime }" pattern="yyyy年MM月dd日 " /></td></tr>
	<tr><c:if test="${!empty waybill.receivetime }"><th>收件时间:</th><td><fmt:formatDate value="${waybill.receivetime }" pattern="yyyy年MM月dd日 " /></td></c:if></tr>
	<tr><th>标注:</th><td>${waybill.remark }</td></tr>
	<tr><th>付款方式:</th><td>${waybill.payment }</td></tr>
	<tr>
	<c:if test="${waybill.status eq '1' &&  !empty waybill.wlWaybillstatuses }"><th>运送情况:</th>
	<td>
	<table  class="table">
	<tr>
	<th>运力编号</th>
	<th>时间</th>
	<th>配送到达地点</th>
	<th>配送状态</th>
	</tr>
	<c:forEach items="${waybill.wlWaybillstatuses}" var="detail">
	  <tr><td>${detail.wlVehicle.number }</td>
	  <td><fmt:formatDate value="${detail.time }" pattern="yyyy年MM月dd日     HH时mm分ss秒" /></td>
	  <td>${detail.wlLocation.city }</td>
	  <td>${detail.status }</td>
	  </tr>
	</c:forEach>
	
	</table>
	</td></c:if>
	
	</tr>
	</tbody>
	</table>
	
	<c:if test="${waybill.status eq '1' && empty waybill.wlWaybillstatuses }"><p><a class="btn btn-primary" href="${ctx }/frontpage/waybillstatus/set/${waybill.id}">分配车辆</a></p></c:if>
	
	<c:if test="${waybill.status eq '1' && !empty waybill.wlWaybillstatuses }"><p><a class="btn btn-primary" href="${ctx }/frontpage/waybillstatus/set1/${waybill.id}">状态更新</a></p></c:if>
	
	<c:if test="${waybill.status eq '1'}"><p><a class="btn btn-info" href="${ctx}/excel/export/waybill/${waybill.id}">打印报表 &raquo;</a></p></c:if>
	
</body>
</html>
