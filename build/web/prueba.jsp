<%-- 
    Document   : prueba
    Created on : 24-feb-2019, 18:07:24
    Author     : Computer
--%>

<%@page import="modelo.reclamos"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<sql:setDataSource 
    var="conexion" 
    driver="com.mysql.jdbc.Driver"
    url="jdbc:mysql://localhost:3306/sowad1?useTimezone=true&serverTimezone=UTC&useSSL=false"
    user="root"
    password="varvon1995"/>
<sql:query var="sqlCat" dataSource="${conexion}">
    select idcategoria, categoria from categoria
</sql:query>
<sql:query var="sqlAr" dataSource="${conexion}">
    select idarea, area from area
</sql:query>
<html>
    <jsp:include page="head.html" />
    
     <%
        reclamos reclamo = (reclamos) request.getSession().getAttribute("reclamo");
    %>
    <body>
         <form action="ProductoServlet?accion=MODIFICARBD" method="post">






            <div class="box-body bg-gray-c">
                <div class="row">
                    <div class="col-md-8">
                        <div class="panel panel-default panel-shadow">
                            <div class="panel-body">
                                <div class="form-group">
                                    <label for="" class="control-label" style="color: #676a6c !important ">
                                        Ticket 00000<%=reclamo.getIdreclamos()%> - <%=reclamo.getFechahecho()%> - <%=reclamo.getNombreestado()%>
                                    </label><br></br>
                                    
                                </div>
                                
        

    </form>
    </body>
</html>
