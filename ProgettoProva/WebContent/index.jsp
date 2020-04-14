<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Progetto Prova</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
</head>
<body>

	<br>
	<div class="container container-fluid">
		
		<h1>Calcola il fattoriale!</h1>

		<form action="${pageContext.servletContext.contextPath}/ProgettoServlet" method="get" >

			<label for="contenuto">Inserisci un numero intero non negativo</label> 
			<input type="number" name="numero" min="0" max="20">
			<button  class="btn btn-primary" onclick="fact()" >Calcola con il doGet</button>

		</form>
		
		<br>
		
		<form action="${pageContext.servletContext.contextPath}/ProgettoServlet" method="post" >

			<label for="contenuto">Inserisci un numero intero non negativo</label> 
			<input type="number" name="numero" min="0" max="20">
			<button  class="btn btn-primary" onclick="fact()" >Calcola con il doPost</button>

		</form>
		
		<br>
		
		<c:if test="${not empty ERRORE}">
			<div class="alert alert-danger">
				${ERRORE}
			</div>
		</c:if>

		<c:if test="${not empty RISULTATO}">
			<div class="container container-fluid">
				<div class="alert alert-success">Il risultato è ${RISULTATO}</div>
			</div>
		</c:if>
		
	</div>
</body>
</html>