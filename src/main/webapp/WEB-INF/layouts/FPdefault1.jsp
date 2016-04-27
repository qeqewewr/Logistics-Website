<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sitemesh" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<c:set var="ctx" value="${pageContext.request.contextPath}" />

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
 <head>
    
    <title>物流电子商务平台 <sitemesh:title/></title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    
    <link type="image/x-icon" href="${ctx}/static/images/favicon.ico" rel="shortcut icon">


	<script src="${ctx}/static/jquery/jquery-1.9.1.min.js" type="text/javascript"></script>
	<link href="${ctx}/static/jquery-validation/1.11.1/validate.css" type="text/css" rel="stylesheet" />
	<script src="${ctx}/static/jquery-validation/1.11.1/jquery.validate.min.js" type="text/javascript"></script>
	<script src="${ctx}/static/jquery-validation/1.11.1/messages_bs_zh.js" type="text/javascript"></script>

    <!-- Le styles -->
    <link href="${ctx}/static/bootstrap/2.3.2/css/bootstrap-responsive.min.css" type="text/css" rel="stylesheet" />
    <link href="${ctx}/static/bootstrap/2.3.2/css/bootstrap.min.css" type="text/css" rel="stylesheet" />
    
    <style type="text/css">
      body {
        padding-top: 20px;
        padding-bottom: 60px;
       /*  background:url(${ctx}/static/images/background/FPbackground.jpg) center 0 no-repeat ; */
        width:100%;
        height:100%;
      }

      /* Custom container */
      .container {
        margin: 0 auto;
        max-width: 1000px;
      }
      .container > hr {
        margin: 60px 0;
      }

      /* Main marketing message and sign up button */
      .jumbotron {
        margin: 80px 0;
        text-align: center;
      }
      .jumbotron h1 {
        font-size: 100px;
        line-height: 1;
      }
      .jumbotron .lead {
        font-size: 24px;
        line-height: 1.25;
      }
      .jumbotron .btn {
        font-size: 21px;
        padding: 14px 24px;
      }

      /* Supporting marketing content */
      .marketing {
        margin: 60px 0;
      }
      .marketing p + h4 {
        margin-top: 28px;
      }


      /* Customize the navbar links to be fill the entire space of the .navbar */
      .navbar .navbar-inner {
        padding: 0;
      }
      .navbar .nav {
        margin: 0;
        display: table;
        width: 100%;
      }
      .navbar .nav li {
        display: table-cell;
        width: 1%;
        float: none;
      }
      .navbar .nav li a {
      	color:#fff;
      	font-family:SimSun;
        
        text-align: center;
        text-shadow: none;
        border-left: 1px solid rgba(0,0,200,.50);
        border-right: 1px solid rgba(0,0,200,.15);
      }
      .navbar .nav li:first-child a {
        border-left: 0;
        border-radius: 3px 0 0 3px;
      }
      .navbar .nav li:last-child a {
        border-right: 0;
        border-radius: 0 3px 3px 0;
      }
      
    </style>
    <link href="static/bootstrap/2.3.2/css/bootstrap-responsive.css" rel="stylesheet">

    <sitemesh:head />                               
                                  
  </head>

<body style="padding-top:0px; padding-bottom:0px">
	<div>
	<div class="container">
		<%@ include file="/WEB-INF/layouts/FPlogin.jsp"%>
		<%@ include file="/WEB-INF/layouts/FPheader.jsp"%>	
		<div class="row" style="margin-left:0px">
			<%@ include file="/WEB-INF/layouts/FPleft.jsp"%>			
			<div id="main" class="span8" style="width:680px">
				<div>
					<img alt="bg3" src="${ctx}/static/images/background/bg3.jpg"/>
				</div>
				<sitemesh:body />	
			</div>
			
		</div>
		<%-- <%@ include file="/WEB-INF/layouts/FPdown.jsp"%> --%>
		<%@ include file="/WEB-INF/layouts/FPfooter.jsp"%>
	</div>
	</div>
	
    <script src="${ctx}/static/bootstrap/2.3.2/js/bootstrap.min.js"></script>

</body>
</html>