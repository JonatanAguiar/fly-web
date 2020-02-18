package br.com.veloweb.flyweb.service;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import br.com.veloweb.flyweb.modelo.Aviao;
import br.com.veloweb.flyweb.modelo.Banco;

/**
 * Servlet implementation class ListaVooService
 */
@WebServlet("/aviao")
public class ListaAviaoService extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Aviao> aviao = new Banco().getAvioes();
		Gson gson = new Gson();
		String json = gson.toJson(aviao);
		
		response.setContentType("application/json");
		response.getWriter().print(json);
	}


}
