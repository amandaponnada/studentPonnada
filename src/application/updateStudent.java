package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.grade;
import entities.student;

public class updateStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("studentPonnada");
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		
		student toUpdate = em.find(student.class, 1);
		toUpdate.setStudentAge(10); 
		
		em.getTransaction().commit();
		em.close();
		emfactory.close();


	}

}
