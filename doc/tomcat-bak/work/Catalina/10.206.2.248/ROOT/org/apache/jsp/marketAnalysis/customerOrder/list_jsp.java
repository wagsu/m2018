/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.20
 * Generated at: 2017-01-06 01:29:39 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.marketAnalysis.customerOrder;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1471862222000L));
    _jspx_dependants.put("jar:file:/data/wwwroot/channel-webapp/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153356282000L));
    _jspx_dependants.put("/WEB-INF/nubia.tld", Long.valueOf(1472004632000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005frbac_005fprivilege_0026_005ftest;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005frbac_005fprivilege_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005frbac_005fprivilege_0026_005ftest.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>客户下单分析</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"/res/bootstrap/core/bootstrap.min.css\"/>\n");
      out.write("    <link rel=\"stylesheet\" href=\"/res/datepicker/css/bootstrap-datetimepicker.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"/res/bootstrap/core/bootstrap-theme.min.css\"/>\n");
      out.write("    <link rel=\"stylesheet\" href=\"/res/bootstrap-table/bootstrap-table.min.css\"/>\n");
      out.write("    <link rel=\"stylesheet\" href=\"/res/bootstrap-multiselect/bootstrap-multiselect.css\"/>\n");
      out.write("    <link rel=\"stylesheet\" href=\"/res/common/common.css\"/>\n");
      out.write("    <link rel=\"stylesheet\" href=\"/res/css/loader.css\"/>\n");
      out.write("    <link rel=\"stylesheet\" href=\"/res/icheck/css/custom.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"/res/icheck/skins/all.css\">\n");
      out.write("    <style type=\"text/css\">\n");
      out.write("        .form-group {\n");
      out.write("            margin-top: 5px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        @keyframes spin {\n");
      out.write("            from {\n");
      out.write("                transform: rotate(0deg);\n");
      out.write("            }\n");
      out.write("            to {\n");
      out.write("                transform: rotate(360deg);\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        #selModel {\n");
      out.write("            width: 199px;\n");
      out.write("            border-radius: 3px;\n");
      out.write("            height: 34px;\n");
      out.write("            line-height: 34px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        td {\n");
      out.write("            width: 20%;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .dropdown-menu {\n");
      out.write("            height: 300px;\n");
      out.write("            overflow-y: scroll;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .btn-group {\n");
      out.write("            margin-left: 10px;\n");
      out.write("            float: left\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .selection {\n");
      out.write("            margin-left: 10px;\n");
      out.write("            width: 230px;\n");
      out.write("            border-radius: 3px;\n");
      out.write("            height: 34px;\n");
      out.write("            line-height: 30px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .multiselect, .dropdown-menu {\n");
      out.write("            width: 445px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .iradio_square-blue {\n");
      out.write("            left: 15px !important\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .demo-list ul li {\n");
      out.write("            padding: 0 0 0 57px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"container-fluid\">\n");
      out.write("    <h2 class=\"page-header\">客户下单分析</h2>\n");
      out.write("</div>\n");
      out.write("<div class=\"container-fluid\" style=\"margin-top: 10px;\">\n");
      out.write("    <span style=\"margin-left:30px; float:left; font-size:14px;\">\n");
      out.write("        <h5>时间：</h5>\n");
      out.write("    </span>\n");
      out.write("    <div style=\"float: left; width: 230px; margin-left: 10px\">\n");
      out.write("        <div class='input-group date' id='startTime'>\n");
      out.write("            <input type='text' class=\"form-control\"/>\n");
      out.write("            <span class=\"input-group-addon\"><span class=\"glyphicon glyphicon-calendar\"></span></span>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div style=\"float: left; width: 85px; height: 30px;\">\n");
      out.write("        <h5 style=\"margin-left: 10px;\">到：</h5>\n");
      out.write("    </div>\n");
      out.write("    <div style=\"float: left; width: 230px;\">\n");
      out.write("        <div class='input-group date' id='endTime'>\n");
      out.write("            <input type='text' class=\"form-control\"/>\n");
      out.write("            <span class=\"input-group-addon\"><span class=\"glyphicon glyphicon-calendar\"></span></span>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<div class=\"container-fluid\" style=\"margin-top: 10px;\">\n");
      out.write("    <span style=\"margin-left:30px; float:left; font-size:14px;\">\n");
      out.write("        <h5>地区：</h5>\n");
      out.write("    </span>\n");
      out.write("    <div style=\"float: left;\">\n");
      out.write("        <SELECT class=\"selection\" name=\"selRegion\" id=\"selRegion\" onChange=\"changeProvince()\">\n");
      out.write("            <option value=\"\">--请选择大区--</option>\n");
      out.write("            ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        </SELECT>\n");
      out.write("    </div>\n");
      out.write("    <span style=\"float:left; font-size:14px; margin-right: 23px\">\n");
      out.write("        <h5 style=\"margin-left: 10px;\">省份：</h5>\n");
      out.write("    </span>\n");
      out.write("    <div style=\"float: left;\">\n");
      out.write("        <SELECT class=\"selection\" name=\"selProvince\" id=\"selProvince\">\n");
      out.write("            <option value=\"\">--请选择省份--</option>\n");
      out.write("        </SELECT>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<div class=\"container-fluid\" style=\"margin-top: 10px;\">\n");
      out.write("    <span style=\"margin-left:30px; float:left; font-size:14px;\">\n");
      out.write("        <h5>型号：</h5>\n");
      out.write("    </span>\n");
      out.write("    <SELECT name=\"selModel\" id=\"selModel\" multiple=\"multiple\">\n");
      out.write("        ");
      if (_jspx_meth_c_005fforEach_005f1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    </SELECT>\n");
      out.write("    ");
      out.write("\n");
      out.write("    ");
      if (_jspx_meth_rbac_005fprivilege_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("<script src=\"/res/jquery.min.js\"></script>\n");
      out.write("<script src=\"/res/icheck/js/icheck.js\"></script>\n");
      out.write("<script src=\"/res/bootstrap-multiselect/bootstrap-multiselect.js\"></script>\n");
      out.write("<script src=\"/res/bootstrap/core/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"/res/bootstrap-table/bootstrap-table.min.js\"></script>\n");
      out.write("<script src=\"/res/datepicker/js/moment-with-locales.js\"></script>\n");
      out.write("<script src=\"/res/datepicker/js/bootstrap-datetimepicker.js\"></script>\n");
      out.write("<script src=\"/res/moment/moment.min.js\"></script>\n");
      out.write("<script src=\"/marketAnalysis/customerOrder/list.js?v=20161005\"></script>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /marketAnalysis/customerOrder/list.jsp(104,12) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/marketAnalysis/customerOrder/list.jsp(104,12) '${region}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${region}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /marketAnalysis/customerOrder/list.jsp(104,12) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("map");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${map.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${map.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("            ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f1.setParent(null);
    // /marketAnalysis/customerOrder/list.jsp(123,8) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setItems(new org.apache.jasper.el.JspValueExpression("/marketAnalysis/customerOrder/list.jsp(123,8) '${models}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${models}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /marketAnalysis/customerOrder/list.jsp(123,8) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setVar("list");
    int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
      if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("            <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list.prdModel}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list.prdModel}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f1.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_rbac_005fprivilege_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  rbac:privilege
    com.nubia.rbac.tag.PrivilegeTag _jspx_th_rbac_005fprivilege_005f0 = (com.nubia.rbac.tag.PrivilegeTag) _005fjspx_005ftagPool_005frbac_005fprivilege_0026_005ftest.get(com.nubia.rbac.tag.PrivilegeTag.class);
    _jspx_th_rbac_005fprivilege_005f0.setPageContext(_jspx_page_context);
    _jspx_th_rbac_005fprivilege_005f0.setParent(null);
    // /marketAnalysis/customerOrder/list.jsp(132,4) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_rbac_005fprivilege_005f0.setTest("exportOpt");
    int _jspx_eval_rbac_005fprivilege_005f0 = _jspx_th_rbac_005fprivilege_005f0.doStartTag();
    if (_jspx_eval_rbac_005fprivilege_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("        <div class=\"btn-group\">\n");
        out.write("            <button id=\"export-btn\" type=\"button\" class=\"btn btn-primary\" style=\"margin-left: 10px\">导出</button>\n");
        out.write("            <button type=\"button\" class=\"btn btn-primary dropdown-toggle\" data-toggle=\"dropdown\"\n");
        out.write("                    aria-haspopup=\"true\" aria-expanded=\"false\">\n");
        out.write("                <span class=\"caret\"></span>\n");
        out.write("                <span class=\"sr-only\">Toggle Dropdown</span>\n");
        out.write("            </button>\n");
        out.write("            <ul class=\"dropdown-menu\" role=\"menu\" style=\"width:100px\">\n");
        out.write("                <li>\n");
        out.write("                    ");
        if (_jspx_meth_c_005fforEach_005f2(_jspx_th_rbac_005fprivilege_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                </li>\n");
        out.write("            </ul>\n");
        out.write("        </div>\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_rbac_005fprivilege_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_rbac_005fprivilege_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005frbac_005fprivilege_0026_005ftest.reuse(_jspx_th_rbac_005fprivilege_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005frbac_005fprivilege_0026_005ftest.reuse(_jspx_th_rbac_005fprivilege_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_rbac_005fprivilege_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_rbac_005fprivilege_005f0);
    // /marketAnalysis/customerOrder/list.jsp(142,20) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f2.setVar("item");
    // /marketAnalysis/customerOrder/list.jsp(142,20) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f2.setItems(new org.apache.jasper.el.JspValueExpression("/marketAnalysis/customerOrder/list.jsp(142,20) '${titles}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${titles}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f2 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f2 = _jspx_th_c_005fforEach_005f2.doStartTag();
      if (_jspx_eval_c_005fforEach_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                        <label style=\"margin-left: 10px;\">\n");
          out.write("                            <input name=\"excel-title\" type=\"checkbox\" data-field=\"id\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("\"\n");
          out.write("                                   checked=\"checked\">\n");
          out.write("                                ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                        </label>\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f2.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f2);
    }
    return false;
  }
}