<%-- 
    Document   : updateProductAdmin
    Created on : Nov 16, 2020, 10:26:07 AM
    Author     : Dell Inc
--%>

<%@page import="dao.impl.VoucherDAOImpl"%>
<%@page import="entity.voucher"%>
<%@page import="dao.VoucherDAO"%>
<%@page import="dao.CustomerDAO"%>
<%@page import="entity.Customer"%>
<%@page import="entity.Product"%>
<%@page import="dao.impl.ProductDAOImpl"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/cssAdd.css" rel="stylesheet" type="text/css"/>
    </head>
    <%VoucherDAO cdb = new VoucherDAOImpl();
        String id = (String) request.getParameter("Vid");
        HttpSession ses = request.getSession();
        ses.setAttribute("Vid", id);
        voucher c = (voucher) cdb.getVoucherByID(id);%>
    <body>
        <div class=" submit" >
            <nav class="navbar navbar-expand-lg navbar-light bg-light">
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav mr-auto" style="list-style-type:none;">
                        <li class="nav-item">
                        <li class="nav-item active">
                            ADMIN :>>>>>_______________${sessionScope.customer.username}_______________ <<<<< ADMIN                        
                        </li>

                        <li class="submit" style="border: 1px solid red; border-radius: 50px; background-color: lightseagreen;" >
                            <a class="nav-link" href="Logout">Logout</a>
                        </li>  
                    </ul>
                </div>
            </nav>
        </div>

        <div class="container">
            <form action="editVoucher" method="post" id="join-us">
                <div class="fields">
                    <br>
                    <br>
                    <span>
                        <input placeholder="code" type="text"   required="" name="code" value="<%=c.getCode()%>"/>
                    </span>
                    <br>
                    <span>
                        <input placeholder="exist time" type="text"  required="" value="<%=c.getExistTime()%>" name="time"/>
                    </span>
                    <br />
                    <span>
                        <input placeholder="discount" type="text" required=""  value="<%=c.getDiscount()%> " name="discount"/>
                    </span>
                    <br />

                </div>
                <div class="submit">
                    <input class="submit" value="Update" type="submit" />
                </div>
            </form>
        </div>
    </body>
</html>
