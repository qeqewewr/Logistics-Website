<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%@ page import="org.apache.shiro.web.filter.authc.FormAuthenticationFilter"%>
<%@ page import="org.apache.shiro.authc.ExcessiveAttemptsException"%>
<%@ page import="org.apache.shiro.authc.IncorrectCredentialsException"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<div class="navbar">
          <div class="navbar-inner" style="background-image: url(${ctx}/static/images/background/navigation_bg.jpg)">
            <div class="container">
              <ul class="nav" >
                <li><a href="${ctx}/frontpage/index" style="font-size:18px; text-shadow:0px;">首页</a></li>
                <li><a href="${ctx}/frontpage1/introduce" style=" font-size:18px;" >公司简介</a></li>
                <li><a href="${ctx}/frontpage1/news" style=" font-size:18px;">公司新闻</a></li>
                <li><a href="${ctx}/frontpage1/contactus" style=" font-size:18px;">联系我们</a></li>
                <li><a href="${ctx}/frontpage1/feedback" style=" font-size:18px;">留言反馈</a></li>
              
                <shiro:hasAnyRoles  name="manager">
                	<li><a href="${ctx }/frontpage/pricelst" style=" font-size:18px;">价格管理</a></li>
                </shiro:hasAnyRoles>
                
                <shiro:hasAnyRoles  name="controller,owner">
                	<li><a href="${ctx }/frontpage/pricelst" style=" font-size:18px;">价格查询</a></li>
                </shiro:hasAnyRoles>
                
                <shiro:hasRole name="controller">
             	<li><a href="${ctx}/controllerRelation" style=" font-size:18px;">客户关系</a></li>
               <!-- <li><a href="">订单线路管理</a></li> --> 
                <li><a href="${ctx }/frontpage/waybilst" style=" font-size:18px;">订单管理</a></li>
                </shiro:hasRole>

                
                <shiro:hasRole name="customer">
                	<li><a href="${ctx}/story/waybill" style=" font-size:18px;">订单查询</a></li>
                </shiro:hasRole>
                
                <shiro:hasRole name="manager">
                 	<li><a href="${ctx}/relationManage" style=" font-size:18px;">客户关系</a></li>
                </shiro:hasRole >
                
                <shiro:hasRole name="owner">
                	<li><a href="${ctx}/story/vehicle/list" style=" font-size:18px;">车船管理</a></li>
                </shiro:hasRole >
                
                
                
                
              </ul>
            </div>
          </div>
</div><!-- /.navbar -->
