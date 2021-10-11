package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addProcductAdmin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("        <link href=\"css/cssAdd.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body >\n");
      out.write("\n");
      out.write("        <div class=\" submit\" >\n");
      out.write("            <nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                    <ul class=\" navbar-nav mr-auto \" style=\"list-style-type:none; text-align: center;\">\n");
      out.write("                        <li class=\"midd nav-item active \"style=\"text-align: center;margin-left: 40em;\">\n");
      out.write("                            ADMIN :>>>>>_______________(  ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.customer.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("  )_______________ <<<<< ADMIN \n");
      out.write("                            <a class=\"nav-link\" style=\"color: orange;margin: 0 auto;\" href=\"Logout\">Logout</a>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <form action=\"addProductAdmin\" method=\"post\" id=\"join-us\">\n");
      out.write("                <div class=\"fields\">\n");
      out.write("                    <span>\n");
      out.write("                        <input placeholder=\"name\" type=\"text\" required=\"\" name=\"name\"/>\n");
      out.write("                    </span>\n");
      out.write("                    <br />\n");
      out.write("                    <span>\n");
      out.write("                        <input placeholder=\"image\" type=\"text\" required=\"\" name=\"image\"/>\n");
      out.write("                    </span>\n");
      out.write("                    <br />\n");
      out.write("                    <span>\n");
      out.write("                        <input placeholder=\"price\" type=\"text\" required=\"\" name=\"price\"/>\n");
      out.write("                    </span>\n");
      out.write("                    <br />\n");
      out.write("                    <span>\n");
      out.write("                        <input placeholder=\"CateID\" type=\"text\" required=\"\" name=\"CateID\"/>\n");
      out.write("                    </span>\n");
      out.write("                    <br />\n");
      out.write("                    <span>\n");
      out.write("                        <input placeholder=\"detail\" type=\"datetime\" required=\"\" name=\"detail\"/>\n");
      out.write("                    </span>\n");
      out.write("                    <br />\n");
      out.write("                </div>\n");
      out.write("                <div class=\"submit\">\n");
      out.write("                    <input class=\"submit\" value=\"Add\" type=\"submit\" />\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
