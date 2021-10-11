/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.DAO;
import dao.VoucherDAO;
import entity.Customer;
import entity.Product;
import entity.voucher;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Dell Inc
 */
@WebServlet(name = "editVoucher", urlPatterns = {"/editVoucher"})
public class editVoucher extends HttpServlet {

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
        doPost(request, response);
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
        processRequest(request, response);
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
        HttpSession session = request.getSession();
        if (session.getAttribute("customer") == null) {
            String mess = "";
            mess = "đăng nhập trước đã";
            request.setAttribute("mess", mess);
            request.getRequestDispatcher("login_register.jsp").forward(request, response);

        } else {
            Customer c = (Customer) session.getAttribute("customer");
            if (c.getAuthority() != 1) {
                String mess = "bạn k phải admin";
                request.setAttribute("mess", mess);
                request.getRequestDispatcher("login_register.jsp").forward(request, response);
            } else {
                VoucherDAO cdb = new VoucherDAO();
                String id = session.getAttribute("Vid").toString();
                int Vid = Integer.parseInt(id);
                String code = request.getParameter("code").trim();
                
                String time = request.getParameter("time").trim();
                int ExistTime = Integer.parseInt(time);
                
                int discount = Integer.parseInt(request.getParameter("discount").trim());
                cdb.updateVoucher(new voucher(Vid, c.getId(), code, ExistTime, discount));

                response.sendRedirect("manageVouchers.jsp");
            }
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
