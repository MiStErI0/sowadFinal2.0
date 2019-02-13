<%-- 
    Document   : home
    Created on : 29/01/2019, 02:29:03 PM
    Author     : User
--%>

<%@page import="modelo.tipotelefono"%>
<%@page import="modelo.distrito"%>
<%@page import="modelo.provincia"%>
<%@page import="java.util.ArrayList"%>
<%@page import="funciones.reclamoDB"%>
<%@page import="modelo.departamento"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<sql:setDataSource 
    var="conexion" 
    driver="com.mysql.jdbc.Driver"
    url="jdbc:mysql://localhost:3306/sowad1?useTimezone=true&serverTimezone=UTC&useSSL=false"
    user="root"
    password="varvon1995"/>
<sql:query var="sqlDep" dataSource="${conexion}">
    select idDepartamento, departamento from departamento
</sql:query>

<sql:query var="sqlTT" dataSource="${conexion}">
    select idTipo_telefono, nombreTT from tipo_telefono
</sql:query>
    
<sql:query var="sqlOp" dataSource="${conexion}">
    select idOperador, nombreO from Operador
</sql:query>

<!DOCTYPE html>
<script>
    function getprovincia() {
        cdep = document.getElementById("iddepartamento").value;
        $.ajax({
            data: {dpto: cdep},
            type: 'POST',
            url: "provincia.jsp",
            success: function (response) {
                document.getElementById("idprovincia").innerHTML = response;
            }
        });
    }

    function getdistrito() {
        cdep = document.getElementById("iddepartamento").value;
        cpro = document.getElementById("idprovincia").value;
        $.ajax({
            data: {dpto: cdep, prov: cpro},
            type: 'POST',
            url: "distrito.jsp",
            success: function (response) {
                document.getElementById("iddistrito").innerHTML = response;
            }
        });
    }

</script>

<html>

    <jsp:include page="head.html" />


    <jsp:include page="body.html" />
    <section class="content-header">
        <h1 style="margin-top: 55px; text-align: center">
            Registrar de Reclamo

        </h1>
        <ol class="breadcrumb">


        </ol>
    </section>

    <form action="ReclamoServlet?accion=REGISTRARBD" method="POST">
        <div class="box-body bg-gray-c">
            <div class="row">
                <div class="col-md-12">
                    <div class="panel panel-default panel-shadow">
                        <div class="panel-body">


                            <div class="row">
                                <div class="col-sm-6">				
                                    <div class="form-group">
                                        <label>Tipo Documento</label>
                                        <select id="a" name="marca_producto" class="form-control">
                                            <option value="" disabled selected >Selecione Tipo de Producto</option>
                                            <option value="DNI">DNI</option>
                                            <option value="RUC">RUC</option>
                                            <option value="PASAPORTE">PASAPORTE</option>
                                        </select>
                                    </div>
                                </div>
                                <div class="col-sm-6">				
                                    <div class="form-group">
                                        <label>Tipo Documento</label>
                                        <input type="text" id="iddocumento" name="documento" class="form-control" placeholder="ingrese documento..." >
                                    </div>
                                </div>
                            </div>

                            <div class="row">
                                <div class="col-sm-4">
                                    <div class="form-group">
                                        <label>Nombres</label>  
                                        <input id="idnombre" type="text" name="nombre" class="form-control"  placeholder="ingrese nombres...">	
                                    </div> 												
                                </div>
                                <div class="col-sm-4">
                                    <div class="form-group">
                                        <label>Apellido Paterno</label>
                                        <input id="idpaterno" type="text" name="paterno" class="form-control"  placeholder="ingrese apellido...">	
                                    </div>													
                                </div>
                                <div class="col-sm-4">
                                    <div class="form-group">
                                        <label>Apellido Materno</label>
                                        <input id="idmaterno" type="text" name="materno" class="form-control"  placeholder="ingrese apellido...">	
                                    </div> 												
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-sm-4">				
                                    <div class="form-group">
                                        <label>Departamento</label>
                                        <select id="iddepartamento" name="departamento" class="form-control" onchange="getprovincia()">
                                            <option value="00">.: Seleccione Provincia :.</option>
                                            <c:forEach var="fila" items="${sqlDep.rows}">
                                                <option value="${fila.idDepartamento}">${fila.departamento}</option>
                                            </c:forEach>
                                        </select>


                                    </div>
                                </div>


                                <div class="col-sm-4">				
                                    <div class="form-group">
                                        <label>Provincia</label>
                                        <select id="idprovincia" name="provincia" class="form-control" onchange="getdistrito()">
                                            <option value="00">.: Seleccione Provincia :.</option>
                                        </select>
                                    </div>      
                                </div> 
                                <div class="col-sm-4">				
                                    <div class="form-group">
                                        <label>Distrito</label>
                                        <select id="iddistrito" name="distrito" class="form-control">
                                            <option value="00">.: Seleccione Distrito :.</option>  
                                        </select>

                                    </div>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-sm-8">
                                    <div class="form-group">
                                        <label>Direccion</label> 
                                        <input id="iddireccion" type="text" name="direccion" class="form-control" placeholder="Ingrese Direccion ...">	
                                    </div>   												
                                </div>

                                <div class="col-sm-4">
                                    <div class="form-group">
                                        <label>Correo Electronico</label> 
                                        <input id="idcorreo" type="text" name="correo" class="form-control" placeholder="Ingrese correo ...">	
                                    </div>  												
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-sm-4">
                                    <div class="form-group">
                                        <label>Telefono</label> 
                                        <input id="idtelefono" type="text" name="telefono" class="form-control" placeholder="Ingrese telefono ...">	
                                    </div>  												
                                </div>
                                <div class="col-sm-4">				
                                    <div class="form-group">
                                        <label>Tipo Telefono</label>
                                        <select id="idtipotelefono" name="tipotelefono" class="form-control">
                                            <option value="00">.: Seleccione Tipo de telefono :.</option>
                                            <c:forEach var="fila" items="${sqlTT.rows}">
                                                <option value="${fila.idtipo_telefono}">${fila.nombreTT}</option>
                                            </c:forEach>
                                        </select>
                                    </div>
                                </div>
                                <div class="col-sm-4">				
                                    <div class="form-group">
                                        <label>Operador</label>
                                        <select id="idoperador" name="operador" class="form-control">
                                            <option value="00">.: Seleccione Operador :.</option>
                                            <c:forEach var="fila" items="${sqlOp.rows}">
                                                <option value="${fila.idOperador}">${fila.nombreO}</option>
                                            </c:forEach>
                                        </select>
                                    </div>
                                </div>

                            </div>
                            <div class="row">
                                <div class="col-sm-4">
                                    <div class="form-group">
                                        <label>Fecha del hecho</label> 
                                        <input id="idfecha" type="date" name="fecha" class="form-control" placeholder="Ingrese correo ...">	
                                    </div>  												
                                </div>
                                <div class="col-sm-8">
                                    <div class="form-group">
                                        <label>Funcionario</label> 
                                        <input id="idfuncionario" type="text" name="funcionario" class="form-control" placeholder="Ingrese telefono ...">	
                                    </div>  												
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-sm-12">
                                    <div class="form-group">
                                        <label>Descripcion</label> 
                                        <textarea id="iddescripcion" type="text" name="descripcion" class="form-control" placeholder="Descripción..."></textarea>
                                    </div>	
                                </div>

                            </div>
                            <div class="row">
                                <div class="col-sm-10">
                                    <div class="form-group">
                                        <label>Adjuntar archivos</label> 
                                        <input id="idarchivo" type="file" name="archivo" class="form-control" placeholder="Ingrese archivo">	
                                    </div>  												
                                </div>
                                <div style="margin-top: 23px" class="col-sm-2">
                                    <div class="form-group">
                                        <input type="submit"class="btn btn-primary" value="enviar">
                                    </div>
                                    <!-- LO ULTIMO-->
                                    <!-- LO ULTIMO-->
                                    <!-- LO ULTIMO-->
                                    <div class="form-group">
                                        <a href="#ventana1" class="btn btn-primary" data-toggle="modal">probando</a>
                                        <div class="modal fade" id="ventana1">
                                            <div class="modal-dialog">
                                                <div class="modal-content">
                                                    <div class="modal-header">
                                                        <h2 class="modal-title">ALEXIS CABRITO FOR EVER</h2>
                                                        <button class="close" type="button" data-dismiss="modal" aria-hidden="true"></button> 
                                                    </div>
                                                    <div class="modal-body">
                                                        <p>YA LES DIJISTE A TUS PADRES QUE ERES GAY??</p>

                                                    </div>

                                                    <div class="modal-footer">
                                                        <div class="form-group">
                                                            <button type="button" class="btn btn-primary" data-dismiss="modal">SI</button>
                                                            <button type="button" class="btn btn-primary" data-dismiss="modal">NO</button>
                                                        </div>
                                                    </div>

                                                </div>
                                            </div>
                                        </div>
                                    </div>

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