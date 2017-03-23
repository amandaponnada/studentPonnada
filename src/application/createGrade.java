package application;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.grade;

public class createGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Grade Name : ");
		String gName = in.nextLine();
		System.out.println("Enter Grade Teacher Name : ");
		String gTeacherName = in.nextLine();
		System.out.println("Enter Grade Sub Teacher Name : ");
		String gSubTeacherName = in.nextLine();
		System.out.println("Enter Grade Mascot : ");
		String gMascot = in.nextLine();
		System.out.println("Enter Grade School Name : ");
		String gSchoolName = in.nextLine();
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("studentPonnada");
		
		EntityManager em =emfactory.createEntityManager();
		
		em.getTransaction().begin();
		//working with object to do whatever needs to be done 
		
//		grade toInsert = new grade("3rd Grade","Mrs Appleton","Mr. Stapleton","Appletown Elementary","Apple");
		grade toInsert = new grade(gName,gTeacherName,gSubTeacherName,gSchoolName,gMascot);
		
		em.persist(toInsert);
		
		em.getTransaction().commit();
		em.close();
		emfactory.close();
		
		
		
		
		
	}

}
