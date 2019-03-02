<%-- 
    Document   : area
    Created on : 24-feb-2019, 22:11:37
    Author     : Computer
--%>

<%@page import="funciones.usuarioBD"%>
<%@page import="modelo.usuario"%>
<%@page import="modelo.tipodocumento"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<sql:setDataSource 
    var="conexion" 
    driver="com.mysql.jdbc.Driver"
    url="jdbc:mysql://localhost:3306/sowad1?useTimezone=true&serverTimezone=UTC&useSSL=false"
    user="root"
    password="varvon1995"/>

<sql:query var="sqlEmp" dataSource="${conexion}">

    SELECT idUsuario,user,clave,nombreP,paternoP,maternoP,cargo,estadoEmp FROM usuario as u
    inner join empelado as e on e.idempelado=u.empelado_idempelado
    inner join persona as p on p.idPersona=e.idPersona
    inner join cargo_has_usuario as cu on cu.Usuario_idUsuario=u.idUsuario
    inner join cargo as c on c.idcargo=cu.cargo_idcargo where estadoEmp=1


</sql:query>

<html>
    <%
        usuarioBD usu = new usuarioBD();

        usuario e;
        String nombre = null;
        int id = 0, idCargo = 0;
        e = usu.usuActivo();
        if (e.getEstado() == 2) {
            nombre = usu.nomUsuAc();
            id = e.getIdUsuario();
            idCargo = usu.idCargo(id);
            System.out.println(id + "               aaaaaaaaaaaa");
        } else {
            response.sendRedirect("login.jsp");
        }
    %>
    <script>
        function usuario() {
            var fsfd = "Bienvenido <%=nombre%>";
            document.getElementById("nomusuario").innerHTML = fsfd;
        }
    </script>

    <jsp:include page="head.html" />

    <style>

        #customers {
            font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
            border-collapse: collapse;
            width: 100%;
        }

        #customers td, #customers th {
            border: 1px solid #ddd;
            padding: 8px;
        }

        #customers tr:nth-child(even){background-color: #f2f2f2;}

        #customers tr:hover {background-color: #ddd;}

        #customers th {
            padding-top: 12px;
            padding-bottom: 12px;
            text-align: left;
            background-color: #4CAF50;
            color: white;
        }

    </style>


    <%@include file="body.jsp" %>


    <div class="box-body bg-gray-c">
        <div class="row">

            <div class="col-md-12">
                

                <h3 style="text-align: center">Listado de Usuarios</h3>


                <div class="panel panel-default panel-shadow">
                    <div class="panel-body">
                        <div class="row">
                            <div class="col-sm-12">				
                                <table id="customers" >
                                    <tr>
                                        <td>Codigo</td>
                                        <td>Nombre</td>
                                        <td>Usuario</td>
                                        <td>Contraseña</td>
                                        <td>Cargo</td>
                                        <td>Opciones</td>
                                    </tr>
                                    <c:forEach var="fila" items="${sqlEmp.rows}">


                                        <tr>
                                            <td>000${fila.idUsuario}</td>
                                            <td>${fila.nombreP} ${fila.paternoP} ${fila.maternoP}</td>
                                            <td>${fila.user}</td>
                                            <td>${fila.clave}</td>
                                            <td>${fila.cargo}</td>



                                            <td>

                                                <a href="ReclamoServlet?accion=VERUSUARIO&id=${fila.idUsuario}">Ver</a>
                                                


                                        </tr>  

                                    </c:forEach>
                                </table>
                            </div>

                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>



    <jsp:include page="footer.html" />
</html>
