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
			destino.options.add(criaOption(rota.cidadeDestino));
			paramRota = rota;
		}
	});
	
	populaEscalas();
	populaAvioes();
//	verificaSeSaoPaisesDiferentes(paramRota.cidadeOrigem.pais.id, paramRota.cidadeDestino.pais.id);
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
	
	$(select).empty();
	
	console.log(avioes);
	
	avioes.forEach(function (a){
		console.log(a);
		
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
		console.log(cidade);
		escala.options.add(criaOption(cidade));
	});
}

function desabilitaEscalas(){
	document.querySelector("#escala1").disabled = true;
	document.querySelector("#escala2").disabled = true;
	document.querySelector("#escala3").disabled = true;
}



