package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    \n");
      out.write("    <head>\n");
      out.write("<title>patient</title>\n");
      out.write("\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=EmulateIE7; IE=EmulateIE9\">\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1.0, user-scalable=no\"/>\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\" media=\"all\" />\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"demo.css\" media=\"all\" />\n");
      out.write(" \n");
      out.write("       <script data-require=\"angular.js@1.2.0-rc3\" data-semver=\"1.2.0-rc3\" src=\"http://code.angularjs.org/1.2.0-rc.3/angular.min.js\"></script>\n");
      out.write("    <script data-require=\"angular-router@1.2.0-rc1\" data-semver=\"1.2.0-rc1\" src=\"http://code.angularjs.org/1.2.0rc1/angular-route.js\"></script>\n");
      out.write("    <link rel=\"stylesheet\" href=\"style.css\" />\n");
      out.write("    <script src=\"angular.js\"></script>\n");
      out.write("\n");
      out.write("    <script src=\"javascript.js\"></script>\n");
      out.write("    <script src=\"script.js\"></script>\n");
      out.write("    \n");
      out.write("</head>\n");
      out.write("<body ng-app=\"myApp\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("    <div class=\"freshdesignweb-top\">\n");
      out.write("    <span class=\"right\">\n");
      out.write("    \n");
      out.write("    <ul>\n");
      out.write("      <li>\n");
      out.write("          <a href=\"#/\"><strong>Home</strong></a>\n");
      out.write("      </li>\n");
      out.write("      <li>\n");
      out.write("          <a href=\"#/patient\"><strong>Add Patient</strong></a>\n");
      out.write("      </li>\n");
      out.write("      <li>\n");
      out.write("          <a href=\"#/list\"><strong>Patient List</strong></a>\n");
      out.write("      </li>\n");
      out.write("    </ul>\n");
      out.write("    </spam>\n");
      out.write("    \n");
      out.write("    <div class=\"clr\"></div>\n");
      out.write("            </div>\n");
      out.write("    </di>\n");
      out.write("    \n");
      out.write("    <div ng-view=\"\"></div>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("    \n");
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
}
