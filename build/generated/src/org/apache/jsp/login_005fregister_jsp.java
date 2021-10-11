package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.CustomerDAO;
import entity.Customer;

public final class login_005fregister_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>TODO supply a title</title>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link href=\"css/loginCss.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css\" \n");
      out.write("              integrity=\"sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2\" crossorigin=\"anonymous\">\n");
      out.write("        ");
      dao.DAO p = null;
      synchronized (request) {
        p = (dao.DAO) _jspx_page_context.getAttribute("p", PageContext.REQUEST_SCOPE);
        if (p == null){
          p = new dao.DAO();
          _jspx_page_context.setAttribute("p", p, PageContext.REQUEST_SCOPE);
        }
      }
      out.write("\n");
      out.write("\n");
      out.write("        </head>\n");
      out.write("        <body >\n");
      out.write("\n");
      out.write("            <p style=\"color: red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.mess}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("\n");
      out.write("        <div class=\"cotn_principal\" style=\"background-image: url('https://vcdn-vnexpress.vnecdn.net/2020/03/22/b-JPG-4063-1584888577.jpg'); background-repeat:  no-repeat; background-size: cover\">\n");
      out.write("            <div class=\"cont_centrar\">\n");
      out.write("                <div class=\"cont_login\">\n");
      out.write("                    <div class=\"cont_info_log_sign_up\">\n");
      out.write("                        <div class=\"col_md_login\">\n");
      out.write("                            <div class=\"cont_ba_opcitiy\">\n");
      out.write("                                <h1>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.Error}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h1>\n");
      out.write("                                <h2>LOGIN</h2>  \n");
      out.write("                                <button class=\"btn_login\" onclick=\"cambiar_login()\">LOGIN</button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col_md_sign_up\">\n");
      out.write("                            <div class=\"cont_ba_opcitiy\">\n");
      out.write("                                <h2>SIGN UP</h2>\n");
      out.write("                                <button class=\"btn_sign_up\" onclick=\"cambiar_sign_up()\">SIGN UP</button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"cont_back_info\">\n");
      out.write("                        <div class=\"cont_img_back_grey\">\n");
      out.write("                            <img src=\"https://images.unsplash.com/42/U7Fc1sy5SCUDIu4tlJY3_NY_by_PhilippHenzler_philmotion.de.jpg?ixlib=rb-0.3.5&q=50&fm=jpg&crop=entropy&s=7686972873678f32efaf2cd79671673d\" alt=\"\" />\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"cont_forms\" >\n");
      out.write("                        <div class=\"cont_img_back_\">\n");
      out.write("                            <img src=\"https://images.unsplash.com/42/U7Fc1sy5SCUDIu4tlJY3_NY_by_PhilippHenzler_philmotion.de.jpg?ixlib=rb-0.3.5&q=50&fm=jpg&crop=entropy&s=7686972873678f32efaf2cd79671673d\" alt=\"\" />\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"cont_form_login\">\n");
      out.write("                            <a href=\"#\" onclick=\"ocultar_login_sign_up()\" ><i class=\"material-icons\">&#xE5C4;</i></a>\n");
      out.write("                            <h2>LOGIN</h2>\n");
      out.write("                            <form action=\"login\" method=\"post\">\n");
      out.write("                                <input type=\"text\" id=\"userName_login\" required=\"\" name=\"userName_login\" placeholder=\"Username\" value=\"\" />\n");
      out.write("                                <p></p>\n");
      out.write("                                <input type=\"password\" name=\"password_login\" required=\"\" placeholder=\"Password\" value=\"\" />\n");
      out.write("                                <button class=\"btn_login\" onclick=\"cambiar_login()\">LOGIN</button>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"remember-me\" class=\"text-info\">\n");
      out.write("                                        <span>Remember me</span> \n");
      out.write("                                        <span>\n");
      out.write("                                            <input type=\"checkbox\" name=\"remember\">\n");
      out.write("                                        </span>\n");
      out.write("\n");
      out.write("                                    </label><br>\n");
      out.write("                                    <br>\n");
      out.write("                                    <a class=\"nav-link\" href=\"changePass.jsp\"> change password?</a>\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"cont_form_sign_up\" >\n");
      out.write("                            <a href=\"#\" onclick=\"ocultar_login_sign_up()\"><i class=\"material-icons\">&#xE5C4;</i></a>\n");
      out.write("                            <h2>SIGN UP</h2>\n");
      out.write("                            <p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.mess}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                            <form action=\"register\" method=\"POST\" style=\"height: 500px;\">\n");
      out.write("                                <p></p><input type=\"text\" placeholder=\"User Name\" required=\"\" name=\"userName_register\" size=\"30\">\n");
      out.write("                                <p></p><input type=\"password\" placeholder=\"Password\" required=\"\" name=\"userPassword_register\" size=\"30\">\n");
      out.write("                                <p></p><input type=\"password\" placeholder=\"Re-enter Password\" required=\"\" name=\"reUserPassword_register\" size=\"30\">\n");
      out.write("                                <p></p><input type=\"password\" placeholder=\"Re-enter Password\" required=\"\" name=\"reUserPassword_register\" size=\"30\">\n");
      out.write("                                <p></p><input type=\"password\" placeholder=\"Re-enter Password\" required=\"\" name=\"reUserPassword_register\" size=\"30\">\n");
      out.write("                                <p></p><input type=\"password\" placeholder=\"Re-enter Password\" required=\"\" name=\"reUserPassword_register\" size=\"30\">\n");
      out.write("                                <p></p><input type=\"password\" placeholder=\"Re-enter Password\" required=\"\" name=\"reUserPassword_register\" size=\"30\">\n");
      out.write("<!--                                <p></p><input type=\"password\" placeholder=\"Re-enter Password\" required=\"\" name=\"reUserPassword_register\" size=\"30\">-->\n");
      out.write("                                <button class=\"btn_sign_up\" onclick=\"cambiar_sign_up()\">SIGN UP</button>\n");
      out.write("                            </form>\n");
      out.write("                            <div class=\"login_register-element\">\n");
      out.write("                            </div>   \n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script>\n");
      out.write("                                    function cambiar_login() {\n");
      out.write("                                        document.querySelector('.cont_forms').className = \"cont_forms cont_forms_active_login\";\n");
      out.write("                                        document.querySelector('.cont_form_login').style.display = \"block\";\n");
      out.write("                                        document.querySelector('.cont_form_sign_up').style.opacity = \"0\";\n");
      out.write("\n");
      out.write("                                        setTimeout(function () {\n");
      out.write("                                            document.querySelector('.cont_form_login').style.opacity = \"1\";\n");
      out.write("                                        }, 400);\n");
      out.write("\n");
      out.write("                                        setTimeout(function () {\n");
      out.write("                                            document.querySelector('.cont_form_sign_up').style.display = \"none\";\n");
      out.write("                                        }, 200);\n");
      out.write("                                    }\n");
      out.write("\n");
      out.write("                                    function cambiar_sign_up(at) {\n");
      out.write("                                        document.querySelector('.cont_forms').className = \"cont_forms cont_forms_active_sign_up\";\n");
      out.write("                                        document.querySelector('.cont_form_sign_up').style.display = \"block\";\n");
      out.write("                                        document.querySelector('.cont_form_login').style.opacity = \"0\";\n");
      out.write("\n");
      out.write("                                        setTimeout(function () {\n");
      out.write("                                            document.querySelector('.cont_form_sign_up').style.opacity = \"1\";\n");
      out.write("                                        }, 100);\n");
      out.write("\n");
      out.write("                                        setTimeout(function () {\n");
      out.write("                                            document.querySelector('.cont_form_login').style.display = \"none\";\n");
      out.write("                                        }, 400);\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    function ocultar_login_sign_up() {\n");
      out.write("\n");
      out.write("                                        document.querySelector('.cont_forms').className = \"cont_forms\";\n");
      out.write("                                        document.querySelector('.cont_form_sign_up').style.opacity = \"0\";\n");
      out.write("                                        document.querySelector('.cont_form_login').style.opacity = \"0\";\n");
      out.write("\n");
      out.write("                                        setTimeout(function () {\n");
      out.write("                                            document.querySelector('.cont_form_sign_up').style.display = \"none\";\n");
      out.write("                                            document.querySelector('.cont_form_login').style.display = \"none\";\n");
      out.write("                                        }, 500);\n");
      out.write("\n");
      out.write("                                    }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </script> \n");
      out.write("    </body>\n");
      out.write("\n");
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
