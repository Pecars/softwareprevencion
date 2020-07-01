<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listado de empresas</title>
</head>
<body>

<h1>Información empresa</h1>
<!-- 
<c:if test="${cumensaje != null}">
	<c:out value="${cumensaje}" />
</c:if>
-->

<table>
<tr>
<th>ID</th>
<th>Nombre</th>
<th>Representante</th>
<th>RUT</th>
<th>Dirección</th>
<th>Teléfono</th>
<th>Correo</th>
<th>Giro</th>
<th>Fecha de Ingreso</th>
<th>Trabajadores Enero</th>
<th>Trabajodores Abril</th>
<th>Trabajadores Julio</th>
<th>Trabajodores Octubre</th>
<th>Tasa Accidentabilidad</th>
<th>Administrador a cargo</th>

</tr>

<c:forEach items="${listadoempresas}" var ="empresa">
<tr>
<td>${empresa.idClientes}</td>
<td>${empresa.nombreEmpresa}</td>
<td>${empresa.representanteEmpresa}</td>
<td>${empresa.rutEmpresa}</td>
<td>${empresa.direccionEmpresa}</td>
<td>${empresa.telefonoEmpresa}</td>
<td>${empresa.correoEmpresa}</td>
<td>${empresa.giroEmpresa}</td>
<td>${empresa.fechaIngresoE}</td>
<td>${empresa.trabajadoresEnero}</td>
<td>${empresa.trabajadoresAbril}</td>
<td>${empresa.trabajadoresJulio}</td>
<td>${empresa.trabajadoresOctubre}</td>
<td>${empresa.tasaAccidentabilidad}</td>
<td>${empresa.rutAdministrador}</td>

</tr>
</c:forEach>
</table>


</body>
</html>