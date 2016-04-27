<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>订单修改</title>


<link href="${ctx }/static/datetimepicker/css/bootstrap-datetimepicker.min.css" rel="stylesheet" media="screen">
		<script type="text/javascript" src="${ctx }/static/datetimepicker/js/bootstrap-datetimepicker.js" charset="UTF-8"></script>
        <script type="text/javascript" src="${ctx }/static/datetimepicker./js/locales/bootstrap-datetimepicker.fr.js" charset="UTF-8"></script>
		
</head>
<body>
	<form id="inputForm" action="${ctx}/frontpage/waybill/updateform" method="post" class="form-horizontal">
	  <input type="hidden" name="id" value="${waybill.id }"/>
	
		<fieldset>
			<legend><small>修改订单</small></legend>
			<div class="control-group">
				<label class="control-label">运单编号:</label>
				<div class="controls">
					<span class="help-inline" style="padding:5px 0px">${waybill.number }</span>
				</div>
			</div>
			
			<div class="control-group">
				<label class="control-label">客户姓名:</label>
				<div class="controls">
					<span class="help-inline" style="padding:5px 0px">${waybill.wlCustomer.name}
					  </span>
				</div>
			</div>
			
			<div class="control-group">
				<label class="control-label">客户电话:</label>
				<div class="controls">
					<span class="help-inline" style="padding:5px 0px">${waybill.wlCustomer.phone}
					  </span>
				</div>
			</div>
			<div class="control-group">
				<label class="control-label">客户邮箱:</label>
				<div class="controls">
					<span class="help-inline" style="padding:5px 0px">${waybill.wlCustomer.email}
					  </span>
				</div>
			</div>
			
			<div class="control-group">
				<label class="control-label">发件人:</label>
				<div class="controls">
					<span class="help-inline" style="padding:5px 0px">${waybill.sender }
					  </span>
				</div>
			</div>
			
			<div class="control-group">
				<label class="control-label">发件人地址:</label>
				<div class="controls">
					<span class="help-inline" style="padding:5px 0px">${waybill.sendaddress }
					  </span>
				</div>
			</div>
			
			
			<div class="control-group">
				<label class="control-label">收件人:</label>
				<div class="controls">
					<span class="help-inline" style="padding:5px 0px">${waybill.receiver }
					  </span>
				</div>
			</div>
			
			<div class="control-group">
				<label class="control-label">收件人地址:</label>
				<div class="controls">
					<span class="help-inline" style="padding:5px 0px">${waybill.receiveaddress }
					  </span>
				</div>
			</div>
			
			
			
			<div class="control-group">
				<label class="control-label">重量:</label>
				<div class="controls">
					<span class="help-inline" style="padding:5px 0px">${waybill.weight }
					  </span>
				</div>
			</div>
			
			
			<div class="control-group">
				<label class="control-label">体积:</label>
				<div class="controls">
					<span class="help-inline" style="padding:5px 0px">${waybill.volume }
					  </span>
				</div>
			</div>
						
			
			<div class="control-group">
				<label class="control-label">运单价格:</label>
				<div class="controls">
					<input type="text" id="price" name="price" value="${waybill.price }" class="input-large required number"/>
				</div>
			</div>
		
			<div class="control-group">
				<label class="control-label">发货时间:</label>
				<div class="controls">
					   <input size="16" type="text" name="sendtime1" readonly class="form_date"  data-date="2012-02-12" data-date-format="yyyy-mm-dd" >
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
				<label class="control-label">订单审核:</label>
				<div class="controls">
					<select name="status">
					 <option value="1">已通过</option>
					 <option value="2">未审核</option>
					 <option value="0">未通过</option>
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