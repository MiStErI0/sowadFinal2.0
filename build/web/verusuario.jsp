<%-- 
    Document   : home
    Created on : 29/01/2019, 02:29:03 PM
    Author     : User
--%>

<%@page import="funciones.usuarioBD"%>
<%@page import="modelo.usuario"%>
<%@page import="modelo.empleado"%>
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

<sql:query var="sqlTD" dataSource="${conexion}">
    select idtipo_documento, tipodoc from tipo_documento
</sql:query>

<sql:query var="sqlAr" dataSource="${conexion}">
    select idarea, area from area where estadoA=1
</sql:query>

<sql:query var="sqlCa" dataSource="${conexion}">
    select idcargo, cargo from cargo where estadoCar=1
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

<%
    empleado empleado = (empleado) request.getSession().getAttribute("user");
%>

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
    <jsp:include page="head.html" />




    <%@include file="body.jsp" %>
    <section class="content-header">
        <h1 style="margin-top: 55px; text-align: center">
            Usuario <%=empleado.getUser()%>

        </h1>
        <ol class="breadcrumb">


        </ol>
    </section>

    <form action="ReclamoServlet?accion=MODIFICAREMP2" method="POST">
        <div class="box-body bg-gray-c">
            <div class="row">
                <div class="col-md-4">
                    <div class="panel panel-default panel-shadow">
                        <div class="panel-body">
                            <div class="row">
                                 <div class="col-sm-12">				
                                    <div class="form-group">
                                        <div style="text-align: center"><img src="img/a.png" alt="Smiley face" height="155" width="155"/>
                                    </div>
                                    </div>
                                </div>
                                <div class="col-sm-12">				
                                    <div class="form-group">
                                        <label>Usuario</label>
                                        <input id="idtipodoc2" type="text" disabled name="tipodoc2" class="form-control" value="<%=empleado.getUser()%>">

                                    </div>
                                </div>
                                <div class="col-sm-12">				
                                    <div class="form-group">
                                        <label>Contraseña</label>
                                        <input type="text" id="iddocumento" disabled name="documento" class="form-control" value="<%=empleado.getClave()%>"> 

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
                                <div class="col-sm-3">				
                                    <div class="form-group">
                                        <label>Tipo Documento</label>
                                        <input id="idtipodoc2" type="text" disabled name="tipodoc2" class="form-control" value="<%=empleado.getTipodoc()%>">

                                    </div>
                                </div>
                                <div class="col-sm-3">				
                                    <div class="form-group">
                                        <label>Numero de Documento</label>
                                        <input type="text" id="iddocumento" disabled name="documento" class="form-control" value="<%=empleado.getNum_documento()%>"> 

                                    </div>
                                </div>

                                <div class="col-sm-3">
                                    <div class="form-group">
                                        <label>Nombres</label>  
                                        <input id="idnombre" type="text" disabled name="nombre" class="form-control"  value="<%=empleado.getNombreP()%>" >	
                                    </div> 												
                                </div>
                                <div class="col-sm-3">
                                    <div class="form-group">
                                        <label>Apellido Paterno</label>
                                        <input id="idpaterno" type="text" disabled name="paterno" class="form-control"  value="<%=empleado.getPaternoP()%>">	
                                    </div>													
                                </div>
                            </div>


                            <div class="row">
                                <div class="col-sm-3">
                                    <div class="form-group">
                                        <label>Apellido Materno</label>
                                        <input id="idmaterno" type="text" disabled name="materno" class="form-control"  value="<%=empleado.getMaternoP()%>">	
                                    </div> 												
                                </div>
                                <div class="col-sm-3">				
                                    <div class="form-group">
                                        <label>Departamento</label>
                                        <input id="iddepartamento2" type="text" disabled name="departamento2" class="form-control" value="<%=empleado.getDepartamento()%>">

                                    </div>
                                </div>
                                <div class="col-sm-3">				
                                    <div class="form-group">
                                        <label>Provincia</label>
                                        <input id="idprovincia2" type="text" disabled name="provincia2" class="form-control" value="<%=empleado.getProvincia()%>">

                                    </div>      
                                </div> 

                                <div class="col-sm-3">				
                                    <div class="form-group">
                                        <label>Distrito</label>
                                        <input id="iddistrito2" type="text" disabled name="distrito2" class="form-control" value="<%=empleado.getDistrito()%>">


                                    </div>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-sm-8">
                                    <div class="form-group">
                                        <label>Direccion</label> 
                                        <input id="iddireccion" type="text" disabled name="direccion" class="form-control" value="<%=empleado.getDireccion()%>">	
                                    </div>   												
                                </div>

                                <div class="col-sm-4">
                                    <div class="form-group">
                                        <label>Correo Electronico</label> 
                                        <input id="idcorreo" type="text" disabled name="correo" class="form-control" value="<%=empleado.getCorreo()%>">	
                                    </div>  												
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-sm-4">
                                    <div class="form-group">
                                        <label>Telefono</label> 
                                        <input id="idtelefono" type="text" disabled name="telefono" class="form-control" value="<%=empleado.getNumero()%>">	
                                    </div>  												
                                </div>
                                <div class="col-sm-4">				
                                    <div class="form-group">
                                        <label>Tipo Telefono</label>
                                        <input id="idtipotelefono2" type="text" disabled name="tipotelefono2" class="form-control" value="<%=empleado.getTipotelefono()%>">

                                    </div>
                                </div>
                                <div class="col-sm-4">
                                    <div class="form-group">
                                        <label>Fecha de Inicio</label> 
                                        <input id="idfechai" type="date" disabled name="fechainicio" class="form-control" value="<%=empleado.getFechainicio()%>">	
                                    </div>  												
                                </div>
                                <div class="col-sm-4">
                                    <div class="form-group">
                                        <label>Fecha Fin</label> 
                                        <input id="idfechaf" type="date" disabled name="fechafin" class="form-control" value="<%=empleado.getFechafin()%>">	
                                    </div>  												
                                </div>
                                <div class="col-sm-4">
                                    <div class="form-group">
                                        <label>Sueldo</label> 
                                        <input id="idsuedo" type="text" disabled name="sueldo" class="form-control" value="<%=empleado.getSueldo()%>">	
                                    </div>  												
                                </div>
                                <div class="col-sm-4">				
                                    <div class="form-group">
                                        <label>Operador</label>
                                        <input id="idoperador2" type="text" disabled name="operador2" class="form-control" value="<%=empleado.getNombreO()%>">

                                    </div>
                                </div>


                                <div class="col-sm-4">				
                                    <div class="form-group">
                                        <label>Area</label>
                                        <input id="idarea22" type="text" disabled name="area22" class="form-control" value="<%=empleado.getArea()%>">

                                    </div>
                                </div>

                                <div class="col-sm-4">				
                                    <div class="form-group">
                                        <label>Cargo</label>
                                        <input id="idcargo2" type="text" disabled name="cargo2" class="form-control" value="<%=empleado.getCargo()%>">

                                    </div>
                                </div>

                            </div>
                        </div>
                    </div>
                </div>


            </div>
        </div>

    </form>
</div>
</div>
</div>
</div>
</div>
</div>



<jsp:include page="footer.html" />
</html>
