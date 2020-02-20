package br.com.veloweb.flyweb.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Cidade {
	
	@Id
	@GeneratedValue
	private Integer id;
	private String nome;
	@ManyToOne 
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
	@Override
	public String toString() {
		return this.getNome();
	}
	
}
