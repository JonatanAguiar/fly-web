package br.com.veloweb.flyweb.acao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.veloweb.flyweb.modelo.Banco;

public class VooCadastraForm implements Acao{

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) {
		Banco banco = new Banco();
		return "fw:formCadastroVoo.jsp";
	}

}
