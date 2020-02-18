function populaDadosJSON(nome, nomeDoSelect){
	var select = document.querySelector("#"+nomeDoSelect);
	
	var xmlhttp = new XMLHttpRequest();

	var url = "http://localhost:8080/FlyWeb/" + nome;
	xmlhttp.open("GET", url);

	xmlhttp.addEventListener("load", function() {
		var resposta = xmlhttp.responseText;
		var lista = JSON.parse(resposta);
		lista.forEach(function(x) {
			select.options.add(criaOption(x.cidadeOrigem));
		});
	});

	xmlhttp.send();
}

function criaOption(cidade){
	var r = document.createElement("option");
	r.text = cidade.nome;
	r.value = cidade.id;
	return r;
}

function pegaDadosJSON(nome){
	var xmlhttp = new XMLHttpRequest();

	var url = "http://localhost:8080/FlyWeb/" + nome;
	xmlhttp.open("GET", url);
	var array = [];

	xmlhttp.addEventListener("load", function() {
		var resposta = xmlhttp.responseText;
		var lista = JSON.parse(resposta);
		lista.forEach(function(x) {
			array.push(x);
		});
	});

	xmlhttp.send();
	return array;
}