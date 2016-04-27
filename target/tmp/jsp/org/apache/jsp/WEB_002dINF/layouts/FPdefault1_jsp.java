package org.apache.jsp.WEB_002dINF.layouts;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.ExcessiveAttemptsException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.apache.shiro.authc.ExcessiveAttemptsException;
import org.apache.shiro.authc.IncorrectCredentialsException;

public final class FPdefault1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(4);
    _jspx_dependants.add("/WEB-INF/layouts/FPlogin.jsp");
    _jspx_dependants.add("/WEB-INF/layouts/FPheader.jsp");
    _jspx_dependants.add("/WEB-INF/layouts/FPleft.jsp");
    _jspx_dependants.add("/WEB-INF/layouts/FPfooter.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sitemesh_title_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sitemesh_head_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_shiro_notAuthenticated;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_shiro_authenticated;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_shiro_hasAnyRoles_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_shiro_hasRole_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sitemesh_body_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sitemesh_title_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sitemesh_head_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_shiro_notAuthenticated = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_shiro_authenticated = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_shiro_hasAnyRoles_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_shiro_hasRole_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sitemesh_body_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_sitemesh_title_nobody.release();
    _jspx_tagPool_sitemesh_head_nobody.release();
    _jspx_tagPool_shiro_notAuthenticated.release();
    _jspx_tagPool_shiro_authenticated.release();
    _jspx_tagPool_shiro_hasAnyRoles_name.release();
    _jspx_tagPool_shiro_hasRole_name.release();
    _jspx_tagPool_sitemesh_body_nobody.release();
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write(" <head>\r\n");
      out.write("    \r\n");
      out.write("    <title>物流电子商务平台 ");
      if (_jspx_meth_sitemesh_title_0(_jspx_page_context))
        return;
      out.write("</title>\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <meta name=\"author\" content=\"\">\r\n");
      out.write("    \r\n");
      out.write("    <link type=\"image/x-icon\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/images/favicon.ico\" rel=\"shortcut icon\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/jquery/jquery-1.9.1.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/jquery-validation/1.11.1/validate.css\" type=\"text/css\" rel=\"stylesheet\" />\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/jquery-validation/1.11.1/jquery.validate.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/jquery-validation/1.11.1/messages_bs_zh.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Le styles -->\r\n");
      out.write("    <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/bootstrap/2.3.2/css/bootstrap-responsive.min.css\" type=\"text/css\" rel=\"stylesheet\" />\r\n");
      out.write("    <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/bootstrap/2.3.2/css/bootstrap.min.css\" type=\"text/css\" rel=\"stylesheet\" />\r\n");
      out.write("    \r\n");
      out.write("    <style type=\"text/css\">\r\n");
      out.write("      body {\r\n");
      out.write("        padding-top: 20px;\r\n");
      out.write("        padding-bottom: 60px;\r\n");
      out.write("       /*  background:url(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/images/background/FPbackground.jpg) center 0 no-repeat ; */\r\n");
      out.write("        width:100%;\r\n");
      out.write("        height:100%;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      /* Custom container */\r\n");
      out.write("      .container {\r\n");
      out.write("        margin: 0 auto;\r\n");
      out.write("        max-width: 1000px;\r\n");
      out.write("      }\r\n");
      out.write("      .container > hr {\r\n");
      out.write("        margin: 60px 0;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      /* Main marketing message and sign up button */\r\n");
      out.write("      .jumbotron {\r\n");
      out.write("        margin: 80px 0;\r\n");
      out.write("        text-align: center;\r\n");
      out.write("      }\r\n");
      out.write("      .jumbotron h1 {\r\n");
      out.write("        font-size: 100px;\r\n");
      out.write("        line-height: 1;\r\n");
      out.write("      }\r\n");
      out.write("      .jumbotron .lead {\r\n");
      out.write("        font-size: 24px;\r\n");
      out.write("        line-height: 1.25;\r\n");
      out.write("      }\r\n");
      out.write("      .jumbotron .btn {\r\n");
      out.write("        font-size: 21px;\r\n");
      out.write("        padding: 14px 24px;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      /* Supporting marketing content */\r\n");
      out.write("      .marketing {\r\n");
      out.write("        margin: 60px 0;\r\n");
      out.write("      }\r\n");
      out.write("      .marketing p + h4 {\r\n");
      out.write("        margin-top: 28px;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("      /* Customize the navbar links to be fill the entire space of the .navbar */\r\n");
      out.write("      .navbar .navbar-inner {\r\n");
      out.write("        padding: 0;\r\n");
      out.write("      }\r\n");
      out.write("      .navbar .nav {\r\n");
      out.write("        margin: 0;\r\n");
      out.write("        display: table;\r\n");
      out.write("        width: 100%;\r\n");
      out.write("      }\r\n");
      out.write("      .navbar .nav li {\r\n");
      out.write("        display: table-cell;\r\n");
      out.write("        width: 1%;\r\n");
      out.write("        float: none;\r\n");
      out.write("      }\r\n");
      out.write("      .navbar .nav li a {\r\n");
      out.write("      \tcolor:#fff;\r\n");
      out.write("      \tfont-family:SimSun;\r\n");
      out.write("        \r\n");
      out.write("        text-align: center;\r\n");
      out.write("        text-shadow: none;\r\n");
      out.write("        border-left: 1px solid rgba(0,0,200,.50);\r\n");
      out.write("        border-right: 1px solid rgba(0,0,200,.15);\r\n");
      out.write("      }\r\n");
      out.write("      .navbar .nav li:first-child a {\r\n");
      out.write("        border-left: 0;\r\n");
      out.write("        border-radius: 3px 0 0 3px;\r\n");
      out.write("      }\r\n");
      out.write("      .navbar .nav li:last-child a {\r\n");
      out.write("        border-right: 0;\r\n");
      out.write("        border-radius: 0 3px 3px 0;\r\n");
      out.write("      }\r\n");
      out.write("      \r\n");
      out.write("    </style>\r\n");
      out.write("    <link href=\"static/bootstrap/2.3.2/css/bootstrap-responsive.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    ");
      if (_jspx_meth_sitemesh_head_0(_jspx_page_context))
        return;
      out.write("                               \r\n");
      out.write("                                  \r\n");
      out.write("  </head>\r\n");
      out.write("\r\n");
      out.write("<body style=\"padding-top:0px; padding-bottom:0px\">\r\n");
      out.write("\t<div>\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_set_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("<div class=\"navbar\" style=\"margin-bottom:0px;\">\r\n");
      out.write("\t  \r\n");
      out.write("      <div class=\"navbar-inner\" style=\"background-image: url(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/images/background/logo_wuliu.jpg);height:82px;\">\r\n");
      out.write("        \r\n");
      out.write("         <!-- <a class=\"brand\" href=\"#\" style=\"color:#777777; margin-left:20px;font-weight:bold; font-family:Microsoft YaHei  \" >物流电子商务平台</a> -->\r\n");
      out.write("            <form id=\"loginForm\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/login\" method=\"post\" class=\"navbar-form pull-right\" style=\"margin-top:22px;margin-right:10px\">\r\n");
      out.write("              ");

				String error = (String) request.getAttribute(FormAuthenticationFilter.DEFAULT_ERROR_KEY_ATTRIBUTE_NAME);
				if(error != null){
				
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"alert alert-error input-medium controls\">\r\n");
      out.write("\t\t\t\t\t\t<button class=\"close\" data-dismiss=\"alert\">×</button>登录失败，请重试.\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t");

				}
			  
      out.write("\r\n");
      out.write("             ");
      if (_jspx_meth_shiro_notAuthenticated_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("             \r\n");
      out.write("             ");
      if (_jspx_meth_shiro_authenticated_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("             \r\n");
      out.write("            </form>\r\n");
      out.write("          </div><!--/.nav-collapse -->\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("    <script>\r\n");
      out.write("\t\t$(document).ready(function() {\r\n");
      out.write("\t\t\t$(\"#loginForm\").validate();\r\n");
      out.write("\t\t});\r\n");
      out.write("\t</script> ");
      out.write("\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_set_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("<div class=\"navbar\">\r\n");
      out.write("          <div class=\"navbar-inner\" style=\"background-image: url(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/images/background/navigation_bg.jpg)\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("              <ul class=\"nav\" >\r\n");
      out.write("                <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/frontpage/index\" style=\"font-size:18px; text-shadow:0px;\">首页</a></li>\r\n");
      out.write("                <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/frontpage1/introduce\" style=\" font-size:18px;\" >公司简介</a></li>\r\n");
      out.write("                <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/frontpage1/news\" style=\" font-size:18px;\">公司新闻</a></li>\r\n");
      out.write("                <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/frontpage1/contactus\" style=\" font-size:18px;\">联系我们</a></li>\r\n");
      out.write("                <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/frontpage1/feedback\" style=\" font-size:18px;\">留言反馈</a></li>\r\n");
      out.write("              \r\n");
      out.write("                ");
      if (_jspx_meth_shiro_hasAnyRoles_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                \r\n");
      out.write("                ");
      if (_jspx_meth_shiro_hasAnyRoles_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                \r\n");
      out.write("                ");
      if (_jspx_meth_shiro_hasRole_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("                \r\n");
      out.write("                ");
      if (_jspx_meth_shiro_hasRole_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                \r\n");
      out.write("                ");
      if (_jspx_meth_shiro_hasRole_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                \r\n");
      out.write("                ");
      if (_jspx_meth_shiro_hasRole_3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("              </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("</div><!-- /.navbar -->\r\n");
      out.write("\t\r\n");
      out.write("\t\t<div class=\"row\" style=\"margin-left:0px\">\r\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_set_3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<div id=\"leftbar\" class=\"span3\">\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("    <div class=\"well sidebar-nav\" style=\"margin-left:-20px;\">\r\n");
      out.write("\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/images/left2.jpg\"  alt=\"网站公告\" style=\"margin-top:-10px;margin-bottom:10px\">\r\n");
      out.write("\t\t<marquee height=\"184\" scrollamount=\"2\" direction=\"up\" style=\"font-size:11px;line-height: 30px;\">  我们通过优良的物流服务赢得信誉，让客户体会到服务第一、客户至上，我们将以最大的热情服务于每位客户。目前我们已经培养了一支精力充沛、技术娴熟、经验丰富的驾驶队伍。我们以“顾客至上”为理念，我们公司管理严格，严格按照客户需求来操作，客户的满意和信赖是我们永恒的追求。  </marquee>\r\n");
      out.write("\t\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"well sidebar-nav\" style=\"margin-left:-20px;\">\r\n");
      out.write("\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/images/left1.jpg\"  alt=\"left1\" style=\"margin-top:-10px;margin-bottom:10px\">\r\n");
      out.write("\t\t<ul class=\"nav nav-list\">\r\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("              <li class=\"active\" style=\"font-size:13px\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/frontpage1/introduce\">公司简介</a></li>\r\n");
      out.write("              <li style=\"font-size:13px\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/frontpage1/news\">公司新闻</a></li>\r\n");
      out.write("              <li style=\"font-size:13px\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/frontpage1/contactus\">联系我们</a></li>\r\n");
      out.write("              <li style=\"font-size:13px\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/frontpage1/feedback\">留言反馈</a></li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("</div>");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div id=\"main\" class=\"span8\" style=\"width:680px\">\r\n");
      out.write("\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t<img alt=\"bg3\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/images/background/bg3.jpg\"/>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_sitemesh_body_0(_jspx_page_context))
        return;
      out.write("\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<div class=\"footer\">\r\n");
      out.write("\t\t<hr></hr>\r\n");
      out.write("        <p style=\"font-size:12px;\">&copy; By XY 2014</p>\r\n");
      out.write("      </div>");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/bootstrap/2.3.2/js/bootstrap.min.js\"></script>\r\n");
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

  private boolean _jspx_meth_sitemesh_title_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sitemesh:title
    com.opensymphony.module.sitemesh.taglib.decorator.TitleTag _jspx_th_sitemesh_title_0 = (com.opensymphony.module.sitemesh.taglib.decorator.TitleTag) _jspx_tagPool_sitemesh_title_nobody.get(com.opensymphony.module.sitemesh.taglib.decorator.TitleTag.class);
    _jspx_th_sitemesh_title_0.setPageContext(_jspx_page_context);
    _jspx_th_sitemesh_title_0.setParent(null);
    int _jspx_eval_sitemesh_title_0 = _jspx_th_sitemesh_title_0.doStartTag();
    if (_jspx_th_sitemesh_title_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sitemesh_title_nobody.reuse(_jspx_th_sitemesh_title_0);
      return true;
    }
    _jspx_tagPool_sitemesh_title_nobody.reuse(_jspx_th_sitemesh_title_0);
    return false;
  }

  private boolean _jspx_meth_sitemesh_head_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sitemesh:head
    com.opensymphony.module.sitemesh.taglib.decorator.HeadTag _jspx_th_sitemesh_head_0 = (com.opensymphony.module.sitemesh.taglib.decorator.HeadTag) _jspx_tagPool_sitemesh_head_nobody.get(com.opensymphony.module.sitemesh.taglib.decorator.HeadTag.class);
    _jspx_th_sitemesh_head_0.setPageContext(_jspx_page_context);
    _jspx_th_sitemesh_head_0.setParent(null);
    int _jspx_eval_sitemesh_head_0 = _jspx_th_sitemesh_head_0.doStartTag();
    if (_jspx_th_sitemesh_head_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sitemesh_head_nobody.reuse(_jspx_th_sitemesh_head_0);
      return true;
    }
    _jspx_tagPool_sitemesh_head_nobody.reuse(_jspx_th_sitemesh_head_0);
    return false;
  }

  private boolean _jspx_meth_c_set_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_1.setPageContext(_jspx_page_context);
    _jspx_th_c_set_1.setParent(null);
    _jspx_th_c_set_1.setVar("ctx");
    _jspx_th_c_set_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_1 = _jspx_th_c_set_1.doStartTag();
    if (_jspx_th_c_set_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
    return false;
  }

  private boolean _jspx_meth_shiro_notAuthenticated_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  shiro:notAuthenticated
    org.apache.shiro.web.tags.NotAuthenticatedTag _jspx_th_shiro_notAuthenticated_0 = (org.apache.shiro.web.tags.NotAuthenticatedTag) _jspx_tagPool_shiro_notAuthenticated.get(org.apache.shiro.web.tags.NotAuthenticatedTag.class);
    _jspx_th_shiro_notAuthenticated_0.setPageContext(_jspx_page_context);
    _jspx_th_shiro_notAuthenticated_0.setParent(null);
    int _jspx_eval_shiro_notAuthenticated_0 = _jspx_th_shiro_notAuthenticated_0.doStartTag();
    if (_jspx_eval_shiro_notAuthenticated_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("              <input type=\"text\" id=\"username\" name=\"username\"  value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" class=\"input-medium required\" placeholder=\"用户名\"/>\r\n");
        out.write("              <input type=\"password\" id=\"password\" name=\"password\" class=\"input-medium required\" placeholder=\"密码\"/>\r\n");
        out.write("              <input id=\"submit_btn\" class=\"btn btn-primary\" type=\"submit\" value=\"登录\"/>\r\n");
        out.write("             ");
        int evalDoAfterBody = _jspx_th_shiro_notAuthenticated_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_shiro_notAuthenticated_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_shiro_notAuthenticated.reuse(_jspx_th_shiro_notAuthenticated_0);
      return true;
    }
    _jspx_tagPool_shiro_notAuthenticated.reuse(_jspx_th_shiro_notAuthenticated_0);
    return false;
  }

  private boolean _jspx_meth_shiro_authenticated_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  shiro:authenticated
    org.apache.shiro.web.tags.AuthenticatedTag _jspx_th_shiro_authenticated_0 = (org.apache.shiro.web.tags.AuthenticatedTag) _jspx_tagPool_shiro_authenticated.get(org.apache.shiro.web.tags.AuthenticatedTag.class);
    _jspx_th_shiro_authenticated_0.setPageContext(_jspx_page_context);
    _jspx_th_shiro_authenticated_0.setParent(null);
    int _jspx_eval_shiro_authenticated_0 = _jspx_th_shiro_authenticated_0.doStartTag();
    if (_jspx_eval_shiro_authenticated_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" \r\n");
        out.write("             \t\r\n");
        out.write("            \t<span style=\"color:#777777;font-family:Microsoft YaHei;padding:10px 20px\">你好！</span> <a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/logout\" style=\"color:#777777; margin-right:20px;font-family:Microsoft YaHei\" >退出登录</a>\r\n");
        out.write("            \r\n");
        out.write("             ");
        int evalDoAfterBody = _jspx_th_shiro_authenticated_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_shiro_authenticated_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_shiro_authenticated.reuse(_jspx_th_shiro_authenticated_0);
      return true;
    }
    _jspx_tagPool_shiro_authenticated.reuse(_jspx_th_shiro_authenticated_0);
    return false;
  }

  private boolean _jspx_meth_c_set_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_2 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_2.setPageContext(_jspx_page_context);
    _jspx_th_c_set_2.setParent(null);
    _jspx_th_c_set_2.setVar("ctx");
    _jspx_th_c_set_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_2 = _jspx_th_c_set_2.doStartTag();
    if (_jspx_th_c_set_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_2);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_2);
    return false;
  }

  private boolean _jspx_meth_shiro_hasAnyRoles_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  shiro:hasAnyRoles
    org.apache.shiro.web.tags.HasAnyRolesTag _jspx_th_shiro_hasAnyRoles_0 = (org.apache.shiro.web.tags.HasAnyRolesTag) _jspx_tagPool_shiro_hasAnyRoles_name.get(org.apache.shiro.web.tags.HasAnyRolesTag.class);
    _jspx_th_shiro_hasAnyRoles_0.setPageContext(_jspx_page_context);
    _jspx_th_shiro_hasAnyRoles_0.setParent(null);
    _jspx_th_shiro_hasAnyRoles_0.setName("manager");
    int _jspx_eval_shiro_hasAnyRoles_0 = _jspx_th_shiro_hasAnyRoles_0.doStartTag();
    if (_jspx_eval_shiro_hasAnyRoles_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                \t<li><a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx }", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/frontpage/pricelst\" style=\" font-size:18px;\">价格管理</a></li>\r\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_shiro_hasAnyRoles_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_shiro_hasAnyRoles_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_shiro_hasAnyRoles_name.reuse(_jspx_th_shiro_hasAnyRoles_0);
      return true;
    }
    _jspx_tagPool_shiro_hasAnyRoles_name.reuse(_jspx_th_shiro_hasAnyRoles_0);
    return false;
  }

  private boolean _jspx_meth_shiro_hasAnyRoles_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  shiro:hasAnyRoles
    org.apache.shiro.web.tags.HasAnyRolesTag _jspx_th_shiro_hasAnyRoles_1 = (org.apache.shiro.web.tags.HasAnyRolesTag) _jspx_tagPool_shiro_hasAnyRoles_name.get(org.apache.shiro.web.tags.HasAnyRolesTag.class);
    _jspx_th_shiro_hasAnyRoles_1.setPageContext(_jspx_page_context);
    _jspx_th_shiro_hasAnyRoles_1.setParent(null);
    _jspx_th_shiro_hasAnyRoles_1.setName("controller,owner");
    int _jspx_eval_shiro_hasAnyRoles_1 = _jspx_th_shiro_hasAnyRoles_1.doStartTag();
    if (_jspx_eval_shiro_hasAnyRoles_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                \t<li><a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx }", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/frontpage/pricelst\" style=\" font-size:18px;\">价格查询</a></li>\r\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_shiro_hasAnyRoles_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_shiro_hasAnyRoles_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_shiro_hasAnyRoles_name.reuse(_jspx_th_shiro_hasAnyRoles_1);
      return true;
    }
    _jspx_tagPool_shiro_hasAnyRoles_name.reuse(_jspx_th_shiro_hasAnyRoles_1);
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
        out.write("             \t<li><a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/controllerRelation\" style=\" font-size:18px;\">客户关系</a></li>\r\n");
        out.write("               <!-- <li><a href=\"\">订单线路管理</a></li> --> \r\n");
        out.write("                <li><a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx }", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/frontpage/waybilst\" style=\" font-size:18px;\">订单管理</a></li>\r\n");
        out.write("                ");
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
        out.write("\r\n");
        out.write("                \t<li><a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/story/waybill\" style=\" font-size:18px;\">订单查询</a></li>\r\n");
        out.write("                ");
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

  private boolean _jspx_meth_shiro_hasRole_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  shiro:hasRole
    org.apache.shiro.web.tags.HasRoleTag _jspx_th_shiro_hasRole_2 = (org.apache.shiro.web.tags.HasRoleTag) _jspx_tagPool_shiro_hasRole_name.get(org.apache.shiro.web.tags.HasRoleTag.class);
    _jspx_th_shiro_hasRole_2.setPageContext(_jspx_page_context);
    _jspx_th_shiro_hasRole_2.setParent(null);
    _jspx_th_shiro_hasRole_2.setName("manager");
    int _jspx_eval_shiro_hasRole_2 = _jspx_th_shiro_hasRole_2.doStartTag();
    if (_jspx_eval_shiro_hasRole_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                 \t<li><a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/relationManage\" style=\" font-size:18px;\">客户关系</a></li>\r\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_shiro_hasRole_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_shiro_hasRole_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_shiro_hasRole_name.reuse(_jspx_th_shiro_hasRole_2);
      return true;
    }
    _jspx_tagPool_shiro_hasRole_name.reuse(_jspx_th_shiro_hasRole_2);
    return false;
  }

  private boolean _jspx_meth_shiro_hasRole_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  shiro:hasRole
    org.apache.shiro.web.tags.HasRoleTag _jspx_th_shiro_hasRole_3 = (org.apache.shiro.web.tags.HasRoleTag) _jspx_tagPool_shiro_hasRole_name.get(org.apache.shiro.web.tags.HasRoleTag.class);
    _jspx_th_shiro_hasRole_3.setPageContext(_jspx_page_context);
    _jspx_th_shiro_hasRole_3.setParent(null);
    _jspx_th_shiro_hasRole_3.setName("owner");
    int _jspx_eval_shiro_hasRole_3 = _jspx_th_shiro_hasRole_3.doStartTag();
    if (_jspx_eval_shiro_hasRole_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                \t<li><a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/story/vehicle/list\" style=\" font-size:18px;\">车船管理</a></li>\r\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_shiro_hasRole_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_shiro_hasRole_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_shiro_hasRole_name.reuse(_jspx_th_shiro_hasRole_3);
      return true;
    }
    _jspx_tagPool_shiro_hasRole_name.reuse(_jspx_th_shiro_hasRole_3);
    return false;
  }

  private boolean _jspx_meth_c_set_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_3 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_3.setPageContext(_jspx_page_context);
    _jspx_th_c_set_3.setParent(null);
    _jspx_th_c_set_3.setVar("ctx");
    _jspx_th_c_set_3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_3 = _jspx_th_c_set_3.doStartTag();
    if (_jspx_th_c_set_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_3);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_3);
    return false;
  }

  private boolean _jspx_meth_sitemesh_body_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sitemesh:body
    com.opensymphony.module.sitemesh.taglib.decorator.BodyTag _jspx_th_sitemesh_body_0 = (com.opensymphony.module.sitemesh.taglib.decorator.BodyTag) _jspx_tagPool_sitemesh_body_nobody.get(com.opensymphony.module.sitemesh.taglib.decorator.BodyTag.class);
    _jspx_th_sitemesh_body_0.setPageContext(_jspx_page_context);
    _jspx_th_sitemesh_body_0.setParent(null);
    int _jspx_eval_sitemesh_body_0 = _jspx_th_sitemesh_body_0.doStartTag();
    if (_jspx_th_sitemesh_body_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sitemesh_body_nobody.reuse(_jspx_th_sitemesh_body_0);
      return true;
    }
    _jspx_tagPool_sitemesh_body_nobody.reuse(_jspx_th_sitemesh_body_0);
    return false;
  }
}
