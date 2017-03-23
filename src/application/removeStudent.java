package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.student;

public class removeStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("studentPonnada");
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		
		student toRemove = em.find(student.class, 3);
		
		em.remove(toRemove);
		em.getTransaction().commit();
		em.close();
		emfactory.close();
		
	}

}
