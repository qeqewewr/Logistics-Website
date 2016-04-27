<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html>
  <head>
  	
    
	<style>
	
    /* CUSTOMIZE THE CAROUSEL
    -------------------------------------------------- */

    /* Carousel base class */
   
    
    .carousel {
      margin-bottom: 60px;
    }

    .carousel .container {
      position: relative;
      z-index: 9;
    }

    .carousel-control {
      height: 80px;
      margin-top: 0;
      font-size: 120px;
      text-shadow: 0 1px 1px rgba(0,0,0,.4);
      background-color: transparent;
      border: 0;
      z-index: 10;
    }

    .carousel .item {
      height: 500px;
    }
    .carousel img {
      position: absolute;
      top: 0;
      left: 0;
      min-width: 1000px;
      height: 500px;
    }

    .carousel-caption {
      background-color: transparent;
      position: static;
      max-width: 550px;
      padding: 0 20px;
      margin-top: 180px;
      margin-left: 80px;
    }
    .carousel-caption h1,
    .carousel-caption .lead {
      margin: 0;
      line-height: 1.25;
      color: #fff;
      text-shadow: 0 1px 1px rgba(0,0,0,.4);
    }
    .carousel-caption .btn {
      margin-top: 10px;
    }



   
    </style>


  </head>

  <body>
 
      <div id="myCarousel" class="carousel slide">
      <div class="carousel-inner" style="height:400px;">
        <div class="item active">
          <img src="${ctx}/static/images/slide-01.jpg" alt="1" style="height:400px;width:940px;">
          <div class="container">
            <div class="carousel-caption">
              <h1>高效</h1>
              <p class="lead">物流电子商务平台为您提供更高效的运输服务</p>
              <a class="btn btn-large btn-primary" href="#">立即加入</a>
            </div>
          </div>
        </div>
        <div class="item">
          <img src="${ctx}/static/images/slide-02.jpg" alt="2" style="height:400px;width:940px;">
          <div class="container">
            <div class="carousel-caption">
              <h1>快捷</h1>
              <p class="lead">无论您身处何地，我们将为您提供更快捷的物流服务</p>
              <a class="btn btn-large btn-primary" href="#">立即加入</a>
            </div>
          </div>
        </div>
        <div class="item">
          <img src="${ctx}/static/images/slide-03.jpg" alt="3" style="height:400px;width:940px;">
          <div class="container">
            <div class="carousel-caption">
              <h1>安全</h1>
              <p class="lead">我们将提供最优质的物流服务将您的货物安全运达</p>
              <a class="btn btn-large btn-primary" href="#">立即加入</a>
            </div>
            
          </div>
        </div>
      </div>
      <a class="left carousel-control" href="#myCarousel" data-slide="prev">&lsaquo;</a>
      <a class="right carousel-control" href="#myCarousel" data-slide="next">&rsaquo;</a>
    </div>
    
    <div class="row" style="margin-top:-45px;width:1000px">
    	<div class="navbar" >
    		<img src="${ctx}/static/images/left3.jpg"  alt="网站公告" style="margin-top:-10px;margin-bottom:-20px;margin-left:18px">
    	</div> 
      	<c:forEach items="${news}" var="news">
      
        <div class="span12" >
          <h3>${news.title}</h3>
          <div style="line-height:200%;height:180px;width:940px;overflow:hidden;font-size:13px;">${news.content}</div>
          <br>
          <p><a class="btn btn-primary" href="../config/newscontent/${news.id}" style="width:80px;height:20px;">全文阅读 &raquo;</a></p>
        </div>
        </c:forEach>
      
        <hr>
</div>
    
    
     <script src="${ctx}/static/bootstrap/2.3.2/js/bootstrap.min.js"></script>
  </body>
</html>
