/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.20
 * Generated at: 2017-01-13 09:44:11 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.nubia.rbac.*;
import com.nubia.rbac.util.*;
import com.nubia.rbac.model.SysUser;
import cn.nubia.framework.crypto.*;
import cn.nubia.framework.core.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("com.nubia.rbac");
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("cn.nubia.framework.crypto");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("cn.nubia.framework.core");
    _jspx_imports_packages.add("com.nubia.rbac.util");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.nubia.rbac.model.SysUser");
  }

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
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

 
	SysUser user=(SysUser)session.getAttribute(Define.SESSION_IN_USER);
	if(user==null){
		HttpCookie cookie=new HttpCookie(request,response);
		String userId=cookie.getValue(Define.COOKIE_IN_USERID);
		if(userId!=null){
			user=RbacCache.get(RbacDes.decrypt(userId));
			if(user!=null){
				response.sendRedirect(request.getContextPath()+"/workspace/workspace.do");
			}
		}
	}else{
		response.sendRedirect(request.getContextPath()+"/workspace/workspace.do");
	}

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<meta charset=\"UTF-8\">\n");
      out.write("\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta http-equiv=\"Pragma\" content=\"no-cache\"/>\n");
      out.write("\t<meta http-equiv=\"Cache-Control\" content=\"no-cache\"/>\n");
      out.write("\t<meta http-equiv=\"Expires\" content=\"0\"/>\n");
      out.write("\t<link rel=\"shortcut icon\" href=\"http://static.nubia.cn/images/favicon.ico\" type=\"image/x-icon\">\n");
      out.write("<title>全渠道数据中心平台</title>\n");
      out.write("<link rel=\"stylesheet\" href=\"res/css/style.css?v=20170112\">\n");
      out.write("<script src=\"res/jquery.js?v=3\"></script>\n");
      out.write("<script src=\"res/jquery-ui.min.js?v=3\"></script>\n");
      out.write("<script>\n");
      out.write("var cookieName='task_username';\n");
      out.write("//密码填写错误振动；\n");
      out.write("function rock(){}\n");
      out.write("\n");
      out.write("function login(){\n");
      out.write("\tvar frm=$('form:eq(0)'),uv=frm[0].username.value,pv=frm[0].password.value,vc=frm[0].validateCode.value,tip=$('h2:eq(0)');\n");
      out.write("\tif($.trim(uv)=='' || $.trim(pv)==''){\n");
      out.write("\t\t alert('用户名与密码不能为空');\n");
      out.write("\t} else if($.trim(vc)=='') {\n");
      out.write("        alert('验证码不能为空');\n");
      out.write("    } else{\n");
      out.write("\t\t$.post(\"login/check.do\",frm.serialize(),function(r){\n");
      out.write("\t\t\tif(r==\"success\"){\n");
      out.write("\t\t\t\t$.cookie.set(cookieName,uv,2678400);\n");
      out.write("\t\t\t\ttop.location.href=\"workspace/workspace.do\";\n");
      out.write("\t\t\t}else if(r==\"username_error\"){\n");
      out.write("\t\t\t\talert('用户名不存在');\n");
      out.write("\t\t\t}else if(r==\"password_error\"){\n");
      out.write("\t\t\t\talert('密码不正确');\n");
      out.write("\t\t\t}else if(r==\"validateCode_error\") {\n");
      out.write("                alert(\"验证码不正确\");\n");
      out.write("                $(\"#validateImg\").attr(\"src\", \"login/validateCode.do?time=\" + new Date().getTime());\n");
      out.write("            }else{\n");
      out.write("\t\t\t\talert(\"系统出错,信息如下:\"+r);\n");
      out.write("\t\t\t}\n");
      out.write("\t\t});\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write("\n");
      out.write("function changeValidateCode(obj) {\n");
      out.write("    var timeNow = new Date().getTime();\n");
      out.write("    obj.src = \"login/validateCode.do?time=\" + timeNow;\n");
      out.write("}\n");
      out.write("\n");
      out.write("$(document).ready(function(){\n");
      out.write("\t\n");
      out.write("  var frm=$('form:eq(0)');\n");
      out.write("\tvar username=$.cookie.get(cookieName);\n");
      out.write("\tif(username){\n");
      out.write("\t\tfrm[0].username.value=username;\n");
      out.write("\t\t$('#userDiv .note').hide();\n");
      out.write("\t\t$('#username').focus();\n");
      out.write("\t}else{\n");
      out.write("\t\t$('#password').focus();\n");
      out.write("\t}\n");
      out.write("    frm.keypress(function (e) {\n");
      out.write("        if (e.keyCode == 13){ \n");
      out.write("      \t \tlogin();\n");
      out.write("         \treturn false;\n");
      out.write("        }            \n");
      out.write("    });\n");
      out.write("\tif(top!=self) top.location.href=\"index.jsp\";\n");
      out.write("\n");
      out.write(" $('#username').focusin(function(){$('#TMark').removeClass('hit');$('#forget').hide();}).focusout(function(){if(this.value==''){$('#userDiv .note').show();};$('#TMark').addClass('hit');}).mouseup(function(){if(this.value!=''){$('#userDiv .note').hide();}});\n");
      out.write(" $('#password').focusin(function(){$('#PMark').removeClass('hit');$('#forget').hide();}).focusout(function(){if(this.value==''){$('#codeDiv .note').show();}$('#PMark').addClass('hit');});\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write(" $('#submit').mousedown(function(){$('#submit').css(\"background-position\",\"0px -583px\");})\n");
      out.write(" \t\t\t .mouseup(function(){$('#submit').css(\"background-position\",\"0px -555px\");})\t\t \n");
      out.write(" $('#username').keydown(function(){$('#userDiv .note').hide();});\n");
      out.write(" $('#password').keydown(function(){$('#codeDiv .note').hide();});\n");
      out.write(" $('#submit').click(function(){login();})\n");
      out.write("})\n");
      out.write("\n");
      out.write("//cookie\n");
      out.write("$.cookie={\n");
      out.write("    get:function(name){\n");
      out.write("        var a=document.cookie.match(new RegExp(\"(^| )\"+name+\"=([^;]*)(;|$)\"));\n");
      out.write("        return a?unescape(a[2]):null;\n");
      out.write("    },\n");
      out.write("    set:function(name,value,seconds, path, domain, secure) {\n");
      out.write("        var a= new Date();\n");
      out.write("        a.setTime(a.getTime() + seconds);\n");
      out.write("        document.cookie =\n");
      out.write("            escape(name) + '=' + escape(value)\n");
      out.write("            + (a ? '; expires=' + a.toGMTString() : '')\n");
      out.write("            + (path ? '; path=' + path : '/')\n");
      out.write("            + (domain ? '; domain=' + domain : '')\n");
      out.write("            + (secure ? '; secure' : '');\n");
      out.write("    },\n");
      out.write("    clear:function(name) {\n");
      out.write("        var a= new Date();\n");
      out.write("        a.setTime(a.getTime() - 1);\n");
      out.write("        document.cookie= name+'=null;expires='+a.toGMTString();\n");
      out.write("    }\n");
      out.write(" };\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"w1170\">\n");
      out.write("\t<div class=\"logo\"></div><p class=\"logo-title\">欢迎使用努比亚全渠道数据中心平台</p>\n");
      out.write("</div>\n");
      out.write("<div class=\"bg-login\">\n");
      out.write("\t<div class=\"w1170\">\n");
      out.write("\t\t<form>\n");
      out.write("\t\t<div class=\"login-con\">\n");
      out.write("\t\t\t<div class=\"login-title mb30\"><span>欢迎登录</span></div>\n");
      out.write("\t\t\t<div class=\"login-row mb20\"><i class=\"icon icon-usr\"></i><input type=\"text\" name=\"username\" id=\"username\" placeholder=\"请输入用户名\" maxlength='16' ></div>\n");
      out.write("\t\t\t<div class=\"login-row mb30\"><i class=\"icon icon-pwd\"></i><input type=\"password\" name=\"password\" id=\"password\" placeholder=\"请输入密码\" maxlength='16' ></div>\n");
      out.write("            <div class=\"login-vac mb30\"><i class=\"icon icon-vac\"></i><input  name=\"validateCode\" id=\"validateCode\" placeholder=\"请输入验证码\" maxlength=\"16\" >\n");
      out.write("                <img id=\"validateImg\" src=\"login/validateCode.do\" class=\"mb-7\" onclick=\"changeValidateCode(this)\" title=\"刷新验证码\">\n");
      out.write("            </div>\n");
      out.write("\t\t\t<div class=\"btn-login mb30\" id=\"submit\">登录</div>\n");
      out.write("\t\t\t<div class=\"bg-gray\"></div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t</form>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"ft\">\n");
      out.write("\t<ul class=\"ft-links\">\n");
      out.write("\t\t<li class=\"items-link\"><a href=\"http://www.nubia.com/service.php?sid=6\" target=\"_blank\">关于我们</a></li>|\n");
      out.write("\t\t<li class=\"items-link\"><a href=\"http://www.nubia.com/service.php?sid=7\" target=\"_blank\">联系我们</a></li>|\n");
      out.write("\t\t<li class=\"items-link\"><a href=\"http://www.nubia.com/news.php\" target=\"_blank\">新闻中心</a></li>|\n");
      out.write("\t\t<li class=\"items-link\"><a href=\"http://hr.nubia.com\" target=\"_blank\">加入我们</a></li>|\n");
      out.write("\t\t<li class=\"items-link\"><a href=\"http://www.nubia.com/gongyi.php\" target=\"_blank\">公益</a></li>|\n");
      out.write("\t\t<li class=\"items-link\"><a href=\"http://www.nubia.com/starsky.php\" target=\"_blank\">星空之约</a></li>\n");
      out.write("\t</ul>\n");
      out.write("\t<p class=\"nb-footer-info\"> 2012-2016 努比亚 版权所有 <a href=\"http://www.miibeian.gov.cn/\" target=\"_blank\">粤ICP备10006213号-2</a> ICP经营许可证编号：粤B2-20120688<a href=\"http://szcert.ebs.org.cn/D52B1891-CB9A-4FD0-8BC6-1D5650B567CE\" target=\"_blank\" style=\"margin-right: 5px;margin-left: 3px;\"><img src=\"http://static.nubia.cn/images/govIcon.png\" title=\"深圳市市场监督管理局企业主体身份公示\" alt=\"深圳市市场监督管理局企业主体身份公示\" border=\"0\" style=\"border-width:0px;border:hidden; border:none;vertical-align: middle;height: 18px;\"></a> 努比亚技术有限公司</p>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
}