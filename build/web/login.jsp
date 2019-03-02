<%-- 
    Document   : login
    Created on : 18/02/2019, 02:47:09 PM
    Author     : johan07
--%>
<%@page import="modelo.usuario"%>
<%@page import="funciones.usuarioBD"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<%
    usuarioBD usu = new usuarioBD();
    
    usuario e;
    e=usu.usuActivo();
    if(e.getEstado()== 2){
    response.sendRedirect("Principal.jsp");
    }
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <script src="resource/vendors/bootstrap/dist/js/bootstrap.min.js"></script>
        <link href="resource/vendors/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
        <script src="resource/vendors/jquery/dist/jquery.min.js"></script>
        <script src="resource/vendors/jquery/dist/jquery.js"></script>
        <script src="validar/validaciones.js" type="text/javascript"></script>
        <style>
            body {
                background: url(source/fondo-login.jpg);
                background-size: cover;
                background-attachment: fixed;

            }
            .login-container{

                margin-top: 10%;
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

            .toggle {
                position: absolute;
                top: 10px;
                right: 7px;
                width: 130px;
                height: 30px;
                font-size: 12px;
                line-height: 25px;
                text-align: center;
                border-top: 2px solid #2a3f54;
                border-bottom: 2px solid #2a3f54;
                cursor: pointer;
                transition: all .5s ease;
            }
            .toggle:hover {
                border-top: 2px solid #00b3ee;
                border-bottom: 2px solid #00b3ee;
            }

            .contenedor-form .toggle span {
                letter-spacing: 1px;
            }
            .formulario{
                display: none;
            }
            .formulario:nth-child(2) {
                display: block;
            }
        </style>
        <script>
            function carga()
            {
                titulo = "Cambiar Contraseña";
                document.getElementById('prueba').innerHTML = titulo;
            }
        </script>

    </head>
    <body onload="carga()">
        <div>
            <div class="container login-container">

                <div class="col-md-7 login-form-1">
                    <div class="toggle">

                        <span id="prueba"  ></span>
                    </div>  
                    <div class="formulario">
                        <h3>Bienvenidos</h3>
                        <form action="usuario?accion=iniciarU" method="post">
                            <div class="form-group">
                                <input type="text" id="nom" class="form-control" placeholder="Usuario *" onkeypress="return soloLetras(event,this.value,10)" value="" name="usuario" />
                            </div>
                            <div class="form-group">
                                <input type="password" class="form-control" placeholder="Contraseña *" onkeypress="return soloNumeros(event,this.value,10)" value="" name="pass" />
                            </div>
                            <div class="form-group">
                                <input type="submit" class="btnSubmit"  value="Login"/>
                            </div>
                            <div class="form-group">
                                <a href="RegistroReclamos1.jsp" class="col-md-4">Registrar Reclamo</a>
                                <a href="#" class="col-md-4 col-md-offset-4">Seguimiento de Ticket</a><br/>
                            </div>
                            <div class="form-group">
                                <h4 style="color:#ff0000; text-align: center; font-weight: bold; font-size:200% ; "><c:out value="${respuesta}"/></h4>    
                            </div>

                        </form>
                    </div>

                    <div class="formulario">
                        <h3>Cambiar contraseña</h3>
                        <form action="usuario?accion=cambiarCon" method="post">
                            <div class="form-group">
                                <input type="text" class="form-control" placeholder="Usuario *" value="" name="usuarioCam" />
                            </div>
                            <div class="form-group">
                                <input type="password" class="form-control" placeholder="Antigua Contraseña *" value="" name="oldpass" />
                            </div>
                            <div class="form-group">
                                <input type="password" class="form-control" placeholder="Nueva Contraseña *" value="" name="newpass" />
                            </div>
                            <div class="form-group">
                                <input type="submit" class="btnSubmit"  value="Cambiar Contraseña"/>
                            </div>
                            <div class="form-group">
                                <a href="#" class="col-md-4">Olvido la Contraseña?</a>
                                <a href="#" class="col-md-4 col-md-offset-4">Seguimiento de Ticket</a><br/>
                            </div>
                            
                            <div class="form-group">
                                <h4 style="color:#ff0000; text-align: center; font-weight: bold; font-size:200% ; "><c:out value="${respuesta1}"/></h4>    
                            </div>
                            
                        </form>
                    </div>
                </div>

            </div>
        </div>


        <script>
            $('.toggle').click(function () {
                $('.formulario').animate({
                    height: "toggle",
                    'padding-top': 'toggle',
                    'padding-bottom': 'toggle',
                    opacity: 'toggle'
                }, "slow");
                var titulo = document.getElementById('prueba').innerHTML;
                if (titulo === "iniciar Sesion")
                {
                    titulo = "Cambiar contraseña";
                    document.getElementById('prueba').innerHTML = titulo;
                } else {
                    titulo = "iniciar Sesion";
                    document.getElementById('prueba').innerHTML = titulo;
                }
            });
        </script>
    </body>
</html>
