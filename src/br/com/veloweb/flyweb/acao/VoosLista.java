package br.com.veloweb.flyweb.acao;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.veloweb.flyweb.modelo.Banco;
import br.com.veloweb.flyweb.modelo.Voo;


public class VoosLista implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Banco banco = new Banco();
		List<Voo> lista = banco.getVoos();
		
		request.setAttribute("listaDeVoos", lista);
		
		return "fw:listaVoo.jsp";
	}

}
