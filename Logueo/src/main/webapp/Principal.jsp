<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Principal</title>
</head>

<%
HttpSession seccionp = (HttpSession) request.getSession();
String usuarioseccion = (String) seccionp.getAttribute("usuario");
if(usuarioseccion==null){
	response.sendRedirect("index.jsp");
}
%>

<body>

<form action="ServeletUser" method = "post">

<input type="submit" value ="CERRAR" name="btnCerrar">

</form>

<h1>Entraste hola que haces</h1>



</body>
</html>