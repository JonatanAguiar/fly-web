package br.com.veloweb.flyweb.modelo;

import java.util.ArrayList;
import java.util.List;


public class Banco {

	private static List<Usuario> listaDeUsuarios = new ArrayList<>();
	
	static {
		Usuario user1 = new Usuario();
		Usuario user2 = new Usuario();
		
		user1.setUsuario("Lucas");
		user1.setSenha("123456");
		
		user2.setUsuario("Lari");
		user2.setSenha("654321");
		
		listaDeUsuarios.add(user1);
		listaDeUsuarios.add(user2);
	}

	public Usuario usuarioExiste(String login, String senha) {
		for(Usuario u : listaDeUsuarios) {
			if(u.ehIgual(login, senha)) {
				return u;
			}
		}
		return null;
	}
	
}
