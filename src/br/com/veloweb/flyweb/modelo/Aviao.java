package br.com.veloweb.flyweb.modelo;

public class Aviao {

	private Integer id;
	private String nome;
	private String modelo;
	private boolean internacional;
	
	public Integer getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public String getModelo() {
		return modelo;
	}
	public boolean isInternacional() {
		return internacional;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public void setInternacional(boolean internacional) {
		this.internacional = internacional;
	}
	
	
	
}
