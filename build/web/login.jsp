<%-- 
    Document   : login
    Created on : 18/02/2019, 02:47:09 PM
    Author     : johan07
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <script src="resource/vendors/bootstrap/dist/js/bootstrap.min.js"></script>
        <link href="resource/vendors/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
        <style>
            body {
                background: url(source/fondo-login.jpg);
                background-size: cover;
                background-attachment: fixed;
                
            }
            .login-container{
               
                margin-top: 15%;
                margin-left: 26%;
            }
            .login-form-1{
                padding: 1%;
                box-shadow: 0 5px 8px 0 rgba(0, 0, 0, 0.2), 0 9px 26px 0 rgba(0, 0, 0, 0.19);
                background-color: #fff; 
            }
            .login-form-1 h3{
                text-align: center;
                color: #333;
                font: bold 300% sans-serif;
                
            }
            .login-container form{
                padding: 1%;
            }
            .btnSubmit
            {
                width: 50%;
                border-radius: 1rem;
                padding: 1%;
                border: none;
                cursor: pointer;
            }
            .login-form-1 .btnSubmit{
                font-weight: 600;
                color: #fff;
                background-color: #2a3f54;
                margin-left: 25%;
            }

            .login-form-1 .ForgetPwd{
                color: #2a3f54;
                font-weight: 600;
                text-decoration: none;
                margin-left: 38.5%
            }


        </style>

    </head>
    <body>
        <div>
            <div class="container login-container">
                <div class="row">
                    <div class="col-md-7 login-form-1">
                        <h3>Bienvenidos</h3>
                        <form action="usuario" method="post">
                            <div class="form-group">
                                <input type="text" class="form-control" placeholder="Usuario *" value="" name="usuario" />
                            </div>
                            <div class="form-group">
                                <input type="password" class="form-control" placeholder="Contraseña *" value="" name="pass" />
                            </div>
                            <div class="form-group">
                                <input type="submit" class="btnSubmit"  value="Login"/>
                            </div>
                            <div class="form-group">
                                <a href="#" class="ForgetPwd">Olvido la Contraseña?</a>
                                <h4 style="color:#ff0000; text-align: center; font-weight: bold; font-size:200% ; "><c:out value="${respuesta}"/></h4>
                                
                                
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
