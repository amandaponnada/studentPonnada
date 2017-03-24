package application;

import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.grade;

public class updateGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
/*		System.out.println("Enter the grade to Update : " );
		int updGrade = in.nextInt();

		System.out.println("Enter updated Mascot : " );
		String updMascot = in.nextLine();
*/		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("studentPonnada");
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		
		grade toUpdate = em.find(grade.class, 2);
		toUpdate.setgradeMascot("Rubix Cube");
		
		em.getTransaction().commit();
		em.close();
		emfactory.close();

	}

}
