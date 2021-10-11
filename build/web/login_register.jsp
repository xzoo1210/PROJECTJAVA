<%@page import="dao.CustomerDAO"%>
<%@page import="entity.Customer"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <title>TODO supply a title</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="css/loginCss.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" 
              integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <jsp:useBean id="p" class="dao.DAO" scope="request"></jsp:useBean>

        </head>
        <body >

            <p style="color: red">${requestScope.mess}</p>

        <div class="cotn_principal" style="background-image: url('https://vcdn-vnexpress.vnecdn.net/2020/03/22/b-JPG-4063-1584888577.jpg'); background-repeat:  no-repeat; background-size: cover">
            <div class="cont_centrar">
                <div class="cont_login">
                    <div class="cont_info_log_sign_up">
                        <div class="col_md_login">
                            <div class="cont_ba_opcitiy">
                                <h1>${requestScope.Error}</h1>
                                <h2>LOGIN</h2>  
                                <button class="btn_login" onclick="cambiar_login()">LOGIN</button>
                            </div>
                        </div>
                        <div class="col_md_sign_up">
                            <div class="cont_ba_opcitiy">
                                <h2>SIGN UP</h2>
                                <button class="btn_sign_up" onclick="cambiar_sign_up()">SIGN UP</button>
                            </div>
                        </div>
                    </div>
                    <div class="cont_back_info">
                        <div class="cont_img_back_grey">
                            <img src="https://images.unsplash.com/42/U7Fc1sy5SCUDIu4tlJY3_NY_by_PhilippHenzler_philmotion.de.jpg?ixlib=rb-0.3.5&q=50&fm=jpg&crop=entropy&s=7686972873678f32efaf2cd79671673d" alt="" />
                        </div>

                    </div>
                    <div class="cont_forms" >
                        <div class="cont_img_back_">
                            <img src="https://images.unsplash.com/42/U7Fc1sy5SCUDIu4tlJY3_NY_by_PhilippHenzler_philmotion.de.jpg?ixlib=rb-0.3.5&q=50&fm=jpg&crop=entropy&s=7686972873678f32efaf2cd79671673d" alt="" />
                        </div>

                        <div class="cont_form_login">
                            <a href="#" onclick="ocultar_login_sign_up()" ><i class="material-icons">&#xE5C4;</i></a>
                            <h2>LOGIN</h2>
                            <form action="login" method="post">
                                <input type="text" id="userName_login" required="" name="userName_login" placeholder="Username" value="" />
                                <p></p>
                                <input type="password" name="password_login" required="" placeholder="Password" value="" />
                                <button class="btn_login" onclick="cambiar_login()">LOGIN</button>
                                <div class="form-group">
                                    <label for="remember-me" class="text-info">
                                        <span>Remember me</span> 
                                        <span>
                                            <input type="checkbox" name="remember">
                                        </span>

                                    </label><br>
                                    <br>
                                    <a class="nav-link" href="changePass.jsp"> change password?</a>
                                </div>
                            </form>
                        </div>

                        <div class="cont_form_sign_up" >
                            <a href="#" onclick="ocultar_login_sign_up()"><i class="material-icons">&#xE5C4;</i></a>
                            <h2>SIGN UP</h2>
                            <p>${requestScope.mess}</p>
                            <form action="register" method="POST" style="height: 500px;">
                                <p></p><input type="text" placeholder="User Name" required="" name="userName_register" size="30">
                                <p></p><input type="password" placeholder="Password" required="" name="userPassword_register" size="30">
                                <p></p><input type="password" placeholder="Re-enter Password" required="" name="reUserPassword_register" size="30">
                                <p></p><input type="password" placeholder="Re-enter Password" required="" name="reUserPassword_register" size="30">
                                <p></p><input type="password" placeholder="Re-enter Password" required="" name="reUserPassword_register" size="30">
                                <p></p><input type="password" placeholder="Re-enter Password" required="" name="reUserPassword_register" size="30">
                                <p></p><input type="password" placeholder="Re-enter Password" required="" name="reUserPassword_register" size="30">
<!--                                <p></p><input type="password" placeholder="Re-enter Password" required="" name="reUserPassword_register" size="30">-->
                                <button class="btn_sign_up" onclick="cambiar_sign_up()">SIGN UP</button>
                            </form>
                            <div class="login_register-element">
                            </div>   
                        </div>

                    </div>

                </div>
            </div>
        </div>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
        <script>
                                    function cambiar_login() {
                                        document.querySelector('.cont_forms').className = "cont_forms cont_forms_active_login";
                                        document.querySelector('.cont_form_login').style.display = "block";
                                        document.querySelector('.cont_form_sign_up').style.opacity = "0";

                                        setTimeout(function () {
                                            document.querySelector('.cont_form_login').style.opacity = "1";
                                        }, 400);

                                        setTimeout(function () {
                                            document.querySelector('.cont_form_sign_up').style.display = "none";
                                        }, 200);
                                    }

                                    function cambiar_sign_up(at) {
                                        document.querySelector('.cont_forms').className = "cont_forms cont_forms_active_sign_up";
                                        document.querySelector('.cont_form_sign_up').style.display = "block";
                                        document.querySelector('.cont_form_login').style.opacity = "0";

                                        setTimeout(function () {
                                            document.querySelector('.cont_form_sign_up').style.opacity = "1";
                                        }, 100);

                                        setTimeout(function () {
                                            document.querySelector('.cont_form_login').style.display = "none";
                                        }, 400);


                                    }



                                    function ocultar_login_sign_up() {

                                        document.querySelector('.cont_forms').className = "cont_forms";
                                        document.querySelector('.cont_form_sign_up').style.opacity = "0";
                                        document.querySelector('.cont_form_login').style.opacity = "0";

                                        setTimeout(function () {
                                            document.querySelector('.cont_form_sign_up').style.display = "none";
                                            document.querySelector('.cont_form_login').style.display = "none";
                                        }, 500);

                                    }




        </script> 
    </body>

</html>
