/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.69
 * Generated at: 2016-06-03 09:04:56 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
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

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<script src=\"http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js\"></script>  \n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<h2>Validation Example</h2>\n");
      out.write("\n");
      out.write("<form ng-app=\"myApp\" ng-controller=\"validateCtrl\" \n");
      out.write("name=\"myForm\" novalidate>\n");
      out.write("\n");
      out.write("<p>Username:<br>\n");
      out.write("<input type=\"text\" name=\"user\" ng-model=\"user\" required>\n");
      out.write("<span style=\"color:red\" ng-show=\"myForm.user.$dirty && myForm.user.$invalid\">\n");
      out.write("<span ng-show=\"myForm.user.$error.required\">Username is required.</span>\n");
      out.write("</span>\n");
      out.write("</p>\n");
      out.write("\n");
      out.write("<p>Email:<br>\n");
      out.write("<input type=\"email\" name=\"email\" ng-model=\"email\" required>\n");
      out.write("<span style=\"color:red\" ng-show=\"myForm.email.$dirty && myForm.email.$invalid\">\n");
      out.write("<span ng-show=\"myForm.email.$error.required\">Email is required.</span>\n");
      out.write("<span ng-show=\"myForm.email.$error.email\">Invalid email address.</span>\n");
      out.write("</span>\n");
      out.write("</p>\n");
      out.write("\n");
      out.write("<p>\n");
      out.write("<input type=\"submit\"\n");
      out.write("ng-disabled=\"myForm.user.$dirty && myForm.user.$invalid ||  \n");
      out.write("myForm.email.$dirty && myForm.email.$invalid\">\n");
      out.write("</p>\n");
      out.write("\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("var app = angular.module('myApp', []);\n");
      out.write("app.controller('validateCtrl', function($scope) {\n");
      out.write("    $scope.user = 'John Doe';\n");
      out.write("    $scope.email = 'john.doe@gmail.com';\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("\n");
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