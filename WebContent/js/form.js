populaDadosJSON("rotas", "cidadeOrigem");
var rotas = pegaDadosJSON("rotas");
var cidades = pegaDadosJSON("cidades");
var avioes = pegaDadosJSON("aviao");

var paramRota;

function listaPossiveisDestinos(){
	var destino = document.querySelector("#cidadeDestino");

	if(destino.length > 0){
		$("#cidadeDestino").empty();
	}
	
	var origemValue = document.querySelector("#cidadeOrigem").value;
	
	destino.options.add(selecionaAutomatico());
	
	rotas.forEach( function(rota){
		if(rota.cidadeOrigem.id == origemValue){
			destino.options.add(criaOption2(rota.cidadeDestino));
			paramRota = rota;
		}
	});
	
	defineRota(0);
	populaEscalas();

//	verificaSeSaoPaisesDiferentes(paramRota.cidadeOrigem.pais.id, paramRota.cidadeDestino.pais.id);
}


function onChangeDestino(){
	var destino = document.querySelector("#cidadeDestino");
	var origem = document.querySelector("#cidadeOrigem");
	
	rotas.forEach( function(rota){
		if(rota.cidadeOrigem.id == origem.value && rota.cidadeDestino.id == destino.value){
			console.log()
			paramRota = rota.id;
		}
	});
	populaAvioes();
	defineRota(paramRota);
}

function defineRota(rota){
	var rotaID = document.querySelector("#idDaRota");
	rotaID.value = rota;
}

function selecionaAutomatico(){
	var r = document.createElement("option");
	r.text = "Selecione...";
	r.value = 0;
	return r;
}

function populaEscalas(){
	var e1 = document.querySelector("#escala1");
	var e2 = document.querySelector("#escala2");
	var e3 = document.querySelector("#escala3");
	var escalas = [e1, e2, e3];
	
	escalas.forEach(function(e){
		$(e).empty();
		e.options.add(selecionaAutomatico());
	});
	
	cidades.forEach(function(cidade){
		escalas.forEach(function(escala){
			escala.options.add(criaOption(cidade));
		});
	});
}

function populaAvioes(){
	var select = document.querySelector("#aviao");
	
	var paisOrigem = $("#cidadeOrigem").find(':selected').attr('idpais');
    var paisDestino = $("#cidadeDestino").find(':selected').attr('idpais');
	
	if(paisOrigem != paisDestino){
		var tipo = true;
		habilitaEscalas();
	}else{
		var tipo = false;
		desabilitaEscalas();
	}
	
	$(select).empty();
	
	avioes.forEach(function (a){
		if(a.tipo == tipo)
			select.options.add(criaOption(a));
	});
}


function habilitaEscalas(){
	for(var i = 1; i < 4; i++){
		liberaEscala(i);
	}
}

function liberaEscala(i){
	var escala = document.querySelector("#escala"+i);
	escala.disabled = false;
	
	if(escala.length > 0){
		$(escala).empty();
	}

	escala.options.add(selecionaAutomatico());
	
	
	cidades.forEach( function(cidade){
		escala.options.add(criaOption(cidade));
	});
}

function desabilitaEscalas(){
	document.querySelector("#escala1").disabled = true;
	document.querySelector("#escala2").disabled = true;
	document.querySelector("#escala3").disabled = true;
}



