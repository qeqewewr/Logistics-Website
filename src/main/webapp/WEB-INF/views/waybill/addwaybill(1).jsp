<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>

<html>
<head>
	<title>订单管理</title>
		<link href="${ctx }/static/datetimepicker/css/bootstrap-datetimepicker.min.css" rel="stylesheet" media="screen">
		<script type="text/javascript" src="${ctx }/static/datetimepicker/js/bootstrap-datetimepicker.js" charset="UTF-8"></script>
        <script type="text/javascript" src="${ctx }/static/datetimepicker./js/locales/bootstrap-datetimepicker.fr.js" charset="UTF-8"></script>
		
	<script>
		$(document).ready(function() {
			//聚焦第一个输入框
			$("#number").focus();
			//为inputForm注册validate函数
			$("#inputForm").validate();
			$("#good").change(getGoodDetail);
		});
		
		function getGoodDetail() {
		var id=$("#good").val();
		
		$.ajax({
				url:"${ctx}/frontpage/waybill/jsongood/"+id, 
				dataType:"json",
				success : function(msg) {
					var tmp="<thead><tr><td>地点</td><td>价格</td></tr></thead><tbody>";
					  $.each(msg,function(i,n){  
					
            $("#goodtype").text(n.type);
            $("#goodvolume").text(n.volume+" 立方");
             $("#goodweight").text(n.weight+" 吨");
             $("#goodsource").text(n.source);
             
             var tmp_c="<tr><td>"+n.location+"</td><td>"+n.price+"</td></tr>";
             tmp+=tmp_c;
					  });
					  tmp+="</tbody>";
					  $("#price_table").append(tmp);
					  $("#price_info").show();
        }  
				
});
		}
		
	</script>
	
</head>

<body>
   <div class="alert alert-info" id="price_info" style="display: none;">
   <a class="close" data-dismiss="alert">×</a>
            <h4 class="alert-heading">价格行情</h4>
  <table id="price_table" class="table">
  
  </table>
    </div>
	<form id="inputForm" action="${ctx}/frontpage/addwaybill" method="post" class="form-horizontal">
		<fieldset>
			<legend><small>下单</small></legend>
			<div class="control-group">
				<label for="customer" class="control-label">客户名称:</label>
				<div class="controls">
				<shiro:hasRole name="controller">
					<select name="customer" id="customer">
					<c:forEach items="${customers}" var="cst">
					<option value="${ cst.id}">${cst.wlUser.name}</option>
					</c:forEach>
					</select>
					</shiro:hasRole>
				<shiro:hasRole name="customer"><span class="help-inline" style="padding:5px 0px">${cst.wlUser.name}</span>
				<input type="hidden" name="customer" value="${cst.id }"/>
				</shiro:hasRole>	
				</div>
			</div>
			
			<div class="control-group">
			<label for="good" class="control-label">货物编号：</label>
			<div class="controls">
                <select name="good" id="good">
                  <option>--请选择货物--</option>
					<c:forEach items="${goods}" var="ago">
					<option value="${ ago.id}">${ago.id}</option>
					</c:forEach>
				</select>
			</div>
			</div>
			
			<div class="control-group">
			   <label for="goodtype" class="control-label">货物类型：</label>
			   <div class="controls">
			      <span id="goodtype" class="help-inline" style="padding:5px 0px">
				  </span>
			   </div>
			</div>
			
			<div class="control-group">
			   <label for="goodvolume" class="control-label">货物体积：</label>
			   <div class="controls">
			      <span id="goodvolume" class="help-inline" style="padding:5px 0px">
				  </span>
				  <span class="help-inline" style="padding:5px 0px"></span>
			   </div>
			</div>
			
			<div class="control-group">
			   <label for="goodweight" class="control-label">货物重量：</label>
			   <div class="controls">
			      <span id="goodweight" class="help-inline" style="padding:5px 0px">
				  </span>
				  <span class="help-inline" style="padding:5px 0px"></span>
			   </div>
			</div>
			
			<div class="control-group">
			   <label for="goodsource" class="control-label">货物产地：</label>
			   <div class="controls">
			      <span id="goodsource" class="help-inline" style="padding:5px 0px">
				  </span>
			   </div>
			</div>
			

			
			
			<div class="control-group">
			   <label for="sender" class="control-label">发件人：</label>
			   <div class="controls">
			      <input type="text" id="sender" name="sender" class="input-large required"/>
			   </div>
			</div>
			
			<div class="control-group">
			   <label for="senderphone" class="control-label">发件人电话：</label>
			   <div class="controls">
			       <input type="text" id="senderphone" name="senderphone" class="input-large required"/>
			   </div>
			</div>
			
			<div class="control-group">
			   <label for="sendaddress" class="control-label">发件人地址：</label>
			   <div class="controls">
			       <input type="text" id="sendaddress" name="sendaddress" class="input-large required"/>
			   </div>
			</div>
			
			<div class="control-group">
			   <label for="receiver" class="control-label">收件人：</label>
			   <div class="controls">
			      <input type="text" id="receiver" name="receiver" class="input-large required"/>
			   </div>
			</div>
			
			<div class="control-group">
			   <label for="receiverphone" class="control-label">收件人电话：</label>
			   <div class="controls">
			       <input type="text" id="receiverphone" name="receiverphone" class="input-large required"/>
			   </div>
			</div>
			
			<div class="control-group">
			   <label for="receiveaddress" class="control-label">收件人地址：</label>
			   <div class="controls">
			       <input type="text" id="receiveaddress" name="receiveaddress" class="input-large required"/>
			   </div>
			</div>
			
			
			 	<div class="control-group">
			   <label for="sendtime" class="control-label">发货日期：</label>
			   <div class="controls">
			       <!-- <input type="text" id="sendtime" name="sendtime" class="input-large required number"/> -->
			        <input size="16" type="text" name="sendtime1" readonly class="form_date" data-date="2012-02-12" data-date-format="yyyy-mm-dd" >
            <script type="text/javascript">
                      $(".form_date").datetimepicker({
                      language:  'en',
        weekStart: 1,
        todayBtn:  1,
		autoclose: 1,
		todayHighlight: 1,
		startView: 2,
		minView: 2,
		forceParse: 0});
          </script> 
			   </div>
			</div>
		   
			
		<div class="control-group">
			   <label for="storemode" class="control-label">存放方式：</label>
			   <div class="controls">
			       <input type="text" id="storemode" name="storemode" class="input-large required"/>
			   </div>
			</div>	
				
		   <div class="control-group">
			   <label for="price" class="control-label">运单价格：</label>
			   <div class="controls">
			       <input type="text" id="price" name="price" class="input-large required number"/>
			   </div>
			</div>			
				
			<div class="control-group">
			   <label for="remark" class="control-label">备注：</label>
			   <div class="controls">
			       <input type="text" id="remark" name="remark" class="input-large"/>
			   </div>
			</div>			
				
			<div class="control-group">
			   <label for="transportmode" class="control-label">付款方式：</label>
			   <div class="controls">
			       <select id="transportmode" name="transportmode">
			         <option value="转账">转账</option>
			         <option value="现金">现金</option>
			       </select>
			   </div>
			</div>
			
			<div class="form-actions">
				<input id="submit_btn" class="btn btn-primary" type="submit" value="完成"/>&nbsp;	
				<input id="cancel_btn" class="btn" type="button" value="返回" onclick="history.back()"/>
			</div>
		</fieldset>
	</form>

</body>
</html>
