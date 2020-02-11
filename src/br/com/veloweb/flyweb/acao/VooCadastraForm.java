package br.com.veloweb.flyweb.acao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class VooCadastraForm implements Acao{

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) {
		return "fw:formCadastroVoo.jsp";
	}

}
