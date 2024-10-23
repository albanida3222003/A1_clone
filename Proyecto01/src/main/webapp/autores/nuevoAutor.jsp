<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String url = "http://localhost:8080/ProtectoWebGB/";
	%>
	<h3>Nuevo Autor</h3>
	<form role="form" action="<%=url%>AutoresContoler" method="POST">
		Nombre del Autor: <input type = "hidden" name="op" value="insertar"/><br>
		Nacionalidad: <input type = "text" name="nacionalidad" id="nacionalidad"/><br>
		<input type="submit" valor="Guardar" name="Guardar"/>
		<a href="<%=url%>AutoresContoler?op=listar">Volver</a>
	</form>
</body>
</html>