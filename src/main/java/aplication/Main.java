package aplication;

import javax.persistence.EntityManager;

import aplication.db.RepositoryDB;
import aplication.entities.User;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManager em = RepositoryDB.getEntityManager();
		
		User p = new User();
		p.setName("Romeu");
		
		em.getTransaction().begin();
		/*Crud example hibernate*/
		
		//persistindo uma entidade
		//em.persist(p);
		
		//consultando um User
		//User x = em.find(User.class,1l);
		//System.out.println(x);
		
		//atualizando User
		//User x = em.find(User.class,1l);
		//x.setName("Romeu Dias Rocha");
		//em.persist(x);
		
		//deletando um User
		//User x = em.find(User.class,1l);
		//em.remove(x);
		
		em.getTransaction().commit();
		
		System.out.println("fim");
	}

}
