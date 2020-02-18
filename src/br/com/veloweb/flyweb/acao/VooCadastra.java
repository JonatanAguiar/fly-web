package br.com.veloweb.flyweb.acao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.veloweb.flyweb.modelo.Banco;
import br.com.veloweb.flyweb.modelo.Voo;

public class VooCadastra implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) {
		
		Banco banco = new Banco();
		
		Voo voo = new Voo();
		voo.setAviao(banco.getAviaoId(Integer.parseInt(request.getParameter("aviao"))));
		
		
//		voo.setRota(rota);
		
		
		return "redirect:VooLista";
	}

}
