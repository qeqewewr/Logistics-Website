package org.apache.jsp.WEB_002dINF.views.frontpage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
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
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("  \t\r\n");
      out.write("    \r\n");
      out.write("\t<style>\r\n");
      out.write("\t\r\n");
      out.write("    /* CUSTOMIZE THE CAROUSEL\r\n");
      out.write("    -------------------------------------------------- */\r\n");
      out.write("\r\n");
      out.write("    /* Carousel base class */\r\n");
      out.write("   \r\n");
      out.write("    \r\n");
      out.write("    .carousel {\r\n");
      out.write("      margin-bottom: 60px;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .carousel .container {\r\n");
      out.write("      position: relative;\r\n");
      out.write("      z-index: 9;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .carousel-control {\r\n");
      out.write("      height: 80px;\r\n");
      out.write("      margin-top: 0;\r\n");
      out.write("      font-size: 120px;\r\n");
      out.write("      text-shadow: 0 1px 1px rgba(0,0,0,.4);\r\n");
      out.write("      background-color: transparent;\r\n");
      out.write("      border: 0;\r\n");
      out.write("      z-index: 10;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .carousel .item {\r\n");
      out.write("      height: 500px;\r\n");
      out.write("    }\r\n");
      out.write("    .carousel img {\r\n");
      out.write("      position: absolute;\r\n");
      out.write("      top: 0;\r\n");
      out.write("      left: 0;\r\n");
      out.write("      min-width: 1000px;\r\n");
      out.write("      height: 500px;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .carousel-caption {\r\n");
      out.write("      background-color: transparent;\r\n");
      out.write("      position: static;\r\n");
      out.write("      max-width: 550px;\r\n");
      out.write("      padding: 0 20px;\r\n");
      out.write("      margin-top: 180px;\r\n");
      out.write("      margin-left: 80px;\r\n");
      out.write("    }\r\n");
      out.write("    .carousel-caption h1,\r\n");
      out.write("    .carousel-caption .lead {\r\n");
      out.write("      margin: 0;\r\n");
      out.write("      line-height: 1.25;\r\n");
      out.write("      color: #fff;\r\n");
      out.write("      text-shadow: 0 1px 1px rgba(0,0,0,.4);\r\n");
      out.write("    }\r\n");
      out.write("    .carousel-caption .btn {\r\n");
      out.write("      margin-top: 10px;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("   \r\n");
      out.write("    </style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  </head>\r\n");
      out.write("\r\n");
      out.write("  <body>\r\n");
      out.write(" \r\n");
      out.write("      <div id=\"myCarousel\" class=\"carousel slide\">\r\n");
      out.write("      <div class=\"carousel-inner\" style=\"height:400px;\">\r\n");
      out.write("        <div class=\"item active\">\r\n");
      out.write("          <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/images/slide-01.jpg\" alt=\"1\" style=\"height:400px;width:940px;\">\r\n");
      out.write("          <div class=\"container\">\r\n");
      out.write("            <div class=\"carousel-caption\">\r\n");
      out.write("              <h1>高效</h1>\r\n");
      out.write("              <p class=\"lead\">物流电子商务平台为您提供更高效的运输服务</p>\r\n");
      out.write("              <a class=\"btn btn-large btn-primary\" href=\"#\">立即加入</a>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"item\">\r\n");
      out.write("          <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/images/slide-02.jpg\" alt=\"2\" style=\"height:400px;width:940px;\">\r\n");
      out.write("          <div class=\"container\">\r\n");
      out.write("            <div class=\"carousel-caption\">\r\n");
      out.write("              <h1>快捷</h1>\r\n");
      out.write("              <p class=\"lead\">无论您身处何地，我们将为您提供更快捷的物流服务</p>\r\n");
      out.write("              <a class=\"btn btn-large btn-primary\" href=\"#\">立即加入</a>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"item\">\r\n");
      out.write("          <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/images/slide-03.jpg\" alt=\"3\" style=\"height:400px;width:940px;\">\r\n");
      out.write("          <div class=\"container\">\r\n");
      out.write("            <div class=\"carousel-caption\">\r\n");
      out.write("              <h1>安全</h1>\r\n");
      out.write("              <p class=\"lead\">我们将提供最优质的物流服务将您的货物安全运达</p>\r\n");
      out.write("              <a class=\"btn btn-large btn-primary\" href=\"#\">立即加入</a>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <a class=\"left carousel-control\" href=\"#myCarousel\" data-slide=\"prev\">&lsaquo;</a>\r\n");
      out.write("      <a class=\"right carousel-control\" href=\"#myCarousel\" data-slide=\"next\">&rsaquo;</a>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"row\" style=\"margin-top:-45px;width:1000px\">\r\n");
      out.write("    \t<div class=\"navbar\" >\r\n");
      out.write("    \t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/images/left3.jpg\"  alt=\"网站公告\" style=\"margin-top:-10px;margin-bottom:-20px;margin-left:18px\">\r\n");
      out.write("    \t</div> \r\n");
      out.write("      \t");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("      \r\n");
      out.write("        <hr>\r\n");
      out.write("</div>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("     <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/bootstrap/2.3.2/js/bootstrap.min.js\"></script>\r\n");
      out.write("  </body>\r\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${news}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("news");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("      \r\n");
          out.write("        <div class=\"span12\" >\r\n");
          out.write("          <h3>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${news.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h3>\r\n");
          out.write("          <div style=\"line-height:200%;height:180px;width:940px;overflow:hidden;font-size:13px;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${news.content}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</div>\r\n");
          out.write("          <br>\r\n");
          out.write("          <p><a class=\"btn btn-primary\" href=\"../config/newscontent/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${news.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" style=\"width:80px;height:20px;\">全文阅读 &raquo;</a></p>\r\n");
          out.write("        </div>\r\n");
          out.write("        ");
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
}
