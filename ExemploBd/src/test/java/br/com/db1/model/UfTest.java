package br.com.db1.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Test;

public class UfTest {
	
	@Test
	public void metodoTest() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("db1start");
		EntityManager manager = factory.createEntityManager();
				
		Uf2 uf = new Uf2();
		uf.setNome("PR");

		
		manager.getTransaction().begin();
		manager.persist(uf);
		manager.getTransaction().commit();
		
		factory.close();
	}
}