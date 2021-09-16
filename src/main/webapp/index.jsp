<%@page import="controlador.Conexion"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
Conexion co=new Conexion();
co.conexionbd();
%>
<form action="Servletgestionlineas" method="POST">
<input type="text" name="codlin" placeholder="codigo de la linea">
<input type="text" name="nomlin" placeholder="nombre linea">
<input type="submit" name="btnins">


</form>


</body>
</html>