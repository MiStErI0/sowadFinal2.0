<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<sql:setDataSource 
    var="conexion2" 
    driver="com.mysql.jdbc.Driver"
    url="jdbc:mysql://localhost:3306/sowad?useTimezone=true&serverTimezone=UTC&useSSL=false"
    user="root"
    password="varvon1995"/>

<sql:query var="sqlprov" dataSource="${conexion2}">
    select idProvincia, provincia from provincia where Departamento_idDepartamento = ?
    <sql:param value="${param.dpto}"/>
</sql:query>

    <option value="00">.: Seleccione Provincia :.</option>
<c:forEach var="fila" items="${sqlprov.rows}">
    <option value="${fila.idProvincia}">${fila.provincia}</option>
</c:forEach>
       