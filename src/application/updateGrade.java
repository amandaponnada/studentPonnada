package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.grade;

public class updateGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("studentPonnada");
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		
		grade toUpdate = em.find(grade.class, 1);
		toUpdate.setgradeMascot("Rubix Cube");
		
		em.getTransaction().commit();
		em.close();
		emfactory.close();

	}

}
