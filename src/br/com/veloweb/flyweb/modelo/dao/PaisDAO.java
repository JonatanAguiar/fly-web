package br.com.veloweb.flyweb.modelo.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.veloweb.flyweb.connection.ConnectionFactory;
import br.com.veloweb.flyweb.modelo.Pais;

public class PaisDAO {
	
	public Pais save(Pais pais) {
		EntityManager em = new ConnectionFactory().getConnection();
		
		try {
			em.getTransaction().begin();
			if(pais.getId() == null) {
				em.persist(pais);
			}else {
				em.merge(pais);
			}
			em.getTransaction().commit();
			
		}catch (Exception e) {
			System.err.println(e);
			em.getTransaction().rollback();
		}finally {
			em.close();
		}
		return pais;
	}
	
	public Pais findById (Integer id) {
		EntityManager em = new ConnectionFactory().getConnection();
		
		Pais pais = null;
		
		try {
			pais = em.find(Pais.class, id);
		}catch(Exception e) {
			System.err.println(e);
		}finally {
			em.close();
		}
		
		return pais;
	}
	
	public List<Pais> findAll(){
		EntityManager em = new ConnectionFactory().getConnection();
		List<Pais> paises = null;
		
		try {
			paises = em.createQuery("from Paiss c").getResultList();
		} catch (Exception e) {
			System.err.println(e);
		}finally {
			em.close();
		}
		
		return paises;
	}
	
	public Pais remove(Integer id) {
		EntityManager em = new ConnectionFactory().getConnection();
		Pais pais = null;
		
		try {
			pais = em.find(Pais.class, id);
			em.getTransaction().begin();
			em.remove(pais);
			em.getTransaction().commit();
		} catch (Exception e) {
			System.err.println(e);
			em.getTransaction().rollback();
		}finally {
			em.close();			
		}
		
		return pais;		
	}
}
