<%@ page language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<div id="leftbar" class="span3">
	
	
    <div class="well sidebar-nav" style="margin-left:-20px;">
		<img src="${ctx}/static/images/left2.jpg"  alt="网站公告" style="margin-top:-10px;margin-bottom:10px">
		<marquee height="184" scrollamount="2" direction="up" style="font-size:11px;line-height: 30px;">  我们通过优良的物流服务赢得信誉，让客户体会到服务第一、客户至上，我们将以最大的热情服务于每位客户。目前我们已经培养了一支精力充沛、技术娴熟、经验丰富的驾驶队伍。我们以“顾客至上”为理念，我们公司管理严格，严格按照客户需求来操作，客户的满意和信赖是我们永恒的追求。  </marquee>
		
	</div>
	
	<div class="well sidebar-nav" style="margin-left:-20px;">
		<img src="${ctx}/static/images/left1.jpg"  alt="left1" style="margin-top:-10px;margin-bottom:10px">
		<ul class="nav nav-list">
			<%-- <li class="nav-header" style="font-size:14px;background-image:url(${ctx}/static/images/left1.jpg);">网站导航</li> --%>
              <li class="active" style="font-size:13px"><a href="${ctx}/frontpage1/introduce">公司简介</a></li>
              <li style="font-size:13px"><a href="${ctx}/frontpage1/news">公司新闻</a></li>
              <li style="font-size:13px"><a href="${ctx}/frontpage1/contactus">联系我们</a></li>
              <li style="font-size:13px"><a href="${ctx}/frontpage1/feedback">留言反馈</a></li>
		</ul>
		
	</div>

	
	
	
</div>