package br.com.veloweb.flyweb.modelo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Voo {

	private Integer id;
	private Rota rota;
	private List<Cidade> escalas = new ArrayList<Cidade>();
	private Aviao aviao;
	private LocalDateTime dataEHora;
	
	public Integer getId() {
		return id;
	}
	public Rota getRota() {
		return rota;
	}
	public void setRota(Rota rota) {
		this.rota = rota;
	}
	public List<Cidade> getEscalas() {
		return escalas;
	}
	public void setEscalas(List<Cidade> escalas) {
		this.escalas = escalas;
	}
	public Aviao getAviao() {
		return aviao;
	}
	public void setAviao(Aviao aviao) {
		this.aviao = aviao;
	}
	public LocalDateTime getDataEHora() {
		return dataEHora;
	}
	public void setDataEHora(LocalDateTime dataEHora) {
		this.dataEHora = dataEHora;
	}
	
}
