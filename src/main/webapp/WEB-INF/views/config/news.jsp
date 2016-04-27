<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib prefix="sitemesh" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html>
  <head>
	<title>公司新闻</title>
	
	<script type="text/javascript">
  $(document).ready(function() {
		$("#web").addClass("active");
		$("#web").addClass("open");
		$("#webul").removeClass("closed");
	});
  </script>
	
  </head>

  <body>
  
    <h3 style="color:#013791;">公司新闻</h3>
  
  	<div class="container" style="border: 1px solid #d0d0d0 ; max-width: 680px"  >  
    	<c:forEach items="${news}" var="news">
	
				<li style="margin:15px 20px">
					<a style="color:#333" href="../config/newscontent/${news.id}">${news.title}</a>
					<span style="float:right"><fmt:formatDate value="${news.date}" pattern="yyyy年MM月dd日     HH时mm分" /></span>
				</li>
				<!-- <hr style="margin:10px 0px ; border-color:#d0d0d0"> -->
				
		</c:forEach>
  	</div>


  </body>
</html>
