<%-- 
    Document   : addProcductAdmin
    Created on : Nov 16, 2020, 10:24:59 AM
    Author     : Dell Inc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <link href="css/cssAdd.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body >

        <div class=" submit" >
            <nav class="navbar navbar-expand-lg navbar-light bg-light">
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
        <div class="container">
            <form action="addVoucher" method="post" id="join-us">
                <div class="fields">
                    <span>
                        <input placeholder="code" type="text" required="" name="code"/>
                    </span>
                    <br />
                    <span>
                        <input placeholder="Exist time" type="text" required="" name="time"/>
                    </span>
                    <br />
                    <span>
                        <input placeholder="discount" type="text" required="" name="discount"/>
                    </span>
                    <br />
                    
                    <br />
                </div>
                <div class="submit">
                    <input class="submit" value="Add" type="submit" />
                </div>
            </form>
        </div>

    </body>
</html>
