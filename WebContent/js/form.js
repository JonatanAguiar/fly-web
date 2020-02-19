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
	
	rotas.forEach( function(rota){
		if(rota.cidadeOrigem.id == origemValue){
			destino.options.add(criaOption2(rota.cidadeDestino));
			paramRota = rota;
		}
	});
	
	populaEscalas();
	populaAvioes();
	defineRota(paramRota);
//	verificaSeSaoPaisesDiferentes(paramRota.cidadeOrigem.pais.id, paramRota.cidadeDestino.pais.id);
}

function onChangeDestino(){
	var destino = document.querySelector("#cidadeDestino");
	var origem = document.querySelector("#cidadeOrigem");
	
	rotas.forEach( function(rota){
		if(rota.cidadeOrigem.id == origem.value && rota.cidadeDestino.id == destino.value){
			paramRota = rota.id;
		}
	});
	
	defineRota(paramRota);
}

function defineRota(rota){
	var rotaID = document.querySelector("#idDaRota");
	rotaID.value = rota.id;
}

function populaEscalas(){
	var e1 = document.querySelector("#escala1");
	var e2 = document.querySelector("#escala2");
	var e3 = document.querySelector("#escala3");
	var escalas = [e1, e2, e3];
	
	escalas.forEach(function(e){
		$(e).empty();
	});
	
	cidades.forEach(function(cidade){
		escalas.forEach(function(escala){
			escala.options.add(criaOption(cidade));
		});
	});
}

function populaAvioes(){
	var select = document.querySelector("#aviao");
	
	
	var paisOrigem = document.getElementById("cidadeOrigem").getAttribute("idpais");
	var paisDestino = document.getElementById("cidadeDestino").getAttribute("idpais");
	
	if(paisOrigem != paisDestino){
		var tipo = true;
	}else{
		var tipo = false;
		desabilitaEscalas();
	}
	$(select).empty();
	avioes.forEach(function (a){
		console.log(a);
		if(a.tipo == tipo)
			select.options.add(criaOption(a));
	});
}


function verificaSeSaoPaisesDiferentes(pais1, pais2){
	if(pais1 != pais2){
		liberaEscala("1");
	} else {
		desabilitaEscalas();
	}
}

function liberaEscala(i){
	var escala = document.querySelector("#escala"+i);
	escala.disabled = false;
	
	var cidades = pegaDadosJSON("cidades");
	
	if(escala.length > 0){
		$(escala).empty();
	}
	
	cidades.forEach( function(cidade){
//		console.log(cidade);
		escala.options.add(criaOption(cidade));
	});
}

function desabilitaEscalas(){
	document.querySelector("#escala1").disabled = true;
	document.querySelector("#escala2").disabled = true;
	document.querySelector("#escala3").disabled = true;
}



