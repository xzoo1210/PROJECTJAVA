/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.ProductDAO;
import dao.impl.ProductDAOImpl;
import entity.Customer;
import entity.Product;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Dell Inc
 */
public class addProductAdmin extends HttpServlet {

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
        doPost(request, response);
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
        try (PrintWriter out = response.getWriter()) {
            response.setContentType("text/html;charset=UTF-8");
            request.setCharacterEncoding("UTF-8");
            HttpSession session = request.getSession();
        if (session.getAttribute("customer") == null) {
            String mess = "";
            mess = "đăng nhập trước đã";
            request.setAttribute("mess", mess);
            request.getRequestDispatcher("login_register.jsp").forward(request, response);

        }else {
            Customer c =(Customer)session.getAttribute("customer");
            if(c.getAuthority()!=1 ){
                String mess = "bạn k phải admin";
            request.setAttribute("mess", mess);
            request.getRequestDispatcher("login_register.jsp").forward(request, response);
            }
            else{
             ProductDAO cdb = new ProductDAOImpl();
            String name = request.getParameter("name").trim();
            int id = cdb.getLastID();
            System.out.println(" id ="+id);
            String img = request.getParameter("image").trim();
            String price = request.getParameter("price").trim();
            float PriceValue = Float.valueOf(price);
            String cate = request.getParameter("CateID").trim();
            System.out.println(cate);
            int CateID = Integer.parseInt(cate);
            System.out.println(CateID);
            String detail = request.getParameter("detail");
            int i= cdb.addProduct(new Product(id+1, name, img, PriceValue, CateID, detail));
            System.out.println(i);
            response.sendRedirect("listAdmin.jsp");
            }
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
