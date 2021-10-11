<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <title>JSP Page</title>
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="style.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" 
              integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">

        </head>
        <body style="background-color: #7dc5bf4a;">

        <jsp:include page="Menu.jsp"></jsp:include>
        <jsp:include page="introArea.jsp"></jsp:include>


            <div class="row">
            <jsp:include page="Left.jsp"></jsp:include>
            <div class="container row" >
                <c:forEach items="${list}" var="o">
                    <div class="card col-lg-3 " style="margin: 10px; border-radius:20px;background-color: #18cee44d; " >
                        <img class="card-img-top" src="${o.image}">
                        <div class="card-body" style="text-align: center">
                            <h5 class="card-title">${o.name}</h5>
                            <p>${o.price} $</p>
                            <a href="cart?id=${o.id}" class="btn btn-primary">Buy</a>
                            <a href="detail?id=${o.id}" class="btn btn-primary">view</a>
                        </div>
                    </div>
                </c:forEach>
            </div>
        </div>
        <div class="card">
            <div class="card-header">
                Laptop
            </div>
            <div class="card-body"> 
                <h5 class="card-title">thông tin liên hệ</h5>
                <p class="card-text" >Email: dupihe141231@fpt.edu.vn. Điện thoại: 0369662341</p>
            </div>
        </div>

        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>
    </body>
</html>
