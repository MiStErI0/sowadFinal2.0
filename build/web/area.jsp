<%-- 
    Document   : area
    Created on : 24-feb-2019, 22:11:37
    Author     : Computer
--%>

<%@page import="modelo.usuario"%>
<%@page import="funciones.usuarioBD"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<sql:setDataSource 
    var="conexion" 
    driver="com.mysql.jdbc.Driver"
    url="jdbc:mysql://localhost:3306/sowad1?useTimezone=true&serverTimezone=UTC&useSSL=false"
    user="root"
    password="varvon1995"/>

<sql:query var="sqlAr" dataSource="${conexion}">
    select idarea, area from area where estadoA = 1
</sql:query>
    
<html>
    <%
        usuarioBD usu = new usuarioBD();

        usuario e;
        String nombre = null;
        int id=0,idCargo=0;
        e = usu.usuActivo();
        if (e.getEstado() == 2) {
            nombre = usu.nomUsuAc();
            id=e.getIdUsuario();
            idCargo=usu.idCargo(id);
            System.out.println(id +"               aaaaaaaaaaaa");
        } else {
            response.sendRedirect("login.jsp");
        }
    %>
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
    <form id="formarea" method="Post" action="ReclamoServlet?accion=REGISTROAREA">
<h3>Registro Area</h3>
        <div class="box-body bg-gray-c">
            <div class="row">
                
                <div class="col-md-5">
                    <div class="panel panel-default panel-shadow">
                        <div class="panel-body">
                            <div class="row">
                                
                                
                                <div class="col-sm-12">				
                                    <div class="form-group"> 
                                        <label>Ingrese Nueva area</label>

                                        <input type="text" name="area" class="form-control" placeholder="ingrese area...">


                                    </div>
                                </div>
                                <div class="col-sm-4">				
                                    <div class="form-group"> 
                                        <input type="submit" value="registrar">


                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-md-7">
                    <div class="panel panel-default panel-shadow">
                        <div class="panel-body">
                            <div class="row">
                                <div class="col-sm-12">				
                                    <table id="customers" >
        <tr>
            <td>Codigo</td>
            <td>Area</td>
            <td>Opciones</td>
        </tr>
        <c:forEach var="fila" items="${sqlAr.rows}">
                                                
        
        <tr>
            <td>${fila.idarea}</td>
            <td>${fila.area}</td>
            


            <td>
                
                <a href="ReclamoServlet?accion=MODIFICARAREA&id=${fila.idarea}">Editar</a>
                <a href="ReclamoServlet?accion=ELIMINARAREA&id=${fila.idarea}">Eliminar</a>
                

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
    </form>


    <jsp:include page="footer.html" />
</html>
