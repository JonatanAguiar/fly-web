package br.com.veloweb.flyweb.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.google.gson.Gson;

import br.com.veloweb.flyweb.modelo.Banco;
import br.com.veloweb.flyweb.modelo.Voo;

/**
 * Servlet implementation class Teste
 */
@WebServlet("/teste")
public class Teste extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Path("voo")
	@GET
	@Produces("application/json")
	public String listaDeVoo() {

		Banco banco = new Banco();
		List<Voo> lista = banco.getVoos();

		Gson json = new Gson();
		String ListaNova = json.toJson(lista);

		return ListaNova;

	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
