<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sitemesh" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html>
  <head>
	<title>联系我们</title>
	<script type="text/javascript">
  $(document).ready(function() {
		$("#web").addClass("active");
		$("#web").addClass("open");
		$("#webul").removeClass("closed");
	});
  </script>
	
  </head>

  <body>
  <h3 style="color:#013791;">联系我们</h3>
 
  <div class="container" style="border: 1px solid #d0d0d0 ; max-width: 680px ;padding:10px 10px;">  
  ${contactus.content}
  </div>


  </body>
</html>
