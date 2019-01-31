<%-- 
    Document   : home
    Created on : 29/01/2019, 02:29:03 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <jsp:include page="head.html" />


    <jsp:include page="body.html" />



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
                                    <select id="iddepartamento" name="departamento" class="form-control">
                                        <option value="" disabled selected >Selecione Departamento</option>
                                    </select>
                                </div>
                            </div>
                            <div class="col-sm-4">				
                                <div class="form-group">
                                    <label>Provincia</label>
                                    <select id="idprovincia" name="provincia" class="form-control">
                                        <option value="" disabled selected >Selecione Provincia</option>
                                    </select>
                                </div>
                            </div> 
                            <div class="col-sm-4">				
                                <div class="form-group">
                                    <label>Distrito</label>
                                    <select id="iddistrito" name="distrito" class="form-control">
                                        <option value="" disabled selected >Selecione Distrito</option>
                                    </select>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-sm-12">
                                <div class="form-group">
                                    <label>Direccion</label> 
                                    <input id="iddireccion" type="text" name="direccion" class="form-control" placeholder="Ingrese Direccion ...">	
                                </div>   												
                            </div>
                        </div>

                        <div class="row">
                            <div class="col-sm-4">
                                <div class="form-group">
                                    <label>Correo Electronico</label> 
                                    <input id="idcorreo" type="text" name="correo" class="form-control" placeholder="Ingrese correo ...">	
                                </div>  												
                            </div>
                            <div class="col-sm-4">
                                <div class="form-group">
                                    <label>Telefono</label> 
                                    <input id="idtelefono" type="text" name="telefono" class="form-control" placeholder="Ingrese telefono ...">	
                                </div>  												
                            </div>
                            <div class="col-sm-4">
                                <div class="form-group">
                                    <label>Celular</label> 
                                    <input id="idcelular" type="text" name="celular" class="form-control" placeholder="Ingrese celular ...">	
                                </div>  												
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-sm-4">
                                <div class="form-group">
                                    <label>Fecha del hecho</label> 
                                    <input id="idfecha" type="text" name="fecha" class="form-control" placeholder="Ingrese correo ...">	
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
                                    <button  type="button" class="btn btn-primary"> Enviar</button>
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
