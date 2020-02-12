package br.com.veloweb.flyweb.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Rota {
	
	@Id
	@GeneratedValue
	private Integer id;
	@ManyToOne
	private Cidade cidadeOrigem;
	@ManyToOne
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
