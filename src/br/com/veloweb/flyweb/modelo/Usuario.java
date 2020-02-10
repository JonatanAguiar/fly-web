package br.com.veloweb.flyweb.modelo;

public class Usuario {

	private String login;
	private String senha;
	
	public String getUsuario() {
		return login;
	}
	public void setUsuario(String usuario) {
		this.login = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public boolean ehIgual(String login, String senha) {
		if(!this.login.equals(login)) {
			return false;
		}
		if(!this.senha.equals(senha)) {
			return false;
		}
		return true;
	}
	
	
}
