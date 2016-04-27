<%@ page language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>

<div class="topbar">
	<div class="container-fluid">
		<a class='company'>物流电子商务决策服务平台后台管理</a>
		<ul class='mini'>
			<li>
				<a href="#">
					<img src="img/icons/fugue/gear.png" alt="">
					${admin.username}
				</a>
			</li>
			<li>
				<a href="${ctx}/logout">
					<img src="img/icons/fugue/control-power.png" alt="">
					退出登录
				</a>
			</li>
		</ul>
	</div>
</div>