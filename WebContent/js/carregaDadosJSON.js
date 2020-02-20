function populaDadosJSON(nome, nomeDoSelect){
	var select = document.querySelector("#"+nomeDoSelect);
	
	var xmlhttp = new XMLHttpRequest();

	var url = "http://localhost:8080/FlyWeb/" + nome;
	xmlhttp.open("GET", url);

	xmlhttp.addEventListener("load", function() {
		var resposta = xmlhttp.responseText;
		var lista = JSON.parse(resposta);
		lista.forEach(function(x) {
			select.options.add(criaOption2(x.cidadeOrigem,nomeDoSelect,x.id));
		});
	});

	xmlhttp.send();
}

function criaOption(x){
	var r = document.createElement("option");
	r.text = x.nome;
	r.value = x.id;
	return r;
}

function criaOption2(x, tipo, id){
	var r = document.createElement("option");
	r.text = x.nome;
	r.value = x.id;
	r.setAttribute("idpais", x.pais.id);

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