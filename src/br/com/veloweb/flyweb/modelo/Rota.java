package br.com.veloweb.flyweb.modelo;

public class Rota {

	private Integer id;
	private Cidade cidadeOrigem;
	private Cidade cidadeDestino;
	
	public Integer getId() {
		return id;
	}
	public Cidade getCidadeOrigem() {
		return cidadeOrigem;
	}
	public Cidade getCidadeDestino() {
		return cidadeDestino;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setCidadeOrigem(Cidade cidadeOrigem) {
		this.cidadeOrigem = cidadeOrigem;
	}
	public void setCidadeDestino(Cidade cidadeDestino) {
		this.cidadeDestino = cidadeDestino;
	}
	
}
