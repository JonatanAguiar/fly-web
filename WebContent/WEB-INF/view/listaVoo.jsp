<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:import url="comum/cabecalho.jsp" />

<div class="container">
	<table class="table">
		<thead>
			<tr>
				<th scope="col">Horário</th>
				<th scope="col">Origem</th>
				<th scope="col">Destino</th>
				<th scope="col">Escalas</th>
				<th scope="col">Avião</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${listaDeVoos}" var="voo">
				<tr>
					<th scope="row">${voo.dataEHora } </th>
					<th>${voo.rota.cidadeOrigem.nome}</th>
					<td>${voo.rota.cidadeDestino.nome}</td>
					<td>
					Lista de escalas
					</td>
					<td>${voo.aviao.nome} - ${voo.aviao.modelo}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
<c:import url="comum/rodape.jsp" />
</body>
</html>