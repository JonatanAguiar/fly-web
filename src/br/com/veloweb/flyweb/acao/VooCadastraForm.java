package br.com.veloweb.flyweb.acao;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.veloweb.flyweb.modelo.Banco;
import br.com.veloweb.flyweb.modelo.Rota;

public class VooCadastraForm implements Acao{

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) {
		Banco banco = new Banco();
		List<Rota> listaDeRotas = banco.getRotas();
		request.setAttribute("listaDeRotas",listaDeRotas);
		return "fw:formCadastroVoo.jsp";
	}

}
