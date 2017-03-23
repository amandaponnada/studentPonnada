package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.grade;

public class removeGrade {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("studentPonnada");
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		
		grade toRemove = em.find(grade.class, 4);
		
		em.remove(toRemove);
		em.getTransaction().commit();
		em.close();
		emfactory.close();
	}
}
