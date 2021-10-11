<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<nav class="navbar fixed-top navbar-expand-md " style=" background-color: cornsilk; ">
    <div class="container">
        <a class="navbar-brand" href="Home">Home</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse justify-content-end" id="navbarsExampleDefault">
            <ul class="navbar-nav m-auto">
                <c:if test="${sessionScope.customer.authority==1}">
                    <li class="nav-item">
                        <a class="nav-link" href="listAdmin.jsp">Manager Product</a>
                    </li>
                </c:if>
                <c:if test="${sessionScope.customer.authority==1}">
                    <li class="nav-item">
                        <a class="nav-link" href="manageAccount.jsp">Manager Account</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="manageVouchers.jsp">Manager Vouchers</a>
                    </li>
                </c:if>

                <c:if test="${sessionScope.customer==null}">
                    <li class="nav-item active">
                        <a class="nav-link" href ="login"> register/login</a>
                    </li>
                </c:if>
                    <a class="nav-link" href="changePass.jsp"> change password?</a>
                <c:if test="${sessionScope.customer != null}">
                    <li class="nav-item active">
                        <a class="nav-link" href="Logout">Logout</a>
                    </li> 
                    <li class="nav-item active">
                        
                    </li> 
                    <li class="nav-item active">
                       <a class="nav-link" href="#"> Hello ${sessionScope.customer.username}</a>                           
                    </li>
                </c:if>  
            </ul>

            <form action="search" method="get" class="form-inline my-2 my-lg-0">
                <div class="input-group input-group-sm">
                    <input name="nameSearch" type="text" required="" class="form-control" aria-label="Small" aria-describedby="inputGroup-sizing-sm" placeholder="Search...">
                    <div class="input-group-append">
                        <button type="submit" class="btn btn-secondary btn-number">Search
                        </button>
                    </div>
                </div>
                <a class="btn btn-success btn-sm ml-3" href="print">
                    Cart
                </a>
            </form>
        </div>
    </div>
</nav>
