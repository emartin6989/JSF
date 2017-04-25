package dao;


import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import metier.Client;

public class Dao implements IDao {
EntityManagerFactory emf= Persistence.createEntityManagerFactory("jpacdi-pu");

	@Override
	public long addClient(Client c) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx= em.getTransaction();
		tx.begin();
		em.persist(c);
		tx.commit();
		em.close();
		return c.getId();
	}
	@Override
	public  ArrayList<Client> listeClient() {
		ArrayList<Client> clients;
		EntityManager em = emf.createEntityManager();
		Query query = em.createQuery("SELECT c FROM Client c");
		return clients = (ArrayList<Client>) query.getResultList();
	}
	
	@Override
	public void supprimer(Client c) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx= em.getTransaction();
		tx.begin();
		//em.remove(em.contains(c) ? c:em.merge(c));
		em.remove(em.find(Client.class, c.getId()));
		tx.commit();
		em.close();
	}
	
	@Override
	public void maj(Client c) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx= em.getTransaction();
		tx.begin();
		//em.remove(em.contains(c) ? c:em.merge(c));
		em.merge(c);
		tx.commit();
		em.close();
	}

}
