package br.com.veloweb.flyweb.modelo.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.veloweb.flyweb.connection.ConnectionFactory;
import br.com.veloweb.flyweb.modelo.Rota;

public class RotaDAO {
	
	public Rota save(Rota rota) {
		EntityManager em = new ConnectionFactory().getConnection();
		
		try {
			em.getTransaction().begin();
			if(rota.getId() == null) {
				em.persist(rota);
			}else {
				em.merge(rota);
			}
			em.getTransaction().commit();
			
		}catch (Exception e) {
			System.err.println(e);
			em.getTransaction().rollback();
		}finally {
			em.close();
		}
		return rota;
	}
	
	public Rota findById (Integer id) {
		EntityManager em = new ConnectionFactory().getConnection();
		
		Rota rota = null;
		
		try {
			rota = em.find(Rota.class, id);
		}catch(Exception e) {
			System.err.println(e);
		}finally {
			em.close();
		}
		
		return rota;
	}
	
	public List<Rota> findAll(){
		EntityManager em = new ConnectionFactory().getConnection();
		List<Rota> rotas = null;
		
		try {
			rotas = em.createQuery("from Rotas c").getResultList();
		} catch (Exception e) {
			System.err.println(e);
		}finally {
			em.close();
		}
		
		return rotas;
	}
	
	public Rota remove(Integer id) {
		EntityManager em = new ConnectionFactory().getConnection();
		Rota rota = null;
		
		try {
			rota = em.find(Rota.class, id);
			em.getTransaction().begin();
			em.remove(rota);
			em.getTransaction().commit();
		} catch (Exception e) {
			System.err.println(e);
			em.getTransaction().rollback();
		}finally {
			em.close();			
		}
		
		return rota;		
	}
}
