<%-- 
    Document   : modal
    Created on : 18-feb-2019, 10:33:29
    Author     : Computer
--%>

<%@page import="modelo.reclamos"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
                            <label for="" class="control-label" style="color: #676a6c !important">
                                Denunciante
                            </label>
                        </div>
                        <div class="row">
                            <div class="col-sm-3">
                                <div class="form-group">
                                    <label>Doc. Identidad</label>
                                    <input type="text" disabled name="cdireccion" id="cdireccion" class="form-control" >
                                </div>

                            </div>
                            <div class="col-sm-3">
                                <div class="form-group">
                                    <label>Telefono</label>
                                    <input type="text" disabled name="cdireccion" id="cdireccion" class="form-control" >
                                </div>

                            </div>

                            <div class="col-sm-6">
                                <div class="form-group">
                                    <label>Apeliidos y nombres</label>
                                    <input type="text" disabled name="cnro_documento" id="cnro_documento" class="form-control" value="<%=reclamo.getNombreP()%>">
                                </div>
                            </div>
                        </div>
                        <div class="row">

                            <div class="col-sm-12">
                                <div class="form-group">
                                    <label>Ubigeo</label>
                                    <input type="text" disabled name="cnro_documento" id="cnro_documento" class="form-control" value="<%=reclamo.getNombreP()%>">
                                </div>
                            </div>
                            <div class="col-sm-8">
                                <div class="form-group">
                                    <label>domicilio</label>
                                    <input type="text" disabled name="cnro_documento" id="cnro_documento" class="form-control" value="<%=reclamo.getNombreP()%>">
                                </div>
                            </div>
                            <div class="col-sm-4">
                                <div class="form-group">
                                    <label>Correo Electronico</label>
                                    <input type="text" disabled name="cnro_documento" id="cnro_documento" class="form-control" value="<%=reclamo.getNombreP()%>">
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
                                    <input type="text" disabled name="simbolo" id="simbolo" class="form-control" placeholder="Simbolo">
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-sm-12">
                                <div class="form-group">
                                    <label>
                                        Area
                                    </label>
                                    <input type="text" disabled id="valorcambio" class="form-control" placeholder="Cambio">
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
                                    <textarea type="text" disabled name="cnro_documento" id="cnro_documento" class="form-control" > </textarea>
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
                                    <input type="text" disabled name="cnro_documento" id="cnro_documento" class="form-control" > 
                                </div>
                            </div>
                            <div class="col-sm-4">
                                <div class="form-group">
                                    <label>Derivar Area</label>
                                    <input type="text" disabled name="cnro_documento" id="cnro_documento" class="form-control" > 
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

</form>
</html>


