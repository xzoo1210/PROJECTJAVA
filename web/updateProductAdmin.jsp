<%-- 
    Document   : updateProductAdmin
    Created on : Nov 16, 2020, 10:26:07 AM
    Author     : Dell Inc
--%>

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
    <%DAO cdb = new DAO();
        String id = (String) request.getParameter("id");
        Product c = (Product) cdb.getProductByID(id);%>
    <body>

    <div class=" submit" >
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav mr-auto" style="list-style-type:none;">

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
        <form action="updateProduct" method="post" id="join-us">
            <div class="fields">
                <span>
                    <input placeholder="id"  type="text" readonly=""  name="id" value="<%=c.getId()%>" n/>
                </span>
                <br>
                <span>
                    <input placeholder="name" type="text" required="" name="name" value="<%=c.getName()%>"/>
                </span>
                <br />
                <span>
                    <input placeholder="image" type="text" required="" value="<%=c.getImage()%>" name="image"/>
                </span>
                <br />
                <span>
                    <input placeholder="price" type="text" required="" value="<%=c.getPrice()%>" name="price"/>
                </span>
                <br />
                <span>
                    <input placeholder="cateID" type="text" required="" value="<%=c.getCateID()%>"  name="CateID"/>
                </span>
                <br />
                <span>
                    <input placeholder="detail" type="text" required="" value="<%=c.getDetail()%>" name="detail"/>
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
