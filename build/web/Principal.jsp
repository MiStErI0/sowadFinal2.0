<%-- 
Document   : index
Created on : 10/01/2019, 02:36:51 PM
Author     : User
--%>


<%@page import="modelo.usuario"%>
<%@page import="funciones.usuarioBD"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <%
        usuarioBD usu = new usuarioBD();

        usuario e;
        String nombre = null;
        int id = 0;
        int idCargo=0;
        e = usu.usuActivo();
        if (e.getEstado() == 2) {
            nombre = usu.nomUsuAc();
            id = e.getIdUsuario();
            idCargo=usu.idCargo(id);
            System.out.println(id +"               aaaaaaaaaaaa");
        } else {
            response.sendRedirect("login.jsp");
        }


    %>
    <script>
        function usuario() {
            var fsfd = "Bienvenido <%=nombre%>";
            document.getElementById("peru").innerHTML = fsfd;
            document.getElementById("nomusuario").innerHTML = fsfd;
        }
    </script>
    <jsp:include page="head.html" />


    <%@include file="body.html"%>



    <%@include file="footer.html"%>
    <script>
        $(document).ready(function ()
        {
            $("#mostrarmodal").modal("show");
        });

    </script>
    <div class="modal fade" id="mostrarmodal" tabindex="-1" role="dialog" aria-labelledby="basicModal" aria-hidden="true">
        <div class="modal-dialog modal-sm">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                </div>
                <div class="modal-body">
                    <h3 class="text" style="text-align: center" id="peru">Bienvenido <c:out value="${respuesta}"/></h3>
                </div>
                <div class="modal-footer">
                    <a href="#" data-dismiss="modal" class="btn btn-danger">Cerrar</a>
                </div>
            </div>
        </div>
    </div>
</html>
