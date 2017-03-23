package application;

import java.util.Scanner;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import entities.grade;
import entities.student;
	
public class listGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("studentPonnada");
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a Grade : ");
		int selectedGrade = in.nextInt();
		
		TypedQuery<grade> selectedGradeQuery = em.createQuery("select schoolGrade from grade schoolGrade where schoolGrade.gradeId = :selectedGrade",grade.class);
		selectedGradeQuery.setParameter("selectedGrade", selectedGrade);
		List<grade>results = selectedGradeQuery.getResultList();
		
		
		for(grade a : results){
			System.out.println("Grade Details : " + a.getgradeName());
		}
		
		em.close();
		emfactory.close();
		
		
	}

}
