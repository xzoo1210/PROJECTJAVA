<%-- 
    Document   : listAdmin
    Created on : Nov 16, 2020, 10:23:44 AM
    Author     : Dell Inc
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>TODO supply a title</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <link href="css/cssAdd.css" rel="stylesheet" type="text/css"/>
        <jsp:useBean id="p" class="dao.DAO" scope="request"></jsp:useBean>
        </head>
        <body>
        <c:if test="${sessionScope.customer==null||sessionScope.customer.authority!=1}">
            <% request.getRequestDispatcher("login_register.jsp").forward(request, response);%>
        </c:if>
        <div>
            <nav class=" navbar navbar-expand-lg navbar-light bg-light" >
                <div class=" collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class=" navbar-nav mr-auto " style="list-style-type:none; text-align: center;">
                        <li class="midd nav-item active "style="text-align: center;margin-left: 40em;">
                            ADMIN :>>>>>_______________(  ${sessionScope.customer.username}  )_______________ <<<<< ADMIN 
                            <a class="nav-link" style="color: orange;margin: 0 auto;" href="Logout">Logout</a>
                        </li>

                    </ul>
                </div>
            </nav>
        </div>
        <div class="container">
            <div class="row" >
                <div class="col-sm">
                    <h2>name</h2>  
                </div>
                <div class="col-sm">
                    <h2>price</h2> 
                </div>
                <div class="col-sm">
                </div>
                <div class="col-sm">

                </div>
            </div>
        </div>
        <a href="addProcductAdmin.jsp" class="btn btn-primary">ADD  new Product</a>
        <div class="container">
            <c:forEach items="${p.all}" var="o">
                <div class="row" style=" border:  3px solid black;border-radius: 2px" >
                    <div class="col-sm" style="border:1px solid 2px;" >
                        <h5 class="card-title">${o.name}</h5>
                    </div>
                    <div class="col-sm">
                        <p>${o.price} $</p>
                    </div>
                    <div class="col-sm">
                        <a href="updateProductAdmin.jsp?id=${o.id}" class="btn btn-primary">update</a>
                    </div>
                    <div class="col-sm">
                        <a href="deleteProduct?id=${o.id}" class="btn btn-primary">delete</a></div>
                </div>
            </c:forEach>
        </div>
    </body>
</html>
