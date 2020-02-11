package br.com.veloweb.flyweb.modelo;

public class Cidade {

	private Integer id;
	private String nome;
	private Pais pais;
	
	public Integer getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public Pais getPais() {
		return pais;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	
}
