package br.com.db1.model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.junit.Test;

public class CidadeTest {

	@Test
	public void metodoTest() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("db1start");
		EntityManager manager = factory.createEntityManager();
				
		Cidade cidade = new Cidade();
		cidade.setNome("Maringa");
		cidade.setUf(Uf.PR);
		
		manager.getTransaction().begin();
		manager.persist(cidade);
		manager.getTransaction().commit();
		
		factory.close();
	}
}
	