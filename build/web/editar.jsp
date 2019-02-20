<%-- 
    Document   : modal
    Created on : 18-feb-2019, 10:33:29
    Author     : Computer
--%>

<%@page import="modelo.reclamos"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<sql:setDataSource 
    var="conexion" 
    driver="com.mysql.jdbc.Driver"
    url="jdbc:mysql://localhost:3306/sowad?useTimezone=true&serverTimezone=UTC&useSSL=false"
    user="root"
    password="varvon1995"/>
<sql:query var="sqlCat" dataSource="${conexion}">
    select idcategoria, categoria from categoria
</sql:query>
<sql:query var="sqlAr" dataSource="${conexion}">
    select idarea, area from area
</sql:query>

<!DOCTYPE html>
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
                                    <label for="" class="control-label" style="color: #676a6c !important">
                                        Denunciante
                                    </label>
                                </div>
                                <div class="row">
                                    <div class="col-sm-3">
                                        <div class="form-group">
                                            <label>Doc. Identidad</label>
                                            <input type="text" disabled name="cdireccion" id="cdireccion" class="form-control " value="<%=reclamo.getNum_documento()%>" >
                                        </div>

                                    </div>
                                    <div class="col-sm-3">
                                        <div class="form-group">
                                            <label>Telefono</label>
                                            <input type="text" disabled name="cdireccion" id="cdireccion" class="form-control" value="<%=reclamo.getTelefono()%>">
                                        </div>

                                    </div>

                                    <div class="col-sm-6">
                                        <div class="form-group">
                                            <label>Apeliidos y nombres</label>
                                            <input type="text"  name="nombre" class="form-control" value="<%=reclamo.getNombreP()%>">
                                        </div>
                                    </div>
                                </div>
                                <div class="row">

                                    <div class="col-sm-12">
                                        <div class="form-group">
                                            <label>Ubigeo</label>
                                            <input type="text" disabled name="cnro_documento" class="form-control" value="<%=reclamo.getUbigeo()%>">
                                        </div>
                                    </div>
                                    <div class="col-sm-8">
                                        <div class="form-group">
                                            <label>domicilio</label>
                                            <input type="text" disabled name="cnro_documento" class="form-control" value="<%=reclamo.getDireccion()%>">
                                        </div>
                                    </div>
                                    <div class="col-sm-4">
                                        <div class="form-group">
                                            <label>Correo Electronico</label>
                                            <input type="text" disabled name="cnro_documento" id="cnro_documento" class="form-control" value="<%=reclamo.getCorreo()%>">
                                        </div>
                                    </div>

                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-4">
                        <div class="panel panel-default panel-shadow">
                            <div class="panel-body">
                                <div class="form-group">
                                    <label for="" class="control-label" style="color: #676a6c !important">
                                        Denunciado
                                    </label>
                                </div>
                                <div class="row">

                                    <div class="col-sm-12">
                                        <div class="form-group">
                                            <label>
                                                Funcionario
                                            </label>
                                            <input type="text" disabled name="simbolo" id="simbolo" class="form-control" placeholder="Simbolo" value="<%=reclamo.getFuncionario()%>">
                                        </div>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-sm-12">
                                        <div class="form-group">
                                            <label>Area</label>
                                            <select id="idarea2" name="area2" class="form-control">
                                                <option value="00">.: Seleccione Area :.</option>
                                                <c:forEach var="fila" items="${sqlAr.rows}">
                                                    <option value="${fila.idarea}">${fila.area}</option>
                                                </c:forEach>
                                            </select> 
                                        </div>
                                    </div>

                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-8">
                        <div class="panel panel-default panel-shadow">
                            <div class="panel-body">


                                <div class="row">

                                    <div class="col-sm-12">
                                        <div class="form-group">
                                            <label>Descripcion de la Denuncia</label>
                                            <input type="text" name="descripcion" class="form-control" value="<%=reclamo.getDescripcion()%>">
                                        </div>
                                    </div>

                                </div>

                            </div>
                        </div>
                    </div>
                    <div class="col-md-4">
                        <div class="panel panel-default panel-shadow">
                            <div class="panel-body">


                                <div class="row">

                                    <div class="col-sm-12">
                                        <div class="form-group">
                                            <label>Archivos Adjuntos</label>
                                            <textarea type="text" disabled name="cnro_documento" id="cnro_documento" class="form-control" > </textarea>
                                        </div>
                                    </div>

                                </div>

                            </div>
                        </div>
                    </div>
                    <div class="col-md-12">
                        <div class="panel panel-default panel-shadow">
                            <div class="panel-body">


                                <div class="row">

                                    <div class="col-sm-8">
                                        <div class="form-group">
                                            <label>Categoria</label>
                                            <select id="idcategoria" name="categoria" class="form-control">
                                                <option value="00">.: Seleccione Categoria :.</option>
                                                <c:forEach var="fila" items="${sqlCat.rows}">
                                                    <option value="${fila.idcategoria}">${fila.categoria}</option>
                                                </c:forEach>
                                            </select> 
                                        </div>
                                    </div>
                                    <div class="col-sm-4">
                                        <div class="form-group">
                                            <label>Derivar Area</label>
                                            <select id="idarea" name="area" class="form-control">
                                                <option value="00">.: Seleccione Area :.</option>
                                                <c:forEach var="fila" items="${sqlAr.rows}">
                                                    <option value="${fila.idarea}">${fila.area}</option>
                                                </c:forEach>
                                            </select>  
                                        </div>
                                    </div>
                                    <div class="col-sm-12">
                                        <div class="form-group">
                                            <label>Detalle</label>
                                            <textarea type="text" name="cnro_documento" id="cnro_documento" class="form-control" > </textarea>
                                        </div>
                                    </div>
                                    <div>
                                        <input type="submit" value="Rechazar Denuncia">
                                        
                                        <input type="submit" value="Aceptar y derivar denuncia">
                                    </div>

                                </div>

                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        

    </form>
</html>


