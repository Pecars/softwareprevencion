<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Editar Empresa</title>
</head>
<body>

<h1>Información empresa</h1>

<c:if test="${cumensaje != null}">
	<c:out value="${cumensaje}" />
</c:if>

<form action="EditaClienteController" method="post">
	Id Empresa: <input type="number" name="txtidempresa" value ="${cliente.idClientes}"/><br/>
	Nombre : <input type="text" name="txtnombreempresa" value ="${cliente.nombreEmpresa}"/> <br/>
	Representante: <input type="text" name="txtrepresentante" value ="${cliente.representanteEmpresa}"/> <br/>
	Rut: <input type="number" name="txtrutempresa" value ="${cliente.rutEmpresa}"/> <br/>
	Dirección : <input type="text" name="txtdireccionempresa" value ="${cliente.direccionEmpresa}"/> <br/>
	Teléfono: <input type="number" name="txttelefonoempresa" value ="${cliente.telefonoEmpresa}"/> <br/>
	Correo: <input type="text" name="txtcorreoempresa" value ="${cliente.correoEmpresa}"/> <br/>
	Giro: <input type="text" name="txtgiroempresa" value ="${cliente.giroEmpresa}"/> <br/>
	Fecha ingreso: <input type="date" name="txtfechaingresoempresa" value ="${cliente.fechaIngresoE}"/> <br/>
	Número de trabajadores enero: <input type="number" name="txttrabajadoresenero" value ="${cliente.trabajadoresEnero}"/> <br/>
	Número de trabajadores abril: <input type="number" name="txttrabajadoresabril" value ="${cliente.trabajadoresAbril}"/> <br/>
	Número de trabajadores julio: <input type="number" name="txttrabajadoresjulio" value ="${cliente.trabajadoresJulio}"/> <br/>
	Número de trabajadores octubre: <input type="number" name="txttrabajadoresoctubre" value ="${cliente.trabajadoresOctubre}"/> <br/>
	Administrador: <input type="text" name="txtadministrador" value ="${cliente.rutAdministrador}"/> <br/>
	
	<input type="hidden" name="hdnidcliente" value ="Agregar Cliente"/> <br/>
	<input type="submit" value="Agregar cliente" />
</form>

<a href="${pageContext.request.contextPath}/ListaClienteController">Volver al listado de empresas</a>

</body>
</html>

