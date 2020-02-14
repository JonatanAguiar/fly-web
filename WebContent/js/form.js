var inputRota = document.querySelector("#rota");

console.log(inputRota);

function adicionaRotaNoSelect(rota){
	var r = document.createElement("option");
	inputRota.options.add(r);
}