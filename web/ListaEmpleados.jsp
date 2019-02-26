<%-- 
    Document   : area
    Created on : 24-feb-2019, 22:11:37
    Author     : Computer
--%>

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
    SELECT idempelado,fechainicio,nombreP,paternoP,maternoP,correo,numero,cargo FROM empelado as e 
inner join persona as p on e.idPersona=p.idPersona
inner join telefonoe as t on t.idempleado=e.idempelado
inner join usuario as u on u.empelado_idempelado=e.idempelado
inner join cargo_has_usuario as cu on cu.Usuario_idUsuario=u.idUsuario
inner join cargo as ca on ca.idcargo=cu.cargo_idcargo where estadoEmp = 1
</sql:query>

<html>
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





    <jsp:include page="body.html" />


    <div class="box-body bg-gray-c">
        <div class="row">
            <div class="col-md-12">
                
                <h3>Listado de Empleados</h3>
                
                <div class="panel panel-default panel-shadow">
                    <div class="panel-body">
                        <div class="row">
                            <div class="col-sm-12">				
                                <table id="customers" >
                                    <tr>
                                        <td>Codigo</td>
                                        <td>Nombre</td>
                                        <td>Correo</td>
                                        <td>Telefono</td>
                                        <td>Cargo</td>
                                        <td>Opciones</td>
                                    </tr>
                                    <c:forEach var="fila" items="${sqlEmp.rows}">


                                        <tr>
                                            <td>000${fila.idempelado}</td>
                                            <td>${fila.nombreP} ${fila.paternoP} ${fila.maternoP}</td>
                                            <td>${fila.correo}</td>
                                            <td>${fila.numero}</td>
                                            <td>${fila.cargo}</td>



                                            <td>

                                                <a href="ReclamoServlet?accion=MODIFICARAREA&id=${fila.idempelado}">Editar</a>
                                                <a href="ReclamoServlet?accion=ELIMINAEMP&id=${fila.idempelado}">Eliminar</a>


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
