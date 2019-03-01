<%-- 
    Document   : consulta
    Created on : 28-feb-2019, 16:34:31
    Author     : Computer
--%>

<%@page import="modelo.ticket"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
     <%
        ticket ticket = (ticket) request.getSession().getAttribute("ticket");
    %>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
    <body>
        
        <input type="text" name="nombre" value="<%=ticket.getNombre()%>">
        <input type="text" name="nombre" value="<%=ticket.getIdreclamos()%>">
    </body>
</html>
