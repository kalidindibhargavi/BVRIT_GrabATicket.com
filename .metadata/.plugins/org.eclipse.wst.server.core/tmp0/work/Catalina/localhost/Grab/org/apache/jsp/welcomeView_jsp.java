/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.69
 * Generated at: 2016-06-05 07:15:59 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class welcomeView_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("    <!-- Indicators -->\n");
      out.write("    <ol class=\"carousel-indicators\">\n");
      out.write("      <li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("      <li data-target=\"#myCarousel\" data-slide-to=\"1\"></li>\n");
      out.write("      <li data-target=\"#myCarousel\" data-slide-to=\"2\"></li>\n");
      out.write("      <!-- <li data-target=\"#myCarousel\" data-slide-to=\"3\"></li>\n");
      out.write("      <li data-target=\"#myCarousel\" data-slide-to=\"4\"></li>\n");
      out.write("      <li data-target=\"#myCarousel\" data-slide-to=\"5\"></li>\n");
      out.write(" -->    </ol>\n");
      out.write("\n");
      out.write("    <!-- Wrapper for slides -->\n");
      out.write("    <div class=\"carousel-inner\" role=\"listbox\">\n");
      out.write("      <div class=\"item active\">\n");
      out.write("        <img src=\"q1.jpg\" alt=\"\" width=\"600\" height=\"100\">\n");
      out.write("        <div class=\"carousel-caption\">\n");
      out.write("          </div>      \n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"item\">\n");
      out.write("        <img src=\"q2.jpg\" alt=\"Chicago\" width=\"600\" height=\"100\">\n");
      out.write("        <div class=\"carousel-caption\">\n");
      out.write("          </div>      \n");
      out.write("      </div>\n");
      out.write("    \n");
      out.write("      <div class=\"item\">\n");
      out.write("        <img src=\"q3.jpg\" alt=\"Los Angeles\" width=\"600\" height=\"100\">\n");
      out.write("        <div class=\"carousel-caption\">\n");
      out.write("         </div>      \n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- <div class=\"item\">\n");
      out.write("        <img src=\"e5.jpg\" alt=\"Los Angeles\" width=\"300\" height=\"100\">\n");
      out.write("        <div class=\"carousel-caption\">\n");
      out.write("         </div>      \n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"item\">\n");
      out.write("        <img src=\"t2.jpg\" alt=\"Los Angeles\" width=\"300\" height=\"100\">\n");
      out.write("        <div class=\"carousel-caption\">\n");
      out.write("         </div>      \n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"item\">\n");
      out.write("        <img src=\"h4.jpg\" alt=\"Los Angeles\" width=\"300\" height=\"100\">\n");
      out.write("        <div class=\"carousel-caption\">\n");
      out.write("         </div>      \n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write(" -->\n");
      out.write("    <!-- Left and right controls -->\n");
      out.write("    <a class=\"left carousel-control\" href=\"#myCarousel\" role=\"button\" data-slide=\"prev\">\n");
      out.write("      <span class=\"glyphicon glyphicon-chevron-left\" aria-hidden=\"true\"></span>\n");
      out.write("      <span class=\"sr-only\">Previous</span>\n");
      out.write("    </a>\n");
      out.write("    <a class=\"right carousel-control\" href=\"#myCarousel\" role=\"button\" data-slide=\"next\">\n");
      out.write("      <span class=\"glyphicon glyphicon-chevron-right\" aria-hidden=\"true\"></span>\n");
      out.write("      <span class=\"sr-only\">Next</span>\n");
      out.write("    </a>\n");
      out.write("</div>\n");
      out.write("<p>Movies </p>\n");
      out.write("    <div class=\"row text-center\">\n");
      out.write("  <div class=\"col-sm-4\">\n");
      out.write("    <div class=\"thumbnail\">\n");
      out.write("      <img src=\"wall2.jpg\" alt=\"Paris\">\n");
      out.write("      <p><strong>Hyderabad</strong></p>\n");
      out.write("      <!-- <p>Fri. 27 November 2015</p> -->\n");
      out.write("      <a href = \"AllMoviesView.jsp\">\n");
      out.write("              <button type=\"submit\" class=\"btn btn-block\">Book\n");
      out.write("                <span class=\"glyphicon glyphicon-ok\"></span>\n");
      out.write("              </button></a>\n");
      out.write("          \n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"col-sm-4\">\n");
      out.write("    <div class=\"thumbnail\">\n");
      out.write("      <img src=\"wall1.jpg\" alt=\"New York\">\n");
      out.write("      <p><strong>Chennai</strong></p>\n");
      out.write("      <!-- <p>Sat. 28 November 2015</p> -->\n");
      out.write("      <a href = \"AllMoviesView.jsp\">\n");
      out.write("              <button type=\"submit\" class=\"btn btn-block\">Book\n");
      out.write("                <span class=\"glyphicon glyphicon-ok\"></span>\n");
      out.write("              </button></a>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"col-sm-4\">\n");
      out.write("    <div class=\"thumbnail\">\n");
      out.write("      <img src=\"pro.jpg\" alt=\"San Francisco\">\n");
      out.write("      <p><strong>Bangaluru</strong></p>\n");
      out.write("      <!-- <p>Sun. 29 November 2015</p> -->\n");
      out.write("      <a href = \"AllMoviesView.jsp\">\n");
      out.write("              <button type=\"submit\" class=\"btn btn-block\">Book\n");
      out.write("                <span class=\"glyphicon glyphicon-ok\"></span>\n");
      out.write("              </button></a>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("  \n");
      out.write("</script>\n");
      out.write(" <footer class=\"text-center\">\n");
      out.write("  <a class=\"up-arrow\" href=\"#myPage\" data-toggle=\"tooltip\" title=\"TO TOP\">\n");
      out.write("    <span class=\"glyphicon glyphicon-chevron-up\"></span>\n");
      out.write("  </a><br><br>\n");
      out.write("  <p><a href=\"http://www.w3schools.com\" data-toggle=\"tooltip\" title=\"Visit w3schools\">www.GrabYourTicket.com</a></p> \n");
      out.write("</footer>\n");
      out.write("<script>\n");
      out.write("$(document).ready(function(){\n");
      out.write("    // Initialize Tooltip\n");
      out.write("    $('[data-toggle=\"tooltip\"]').tooltip(); \n");
      out.write("})\n");
      out.write("</script>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "themeView.jsp", out, false);
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
