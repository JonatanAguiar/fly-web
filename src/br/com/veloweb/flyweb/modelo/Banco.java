package br.com.veloweb.flyweb.modelo;

import java.util.ArrayList;
import java.util.List;


public class Banco {

	private static List<Usuario> listaDeUsuarios = new ArrayList<>();
	private static List<Voo> listaDeVoos = new ArrayList<>();
	
	static {
		//Cria aviões
		
		Aviao aviao1 = new Aviao();
		Aviao aviao2 = new Aviao();
		
		aviao1.setId(1);
		aviao1.setInternacional(true);
		aviao1.setModelo("747");
		aviao1.setNome("Sergio");
		
		aviao2.setId(2);
		aviao2.setInternacional(false);
		aviao2.setModelo("12");
		aviao2.setNome("Alejandro");
		
		Voo voo1 = new Voo();
		Voo voo2 = new Voo();
		
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
