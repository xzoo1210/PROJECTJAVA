/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.CustomerDAO;
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
import dao.OrderDAO;
import dao.ProductDAO;
import dao.impl.CustomerDAOImpl;
import dao.impl.OrderDAOImpl;
import dao.impl.ProductDAOImpl;

/**
 *
 * @author trinh
 */
@WebServlet(name = "OrderControl", urlPatterns = {"/order"})
public class OrderControl extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try (PrintWriter out = response.getWriter()) {
            request.setCharacterEncoding("utf-8");
            response.setContentType("text/html; charset=UTF-8");
            String output = "";
             out.println("<a style = 'background-color:green' href = '/project_prj321_HE141231/Home'> Home</a>");
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
                CustomerDAO cd = new CustomerDAOImpl();
                String name = request.getParameter("fullName").trim();
                String address = request.getParameter("address").trim();
                String phone = request.getParameter("phone").trim();
                //               cd.addInforUser(cd.getLastInforUserID()+1, c.getId(), name, address, phone);
                out.println("<div style='border: black solid 2px'><p> Username :" + name + "</p>");
                out.println("<p> Address :" + address + "</p>");
                out.println("<p> Phone number :" + phone + "</p>");
                out.println("</div><br><br>");
                // add order
                OrderDAO order = new OrderDAOImpl();
                int orderID = order.getLastOrderID() + 1;
                float finalPrice = Float.parseFloat(session.getAttribute("finalPrice").toString().trim());
                order.addOrder(orderID, c.getId(), finalPrice);
                Cookie arr[] = request.getCookies();
                List<Product> list = new ArrayList<>();
                ProductDAO dao = new ProductDAOImpl();
                for (Cookie o : arr) {//get list product
                    if (o.getName().equals("id")) {
                        String txt[] = o.getValue().split(",");
                        for (String s : txt) {
                            Product p = dao.getProductByID(s);
                            p.setAmount(1);
                            list.add(p);
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
               
                out.println("<table style = 'border: blue solid 20px;width:100%;'>");
                out.println("<tr style ='border: black solid 2px' >");
//            out.println("<td style ='border: orange solid 2px'>stt</td>");
                out.println(""
                        + "<td style ='border: orange solid 2px'>Name</td>"
                        + "<td style ='border: orange solid 2px'>price</td>"
                        + "<td style ='border: orange solid 2px'>amount</td>"
                        + "<td style ='border: orange solid 2px'>total price</td>");
                out.println("</tr>");
                HttpSession ses = request.getSession();

                for (Product p : list) {
                    out.println("<tr>");
//                    out.println("<td style ='border: blue solid 1px'> <img style='width: 20%'  src=" + p.getImage() + "></td>");
                    out.println("<td style ='border: blue solid 1px'>" + p.getName() + "</td>");
                    out.println("<td style ='border: blue solid 1px'>" + p.getPrice() + "</td>");
                    out.println("<td style ='border: blue solid 1px'>" + p.getAmount() + "</td>");
                    out.println("<td style ='border: blue solid 1px'>" + p.getAmount() * p.getPrice() + "</td>");

                    //order.addOrderDetail(order.getLastOrderDetailID()+1, orderID, p.getId(), p.getAmount());
                    out.println("</tr>");
                }
                out.println("<p> total price :" + ses.getAttribute("total") + "</p>");
                out.println("<p> discount:" + ses.getAttribute("discount") + "</p>");
                out.println("<p> final price :" + ses.getAttribute("finalPrice") + "</p>");
                
                for (Cookie o : arr) {
                    if (o.getName().equals("id")) {
                        o.setMaxAge(0);
                        response.addCookie(o);
                    }

                }
                // insert to DB 

               // request.getRequestDispatcher("HomePage.jsp").forward(request, response);
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
