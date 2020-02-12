<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:import url="comum/cabecalho.jsp" />
<%@ page import="java.util.List, br.com.veloweb.flyweb.modelo.Aviao"%>


<div class="container">
	<table class="table">
		<thead>
			<tr>
				<th scope="col">Nome</th>
				<th scope="col">Modelo</th>
				<th scope="col">Tipo</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${listaDeAvioes}" var="aviao">
				<tr>
					<th scope="row">${aviao.nome}</th>
					<td>${aviao.modelo}</td>
					<td>
						<c:choose>
						<c:when test="${aviao.tipo == 'true'}">
							Internacional
						</c:when>
						
						<c:otherwise>
							Doméstico
						</c:otherwise>
						
						</c:choose>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>

</body>
</html>