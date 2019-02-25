<%-- 
    Document   : area
    Created on : 24-feb-2019, 22:11:37
    Author     : Computer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form id="formarea" method="Post" action="ReclamoServlet?accion=REGISTROAREA">
            
            <div class="row">
                
        <label>Ingrese Nueva area</label>
        <input type="text" name="area" placeholder="ingrese area...">
        
        <input type="submit" value="registrar">
            </div>
        
        </form>
    </body>
</html>
