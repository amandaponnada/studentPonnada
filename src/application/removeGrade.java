package application;

import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.grade;

public class removeGrade {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Grade which needs to be removed: " );
		int removeGrade = in.nextInt();
		
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("studentPonnada");
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		
		grade toRemove = em.find(grade.class, removeGrade);
		
		em.remove(toRemove);
		em.getTransaction().commit();
		em.close();
		emfactory.close();
	}
}
