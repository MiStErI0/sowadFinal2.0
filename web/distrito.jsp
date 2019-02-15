<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<sql:setDataSource 
    var="conexion3" 
    driver="com.mysql.jdbc.Driver"
    url="jdbc:mysql://localhost:3306/sowad?useTimezone=true&serverTimezone=UTC&useSSL=false"
    user="root"
    password="varvon1995"/>
<sql:query var="sqldist" dataSource="${conexion3}">
    select idDistrito, distrito from distrito where Provincia_Departamento_idDepartamento = ? and Provincia_idProvincia = ?
    <sql:param value="${param.dpto}"/>
    <sql:param value="${param.prov}"/>
</sql:query>
    <option value="00">.: Seleccione Distrito :.</option>
<c:forEach var="fila" items="${sqldist.rows}">
    <option value="${fila.iddistrito}">${fila.distrito}</option>
</c:forEach>
     