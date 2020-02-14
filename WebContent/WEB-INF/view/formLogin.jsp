<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:import url="comum/cabecalho.jsp" />
<c:url value="/index" var="link" />
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<form method="POST" action="${link}">

			Login: <input type="text" name="login" />
			Senha: <input type="password" name="senha" />
			<input type="hidden" name="acao" value="Login" />
			<input type="submit" />

		</form>
	</div>

</body>
</html>