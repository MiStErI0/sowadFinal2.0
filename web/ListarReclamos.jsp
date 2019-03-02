<%-- 
    Document   : ListarReclamos
    Created on : 01/02/2019, 12:29:13 PM
    Author     : User
--%>

<%@page import="modelo.usuario"%>
<%@page import="funciones.usuarioBD"%>
<%@page import="java.util.ArrayList"%>
<%@page import="modelo.reclamos"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%
        usuarioBD usu = new usuarioBD();

        usuario e;
        String nombre = null;
        int id = 0;
        int idCargo = 0;
        int idArea=0;
        e = usu.usuActivo();
        if (e.getEstado() == 2) {
            nombre = usu.nomUsuAc();
            id = e.getIdUsuario();
            idCargo = usu.idCargo(id);
            idArea=usu.idArea();

            System.out.println(id + "               aaaaaaaaaaaa   " +idArea);
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
    <style>

        #customers {
            font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
            border-collapse: collapse;
            width: 100%;
        }

        #customers td, #customers th {
            border: 1px solid #ddd;
            padding: 8px;
        }

        #customers tr:nth-child(even){background-color: #f2f2f2;}

        #customers tr:hover {background-color: #ddd;}

        #customers th {
            padding-top: 12px;
            padding-bottom: 12px;
            text-align: left;
            background-color: #4CAF50;
            color: white;
        }

    </style>

    <%@include file="body.jsp"%>
    <%
        List<reclamos> listaA = (ArrayList<reclamos>) request.getSession().getAttribute("listaA");
    %>


    <section class="content-header">
        <h1 style="margin-top: 55px; text-align: center">
            Lista de Reclamos

        </h1>
        <ol class="breadcrumb">


        </ol>
    </section>

    <br/>

    <%if (listaA.size() != 0) {%>


    <table id="customers" >
        <tr>
            <td>Ticket</td>
            <td>Fecha</td>
            <td>Apellidos y nombres</td>
            <td>Categoria</td>
            <td>Estado</td>
            <td>Opciones</td>
        </tr>
        <%for (reclamos f : listaA) {%>
        <tr>
            <%
                String estado = f.getNombreestado();
                int area=f.getArea_idarea();
                System.out.println("ddddddddddddddddddddddddddddddddd"+area);
                System.out.println("ddddddddddddddddddddddddddddddddd"+estado);
                if ((idCargo == 3 && estado.equals("Registrado")) || (idCargo == 3 && estado.equals("En proceso")) || (idCargo == 3 && estado.equals("Finalizado")) || (idCargo == 3 && estado.equals("Denegado")) || (idCargo == 3 && estado.equals("En proceso."))) 
                {
            %>
            <td>0000<%=f.getIdreclamos()%></td>
            <td><%=f.getFechahecho()%></td>
            <td><%=f.getPaternoP()%> <%=f.getMaternoP()%>, <%=f.getNombreP()%></td>
            <td><%=f.getNombrecategoria()%></td>
            <td><%=f.getNombreestado()%></td>

            <%
                System.out.println(estado + "        465465465");
            %>

            <td>
                <%
                    if (estado.equals("Registrado")) {
                %>
                <a href="ReclamoServlet?accion=VER&id=<%=f.getIdreclamos()%>">VER</a>
                <a href="ReclamoServlet?accion=MODIFICAR&id=<%=f.getIdreclamos()%>">EDITAR</a>
                <%
                } else if (estado.equals("En proceso")) {
                %>
                <a href="ReclamoServlet?accion=VER&id=<%=f.getIdreclamos()%>">VER</a>
                <a href="ReclamoServlet?accion=MODIFICAR&id=<%=f.getIdreclamos()%>">EDITAR</a>
                <a href="ReclamoServlet?accion=SEGUIR&id=<%=f.getIdreclamos()%>">SEGUIMIENTO</a>
                <%
                   } else if (estado.equals("En proceso.")) {
                %>
                <a href="ReclamoServlet?accion=VER&id=<%=f.getIdreclamos()%>">VER</a>
                <a href="ReclamoServlet?accion=MODIFICARFD&id=<%=f.getIdreclamos()%>">EDITARFD</a>
                <a href="ReclamoServlet?accion=SEGUIR&id=<%=f.getIdreclamos()%>">SEGUIMIENTO</a>
                <%

                } else if (estado.equals("Atendido")) {
                %>
                <a href="ReclamoServlet?accion=VER&id=<%=f.getIdreclamos()%>">VER</a>
                <a href="ReclamoServlet?accion=MODIFICAR&id=<%=f.getIdreclamos()%>">EDITAR</a>
                <a href="ReclamoServlet?accion=REGISTARR&id=<%=f.getIdreclamos()%>">REGISTRA</a>
                <a href="ReclamoServlet?accion=MODIFICARFD&id=<%=f.getIdreclamos()%>">EDITARFD</a>
                <%
                } else if (estado.equals("Finalizado")) {
                %>
                <a href="ReclamoServlet?accion=VER&id=<%=f.getIdreclamos()%>">VER</a>
                <a href="ReclamoServlet?accion=SEGUIR&id=<%=f.getIdreclamos()%>">SEGUIMIENTO</a>
                <%
                } else {
                %>
                <a href="ReclamoServlet?accion=VER&id=<%=f.getIdreclamos()%>">VER</a>
                <%
                    }
                %>
            </td>
            <%
                }
                else if(idCargo == 4 && estado.equals("Atendido") && idArea==area)
                {
            %>
            <td>0000<%=f.getIdreclamos()%></td>
            <td><%=f.getFechahecho()%></td>
            <td><%=f.getPaternoP()%> <%=f.getMaternoP()%>, <%=f.getNombreP()%></td>
            <td><%=f.getNombrecategoria()%></td>
            <td><%=f.getNombreestado()%></td>

            <%
                System.out.println(estado + "        465465465");
            %>

            <td>
                <%
                    if (estado.equals("Registrado")) {
                %>
                <a href="ReclamoServlet?accion=VER&id=<%=f.getIdreclamos()%>">VER</a>
                <a href="ReclamoServlet?accion=MODIFICAR&id=<%=f.getIdreclamos()%>">EDITAR</a>
                <%
                } else if (estado.equals("En Proceso")) {
                %>
                <a href="ReclamoServlet?accion=VER&id=<%=f.getIdreclamos()%>">VER</a>
                <a href="ReclamoServlet?accion=MODIFICAR&id=<%=f.getIdreclamos()%>">EDITAR</a>
                <%

                } else if (estado.equals("Atendido")) {
                %>
                <a href="ReclamoServlet?accion=VER&id=<%=f.getIdreclamos()%>">VER</a>
                <a href="ReclamoServlet?accion=REGISTARR&id=<%=f.getIdreclamos()%>">REGISTRA</a>
                <%
                } else if (estado.equals("Finalizado")) {
                %>
                <a href="ReclamoServlet?accion=VER&id=<%=f.getIdreclamos()%>">VER</a>

                <%
                } else {
                %>
                <a href="ReclamoServlet?accion=VER&id=<%=f.getIdreclamos()%>">VER</a>

                <%
                    }
                %>
            </td>
            
                <%}%>
        </tr>  

        <%}%>
    </table>
    <%} else {%>
    <p style="color: red;">no hay Producto</p>
    <%}%>
    <jsp:include page="footer.html" />
</html>
