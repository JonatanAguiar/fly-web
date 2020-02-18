populaDadosJSON("rotas", "cidadeOrigem");
populaEscalas();

var array = pegaDadosJSON("rotas");
var paramRota;

function listaPossiveisDestinos(){
	var destino = document.querySelector("#cidadeDestino");

	if(destino.length > 0){
		$("#cidadeDestino").empty();
	}
	
	var origemValue = document.querySelector("#cidadeOrigem").value;
	
	array.forEach( function(rota){
		if(rota.cidadeOrigem.id == origemValue){
			destino.options.add(criaOption(rota.cidadeDestino));
			paramRota = rota;
		}
	});
	
//	verificaSeSaoPaisesDiferentes(paramRota.cidadeOrigem.pais.id, paramRota.cidadeDestino.pais.id);
}

function populaEscalas(){
	var escalas = document.querySelector(".escala");
	console.log(escalas);
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



