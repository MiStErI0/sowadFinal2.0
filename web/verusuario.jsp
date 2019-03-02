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
    empleado user = (empleado) request.getSession().getAttribute("user");
%>

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




    <%@include file="body.jsp" %>
    <section class="content-header">
        <h1 style="margin-top: 55px; text-align: center">
            Modificar de Empleado 

        </h1>
        <ol class="breadcrumb">


        </ol>
    </section>

    
        <div class="box-body bg-gray-c">
            <div class="row">
                <div class="col-md-12">
                    <div class="panel panel-default panel-shadow">
                        <div class="panel-body">


                            <div class="row">
                                <div class="col-sm-6">				
                                    <div class="form-group">
                                        <label>Tipo Documento</label>
                                        <input id="idtipodoc2" type="text" disabled name="tipodoc2" class="form-control" value="<%=user.getTipodoc()%>">
                                        
                                    </div>
                                </div>
                                <div class="col-sm-6">				
                                    <div class="form-group">
                                        <label>Numero de Documento</label>
                                        <input type="text" id="iddocumento" name="documento" class="form-control" value="<%=user.getNum_documento()%>"> 
                                        
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
</div>
</div>



<jsp:include page="footer.html" />
</html>
