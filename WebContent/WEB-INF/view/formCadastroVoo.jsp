<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:import url="comum/cabecalho.jsp" />

<!--  <script type="text/javascript" src="<c:url value="/js/jquery-ui.js"/>"></script>-->
<div class="container">
	<h3 class="text-center" style="margin-top: 2%;">Cadastrar Voo</h3>
	</br>
	<form method="POST" action="index?acao=AviaoCadastra">
		<div class="form-row">
			<div class="form-group col-md-6">
				<label for="cidadeOrigem">Cidade Origem</label> <select
					id="cidadeOrigem" class="form-control">
					<option value="0">Selecione...</option>
				</select>
			</div>
			<div class="form-group col-md-6">
				<label for="cidadeDestino">Cidade Destino</label> <select
					id="cidadeDestino" class="form-control">
					<option value="0">Selecione...</option>
				</select>
			</div>
		</div>


		<div class="form-row">
			<div class="form-group col-md-4">
				<label for="cidadeOrigem">Escala 1</label> <select
					id="cidadeOrigem" class="form-control">
					<option value="0">Selecione...</option>
				</select>
			</div>
			<div class="form-group col-md-4">
				<label for="cidadeDestino">Escala 2</label> <select
					id="cidadeDestino" class="form-control">
					<option value="0">Selecione...</option>
				</select>
			</div>
			<div class="form-group col-md-4">
				<label for="cidadeDestino">Escala 3</label> <select
					id="cidadeDestino" class="form-control">
					<option value="0">Selecione...</option>
				</select>
			</div>
		</div>
		<div class="form-row">
			<div class="form-group col-md-6">
				<label for="tipo">Avião</label> <select id="tipo"
					class="form-control">
					<option value="0">Selecione um avião</option>
				</select>
			</div>
		</div>
		<div class="form-row">
			<div class="form-group col-md-3">
				<label for="data">Data</label> 
				<input type="date" id="data" class="form-control"/>
			</div>
			<div class="form-group col-md-3">
				<label for="hora">Hora</label> 
				<input type="time" id="hora" class="form-control"/>
			</div>
		</div>
		<button type="submit" class="btn btn-primary">Cadastrar</button>
	</form>
</div>
</body>
</html>