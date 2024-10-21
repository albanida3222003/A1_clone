<%@page import="com.unu.proyectoweb.beans.Autor"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<table id="tabla">
		<thead>
			<tr>
				<th>Codigo del autor</th>
				<th>Nombre del autor</th>
				<th>Nacionalidad</th>
				<th>Operaciones</th>
			</tr>
		</thead>
		<tdbody> 
		<%
			 List<Autor> aux = (List<Autor>) request.getAttribute("listaAutores");

 			// Verificar si la lista no es nula
 			if (aux != null) {
 			// Iterar sobre la lista de autores
 				for (Autor autor : aux) {
 		%>
					<tr>
						<td><%=autor.getIdAtor()%></td>
						<td><%=autor.getNombre()%></td>
						<td><%=autor.getNacionalidad()%></td>
						<td></td>
					</tr>
		<%
				}
			} else {
		%>

				<tr>
					<td>No hay datos</td>
					<td>No hay datos</td>
					<td>No hay datos</td>
					<td></td>
				</tr>

		<%
			}
		%> 
		</tdbody>
	</table>

</body>
</html>