var cidadeOrigem = document.querySelector("#cidadeOrigem");
var cidadeDestino = document.querySelector("#cidadeDestino");

function adicionaCidadeNoSelectOrigem(cidade){
	var r = document.createElement("option");
	r.text = cidade.nome;
	r.value = cidade.id;
	cidadeOrigem.options.add(r);
}


//bugado.. não está iterando
function listaPossiveisDestinos(){
	var array = pegaDadosJSON("cidades");
	
	console.log(array);

	array.forEach( function(cidade){
		if(cidadeOrigem.value != cidade.id){
			cidadeDestino.options.add(criaOption(r));
		}
	});
	
}

function criaOption(cidade){
	var r = document.createElement("option");
	r.text = cidade.nome;
	r.value = cidade.id;
	return r;
}