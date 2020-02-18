package br.com.veloweb.flyweb.modelo;

import java.util.ArrayList;
import java.util.List;

import br.com.veloweb.flyweb.modelo.dao.AviaoDAO;
import br.com.veloweb.flyweb.modelo.dao.CidadeDAO;
import br.com.veloweb.flyweb.modelo.dao.PaisDAO;
import br.com.veloweb.flyweb.modelo.dao.RotaDAO;
import br.com.veloweb.flyweb.modelo.dao.VooDAO;

public class Banco {

	VooDAO vooDAO = new VooDAO();
	AviaoDAO aviaoDAO = new AviaoDAO();
	RotaDAO rotaDAO = new RotaDAO();
	CidadeDAO cidadeDAO = new CidadeDAO();
	PaisDAO paisDAO = new PaisDAO();
	
	private static List<Usuario> listaDeUsuarios = new ArrayList<>();

	public Usuario usuarioExiste(String login, String senha) {
		for (Usuario u : listaDeUsuarios) {
			if (u.ehIgual(login, senha)) {
				return u;
			}
		}
		return null;
	}
	
	//Voos
	public void adicionaVoo(Voo voo) {
		vooDAO.save(voo);
	}
	
	public Voo getVooId(Integer id) {
		return vooDAO.findById(id);
	}
	
	public List<Voo> getVoos() {
		return vooDAO.findAll();
	}	
	
	public void removeVoo(Integer id) {
		vooDAO.remove(id);
	}
	
	//Aviões
	public void adicionaAviao(Aviao aviao) {
		aviaoDAO.save(aviao);
	}
	
	public Aviao getAviaoId(Integer id) {
		return aviaoDAO.findById(id);
	}
	
	public List<Aviao> getAvioes() {
		return aviaoDAO.findAll();
	}
	
	public void removeAviao(Integer id) {
		aviaoDAO.remove(id);
	}
	
	//Rotas
	public void adicionaRota(Rota rota) {
		rotaDAO.save(rota);
	}
	
	public Rota getRotaId(Integer id) {
		return rotaDAO.findById(id);
	}
	
	public List<Rota> getRotas() {
		return rotaDAO.findAll();
	}
	
	public void removeRota(Integer id) {
		rotaDAO.remove(id);
	}
	
	//Cidades
	public void adicionaCidade(Cidade cidade) {
		cidadeDAO.save(cidade);
	}
	
	public Cidade getCidadeId(Integer id) {
		return cidadeDAO.findById(id);
	}
	
	public List<Cidade> getCidades() {
		return cidadeDAO.findAll();
	}
	
	public void removeCidade(Integer id) {
		cidadeDAO.remove(id);
	}
	
	//Paises
	public void adicionaPais(Pais pais) {
		paisDAO.save(pais);
	}
	
	public Pais getPaisId(Integer id) {
		return paisDAO.findById(id);
	}
	
	public List<Pais> getPaises() {
		return paisDAO.findAll();
	}
	
	public void removePais(Integer id) {
		paisDAO.remove(id);
	}
}
