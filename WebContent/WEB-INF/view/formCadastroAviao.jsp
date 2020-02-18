<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:import url="comum/cabecalho.jsp" />
<div class="container">
<h3 class="text-center" style="margin-top: 2%;">Cadastrar Avião</h3>
<form method="POST" action="index?acao=AviaoCadastra" name="aviaoCadastra" id="aviaoCadastra">
	<div class="form-row">
		<div class="form-group col-md-6">
			<label for="nome">Nome</label> <input type="text"
				class="form-control" name="nome" id="nome" >
		</div>
	</div>
	
	<div class="form-row">
		<div class="form-group col-md-6">
			<label for="modelo">Modelo</label> <input type="text"
				class="form-control" name="modelo" id="modelo">
		</div>
	</div>
	<div class="form-row">
		<div class="form-group col-md-3">
			<label for="tipo">Tipo</label> <select name="tipo" id="tipo"
				class="form-control">
				<option value="false">Doméstico</option>
				<option value="true">Internacional</option>
			</select>
		</div>
	</div>
	<button type="submit" class="btn btn-primary">Cadastrar</button>
</form>
</div>
<script type="text/javascript" src='<c:url value="js/validaFormAviao.js"></c:url>'></script>
</body>
</html>