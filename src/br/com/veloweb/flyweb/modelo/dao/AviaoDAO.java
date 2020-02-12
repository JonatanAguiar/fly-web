package br.com.veloweb.flyweb.modelo.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.veloweb.flyweb.connection.ConnectionFactory;
import br.com.veloweb.flyweb.modelo.Aviao;

public class AviaoDAO {
	
	public Aviao save(Aviao aviao) {
		EntityManager em = new ConnectionFactory().getConnection();
		
		try {
			em.getTransaction().begin();
			if(aviao.getId() == null) {
				em.persist(aviao);
			}else {
				em.merge(aviao);
			}
			em.getTransaction().commit();
			
		}catch (Exception e) {
			System.err.println(e);
			em.getTransaction().rollback();
		}finally {
			em.close();
		}
		return aviao;
	}
	
	public Aviao findById (Integer id) {
		EntityManager em = new ConnectionFactory().getConnection();
		
		Aviao aviao = null;
		
		try {
			aviao = em.find(Aviao.class, id);
		}catch(Exception e) {
			System.err.println(e);
		}finally {
			em.close();
		}
		
		return aviao;
	}
	
	public List<Aviao> findAll(){
		EntityManager em = new ConnectionFactory().getConnection();
		List<Aviao> avioes = null;
		
		try {
			avioes = em.createQuery("from Aviao a").getResultList();
		} catch (Exception e) {
			System.err.println(e);
		}finally {
			em.close();
		}
		
		return avioes;
	}
	
	public Aviao remove(Integer id) {
		EntityManager em = new ConnectionFactory().getConnection();
		Aviao aviao = null;
		
		try {
			aviao = em.find(Aviao.class, id);
			em.getTransaction().begin();
			em.remove(aviao);
			em.getTransaction().commit();
		} catch (Exception e) {
			System.err.println(e);
			em.getTransaction().rollback();
		}finally {
			em.close();			
		}
		
		return aviao;		
	}
}
