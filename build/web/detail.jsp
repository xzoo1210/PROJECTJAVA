<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <title>TODO supply a title</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="style.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" 
              integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <jsp:useBean id="p" class="dao.impl.ProductDAOImpl" scope="request"></jsp:useBean>
        </head>
        <body>
        <jsp:include page="Menu.jsp"></jsp:include>
            <div class="container">
                <div class="row">
                    <img class="card-img-top" src="${requestScope.detail.image}" >
                <div class="card-body" style="text-align: center">
                    <h5 class="card-title">${requestScope.detail.name}</h5>
                    <p>${requestScope.detail.price} $</p>
                    <p>${requestScope.detail.detail}</p>
                    <a href="cart?id=${requestScope.detail.id}" class="btn btn-primary">Buy</a>
                </div>
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
