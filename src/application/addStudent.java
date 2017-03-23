package application;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.student;
import entities.grade;

public class addStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("Enter Student Name 		: " );
		String sName = in.nextLine();
		System.out.println("Enter Student Age 		: " );
		int sAge = in.nextInt();
		System.out.println("Enter Student Grade ID  : " );
		int sGradeID = in.nextInt();
		System.out.println("Enter Student Major Sub : " );
		String sMajorSub = in.nextLine();
		System.out.println("Enter Student Elective  : " );
		String sElective = in.nextLine();
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("studentPonnada");
		
		EntityManager em =emfactory.createEntityManager();
		
		em.getTransaction().begin();
		
		student newStudent = new student(sName,sAge,sGradeID,sMajorSub,sElective);
		
		em.persist(newStudent);
		
		em.getTransaction().commit();
		em.close();
		emfactory.close();
		
	}

}
