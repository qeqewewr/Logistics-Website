package org.apache.jsp.WEB_002dINF.views.waybill;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class editwaybill_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>订单修改</title>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/datetimepicker/css/bootstrap-datetimepicker.min.css\" rel=\"stylesheet\" media=\"screen\">\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/datetimepicker/js/bootstrap-datetimepicker.js\" charset=\"UTF-8\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/datetimepicker./js/locales/bootstrap-datetimepicker.fr.js\" charset=\"UTF-8\"></script>\r\n");
      out.write("\t\t\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<form id=\"inputForm\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/frontpage/waybill/updateform\" method=\"post\" class=\"form-horizontal\">\r\n");
      out.write("\t  <input type=\"hidden\" name=\"id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${waybill.id }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\r\n");
      out.write("\t\r\n");
      out.write("\t\t<fieldset>\r\n");
      out.write("\t\t\t<legend><small>修改订单</small></legend>\r\n");
      out.write("\t\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t\t<label class=\"control-label\">运单编号:</label>\r\n");
      out.write("\t\t\t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t<span class=\"help-inline\" style=\"padding:5px 0px\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${waybill.number }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t\t<label class=\"control-label\">客户姓名:</label>\r\n");
      out.write("\t\t\t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t<span class=\"help-inline\" style=\"padding:5px 0px\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${waybill.wlCustomer.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("\t\t\t\t\t  </span>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t\t<label class=\"control-label\">客户电话:</label>\r\n");
      out.write("\t\t\t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t<span class=\"help-inline\" style=\"padding:5px 0px\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${waybill.wlCustomer.phone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("\t\t\t\t\t  </span>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t\t<label class=\"control-label\">客户邮箱:</label>\r\n");
      out.write("\t\t\t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t<span class=\"help-inline\" style=\"padding:5px 0px\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${waybill.wlCustomer.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("\t\t\t\t\t  </span>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t\t<label class=\"control-label\">发件人:</label>\r\n");
      out.write("\t\t\t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t<span class=\"help-inline\" style=\"padding:5px 0px\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${waybill.sender }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("\t\t\t\t\t  </span>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t\t<label class=\"control-label\">发件人地址:</label>\r\n");
      out.write("\t\t\t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t<span class=\"help-inline\" style=\"padding:5px 0px\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${waybill.sendaddress }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("\t\t\t\t\t  </span>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t\t<label class=\"control-label\">收件人:</label>\r\n");
      out.write("\t\t\t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t<span class=\"help-inline\" style=\"padding:5px 0px\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${waybill.receiver }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("\t\t\t\t\t  </span>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t\t<label class=\"control-label\">收件人地址:</label>\r\n");
      out.write("\t\t\t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t<span class=\"help-inline\" style=\"padding:5px 0px\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${waybill.receiveaddress }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("\t\t\t\t\t  </span>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t\t<label class=\"control-label\">重量:</label>\r\n");
      out.write("\t\t\t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t<span class=\"help-inline\" style=\"padding:5px 0px\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${waybill.weight }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("\t\t\t\t\t  </span>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t\t<label class=\"control-label\">体积:</label>\r\n");
      out.write("\t\t\t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t<span class=\"help-inline\" style=\"padding:5px 0px\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${waybill.volume }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("\t\t\t\t\t  </span>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t\t<label class=\"control-label\">运单价格:</label>\r\n");
      out.write("\t\t\t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" id=\"price\" name=\"price\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${waybill.price }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"input-large required number\"/>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t\t<label class=\"control-label\">发货时间:</label>\r\n");
      out.write("\t\t\t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t   <input size=\"16\" type=\"text\" name=\"sendtime1\" readonly class=\"form_date\"  data-date=\"2012-02-12\" data-date-format=\"yyyy-mm-dd\" >\r\n");
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
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t\t<label class=\"control-label\">订单审核:</label>\r\n");
      out.write("\t\t\t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t<select name=\"status\">\r\n");
      out.write("\t\t\t\t\t <option value=\"1\">已通过</option>\r\n");
      out.write("\t\t\t\t\t <option value=\"2\">未审核</option>\r\n");
      out.write("\t\t\t\t\t <option value=\"0\">未通过</option>\r\n");
      out.write("\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t</div>\r\n");
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
      out.write("</html>");
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
}
