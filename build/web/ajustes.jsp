<%-- 
    Document   : ajustes
    Created on : 26-feb-2019, 0:13:43
    Author     : Computer
--%>


<%@page import="modelo.usuario"%>
<%@page import="funciones.usuarioBD"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
    <script>
        function usuario() {
            var fsfd = "Bienvenido <%=nombre%>";
            document.getElementById("nomusuario").innerHTML = fsfd;
        }
    </script>
    <jsp:include page="head.html" />


    <%@include file="body.jsp" %>


	<div class="box-body bg-gray-c">
            <div class="row">
                <div class="col-md-12">
                    <div class="panel panel-default panel-shadow">
                        <div class="panel-body">

				<h3>Configuraciones de Sistema</h3>
				<div class="box-body">
					<div class="row">
					    <div class="col-sm-4">
					        <div class="ibox">
					            <div class="ibox-title">
					               
					            </div>
					            <div class="ibox-content no-padding">
					                <div class="list-group">
					                	<a class="list-group-item" href="ReclamoServlet?accion=AREA">
					                        <h4 class="list-group-item-heading">Configuración Area</h4>
					                        <p class="list-group-item-text">Creación, modificación.</p>
					                    </a>
					                    <a class="list-group-item" href="ReclamoServlet?accion=CATEGORIA">
					                        <h4 class="list-group-item-heading">Configuración Categoria</h4>
					                        <p class="list-group-item-text">Creación, modificación.</p>
					                    </a>
					                    <a class="list-group-item" href="ReclamoServlet?accion=LISTAEMPLEADO">
					                        <h4 class="list-group-item-heading">Configuración Empleado</h4>
					                        <p class="list-group-item-text">Creación, modificación.</p>
					                    </a>						              
					                    
					                    <a class="list-group-item" href="ReclamoServlet?accion=CARGO">
					                        <h4 class="list-group-item-heading">Configuración Cargo/Ocupacion</h4>
					                        <p class="list-group-item-text">Creación, modificación.</p>
					                    </a>
                                                             </div>
					            </div>
					        </div>
					    </div>
                                           <div class="col-sm-4">
					        <div class="ibox">
					            
					            <div class="ibox-content no-padding">
					                <div class="list-group">
                                                            
                                                            <a class="list-group-item" href="ReclamoServlet?accion=OPERADOR">
					                        <h4 class="list-group-item-heading">Configuración Operador</h4>
					                        <p class="list-group-item-text">Creación, modificación.</p>
					                    </a>
                                                            
                                                            <a class="list-group-item" href="ReclamoServlet?accion=ESTADO">
					                        <h4 class="list-group-item-heading">Configuración Estado</h4>
					                        <p class="list-group-item-text">Creación, modificación.</p>
					                    </a>
                                                            
                                                            <a class="list-group-item" href="ReclamoServlet?accion=TIPODOC">
					                        <h4 class="list-group-item-heading">Configuración Documento</h4>
					                        <p class="list-group-item-text">Creación, modificación.</p>
					                    </a>
                                                            
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
              </div><!-- /.box -->
            </div><!-- /.col -->
          </div><!-- /.row -->
          </div><!-- /.row -->
          </div><!-- /.row -->

<jsp:include page="footer.html" />
</html>
