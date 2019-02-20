<%-- 
    Document   : ListarReclamos
    Created on : 01/02/2019, 12:29:13 PM
    Author     : User
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="modelo.reclamos"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <jsp:include page="head.html" />
    <style>
        html,body {

            background-color: white;
            margin: 0;
            padding: 0;
            display: block;
        }
        .title{
            background-color: white;
            -webkit-box-shadow: inset 0px 9px 59px -11px rgba(0,0,0,0.77);
            -moz-box-shadow: inset 0px 9px 59px -11px rgba(0,0,0,0.77);
            box-shadow: inset 0px 9px 59px -11px rgba(0,0,0,0.77);
        }
        .title h3{
            text-align: center;
            padding: 10px;
            font-family: 'ZCOOL QingKe HuangYou', cursive;
            font-size: 45px;
        }
        .container{
            width: 100%;
            background-color: yellow;   
        }

        .row{
            width: 50%;
            float: left;
            display: inline-block;
            vertical-align: middle;

            margin-top: 40px;

        }

        .row h5 a{
            text-decoration: none;
        }

        .color{
            color: white;
            font-size: 22px;
        }

        footer {
            background-color: white;
            position: absolute;
            bottom: 0;
            width: 100%;
            height: 60px;
            color: black;
            text-align: center;
        }
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
        button{
            background-color: green;
            width: 100px;
            padding: 10px;
            color: white;
            border:1px solid white;
            border-radius: 5px;
            margin-left: auto;
            margin-right: auto;

        }
        .color{
            color: white;
            font-size: 15px;
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
                <a href="ProductoServlet?accion=ELIMINAR&id=<%=f.getIdreclamos()%>">SEGUIMIENTO</a></td>

        </tr>  

        <%}%>
    </table>
    <%} else {%>
    <p style="color: red;">no hay Producto</p>
    <%}%>
    <jsp:include page="footer.html" />
</html>
