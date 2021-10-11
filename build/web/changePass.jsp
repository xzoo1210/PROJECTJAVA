<%-- 
    Document   : updateProductAdmin
    Created on : Nov 16, 2020, 10:26:07 AM
    Author     : Dell Inc
--%>

<%@page import="dao.CustomerDAO"%>
<%@page import="entity.Customer"%>
<%@page import="entity.Product"%>
<%@page import="dao.DAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/cssAdd.css" rel="stylesheet" type="text/css"/>
    </head>

    <body>
        <div class="navbar fixed-top navbar-expand-md " style=" background-color: cornsilk;">
            <nav class="navbar navbar-expand-lg navbar-light bg-light">
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav mr-auto" style="list-style-type:none;">
                        <li class="nav-item">
                        <li class="nav-item active">
                                            
                        </li>
                        <li class="submit" style="border: 1px solid red; border-radius: 50px; background-color: lightseagreen;" >
                            <a class="navbar-brand" href="HomePage.jsp">Home</a>
                        </li>  

                    </ul>
                </div>
            </nav>
        </div>

        <div class="container">
            <form action="changePass" method="post" id="join-us">

                <div class="fields">
                    <br>
                    <p>${rs}</p>
                    <br>
                    <span>
                        <input placeholder="User Name" type="text"  required="" name="name" value=""/>
                    </span>
                    <br>
                    <span>
                        <input placeholder="old password" type="password" required="" name="pass" value=""/>
                    </span>
                    <br />
                    <span>
                        <input placeholder="new password" type="password" required="" name="newpass" value=""/>
                    </span>
                    <br />
                    <span>
                        <input placeholder="enter pass word again" type="password" required=""  value= "" name="repass"/>
                    </span>
                    <br />

                </div>
                <div class="submit">
                    <input class="submit" value="save" type="submit" />
                </div>
            </form>

        </div>
    </body>
</html>
