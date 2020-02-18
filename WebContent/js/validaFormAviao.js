$('#aviaoCadastra').submit(function(e) {
	if($("#nome").val() == '' || $('#modelo').val()==''){
		e.preventDefault();
		alert("Todos os campos devem ser preenchidos");
	}
});

