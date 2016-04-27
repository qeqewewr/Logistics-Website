package org.apache.jsp.WEB_002dINF.views.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addgoods_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<title>货物管理</title>\r\n");
      out.write("\t\t\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\t$(document).ready(function() {\r\n");
      out.write("\t\t\t//聚焦第一个输入框\r\n");
      out.write("\t\t\t$(\"#number\").focus();\r\n");
      out.write("\t\t\t//为inputForm注册validate函数\r\n");
      out.write("\t\t\t$(\"#inputForm\").validate();\r\n");
      out.write("\t\t});\r\n");
      out.write("\t</script>\r\n");
      out.write("\t\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"row-fluid\">\r\n");
      out.write("\t\t\t\t<div class=\"span12\">\r\n");
      out.write("\t\t\t\t\t<div class=\"box\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"box-head\">\r\n");
      out.write("\t\t\t\t\t\t\t<h3>货物管理</h3>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"box-content\">\r\n");
      out.write("\t<form id=\"inputForm\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/admin/addgoods\" method=\"post\" class=\"form-horizontal\">\r\n");
      out.write("\t\t<fieldset>\r\n");
      out.write("\t\t\t<legend></legend>\r\n");
      out.write("\t\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t\t<label for=\"type\" class=\"control-label\">类型:</label>\r\n");
      out.write("\t\t\t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" id=\"type\" name=\"type\" class=\"input-large required\"/>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t<label for=\"source\" class=\"control-label\">产地：</label>\r\n");
      out.write("\t\t\t<div class=\"controls\">\r\n");
      out.write("                <input type=\"text\" id=\"source\" name=\"source\" class=\"input-large required\"/> \r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t   <label for=\"volume\" class=\"control-label\">体积：</label>\r\n");
      out.write("\t\t\t   <div class=\"controls\">\r\n");
      out.write("\t\t\t      <input type=\"text\" id=\"volume\" name=\"volume\" class=\"input-large required number\"/>\r\n");
      out.write("\t\t\t   </div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t   <label for=\"weight\" class=\"control-label\">重量：</label>\r\n");
      out.write("\t\t\t   <div class=\"controls\">\r\n");
      out.write("\t\t\t       <input type=\"text\" id=\"weight\" name=\"weight\" class=\"input-large required number\"/>\r\n");
      out.write("\t\t\t   </div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t   <label for=\"transportmode\" class=\"control-label\">托运方式：</label>\r\n");
      out.write("\t\t\t   <div class=\"controls\">\r\n");
      out.write("\t\t\t       <select id=\"transportmode\" name=\"transportmode\">\r\n");
      out.write("\t\t\t         <option value=\"车\">车</option>\r\n");
      out.write("\t\t\t         <option value=\"船\">船</option>\r\n");
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
      out.write("</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
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
}
