/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.CustomerDAO;
import entity.Customer;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Dell Inc
 */
@WebServlet(name = "login", urlPatterns = {"/login"})
public class login extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet loginRegister</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet loginRegister at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        Cookie[] cookies = request.getCookies();
        CustomerDAO dao = new CustomerDAO();
        String username = "";
        String password = "";
        boolean check = false;
        if (cookies != null) {
            for (Cookie coo : cookies) {
                if (coo.getName().equals("username")) {
                    check = true;
                }

            }
        }
        if (check) {
            for (Cookie coo : cookies) {
                if (coo.getName().equals("username")) {
                    username = coo.getValue();
                }
                if (coo.getName().equals("password")) {
                    password = coo.getValue();
                }
                Customer c = dao.checkLogin(username, password);
                if (c != null) {
                    HttpSession session = request.getSession();
                    session.setAttribute("customer", c);
                    request.getRequestDispatcher("Home").forward(request, response);
                    break;
                }

            }
        }
        response.sendRedirect("login_register.jsp");

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        String username = request.getParameter("userName_login");
        String password = request.getParameter("password_login");
        CustomerDAO cudb = new CustomerDAO();
        Customer c = (Customer) cudb.checkLogin(username, password);
        boolean check = true;
        if (c != null) {
            String rememberMe = request.getParameter("remember");
            Cookie user = new Cookie("username", username);
            Cookie pass = new Cookie("password", password);
            if (rememberMe != null) {
                user.setMaxAge(60 * 60 * 24 * 7);
                pass.setMaxAge(60 * 60 * 24 * 7);
                // c_remember.setMaxAge(60 * 60 * 24 * 7);
                response.addCookie(user);
                response.addCookie(pass);
                //response.addCookie(c_remember);
            } else {
                user.setMaxAge(0);
                pass.setMaxAge(0);
                response.addCookie(user);
                response.addCookie(pass);
//              c_remember.setMaxAge(0);
            }
            HttpSession session = request.getSession();
            session.setAttribute("customer", c);
            request.getRequestDispatcher("Home").forward(request, response);
//            response.sendRedirect("HomePage.jsp");
        } else {
            String showError = "invalid username or password";
            request.setAttribute("Error", showError);
            request.getRequestDispatcher("login_register.jsp").forward(request, response);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
