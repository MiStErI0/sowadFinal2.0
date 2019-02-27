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

<sql:query var="sqlTD" dataSource="${conexion}">
    select idtipo_documento, tipodoc from tipo_documento where estadoTD = 1
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
    <form id="formarea" method="Post" action="ReclamoServlet?accion=REGISTROTIPODOC">
        <h3>Registro Tipo Documento</h3>
        <div class="box-body bg-gray-c">
            <div class="row">

                <div class="col-md-5">
                    <div class="panel panel-default panel-shadow">
                        <div class="panel-body">
                            <div class="row">


                                <div class="col-sm-12">				
                                    <div class="form-group"> 
                                        <label>Ingrese Nueva Tipo de Documento</label>

                                        <input type="text" name="tipodoc" class="form-control" placeholder="ingrese tipo documento...">


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
                                            <td>Tipo Documento</td>
                                            <td>Opciones</td>
                                        </tr>
                                        <c:forEach var="fila" items="${sqlTD.rows}">


                                            <tr>
                                                <td>${fila.idtipo_documento}</td>
                                                <td>${fila.tipodoc}</td>



                                                <td>

                                                    <a href="ReclamoServlet?accion=MODIFICARTIPODOC&id=${fila.idtipo_documento}">Editar</a>
                                                    <a href="ReclamoServlet?accion=ELIMINARTIPODOC&id=${fila.idtipo_documento}">Eliminar</a>


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
