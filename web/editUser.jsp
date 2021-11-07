<%-- 
    Document   : updateProductAdmin
    Created on : Nov 16, 2020, 10:26:07 AM
    Author     : Dell Inc
--%>

<%@page import="dao.impl.CustomerDAOImpl"%>
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
    <%CustomerDAO cdb = new CustomerDAOImpl();
        String id = (String) request.getParameter("id");
        Customer c = (Customer) cdb.getUserByID(id);%>
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
        <form action="editUser" method="post" id="join-us">
            <div class="fields">
                <br>
                <span>
                    <input placeholder="id" id="id" type="text" readonly="" required="" name="id" value="<%=c.getId()%>"/>
                </span>
                <br>
                <input placeholder="password" id="pass" type="text" readonly="" style="display: none;" required="" name="pass" value="<%=c.getPassword()%>"/>
                <span>
                    <input placeholder="Uname" type="text"  readonly="" required="" name="name" value="<%=c.getUsername()%>"/>
                </span>
                <br>
                <span>
                    <input placeholder="authority" type="text" required=""   name="authority"/>
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
