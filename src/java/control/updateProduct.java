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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Dell Inc
 */
public class updateProduct extends HttpServlet {

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
        response.setCharacterEncoding("UTF-8");
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
            mess = "????ng nh???p tr?????c ????";
            request.setAttribute("mess", mess);
            request.getRequestDispatcher("login_register.jsp").forward(request, response);

        } else {
            Customer c = (Customer) session.getAttribute("customer");
            if (c.getAuthority() != 1) {
                String mess = "b???n k ph???i admin";
                request.setAttribute("mess", mess);
                request.getRequestDispatcher("login_register.jsp").forward(request, response);
            } else {
                String sid = request.getParameter("id");
                System.out.println("ID=" + sid);
                int id = Integer.parseInt(sid);
                String name = request.getParameter("name");
                String img = request.getParameter("image");
                String price = request.getParameter("price");
                float Price = Float.valueOf(price);
                String cate = request.getParameter("CateID");
                int cateID = Integer.parseInt(cate);
                String detail = request.getParameter("detail");
                ProductDAO cdb = new ProductDAOImpl();
                Product pd = new Product();
                pd.setId(id);
                pd.setName(name);
                pd.setImage(img);
                pd.setPrice(Price);
                pd.setCateID(cateID);
                pd.setDetail(detail);
                cdb.updateProduct(pd);
                response.sendRedirect("listAdmin.jsp");
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
