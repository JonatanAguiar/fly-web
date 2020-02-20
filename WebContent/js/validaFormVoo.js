$('#vooCadastra').submit(function(e) {
	if($("#cidadeOrigem").val() == 0 || $('#cidadeDestino').val()== 0 || $('#aviao').val() == 0
			|| $("#data").val() == '' || $("#hora").val() == ''){
		e.preventDefault();
		alert("Todos os campos devem ser preenchidos");
	}
});

