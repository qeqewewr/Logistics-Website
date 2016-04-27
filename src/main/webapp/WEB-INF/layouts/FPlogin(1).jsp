<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%@ page import="org.apache.shiro.web.filter.authc.FormAuthenticationFilter"%>
<%@ page import="org.apache.shiro.SecurityUtils"%>
<%@ page import="org.apache.shiro.authc.ExcessiveAttemptsException"%>
<%@ page import="org.apache.shiro.authc.IncorrectCredentialsException"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

 
<div class="navbar" style="margin-bottom:0px;">
	  
      <div class="navbar-inner" style="background-image: url(${ctx}/static/images/background/logo_wuliu.jpg);height:82px;">
        
         <!-- <a class="brand" href="#" style="color:#777777; margin-left:20px;font-weight:bold; font-family:Microsoft YaHei  " >物流电子商务平台</a> -->
            <form id="loginForm" action="${ctx}/login" method="post" class="navbar-form pull-right" style="margin-top:22px;margin-right:10px">
              <%
				String error = (String) request.getAttribute(FormAuthenticationFilter.DEFAULT_ERROR_KEY_ATTRIBUTE_NAME);
				if(error != null){
				%>
					<div class="alert alert-error input-medium controls">
						<button class="close" data-dismiss="alert">×</button>登录失败，请重试.
					</div>
				<%
				}
			  %>
             <shiro:notAuthenticated>
              <input type="text" id="username" name="username"  value="${username}" class="input-medium required" placeholder="用户名"/>
              <input type="password" id="password" name="password" class="input-medium required" placeholder="密码"/>
              <input id="submit_btn" class="btn btn-primary" type="submit" value="登录"/>
             </shiro:notAuthenticated>
             
             <shiro:authenticated> 
             	
            	<span style="color:#777777;font-family:Microsoft YaHei;padding:10px 20px">你好！</span> <a href="${ctx}/logout" style="color:#777777; margin-right:20px;font-family:Microsoft YaHei" >退出登录</a>
            
             </shiro:authenticated>
             
            </form>
          </div><!--/.nav-collapse -->
        </div>
        
        
    <script>
		$(document).ready(function() {
			$("#loginForm").validate();
		});
	</script> 