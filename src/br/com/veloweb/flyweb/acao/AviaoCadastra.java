package br.com.veloweb.flyweb.acao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.veloweb.flyweb.modelo.Aviao;
import br.com.veloweb.flyweb.modelo.Banco;

public class AviaoCadastra implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) {
		
		Aviao aviao = new Aviao();
		aviao.setModelo(request.getParameter("modelo"));
		aviao.setNome(request.getParameter("nome"));
		aviao.setTipo(Boolean.parseBoolean(request.getParameter("tipo")));
		

		Banco banco = new Banco();
		banco.adicionaAviao(aviao);
		
		return "redirect:AviaoLista";
	}

}
