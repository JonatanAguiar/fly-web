package br.com.veloweb.flyweb.acao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.veloweb.flyweb.modelo.Banco;
import br.com.veloweb.flyweb.modelo.Usuario;


public class Login implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) {
		
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		
		Banco banco = new Banco();
		Usuario user = banco.usuarioExiste(login, senha);

		if(user != null) {
			HttpSession session = request.getSession();
			session.setAttribute("usuarioLogado", user);
			return "rd:VoosLista";
		} else {
			return "rd:LoginForm";
		}
	}

}
