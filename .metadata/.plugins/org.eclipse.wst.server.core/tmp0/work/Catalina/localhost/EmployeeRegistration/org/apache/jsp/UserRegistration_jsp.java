/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.46
 * Generated at: 2017-10-02 10:38:31 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class UserRegistration_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
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

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>Insert title here</title>\n");
      out.write("<style type=\"text/css\">\n");
      out.write("button {\n");
      out.write("\tmargin-left: 70px;\n");
      out.write("\tborder: none;\n");
      out.write("\tborder-radius: 8px;\n");
      out.write("\tcolor: white;\n");
      out.write("\tpadding: 13px 150px;\n");
      out.write("\ttext-align: center;\n");
      out.write("\ttext-decoration: none;\n");
      out.write("\tbackground-color: #E7EEF3;\n");
      out.write("\tdisplay: inline-block;\n");
      out.write("\tfont-size: 16px;\n");
      out.write("}\n");
      out.write("input[type=text],input[type=password]\n");
      out.write("{\n");
      out.write("\theight: 20px;\n");
      out.write("}\n");
      out.write("input[type=submit] {\n");
      out.write("\tmargin-left: 30px;\n");
      out.write("\tborder: none;\n");
      out.write("\tborder-radius: 8px;\n");
      out.write("\tcolor: Black;\n");
      out.write("\tpadding: 13px 150px;\n");
      out.write("\ttext-align: center;\n");
      out.write("\ttext-decoration: none;\n");
      out.write("\tbackground-color: #1E90FF;\n");
      out.write("\tdisplay: inline-block;\n");
      out.write("\tfont-size: 16px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("td {\n");
      out.write("\tcolor: white;\n");
      out.write("\ttext-align: center;\n");
      out.write("\tfont-size: 18px;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("function validId(){\n");
      out.write("\tvar empId = document.getElementById(\"userId\").value;\n");
      out.write("\tif(empId == \"\"){\n");
      out.write("\t\tvar message = \"*User Id should not be empty\";\n");
      out.write("\t\tdocument.getElementById(\"p1\").innerHTML = message;\n");
      out.write("\t\tdocument.getElementById(\"userId\").style.borderColor = \"red\";\n");
      out.write("\t\treturn false;\n");
      out.write("\t}\n");
      out.write("\telse\n");
      out.write("\t{\n");
      out.write("\t\tdocument.getElementById(\"p1\").innerHTML =\"\";\n");
      out.write("\t\tdocument.getElementById(\"userId\").style.borderColor = \"green\";\n");
      out.write("\t\treturn true;\n");
      out.write("\t}\n");
      out.write("\treturn true;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\tfunction validName(){\n");
      out.write("\t\tvar name = document.getElementById(\"empName\").value;\n");
      out.write("\t\tif(name == \"\"){\n");
      out.write("\t\t\tvar message = \"*User Name should not be empty\";\n");
      out.write("\t\t\tdocument.getElementById(\"p2\").innerHTML = message;\n");
      out.write("\t\t\tdocument.getElementById(\"empName\").style.borderColor = \"red\";\n");
      out.write("\t\t\treturn false;\n");
      out.write("\t\t}\n");
      out.write("\t\telse\n");
      out.write("\t\t{\n");
      out.write("\t\t\tdocument.getElementById(\"p2\").innerHTML =\"\";\n");
      out.write("\t\t\tdocument.getElementById(\"empName\").style.borderColor = \"green\";\n");
      out.write("\t\t\treturn true;\n");
      out.write("\t\t}\n");
      out.write("\t\treturn true;\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\tfunction validPassword(){\n");
      out.write("\t\tvar password = document.getElementById(\"Password\").value;\n");
      out.write("\t\t\n");
      out.write("\t\tif(password == \"\"){\n");
      out.write("\t\t\t\n");
      out.write("\t\t\tvar message = \"*Password should not be empty\";\n");
      out.write("\t\t\tdocument.getElementById(\"p3\").innerHTML = message;\n");
      out.write("\t\t\tdocument.getElementById(\"Password\").style.borderColor = \"red\";\n");
      out.write("\t\t\treturn false;\n");
      out.write("\t\t}\n");
      out.write("\t\telse if(password.length < 6)\n");
      out.write("\t\t{\n");
      out.write("\t\t\tvar message = \"*Password should be greater than 6\";\n");
      out.write("\t\t\tdocument.getElementById(\"p3\").innerHTML = message;\n");
      out.write("\t\t\tdocument.getElementById(\"Password\").style.borderColor = \"red\";\n");
      out.write("\t\t\treturn false;\n");
      out.write("\t\t}\n");
      out.write("\t\telse\n");
      out.write("\t\t{\n");
      out.write("\t\t\tdocument.getElementById(\"p3\").innerHTML = \"\";\n");
      out.write("\t\t\tdocument.getElementById(\"Password\").style.borderColor = \"green\";\n");
      out.write("\t\t\treturn true;\t\n");
      out.write("\t\t}\n");
      out.write("\t\treturn true;\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\tfunction validRePassword(){\n");
      out.write("\t\tvar password = document.getElementById(\"Password\").value;\n");
      out.write("\t\tvar ReEnterpassword = document.getElementById(\"ReEnterpassword\").value;\n");
      out.write("\t\t\n");
      out.write("\t\tif(ReEnterpassword == \"\"){\n");
      out.write("\t\t\t\n");
      out.write("\t\t\tvar message = \"*plzz Re-Enter the password\";\n");
      out.write("\t\t\tdocument.getElementById(\"p4\").innerHTML = message;\n");
      out.write("\t\t\tdocument.getElementById(\"ReEnterpassword\").style.borderColor = \"red\";\n");
      out.write("\t\t\treturn false;\n");
      out.write("\t\t}\n");
      out.write("\t\telse if(password !== ReEnterpassword)\n");
      out.write("\t\t{\n");
      out.write("\t\t\tvar message = \"*Password should be Same\";\n");
      out.write("\t\t\tdocument.getElementById(\"p4\").innerHTML = message;\n");
      out.write("\t\t\tdocument.getElementById(\"ReEnterpassword\").style.borderColor = \"red\";\n");
      out.write("\t\t\treturn false;\n");
      out.write("\t\t}\n");
      out.write("\t\telse\n");
      out.write("\t\t{\n");
      out.write("\t\t\tdocument.getElementById(\"p4\").innerHTML = \"\";\n");
      out.write("\t\t\tdocument.getElementById(\"ReEnterpassword\").style.borderColor = \"green\";\n");
      out.write("\t\t\treturn true;\t\n");
      out.write("\t\t}\n");
      out.write("\t\treturn true;\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\tfunction validForm(){\n");
      out.write("\t\tvar name = validName();\n");
      out.write("\t\tvar password = validPassword();\n");
      out.write("\t\t\n");
      out.write("\t\tif(name == true && password == true){\n");
      out.write("\t\t\treturn true;\n");
      out.write("\t\t}\n");
      out.write("\t\telse\n");
      out.write("\t\t{\n");
      out.write("\t\t\treturn false;\n");
      out.write("\t\t}\n");
      out.write("\t}\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<div class=\"container text-center\" class=\"container\">\n");
      out.write("\t\t<!-- <div style=\"height: 696px; width: 1274px; background-color: gray; color: white; float: left;\"> -->\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"container\"\n");
      out.write("\t\t\t\t\tstyle=\"background-image: url(g.jpg);height: 450px; width: 1100px; background-color: #33A8FF; margin-top: 50px;margin-left: 100px ;color: black; float: left;\">\n");
      out.write("\t\t\t<form action=\"UserRegistration\" method=\"get\" name=\"myform\" id=\"myForm1\" onsubmit=\"return validForm()\">\n");
      out.write("\n");
      out.write("\t\t\t\t");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"container\"\n");
      out.write("\t\t\t\t\tstyle=\"height: 450px; width: 400px; background-color: #33A8FT; margin-left: 300px;color: black\">\n");
      out.write("\t\t\t\t\t<table\n");
      out.write("\t\t\t\t\t\tstyle=\"background-image: url(g2.jpg);height: 400px; width: 450px; margin: 10px; background-color: #33A8FF; color: black\">\n");
      out.write("\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t<td>User Id:</td>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<td><input type='text' name='userId'\n");
      out.write("\t\t\t\t\t\t\t\tonblur=\"return validId()\" id=\"userId\" size=\"30px\" style=\"height: 20px;\">\n");
      out.write("\t\t\t\t\t\t\t\t<p id=\"p1\" style=\"color: white\"></p></td>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t<td>User Name:</td>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<td><input type='text' name='userName'\n");
      out.write("\t\t\t\t\t\t\t\tonblur=\"return validName()\" id=\"empName\" size=\"30px\">\n");
      out.write("\t\t\t\t\t\t\t\t<p id=\"p2\" style=\"color: white\"></p></td>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t<td>Password :</td>\n");
      out.write("\t\t\t\t\t\t\t<td><input type='password' name='password'\n");
      out.write("\t\t\t\t\t\t\t\tonblur=\"validPassword()\" id=\"Password\" size=\"30px\" >\n");
      out.write("\t\t\t\t\t\t\t\t<p id=\"p3\" style=\"color: white\"></p></td>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t<td>Re-Enter Password :</td>\n");
      out.write("\t\t\t\t\t\t\t<td><input type='password' name='ReEnterpassword'\n");
      out.write("\t\t\t\t\t\t\t\tonblur=\"validRePassword()\" id=\"ReEnterpassword\" size=\"30px\">\n");
      out.write("\t\t\t\t\t\t\t\t<p id=\"p4\" style=\"color: white\"></p></td>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t<td colspan=\"2\"><input style=\"background-color: #E7EEF3;\"\n");
      out.write("\t\t\t\t\t\t\t\ttype=\"submit\" value=\"Submit\"></td>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t<tr style=\"color: white; margin-left: 30px;\">\n");
      out.write("\t\t\t\t\t\t\t<td colspan=\"2\" style=\"color: white; margin-left: 30px;text-align: center\"><h4>Already have an account?</h4>\n");
      out.write("\t\t\t\t\t\t\t\t<button type=\"button\"  style=\"color: Black;margin-left: 30px;\" onclick=\"gotoUserLoginPage()\">Login</button>\n");
      out.write("\t\t\t\t\t\t\t\t<script type=\"text/javascript\">\n");
      out.write("\t\t\t\t\t\t\t\tfunction gotoUserLoginPage(){\n");
      out.write("\t\t\t\t\t\t\t\t       window.location = 'EmployLoginForm.jsp';\n");
      out.write("\t\t\t\t\t\t\t\t   }\n");
      out.write("\t\t\t\t\t\t\t\t</script>\n");
      out.write("\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</form>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("</body>\n");
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
}
