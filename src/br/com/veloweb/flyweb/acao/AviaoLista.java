package br.com.veloweb.flyweb.acao;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.veloweb.flyweb.modelo.Aviao;
import br.com.veloweb.flyweb.modelo.Banco;

public class AviaoLista implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Banco banco = new Banco();
		List<Aviao> lista = banco.getAvioes();

		request.setAttribute("listaDeAvioes", lista);

		return "fw:listaAviao.jsp";
	}

}
