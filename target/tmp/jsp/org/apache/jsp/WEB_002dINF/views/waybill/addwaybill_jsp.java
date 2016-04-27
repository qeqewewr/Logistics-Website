package org.apache.jsp.WEB_002dINF.views.waybill;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addwaybill_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_shiro_hasRole_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_shiro_hasRole_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_shiro_hasRole_name.release();
    _jspx_tagPool_c_forEach_var_items.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<title>订单管理</title>\r\n");
      out.write("\t\t<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/datetimepicker/css/bootstrap-datetimepicker.min.css\" rel=\"stylesheet\" media=\"screen\">\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/datetimepicker/js/bootstrap-datetimepicker.js\" charset=\"UTF-8\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/datetimepicker./js/locales/bootstrap-datetimepicker.fr.js\" charset=\"UTF-8\"></script>\r\n");
      out.write("\t\t\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\t$(document).ready(function() {\r\n");
      out.write("\t\t\t//聚焦第一个输入框\r\n");
      out.write("\t\t\t$(\"#number\").focus();\r\n");
      out.write("\t\t\t//为inputForm注册validate函数\r\n");
      out.write("\t\t\t$(\"#inputForm\").validate();\r\n");
      out.write("\t\t\t$(\"#good\").change(getGoodDetail);\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction getGoodDetail() {\r\n");
      out.write("\t\tvar id=$(\"#good\").val();\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\t\turl:\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/frontpage/waybill/jsongood/\"+id, \r\n");
      out.write("\t\t\t\tdataType:\"json\",\r\n");
      out.write("\t\t\t\tsuccess : function(msg) {\r\n");
      out.write("\t\t\t\t\tvar tmp=\"<thead><tr><td>地点</td><td>价格</td></tr></thead><tbody>\";\r\n");
      out.write("\t\t\t\t\t  $.each(msg,function(i,n){  \r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("            $(\"#goodtype\").text(n.type);\r\n");
      out.write("            $(\"#goodvolume\").text(n.volume+\" 立方\");\r\n");
      out.write("             $(\"#goodweight\").text(n.weight+\" 吨\");\r\n");
      out.write("             $(\"#goodsource\").text(n.source);\r\n");
      out.write("             \r\n");
      out.write("             var tmp_c=\"<tr><td>\"+n.location+\"</td><td>\"+n.price+\"</td></tr>\";\r\n");
      out.write("             tmp+=tmp_c;\r\n");
      out.write("\t\t\t\t\t  });\r\n");
      out.write("\t\t\t\t\t  tmp+=\"</tbody>\";\r\n");
      out.write("\t\t\t\t\t  $(\"#price_table\").append(tmp);\r\n");
      out.write("\t\t\t\t\t  $(\"#price_info\").show();\r\n");
      out.write("        }  \r\n");
      out.write("\t\t\t\t\r\n");
      out.write("});\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t</script>\r\n");
      out.write("\t\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("   <div class=\"alert alert-info\" id=\"price_info\" style=\"display: none;\">\r\n");
      out.write("   <a class=\"close\" data-dismiss=\"alert\">×</a>\r\n");
      out.write("            <h4 class=\"alert-heading\">价格行情</h4>\r\n");
      out.write("  <table id=\"price_table\" class=\"table\">\r\n");
      out.write("  \r\n");
      out.write("  </table>\r\n");
      out.write("    </div>\r\n");
      out.write("\t<form id=\"inputForm\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/frontpage/addwaybill\" method=\"post\" class=\"form-horizontal\">\r\n");
      out.write("\t\t<fieldset>\r\n");
      out.write("\t\t\t<legend><small>下单</small></legend>\r\n");
      out.write("\t\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t\t<label for=\"customer\" class=\"control-label\">客户名称:</label>\r\n");
      out.write("\t\t\t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_shiro_hasRole_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_shiro_hasRole_1(_jspx_page_context))
        return;
      out.write("\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t<label for=\"good\" class=\"control-label\">货物编号：</label>\r\n");
      out.write("\t\t\t<div class=\"controls\">\r\n");
      out.write("                <select name=\"good\" id=\"good\">\r\n");
      out.write("                  <option>--请选择货物--</option>\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t</select>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t   <label for=\"goodtype\" class=\"control-label\">货物类型：</label>\r\n");
      out.write("\t\t\t   <div class=\"controls\">\r\n");
      out.write("\t\t\t      <span id=\"goodtype\" class=\"help-inline\" style=\"padding:5px 0px\">\r\n");
      out.write("\t\t\t\t  </span>\r\n");
      out.write("\t\t\t   </div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t   <label for=\"goodvolume\" class=\"control-label\">货物体积：</label>\r\n");
      out.write("\t\t\t   <div class=\"controls\">\r\n");
      out.write("\t\t\t      <span id=\"goodvolume\" class=\"help-inline\" style=\"padding:5px 0px\">\r\n");
      out.write("\t\t\t\t  </span>\r\n");
      out.write("\t\t\t\t  <span class=\"help-inline\" style=\"padding:5px 0px\"></span>\r\n");
      out.write("\t\t\t   </div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t   <label for=\"goodweight\" class=\"control-label\">货物重量：</label>\r\n");
      out.write("\t\t\t   <div class=\"controls\">\r\n");
      out.write("\t\t\t      <span id=\"goodweight\" class=\"help-inline\" style=\"padding:5px 0px\">\r\n");
      out.write("\t\t\t\t  </span>\r\n");
      out.write("\t\t\t\t  <span class=\"help-inline\" style=\"padding:5px 0px\"></span>\r\n");
      out.write("\t\t\t   </div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t   <label for=\"goodsource\" class=\"control-label\">货物产地：</label>\r\n");
      out.write("\t\t\t   <div class=\"controls\">\r\n");
      out.write("\t\t\t      <span id=\"goodsource\" class=\"help-inline\" style=\"padding:5px 0px\">\r\n");
      out.write("\t\t\t\t  </span>\r\n");
      out.write("\t\t\t   </div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t   <label for=\"sender\" class=\"control-label\">发件人：</label>\r\n");
      out.write("\t\t\t   <div class=\"controls\">\r\n");
      out.write("\t\t\t      <input type=\"text\" id=\"sender\" name=\"sender\" class=\"input-large required\"/>\r\n");
      out.write("\t\t\t   </div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t   <label for=\"senderphone\" class=\"control-label\">发件人电话：</label>\r\n");
      out.write("\t\t\t   <div class=\"controls\">\r\n");
      out.write("\t\t\t       <input type=\"text\" id=\"senderphone\" name=\"senderphone\" class=\"input-large required\"/>\r\n");
      out.write("\t\t\t   </div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t   <label for=\"sendaddress\" class=\"control-label\">发件人地址：</label>\r\n");
      out.write("\t\t\t   <div class=\"controls\">\r\n");
      out.write("\t\t\t       <input type=\"text\" id=\"sendaddress\" name=\"sendaddress\" class=\"input-large required\"/>\r\n");
      out.write("\t\t\t   </div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t   <label for=\"receiver\" class=\"control-label\">收件人：</label>\r\n");
      out.write("\t\t\t   <div class=\"controls\">\r\n");
      out.write("\t\t\t      <input type=\"text\" id=\"receiver\" name=\"receiver\" class=\"input-large required\"/>\r\n");
      out.write("\t\t\t   </div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t   <label for=\"receiverphone\" class=\"control-label\">收件人电话：</label>\r\n");
      out.write("\t\t\t   <div class=\"controls\">\r\n");
      out.write("\t\t\t       <input type=\"text\" id=\"receiverphone\" name=\"receiverphone\" class=\"input-large required\"/>\r\n");
      out.write("\t\t\t   </div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t   <label for=\"receiveaddress\" class=\"control-label\">收件人地址：</label>\r\n");
      out.write("\t\t\t   <div class=\"controls\">\r\n");
      out.write("\t\t\t       <input type=\"text\" id=\"receiveaddress\" name=\"receiveaddress\" class=\"input-large required\"/>\r\n");
      out.write("\t\t\t   </div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t \t<div class=\"control-group\">\r\n");
      out.write("\t\t\t   <label for=\"sendtime\" class=\"control-label\">发货日期：</label>\r\n");
      out.write("\t\t\t   <div class=\"controls\">\r\n");
      out.write("\t\t\t       <!-- <input type=\"text\" id=\"sendtime\" name=\"sendtime\" class=\"input-large required number\"/> -->\r\n");
      out.write("\t\t\t        <input size=\"16\" type=\"text\" name=\"sendtime1\" readonly class=\"form_date\" data-date=\"2012-02-12\" data-date-format=\"yyyy-mm-dd\" >\r\n");
      out.write("            <script type=\"text/javascript\">\r\n");
      out.write("                      $(\".form_date\").datetimepicker({\r\n");
      out.write("                      language:  'en',\r\n");
      out.write("        weekStart: 1,\r\n");
      out.write("        todayBtn:  1,\r\n");
      out.write("\t\tautoclose: 1,\r\n");
      out.write("\t\ttodayHighlight: 1,\r\n");
      out.write("\t\tstartView: 2,\r\n");
      out.write("\t\tminView: 2,\r\n");
      out.write("\t\tforceParse: 0});\r\n");
      out.write("          </script> \r\n");
      out.write("\t\t\t   </div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t   \r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t   <label for=\"storemode\" class=\"control-label\">存放方式：</label>\r\n");
      out.write("\t\t\t   <div class=\"controls\">\r\n");
      out.write("\t\t\t       <input type=\"text\" id=\"storemode\" name=\"storemode\" class=\"input-large required\"/>\r\n");
      out.write("\t\t\t   </div>\r\n");
      out.write("\t\t\t</div>\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t   <div class=\"control-group\">\r\n");
      out.write("\t\t\t   <label for=\"price\" class=\"control-label\">运单价格：</label>\r\n");
      out.write("\t\t\t   <div class=\"controls\">\r\n");
      out.write("\t\t\t       <input type=\"text\" id=\"price\" name=\"price\" class=\"input-large required number\"/>\r\n");
      out.write("\t\t\t   </div>\r\n");
      out.write("\t\t\t</div>\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t   <label for=\"remark\" class=\"control-label\">备注：</label>\r\n");
      out.write("\t\t\t   <div class=\"controls\">\r\n");
      out.write("\t\t\t       <input type=\"text\" id=\"remark\" name=\"remark\" class=\"input-large\"/>\r\n");
      out.write("\t\t\t   </div>\r\n");
      out.write("\t\t\t</div>\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t   <label for=\"transportmode\" class=\"control-label\">付款方式：</label>\r\n");
      out.write("\t\t\t   <div class=\"controls\">\r\n");
      out.write("\t\t\t       <select id=\"transportmode\" name=\"transportmode\">\r\n");
      out.write("\t\t\t         <option value=\"转账\">转账</option>\r\n");
      out.write("\t\t\t         <option value=\"现金\">现金</option>\r\n");
      out.write("\t\t\t       </select>\r\n");
      out.write("\t\t\t   </div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"form-actions\">\r\n");
      out.write("\t\t\t\t<input id=\"submit_btn\" class=\"btn btn-primary\" type=\"submit\" value=\"完成\"/>&nbsp;\t\r\n");
      out.write("\t\t\t\t<input id=\"cancel_btn\" class=\"btn\" type=\"button\" value=\"返回\" onclick=\"history.back()\"/>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</fieldset>\r\n");
      out.write("\t</form>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("ctx");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_shiro_hasRole_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  shiro:hasRole
    org.apache.shiro.web.tags.HasRoleTag _jspx_th_shiro_hasRole_0 = (org.apache.shiro.web.tags.HasRoleTag) _jspx_tagPool_shiro_hasRole_name.get(org.apache.shiro.web.tags.HasRoleTag.class);
    _jspx_th_shiro_hasRole_0.setPageContext(_jspx_page_context);
    _jspx_th_shiro_hasRole_0.setParent(null);
    _jspx_th_shiro_hasRole_0.setName("controller");
    int _jspx_eval_shiro_hasRole_0 = _jspx_th_shiro_hasRole_0.doStartTag();
    if (_jspx_eval_shiro_hasRole_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t<select name=\"customer\" id=\"customer\">\r\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_c_forEach_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_shiro_hasRole_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t</select>\r\n");
        out.write("\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_shiro_hasRole_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_shiro_hasRole_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_shiro_hasRole_name.reuse(_jspx_th_shiro_hasRole_0);
      return true;
    }
    _jspx_tagPool_shiro_hasRole_name.reuse(_jspx_th_shiro_hasRole_0);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(javax.servlet.jsp.tagext.JspTag _jspx_th_shiro_hasRole_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_shiro_hasRole_0);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${customers}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("cst");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t<option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ cst.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cst.wlUser.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\r\n");
          out.write("\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_shiro_hasRole_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  shiro:hasRole
    org.apache.shiro.web.tags.HasRoleTag _jspx_th_shiro_hasRole_1 = (org.apache.shiro.web.tags.HasRoleTag) _jspx_tagPool_shiro_hasRole_name.get(org.apache.shiro.web.tags.HasRoleTag.class);
    _jspx_th_shiro_hasRole_1.setPageContext(_jspx_page_context);
    _jspx_th_shiro_hasRole_1.setParent(null);
    _jspx_th_shiro_hasRole_1.setName("customer");
    int _jspx_eval_shiro_hasRole_1 = _jspx_th_shiro_hasRole_1.doStartTag();
    if (_jspx_eval_shiro_hasRole_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("<span class=\"help-inline\" style=\"padding:5px 0px\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cst.wlUser.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</span>\r\n");
        out.write("\t\t\t\t<input type=\"hidden\" name=\"customer\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cst.id }", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"/>\r\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_shiro_hasRole_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_shiro_hasRole_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_shiro_hasRole_name.reuse(_jspx_th_shiro_hasRole_1);
      return true;
    }
    _jspx_tagPool_shiro_hasRole_name.reuse(_jspx_th_shiro_hasRole_1);
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${goods}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("ago");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t<option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ ago.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ago.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\r\n");
          out.write("\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }
}
