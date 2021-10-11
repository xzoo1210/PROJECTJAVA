/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.CustomerDAO;
import dao.DAO;
import dao.orderDAO;
import entity.Customer;
import entity.Product;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author trinh
 */
@WebServlet(name = "OrderControl", urlPatterns = {"/order"})
public class OrderControl extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            response.setContentType("text/html;charset=UTF-8");
            request.setCharacterEncoding("UTF-8");
            HttpSession session = request.getSession();
            if (session.getAttribute("customer") == null) {
                String mess = "";
                mess = "đăng nhập trước đã";
                request.setAttribute("mess", mess);

                request.getRequestDispatcher("login_register.jsp").forward(request, response);

            }
            if (session.getAttribute("customer") != null) {
                //insert to infor user
                Customer c = (Customer) session.getAttribute("customer");
                CustomerDAO cd = new CustomerDAO();
                String name = request.getParameter("fullName").trim();
                String address = request.getParameter("address").trim();
                String phone = request.getParameter("phone").trim();
                cd.addInforUser(cd.getLastInforUserID()+1, c.getId(), name, address, phone);

                // add order
                orderDAO order = new orderDAO();
                int orderID = order.getLastOrderID()+1;
                float finalPrice = Float.parseFloat(session.getAttribute("finalPrice").toString().trim());
                order.addOrder(orderID, c.getId(), finalPrice);
                Cookie arr[] = request.getCookies();
                List<Product> list = new ArrayList<>();
                DAO dao = new DAO();
                for (Cookie o : arr) {//get list product
                    if (o.getName().equals("id")) {
                        String txt[] = o.getValue().split(",");
                        for (String s : txt) {
                            list.add(dao.getProductByID(s));
                        }
                    }
                }
                // gộp sản phẩn theo id lại
                for (int i = 0; i < list.size(); i++) {
                    int count = 1;
                    for (int j = i + 1; j < list.size(); j++) {
                        if (list.get(i).getId() == list.get(j).getId()) {
                            count++;
                            list.remove(j);
                            j--;
                            list.get(i).setAmount(count);
                        }
                    }
                }
                for (Product p : list) {
                    order.addOrderDetail(order.getLastOrderDetailID()+1, orderID, p.getId(), p.getAmount());
                }
                for (Cookie o : arr) {
                    o.setMaxAge(0);
                    response.addCookie(o);
                }
                // insert to DB 
                request.getRequestDispatcher("HomePage.jsp").forward(request, response);
            } else {
                request.getRequestDispatcher("login_register.jsp").forward(request, response);
            }
        } catch (Exception e) {
            System.out.println(e);
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
        processRequest(request, response);
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
