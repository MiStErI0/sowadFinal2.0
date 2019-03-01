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
        int id=0;
        e = usu.usuActivo();
        if (e.getEstado() == 2) {
            nombre = usu.nomUsuAc();
            id=e.getIdUsuario();
            
            System.out.println(id +"               aaaaaaaaaaaa");
        } else {
            response.sendRedirect("login.jsp");
        }
    %>   
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

    <jsp:include page="body.html" />
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
            <td>0000<%=f.getIdreclamos()%></td>
            <td><%=f.getFechahecho()%></td>
            <td><%=f.getPaternoP()%> <%=f.getMaternoP()%>, <%=f.getNombreP()%></td>
            <td><%=f.getNombrecategoria()%></td>
            <td><%=f.getNombreestado()%></td>


            <td>
                <a href="ReclamoServlet?accion=VER&id=<%=f.getIdreclamos()%>">VER</a>
                <a href="ReclamoServlet?accion=MODIFICAR&id=<%=f.getIdreclamos()%>">EDITAR</a>
                <a href="ReclamoServlet?accion=MODIFICARFD&id=<%=f.getIdreclamos()%>">EDITARFD</a>
                <a href="ReclamoServlet?accion=SEGUIR&id=<%=f.getIdreclamos()%>">SEGUIMIENTO</a></td>

        </tr>  

        <%}%>
    </table>
    <%} else {%>
    <p style="color: red;">no hay Producto</p>
    <%}%>
    <jsp:include page="footer.html" />
</html>
