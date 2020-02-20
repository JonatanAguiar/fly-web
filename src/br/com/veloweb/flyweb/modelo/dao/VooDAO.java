package br.com.veloweb.flyweb.modelo.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.veloweb.flyweb.connection.ConnectionFactory;
import br.com.veloweb.flyweb.modelo.Cidade;
import br.com.veloweb.flyweb.modelo.Voo;

public class VooDAO {
	
	public Voo save(Voo voo) {
		EntityManager em = new ConnectionFactory().getConnection();
		
		try {
			em.getTransaction().begin();
			if(voo.getId() == null) {
				em.persist(voo);
			}else {
				em.merge(voo);
			}
			em.getTransaction().commit();
			
		}catch (Exception e) {
			System.err.println(e);
			em.getTransaction().rollback();
		}finally {
			em.close();
		}
		return voo;
	}
	
	public Voo findById (Integer id) {
		EntityManager em = new ConnectionFactory().getConnection();
		
		Voo voo = null;
		
		try {
			voo = em.find(Voo.class, id);
		}catch(Exception e) {
			System.err.println(e);
		}finally {
			em.close();
		}
		
		return voo;
	}
	
	public List<Voo> findAll(){
		EntityManager em = new ConnectionFactory().getConnection();
		List<Voo> voos = null;
		
		try {
			voos = em.createQuery("from Voo v").getResultList();
		} catch (Exception e) {
			System.err.println(e);
		}finally {
			em.close();
		}
		
		return voos;
	}
	
	public Voo remove(Integer id) {
		EntityManager em = new ConnectionFactory().getConnection();
		Voo voo = null;
		
		try {
			voo = em.find(Voo.class, id);
			em.getTransaction().begin();
			em.remove(voo);
			em.getTransaction().commit();
		} catch (Exception e) {
			System.err.println(e);
			em.getTransaction().rollback();
		}finally {
			em.close();			
		}
		
		return voo;		
	}
	
}
