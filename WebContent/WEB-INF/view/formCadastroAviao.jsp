<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:import url="comum/cabecalho.jsp" />
<div class="container">
<h3 class="text-center" style="margin-top: 2%;">Cadastrar Avião</h3>
</br>
<form method="POST" action="index?acao=AviaoCadastra">
	<div class="form-row">
		<div class="form-group col-md-6">
			<label for="nome">Nome</label> <input type="text"
				class="form-control" id="nome" >
		</div>
	</div>
	
	<div class="form-row">
		<div class="form-group col-md-6">
			<label for="modelo">Modelo</label> <input type="text"
				class="form-control" id="modelo">
		</div>
	</div>
	<div class="form-row">
		<div class="form-group col-md-3">
			<label for="tipo">Tipo</label> <select id="tipo"
				class="form-control">
				<option value="0">Doméstico</option>
				<option value="1">Internacional</option>
			</select>
		</div>
	</div>
	<button type="submit" class="btn btn-primary">Cadastrar</button>
</form>
</div>
</body>
</html>