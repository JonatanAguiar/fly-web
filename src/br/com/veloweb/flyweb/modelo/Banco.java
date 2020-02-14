package br.com.veloweb.flyweb.modelo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Banco {

	private static List<Usuario> listaDeUsuarios = new ArrayList<>();
	private static List<Voo> listaDeVoos = new ArrayList<>();
	private static List<Aviao> listaDeAvioes = new ArrayList<>();
	private static Integer contadorDeAvioes = 1;
	private static List<Rota> listaDeRotas = new ArrayList<>();

	static {
		// Cria país

		Pais pais1 = new Pais();
		pais1.setId(1);
		pais1.setNome("França");

		Pais pais2 = new Pais();
		pais2.setId(2);
		pais2.setNome("Brasil");

		Pais pais3 = new Pais();
		pais3.setId(3);
		pais3.setNome("China");
		// Cria cidade

		Cidade cidade1 = new Cidade();
		cidade1.setId(1);
		cidade1.setNome("Marselha");
		cidade1.setPais(pais1);

		Cidade cidade2 = new Cidade();
		cidade2.setId(2);
		cidade2.setNome("Honk kong");
		cidade2.setPais(pais3);

		Cidade cidade3 = new Cidade();
		cidade3.setId(3);
		cidade3.setNome("Santa Cruz");
		cidade3.setPais(pais2);

		Cidade cidade4 = new Cidade();
		cidade4.setId(4);
		cidade4.setNome("Sao Paulo");
		cidade4.setPais(pais2);

		// Cria Rota

		Rota rota1 = new Rota();
		rota1.setCidadeDestino(cidade4);
		rota1.setCidadeOrigem(cidade1);

		Rota rota2 = new Rota();
		rota2.setCidadeDestino(cidade3);
		rota2.setCidadeOrigem(cidade2);

		// Cria aviões

		Aviao aviao1 = new Aviao();
		Aviao aviao2 = new Aviao();

		aviao1.setId(1);
		aviao1.setTipo(true);
		aviao1.setModelo("747");
		aviao1.setNome("Sergio");

		aviao2.setId(2);
		aviao2.setTipo(false);
		aviao2.setModelo("12");
		aviao2.setNome("Alejandro");

		listaDeAvioes.add(aviao1);
		listaDeAvioes.add(aviao2);

		// Cria voo

		Voo voo1 = new Voo();
		Voo voo2 = new Voo();
		
		voo1.setDataEHora(LocalDateTime.now());
		voo1.setAviao(aviao1);
		voo1.setRota(rota1);
		voo1.setId(1);

		listaDeVoos.add(voo1);

		Usuario user1 = new Usuario();
		Usuario user2 = new Usuario();

		user1.setUsuario("Lucas");
		user1.setSenha("123456");

		user2.setUsuario("Lari");
		user2.setSenha("654321");

		listaDeUsuarios.add(user1);
		listaDeUsuarios.add(user2);

		listaDeRotas.add(rota1);
		listaDeRotas.add(rota2);

	}

	public Usuario usuarioExiste(String login, String senha) {
		for (Usuario u : listaDeUsuarios) {
			if (u.ehIgual(login, senha)) {
				return u;
			}
		}
		return null;
	}

	public List<Voo> getVoos() {
		return listaDeVoos;
	}

	public List<Aviao> getAvioes() {
		return listaDeAvioes;
	}


	public void adicionaAviao(Aviao aviao) {
		aviao.setId(contadorDeAvioes++);
		listaDeAvioes.add(aviao);
	}
		
	public List<Rota> getRotas() {
		return listaDeRotas;
	}
}
