package br.com.veloweb.flyweb.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Aviao {
	
	@Id
	@GeneratedValue
	private Integer id;
	private String nome;
	private String modelo;
	private boolean tipo;
	
	public Integer getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public String getModelo() {
		return modelo;
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
	public boolean isTipo() {
		return tipo;
	}
	public void setTipo(boolean tipo) {
		this.tipo = tipo;
	}
}
