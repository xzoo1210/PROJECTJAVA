package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class OrderDetail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("                background-color: #5165ff;\n");
      out.write("                height: 100vh;\n");
      out.write("                display: flex;\n");
      out.write("                justify-content: center;\n");
      out.write("                align-items: center\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .modal-body {\n");
      out.write("                background-color: #fff;\n");
      out.write("                border-color: #fff\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .close {\n");
      out.write("                color: #000;\n");
      out.write("                cursor: pointer\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .close:hover {\n");
      out.write("                color: #000\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .theme-color {\n");
      out.write("                color: #004cb9\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            hr.new1 {\n");
      out.write("                border-top: 2px dashed #fff;\n");
      out.write("                margin: 0.4rem 0\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .btn-primary {\n");
      out.write("                color: #fff;\n");
      out.write("                background-color: #004cb9;\n");
      out.write("                border-color: #004cb9;\n");
      out.write("                padding: 12px;\n");
      out.write("                padding-right: 30px;\n");
      out.write("                padding-left: 30px;\n");
      out.write("                border-radius: 1px;\n");
      out.write("                font-size: 17px\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .btn-primary:hover {\n");
      out.write("                color: #fff;\n");
      out.write("                background-color: #004cb9;\n");
      out.write("                border-color: #004cb9;\n");
      out.write("                padding: 12px;\n");
      out.write("                padding-right: 30px;\n");
      out.write("                padding-left: 30px;\n");
      out.write("                border-radius: 1px;\n");
      out.write("                font-size: 17px\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <button type=\"button\" class=\"btn btn-primary launch\" data-toggle=\"modal\" data-target=\"#staticBackdrop\"> <i class=\"fa fa-info\"></i> Get information\n");
      out.write("        </button>\n");
      out.write("        <div class=\"modal fade\" id=\"staticBackdrop\" data-backdrop=\"static\" data-keyboard=\"false\" tabindex=\"-1\" aria-labelledby=\"staticBackdropLabel\" aria-hidden=\"true\">\n");
      out.write("            <div class=\"modal-dialog\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <div class=\"modal-body \">\n");
      out.write("                        <div class=\"text-right\"> <i class=\"fa fa-close close\" data-dismiss=\"modal\"></i> </div>\n");
      out.write("                        <div class=\"px-4 py-5\">\n");
      out.write("                            <h5 class=\"text-uppercase\">Jonathan Adler</h5>\n");
      out.write("                            <h4 class=\"mt-5 theme-color mb-5\">Thanks for your order</h4> <span class=\"theme-color\">Payment Summary</span>\n");
      out.write("                            <div class=\"mb-3\">\n");
      out.write("                                <hr class=\"new1\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"d-flex justify-content-between\"> <span class=\"font-weight-bold\">Ether Chair(Qty:1)</span> <span class=\"text-muted\">$1750.00</span> </div>\n");
      out.write("                            <div class=\"d-flex justify-content-between\"> <small>Shipping</small> <small>$175.00</small> </div>\n");
      out.write("                            <div class=\"d-flex justify-content-between\"> <small>Tax</small> <small>$200.00</small> </div>\n");
      out.write("                            <div class=\"d-flex justify-content-between mt-3\"> <span class=\"font-weight-bold\">Total</span> <span class=\"font-weight-bold theme-color\">$2125.00</span> </div>\n");
      out.write("                            <div class=\"text-center mt-5\"> <button class=\"btn btn-primary\">Track your order</button> </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
