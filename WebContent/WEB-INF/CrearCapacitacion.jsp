<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<!-- @author Nice -->

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Agendar Capacitacion</title>
</head>
<body>
<form action="CapacitacionController" method="post">
	<table>
		<tr>
			<td>Capacitacion:</td>
			<td><select name="txtidcapacitacion">
			<c:forEach items="${listaCapacitacion}" var="userCapacitacion">
  				<option>${userCapacitacion.getId}%nbsp;${userCapacitacion.getNombre}</option>
  				 <Input type="hidden" name="txtidcapacitacion" value="${userCapacitacion.getId}" />
  			</c:forEach>
				</select></td>
		</tr>
		<tr>
			<td>Profesional:</td>
			<td><select name="txtidprofesional">
			<c:forEach items="${listaProfesional}" var="userProfesional">
  				<option>${userProfesional.getId}%nbsp;${userProfesional.getNombre}%nbsp;${userProfesional.getApellido}%nbsp;${userProfesional.getRut}</option>
  				<Input type="hidden" name="txtidprofesional" value="${userProfesional.getId}" />
  			</c:forEach>
  			</select></td>
		</tr>
		<tr>
			<td>Empresa:</td>
			<td><select>
			<c:forEach items="${listaEmpresa}" var="userEmpresa">
  				<option>${userEmpresa.getId}%nbsp;${userEmpresa.getNombre}</option>
  				 <Input type="hidden" name="txtidempresa" value="${userEmpresa.getId}" />
  			</c:forEach>
  			</select></td>
		</tr>
		<tr>
			<td>Fecha de agendamiento</td>
			<td><input type="text" name="txtnfechaagendada"/></td>
		</tr>
		<tr>
			<td>Tema a tratar:</td>
			<td><textarea name="txttemacapacitacion" rows="7" cols="50"></textarea></td>
		</tr>
	</table>
<input type="submit" value="Ingresar">
</form>
	

</body>
