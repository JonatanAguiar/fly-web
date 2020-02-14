var xmlhttp = new XMLHttpRequest();

var url = "http://localhost:8080/FlyWeb/cidades";

xmlhttp.open("GET", url);

xmlhttp.addEventListener("load", function() {
	var resposta = xmlhttp.responseText;
	var lista = JSON.parse(resposta);
	lista.forEach(function(x) {
		adicionaCidadeNoSelectOrigem(x)
	});
});

xmlhttp.send();


function pegaDadosJSON(nome){
	var xmlhttp = new XMLHttpRequest();

	var url = "http://localhost:8080/FlyWeb/" + nome;
	var array = [];
	xmlhttp.open("GET", url);

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