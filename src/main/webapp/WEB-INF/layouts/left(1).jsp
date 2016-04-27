<%@ page language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

	<div class="navi">
		<ul class='main-nav'>
			<li id="account-tab">
				<a href="${ctx}/admin/default" class='light toggle-collapsed'>
					<div class="ico"><i class="icon-user icon-white"></i></div>
					账号管理
					<img src="${ctx}/static/neat/img/toggle-subnav-down.png" alt="">
				</a>
				<ul id="account" class='collapsed-nav closed'>
					<li>
						<a href="${ctx}/admin/profile">
							修改密码
						</a>
					</li>
					<li>
						<a href="${ctx}/admin/user">
							用户管理
						</a>
					</li>
					<li>
						<a href="${ctx}/admin/user/add">
							添加用户
						</a>
					</li>
					<li>
						<a href="${ctx}/admin/admin">
							管理员管理
						</a>
					</li>
					<li>
						<a href="${ctx}/admin/admin/add">
							添加管理员
						</a>
					</li>
					
				</ul>
			</li>
			
			<li id="web">
				<a href="#" class='light toggle-collapsed'>
					<div class="ico"><i class="icon-home icon-white"></i></div>
					网站管理
					<img src="${ctx}/static/neat/img/toggle-subnav-down.png" alt="">
				</a>
				<ul id="webul" class='collapsed-nav closed'>
					<li>
						<a href="${ctx}/admin/config/company/edit">
							公司简介
						</a>
					</li>
					<li>
						<a href="${ctx}/admin/config/profile/edit">
							联系方式
						</a>
					</li>
					<li>
						<a href="${ctx}/admin/news/list">
							新闻管理
						</a>
					</li>
					<li>
						<a href="${ctx}/admin/news/add">添加新闻</a>
					</li>
				</ul>
			</li>
			
			
			<li id="veh-tab">
				<a href="${ctx}/admin/vehlst" class='light'>
					<div class="ico"><i class="icon-plane icon-white"></i></div>
					运力管理
					
				</a>
			</li>
			<li id="location-tab">
				<a href="${ctx}/admin/localtionlist" class='light'>
					<div class="ico"><i class="icon-flag icon-white"></i></div>
					地点管理
				</a>
			</li>
			<li id="goods-tab">
				<a href="${ctx}/admin/goodlst" class='light'>
					<div class="ico"><i class="icon-gift icon-white"></i></div>
					货物管理
					
				</a>
			</li>
			<li id="goodsprice-tab">
				<a href="${ctx}/admin/pricelst" class='light'>
					<div class="ico"><i class="icon-signal icon-white"></i></div>
					价目管理
					
				</a>
				
			</li>
	

		</ul>
	</div>