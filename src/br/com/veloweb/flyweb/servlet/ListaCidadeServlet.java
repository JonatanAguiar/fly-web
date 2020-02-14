package br.com.veloweb.flyweb.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import br.com.veloweb.flyweb.modelo.Banco;
import br.com.veloweb.flyweb.modelo.Rota;

/**
 * Servlet implementation class ListaServlet
 */
@WebServlet("/cidades")
public class ListaCidadeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Rota> rota = new Banco().getRotas();
		Gson gson = new Gson();
		String json = gson.toJson(rota);
		
		response.setContentType("application/json");
		response.getWriter().print(json);
	}

}
