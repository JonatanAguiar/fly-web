package br.com.veloweb.flyweb.acao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.veloweb.flyweb.modelo.Banco;

public class AviaoLista implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Banco banco = new Banco();
		List<Voo> lista = banco.getAvioes();

		request.setAttribute("listaDeAvioes", lista);

		return "fw:listaAviao.jsp";
	}

}
