<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Crear usuario</title>
</head>
<body>

<h1>Información empresa</h1>
<!-- 
<c:if test="${cumensaje != null}">
	<c:out value="${cumensaje}" />
</c:if>
-->
<form action="CreaClienteController" method="post">
	Id Empresa: <input type="text" name="txtnombre" /><br/>
	Nombre : <input type="text" name="txtapellido" /> <br/>
	Representante: <input type="text" name="txttelefono" /> <br/>
	Rut: <input type="number" name="txtcorreo" /> <br/>
	Dirección : <input type="text" name="txtapellido" /> <br/>
	Teléfono: <input type="number" name="txttelefono" /> <br/>
	Correo: <input type="text" name="txtcorreo" /> <br/>
	Giro: <input type="text" name="txtapellido" /> <br/>
	Fecha ingreso: <input type="date" name="txttelefono" /> <br/>
	Número de trabajadores enero: <input type="number" name="txtcorreo" /> <br/>
	Número de trabajadores abril: <input type="number" name="txtcorreo" /> <br/>
	Número de trabajadores julio: <input type="number" name="txtcorreo" /> <br/>
	Número de trabajadores octubre: <input type="number" name="txtcorreo" /> <br/>
	Administrador: <input type="text" name="txtcorreo" /> <br/>
	
	<input type="submit" value="Agregar usuario" />
</form>

<!--
<a href="${pageContext.request.contextPath}/ListarUsuarios">Volver al listado de usuarios</a>
-->
</body>
</html>