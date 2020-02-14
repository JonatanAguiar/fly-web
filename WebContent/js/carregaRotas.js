var xmlhttp = new XMLHttpRequest();
var url = "http://localhost:8080/FlyWeb/rotas";

xmlhttp.open("GET", url);

xmlhttp.addEventListener("load", function(){
	var resposta = xmlhttp.responseText;
	var rotas = JSON.parse(resposta);
	rotas.forEach( function(rota){
		adicionaRotaNoSelect(rota);
	});
});

xmlhttp.send();



