<%-- 
    Document   : modal
    Created on : 18-feb-2019, 10:33:29
    Author     : Computer
--%>

<%@page import="modelo.usuario"%>
<%@page import="funciones.usuarioBD"%>
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

<!DOCTYPE html>
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

    <%
        reclamos reclamo = (reclamos) request.getSession().getAttribute("reclamo");
    %>

     <%@include file="body.jsp" %>


        <form action="ProductoServlet?accion=MODIFICARBD" method="get">






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
                                            <input type="text" disabled name="nombre" class="form-control" value="<%=reclamo.getNombreP()%> <%=reclamo.getPaternoP()%> <%=reclamo.getMaternoP()%>">
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
                                            <select id="idarea2" disabled name="area2" class="form-control">
                                                <option value="00">.: Seleccione Area :.</option>
                                                <c:forEach var="fila" items="${sqlAr.rows}">
                                                    <option disabled value="${fila.idarea}">${fila.area}</option>
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
                                            <input type="text" disabled name="descripcion" class="form-control" value="<%=reclamo.getDescripcion()%>">
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
                                            <select id="idcategoria" disabled name="categoria" class="form-control">
                                                <option value="00">.: Seleccione Categoria :.</option>
                                                <c:forEach var="fila" items="${sqlCat.rows}">
                                                    <option disabled value="${fila.idcategoria}">${fila.categoria}</option>
                                                </c:forEach>
                                            </select> 
                                        </div>
                                    </div>
                                    <div class="col-sm-4">
                                        <div class="form-group">
                                            <label>Derivar Area</label>
                                            <select id="idarea" disabled name="area" class="form-control">
                                                <option value="00">.: Seleccione Area :.</option>
                                                <c:forEach var="fila" items="${sqlAr.rows}">
                                                    <option disabled value="${fila.idarea}">${fila.area}</option>
                                                </c:forEach>
                                            </select>  
                                        </div>
                                    </div>
                                    <div class="col-sm-12">
                                        <div class="form-group">
                                            <label>Detalle</label>
                                            <textarea type="text" disabled name="cnro_documento" id="cnro_documento" class="form-control" > </textarea>
                                        </div>
                                    </div>
                                    

                                </div>

                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        
<jsp:include page="footer.html" />
    </form>
</html>


