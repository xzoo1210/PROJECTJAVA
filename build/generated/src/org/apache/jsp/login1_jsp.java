package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("<script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("<!------ Include the above in your HEAD tag ---------->\n");
      out.write("\n");
      out.write("<link href=\"//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("<script src=\"//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"//code.jquery.com/jquery-1.11.1.min.js\"></script>\n");
      out.write("<link href=\"css.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("\n");
      out.write("<div class=\"cotn_principal\">\n");
      out.write("    <div class=\"cont_centrar\">\n");
      out.write("\n");
      out.write("        <div class=\"cont_login\">\n");
      out.write("            <div class=\"cont_info_log_sign_up\">\n");
      out.write("                \n");
      out.write("                <div class=\"col_md_login\">\n");
      out.write("                    <div class=\"cont_ba_opcitiy\">\n");
      out.write("\n");
      out.write("                        <h2>LOGIN</h2>  \n");
      out.write("                        <p></p> \n");
      out.write("                        <button class=\"btn_login\" onclick=\"cambiar_login()\">LOGIN</button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col_md_sign_up\">\n");
      out.write("                    <div class=\"cont_ba_opcitiy\">\n");
      out.write("                        <h2>SIGN UP</h2>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <p></p>\n");
      out.write("\n");
      out.write("                        <button class=\"btn_sign_up\" onclick=\"cambiar_sign_up()\">SIGN UP</button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"cont_back_info\">\n");
      out.write("                <div class=\"cont_img_back_grey\">\n");
      out.write("                    <img src=\"https://www.gtagangwars.de/suite/images/styleLogo-6bd77433ddf78bd8477ea7306e804f677bc925d0.png\" alt=\"\" />\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"cont_forms\" >\n");
      out.write("                <div class=\"cont_img_back_\">\n");
      out.write("                    <img src=\"https://www.gtagangwars.de/suite/images/styleLogo-6bd77433ddf78bd8477ea7306e804f677bc925d0.png\" alt=\"\" />\n");
      out.write("                </div>\n");
      out.write("                <div class=\"cont_form_login\">\n");
      out.write("                    <a href=\"#\" onclick=\"ocultar_login_sign_up()\" ><i class=\"material-icons\">?</i></a>\n");
      out.write("                    <h2>LOGIN</h2>\n");
      out.write("                    <input type=\"text\" placeholder=\"Username\" />\n");
      out.write("                    <input type=\"password\" placeholder=\"Password\" />\n");
      out.write("                    <button class=\"btn_login\" onclick=\"cambiar_login()\">LOGIN</button>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"cont_form_sign_up\">\n");
      out.write("                    <a href=\"#\" onclick=\"ocultar_login_sign_up()\"><i class=\"material-icons\">?</i></a>\n");
      out.write("                    <h2>SIGN UP</h2>\n");
      out.write("                    <input type=\"text\" placeholder=\"Username\" />\n");
      out.write("                    <input type=\"password\" placeholder=\"Password\" />\n");
      out.write("                    <input type=\"password\" placeholder=\"Confirm Password\" />\n");
      out.write("                    <button class=\"btn_sign_up\" onclick=\"cambiar_sign_up()\">SIGN UP</button>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<script>\n");
      out.write("    /* ------------------------------------ Click on login and Sign Up to  changue and view the effect\n");
      out.write("     ---------------------------------------\n");
      out.write("     */\n");
      out.write("\n");
      out.write("    function cambiar_login() {\n");
      out.write("        document.querySelector('.cont_forms').className = \"cont_forms cont_forms_active_login\";\n");
      out.write("        document.querySelector('.cont_form_login').style.display = \"block\";\n");
      out.write("        document.querySelector('.cont_form_sign_up').style.opacity = \"0\";\n");
      out.write("\n");
      out.write("        setTimeout(function () {\n");
      out.write("            document.querySelector('.cont_form_login').style.opacity = \"1\";\n");
      out.write("        }, 400);\n");
      out.write("\n");
      out.write("        setTimeout(function () {\n");
      out.write("            document.querySelector('.cont_form_sign_up').style.display = \"none\";\n");
      out.write("        }, 200);\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function cambiar_sign_up(at) {\n");
      out.write("        document.querySelector('.cont_forms').className = \"cont_forms cont_forms_active_sign_up\";\n");
      out.write("        document.querySelector('.cont_form_sign_up').style.display = \"block\";\n");
      out.write("        document.querySelector('.cont_form_login').style.opacity = \"0\";\n");
      out.write("\n");
      out.write("        setTimeout(function () {\n");
      out.write("            document.querySelector('.cont_form_sign_up').style.opacity = \"1\";\n");
      out.write("        }, 100);\n");
      out.write("\n");
      out.write("        setTimeout(function () {\n");
      out.write("            document.querySelector('.cont_form_login').style.display = \"none\";\n");
      out.write("        }, 400);\n");
      out.write("\n");
      out.write("\n");
      out.write("    }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    function ocultar_login_sign_up() {\n");
      out.write("\n");
      out.write("        document.querySelector('.cont_forms').className = \"cont_forms\";\n");
      out.write("        document.querySelector('.cont_form_sign_up').style.opacity = \"0\";\n");
      out.write("        document.querySelector('.cont_form_login').style.opacity = \"0\";\n");
      out.write("\n");
      out.write("        setTimeout(function () {\n");
      out.write("            document.querySelector('.cont_form_sign_up').style.display = \"none\";\n");
      out.write("            document.querySelector('.cont_form_login').style.display = \"none\";\n");
      out.write("        }, 500);\n");
      out.write("\n");
      out.write("    }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</script>");
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
