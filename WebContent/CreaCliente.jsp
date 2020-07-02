<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Crear Empresa</title>
</head>
<body>

<h1>Informaci�n empresa</h1>

<c:if test="${cumensaje != null}">
	<c:out value="${cumensaje}" />
</c:if>

<form action="CreaClienteController" method="post">
	Id Empresa: <input type="number" name="txtidempresa" /><br/>
	Nombre : <input type="text" name="txtnombreempresa" /> <br/>
	Representante: <input type="text" name="txtrepresentante" /> <br/>
	Rut: <input type="number" name="txtrutempresa" /> <br/>
	Direcci�n : <input type="text" name="txtdireccionempresa" /> <br/>
	Tel�fono: <input type="number" name="txttelefonoempresa" /> <br/>
	Correo: <input type="text" name="txtcorreoempresa" /> <br/>
	Giro: <input type="text" name="txtgiroempresa" /> <br/>
	Fecha ingreso: <input type="date" name="txtfechaingresoempresa" /> <br/>
	N�mero de trabajadores enero: <input type="number" name="txttrabajadoresenero" /> <br/>
	N�mero de trabajadores abril: <input type="number" name="txttrabajadoresabril" /> <br/>
	N�mero de trabajadores julio: <input type="number" name="txttrabajadoresjulio" /> <br/>
	N�mero de trabajadores octubre: <input type="number" name="txttrabajadoresoctubre" /> <br/>
	Administrador: <input type="text" name="txtadministrador" /> <br/>
	
	<input type="submit" value="Agregar cliente" />
</form>

<a href="${pageContext.request.contextPath}/ListaClienteController">Volver al listado de empresas</a>

</body>
</html>

