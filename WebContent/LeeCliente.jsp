<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listado de empresas</title>
 <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

    <link href="style.css" rel="stylesheet">
    <script src="WEB-INF/app/app.js"></script>

    <link href="https://cdn.datatables.net/1.10.21/css/jquery.dataTables.min.css" rel="stylesheet">
    <script src="https://cdn.datatables.net/1.10.21/js/jquery.dataTables.min.js"></script>
   </head>
<body>

<h1>Información empresa</h1>

<c:if test="${listadoempresas != null}">
	<c:out value="Hola , la lista es válida" />
</c:if>

<c:if test="${cumensaje != null}">
	<c:out value="${cumensaje}" />
</c:if>

<table id = "table">
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
<th>Trabajadores Abril</th>
<th>Trabajadores Julio</th>
<th>Trabajadores Octubre</th>
<th>Tasa Accidentabilidad</th>
<th>Administrador a cargo</th>
<th>Acciones</th>

</tr>

<c:forEach items="${listadoempresas}" var ="cliente">
<tr>
<td>${cliente.idClientes}</td>
<td>${cliente.nombreEmpresa}</td>
<td>${cliente.representanteEmpresa}</td>
<td>${cliente.rutEmpresa}</td>
<td>${cliente.direccionEmpresa}</td>
<td>${cliente.telefonoEmpresa}</td>
<td>${cliente.correoEmpresa}</td>
<td>${cliente.giroEmpresa}</td>
<td>${cliente.fechaIngresoE}</td>
<td>${cliente.trabajadoresEnero}</td>
<td>${cliente.trabajadoresAbril}</td>
<td>${cliente.trabajadoresJulio}</td>
<td>${cliente.trabajadoresOctubre}</td>
<td>${cliente.tasaAccidentabilidad}</td>
<td>${cliente.rutAdministrador}</td>
<td> 
<a href="${pageContext.request.contextPath}/EliminaClienteController?idClientes=${cliente.idClientes}">Eliminar</a>
&nbsp;
<a href="${pageContext.request.contextPath}/EditaClienteController?idClientes=${cliente.idClientes}">Editar</a>


</td>

</tr>
</c:forEach>
</table>


</body>
</html>