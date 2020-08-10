package aplication.db;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class RepositoryDB {

	private static EntityManager entityManager;
	
	public static EntityManager getEntityManager() {
		
		if( entityManager == null) {
			javax.persistence.EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
			entityManager = emf.createEntityManager();
		}
		
		return entityManager;
		
	}
	
}
