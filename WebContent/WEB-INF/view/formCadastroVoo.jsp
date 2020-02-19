<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:import url="comum/cabecalho.jsp" />
<%@ page import="java.util.List, br.com.veloweb.flyweb.modelo.Rota" %>


<div class="container">
	<h3 class="text-center" style="margin-top: 2%;">Cadastrar Voo</h3>
	<br>
	<form method="POST" action="index?acao=VooCadastra" id="vooCadastra">
		<div class="form-row">
			<div class="form-group col-md-4">
				<label for="rota">Cidade Origem</label> <select onchange="listaPossiveisDestinos()"
					id="cidadeOrigem" class="form-control">
					<option value="0" idpais="0" >Selecione uma origem </option>
				</select>
			</div>
			<div class="form-group col-md-4">
				<label for="rota">Cidade Destino</label> <select onchange="onChangeDestino()"
					id="cidadeDestino" class="form-control">
				</select>
			</div>
			<input type="hidden" id="idDaRota"/>
		</div>
		<div class="form-row">
			<div class="form-group col-md-4">
				<label for="escala1">Escala 1</label> <select
					id="escala1" class="form-control escala">
					<option value="0">Selecione...</option>
				</select>
			</div>
			<div class="form-group col-md-4">
				<label for="escala2">Escala 2</label> <select
					id="escala2" class="form-control escala">
					<option value="0">Selecione...</option>
				</select>
			</div>
			<div class="form-group col-md-4">
				<label for="escala3">Escala 3</label> <select
					id="escala3" class="form-control escala">
					<option value="0">Selecione...</option>
				</select>
			</div>
		</div>
		<div class="form-row">
			<div class="form-group col-md-8">
				<label for="tipo">Avião</label> <select id="aviao"
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

<script type="text/javascript" src='<c:url value="js/carregaDadosJSON.js"></c:url>'></script>
<script type="text/javascript" src='<c:url value="js/form.js"></c:url>'></script>
<script type="text/javascript" src='<c:url value="js/validaFormVoo.js"></c:url>'></script>

</body>
</html>