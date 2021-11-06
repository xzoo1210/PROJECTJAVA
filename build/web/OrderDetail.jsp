<%-- 
    Document   : OrderDetail
    Created on : Nov 2, 2021, 8:16:57 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="style.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" 
              integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">

        <style>
            body {
                background-color: #5165ff;
                height: 100vh;
                display: flex;
                justify-content: center;
                align-items: center
            }

            .modal-body {
                background-color: #fff;
                border-color: #fff
            }

            .close {
                color: #000;
                cursor: pointer
            }

            .close:hover {
                color: #000
            }

            .theme-color {
                color: #004cb9
            }

            hr.new1 {
                border-top: 2px dashed #fff;
                margin: 0.4rem 0
            }

            .btn-primary {
                color: #fff;
                background-color: #004cb9;
                border-color: #004cb9;
                padding: 12px;
                padding-right: 30px;
                padding-left: 30px;
                border-radius: 1px;
                font-size: 17px
            }

            .btn-primary:hover {
                color: #fff;
                background-color: #004cb9;
                border-color: #004cb9;
                padding: 12px;
                padding-right: 30px;
                padding-left: 30px;
                border-radius: 1px;
                font-size: 17px
            }
        </style>
    </head>
    <body>
        <button type="button" class="btn btn-primary launch" data-toggle="modal" data-target="#staticBackdrop"> <i class="fa fa-info"></i> Get information
        </button>
        <div class="modal fade" id="staticBackdrop" data-backdrop="static" data-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-body ">
                        <div class="text-right"> <i class="fa fa-close close" data-dismiss="modal"></i> </div>
                        <div class="px-4 py-5">
                            <h5 class="text-uppercase">Jonathan Adler</h5>
                            <h4 class="mt-5 theme-color mb-5">Thanks for your order</h4> <span class="theme-color">Payment Summary</span>
                            <div class="mb-3">
                                <hr class="new1">
                            </div>
                            <div class="d-flex justify-content-between"> <span class="font-weight-bold">Ether Chair(Qty:1)</span> <span class="text-muted">$1750.00</span> </div>
                            <div class="d-flex justify-content-between"> <small>Shipping</small> <small>$175.00</small> </div>
                            <div class="d-flex justify-content-between"> <small>Tax</small> <small>$200.00</small> </div>
                            <div class="d-flex justify-content-between mt-3"> <span class="font-weight-bold">Total</span> <span class="font-weight-bold theme-color">$2125.00</span> </div>
                            <div class="text-center mt-5"> <button class="btn btn-primary">Track your order</button> </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
