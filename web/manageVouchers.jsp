<%-- 
    Document   : manageAccount
    Created on : Mar 6, 2021, 11:53:04 PM
    Author     : Dell Inc
--%>

<%@page import="entity.Customer"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>TODO supply a title</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="style.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" 
              integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <jsp:useBean id="p" class="dao.impl.VoucherDAOImpl" scope="request"></jsp:useBean>
        </head>
    </head>
    <body style=" background-color: gray;">

    <c:if test="${sessionScope.customer==null||sessionScope.customer.authority!=1}">
        <% request.getRequestDispatcher("login_register.jsp").forward(request, response);%>
    </c:if>
    <div class=" submit" >
        <nav class="navbar navbar-expand-lg navbar-light bg-light" style=" background-color: lightpink;">
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class=" navbar-nav mr-auto " style="list-style-type:none; text-align: center;">
                    <li class="midd nav-item active "style="text-align: center;margin-left: 40em;">
                        ADMIN :>>>>>_______________(  ${sessionScope.customer.username}  )_______________ <<<<< ADMIN 

                        <a class="nav-link" style="color: orange;margin: 0 auto;" href="Logout">Logout</a>

                    </li>

                </ul>
            </div>
        </nav>
    </div>
    <a href="addVouchers.jsp" class="btn btn-primary">ADD  new Voucher</a>
    <div class="container" style="background-color: darkseagreen;">
        <div class="row">
            <div class="col-sm">
                <h2>  UserID</h2>
            </div>
            <div class="col-sm">
                <h2>code</h2>   
            </div>
            <div class="col-sm">
                <h2>Exist Time</h2>   
            </div>
            <div class="col-sm">
                <h2> discount</h2>
            </div>
            <div class="col-sm">

            </div>
        </div>
    </div>

    <div class="container" style="background-color: lightsalmon;">
        <c:forEach items="${p.all}" var="o">
            <div class="row" style=" border: 3px solid gray;">
                <div class="col-sm">
                    <h5 class="card-title">${o.getUserID()}</h5>
                </div>
                <div class="col-sm">

                </div>
                <div class="col-sm">

                    <h2>${o.code} </h2>
                </div>
                <div class="col-sm">
                    <h2> </h2>
                </div>
                <div class="col-sm">
                    <h2>${o.existTime} </h2>
                </div>
                <div class="col-sm">
                    <h2>${o.discount} </h2>
                </div>
                <div class="col-sm">
                    <a href="editVouchers.jsp?Vid=${o.codeID}" class="btn btn-primary">update</a>
                </div>
                <div class="col-sm">
                    <a href="deleteVoucher?Vid=${o.codeID}" class="btn btn-primary">delete</a></div>
            </div>
        </c:forEach>
    </div>
</div>
</body>
</html>

