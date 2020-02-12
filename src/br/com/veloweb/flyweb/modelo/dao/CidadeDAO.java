package br.com.veloweb.flyweb.modelo.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.veloweb.flyweb.connection.ConnectionFactory;
import br.com.veloweb.flyweb.modelo.Cidade;

public class CidadeDAO {
	
	public Cidade save(Cidade cidade) {
		EntityManager em = new ConnectionFactory().getConnection();
		
		try {
			em.getTransaction().begin();
			if(cidade.getId() == null) {
				em.persist(cidade);
			}else {
				em.merge(cidade);
			}
			em.getTransaction().commit();
			
		}catch (Exception e) {
			System.err.println(e);
			em.getTransaction().rollback();
		}finally {
			em.close();
		}
		return cidade;
	}
	
	public Cidade findById (Integer id) {
		EntityManager em = new ConnectionFactory().getConnection();
		
		Cidade cidade = null;
		
		try {
			cidade = em.find(Cidade.class, id);
		}catch(Exception e) {
			System.err.println(e);
		}finally {
			em.close();
		}
		
		return cidade;
	}
	
	public List<Cidade> findAll(){
		EntityManager em = new ConnectionFactory().getConnection();
		List<Cidade> cidades = null;
		
		try {
			cidades = em.createQuery("from Cidades c").getResultList();
		} catch (Exception e) {
			System.err.println(e);
		}finally {
			em.close();
		}
		
		return cidades;
	}
	
	public Cidade remove(Integer id) {
		EntityManager em = new ConnectionFactory().getConnection();
		Cidade cidade = null;
		
		try {
			cidade = em.find(Cidade.class, id);
			em.getTransaction().begin();
			em.remove(cidade);
			em.getTransaction().commit();
		} catch (Exception e) {
			System.err.println(e);
			em.getTransaction().rollback();
		}finally {
			em.close();			
		}
		
		return cidade;		
	}
}
