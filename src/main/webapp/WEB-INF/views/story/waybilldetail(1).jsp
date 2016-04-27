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

	<table cellpadding="0" cellspacing="0" border="0" align="center" width="10%" class="table table-bordered" id="example">
	<tbody>
	<tr><td colspan="2">运单编号</td><td colspan="2">${waybill.number}</td><td colspan="2">客户编号</td><td colspan="2"></td></tr>
	<tr><td colspan="2">发件人</td><td colspan="2">${waybill.sender}</td><td colspan="2">发件人号码</td><td colspan="2">${waybill.senderphone}</td></tr>
	<tr><td colspan="2">发件人地址</td><td colspan="6">${waybill.sendaddress}</td></tr>
	<tr><td colspan="2">收件人</td><td colspan="2">${waybill.receiver}</td><td colspan="2">收件人号码</td><td colspan="2">${waybill.receiverphone}</td></tr>
	<tr><td colspan="2">收件人地址</td><td colspan="6">${waybill.receiveaddress}</td></tr>
	<tr><td colspan="1">重量</td><td colspan="1">${waybill.weight}</td><td colspan="1">体积</td><td colspan="1">${waybill.volume}</td><td colspan="2">存放方式</td><td colspan="2">${waybill.storemode}</td></tr>
	<tr><td>运单价格</td><td>${waybill.price}</td><td>付款方式</td><td>${waybill.payment}</td><td>发件时间</td><td>${waybill.sendtime}</td><td>收件时间</td><td>${waybill.receivetime}</td></tr>	
	<tr><td colspan="1">标注</td><td colspan="7">${waybill.remark}</td></tr>
	</tbody>
	</table>
</body>
</html>
