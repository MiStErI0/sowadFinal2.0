<%-- 
    Document   : body
    Created on : 28/02/2019, 10:09:51 PM
    Author     : johan07
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<body class="nav-md" onload="usuario()">
    <div class="container body">
        <div class="main_container">
            <div class="col-md-3 left_col">
                <div class="left_col scroll-view">
                    <div class="navbar nav_title"  style="border: 0;text-align: center; font-family: 'Federant', cursive;">
                        <a href="Principal.jsp" class="site_title" > <span>Sistema de Reclamos</span></a>
                    </div>

                    <div class="clearfix"></div>
                    <br />

                    <!-- sidebar menu -->
                    <div id="sidebar-menu" class="main_menu_side hidden-print main_menu">
                        <div class="menu_section">
                            <h3>General</h3>
                            <ul class="nav side-menu">

                                <%if (idCargo != 0) {%>       
                                <%if (idCargo == 5) {%> 
                                <li><a href="ReclamoServlet?accion=REGISTRAR">
                                        <i class="fa fa-pencil-square-o" style="font-size:20px"></i> Registrar Reclamo
                                    </a>
                                </li>
                                <%}%>
                                <%if (idCargo != 1) {%>    
                                <li><a href="ReclamoServlet?accion=LISTAR">
                                        <i class="fas fa-list" style='font-size:15px'></i> Lista de Reclamos
                                    </a>
                                </li>
                                <%}%>
                                <%if (idCargo == 1) {%>  
                                <li><a href="ReclamoServlet?accion=USUARIO">
                                        <i class='far fa-user' style='font-size:20px'></i> Usuarios
                                    </a>
                                </li>
                                 <%}%>
                                <%if (idCargo == 1) {%>
                                <li><a href="ReclamoServlet?accion=AJUSTES">
                                        <i class="fas fa-list" style='font-size:15px'></i> Ajustes
                                    </a>
                                </li>
                                <%}%>
                                <%} else {%>
                                <li><a href="ReclamoServlet?accion=REGISTRAR">
                                        <i class="fa fa-pencil-square-o" style="font-size:20px"></i> Registrar Reclamo
                                    </a>
                                </li>
                                <%}%>
                            </ul>
                        </div>


                    </div>
                    <!-- /sidebar menu -->

                    <!-- /menu footer buttons -->
                    <div class="sidebar-footer hidden-small">
                        <a data-toggle="tooltip" data-placement="top" title="Settings">
                            <span class="glyphicon glyphicon-cog" aria-hidden="true"></span>
                        </a>
                        <a data-toggle="tooltip" data-placement="top" title="FullScreen">
                            <span class="glyphicon glyphicon-fullscreen" aria-hidden="true"></span>
                        </a>
                        <a data-toggle="tooltip" data-placement="top" title="Lock">
                            <span class="glyphicon glyphicon-eye-close" aria-hidden="true"></span>
                        </a>
                        <a data-toggle="tooltip" data-placement="top" title="Logout" href="login.html">
                            <span class="glyphicon glyphicon-off" aria-hidden="true"></span>
                        </a>
                    </div>
                    <!-- /menu footer buttons -->
                </div>
            </div>

            <!-- top navigation -->
            <div class="top_nav">
                <div class="nav_menu">
                    <nav>
                        <div class="nav toggle">
                            <a id="menu_toggle"><i class="fa fa-bars"></i></a>
                        </div>

                        <ul class="nav navbar-nav navbar-right">
                            <li class="">
                                <a href="javascript:;" class="user-profile dropdown-toggle" data-toggle="dropdown" aria-expanded="false">
                                    <img src="images/img.jpg" alt=""><label id="nomusuario" ></label>
                                    <span class=" fa fa-angle-down"></span>
                                </a>
                                <ul class="dropdown-menu dropdown-usermenu pull-right">
                                    <li><a href="javascript:;"> Profile</a></li>
                                    <li>
                                        <a href="javascript:;">
                                            <span class="badge bg-red pull-right">50%</span>
                                            <span>Settings</span>
                                        </a>
                                    </li>
                                    <li><a href="javascript:;">Help</a></li>
                                    <li><a href="usuario?accion=Cerrar"><i class="fa fa-sign-out pull-right"></i> Log Out</a></li>
                                </ul>
                            </li>

                            
                        </ul>
                    </nav>
                </div>
            </div>
            <!-- /top navigation -->
            <div class="right_col" role="main">