package application;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import entities.student;

public class displayStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("studentPonnada");
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a Student ID: ");
		int selectedStudent = in.nextInt();
		
		TypedQuery<student> selectedStudentQuery = em.createQuery("select schoolStudent from student schoolStudent where schoolStudent.studentID = :selectedStudent",student.class);
		selectedStudentQuery.setParameter("selectedStudent", selectedStudent);
		List<student>results = selectedStudentQuery.getResultList();
		
		
		for(student a : results){
			System.out.println(a.toString());
		}
		
		em.close();
		emfactory.close();
		
	}

}
