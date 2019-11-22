package com.ustglobal.jpawithhibernate;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.manytomany.Course;
import com.ustglobal.jpawithhibernate.manytomany.Student;


public class TestManyToMany {
	public static void main(String[] args) {
		Course c=new Course();
		c.setCid(12);
		c.setCname("jdbc");

		Course c1=new Course();
		c1.setCid(22);
		c1.setCname("hibernate");
		ArrayList<Course>alCourses=new ArrayList<Course>();
		alCourses.add(c);
		alCourses.add(c1);

		Student s=new Student();
		s.setSid(4);
		s.setSname("anandha");
		s.setCourses(alCourses);



		EntityTransaction entityTransaction = null;
		EntityManager entityManager=null;

		try {
			EntityManagerFactory entitymanagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
			entityManager= entitymanagerFactory.createEntityManager();
			entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();

			entityManager.persist(s);
			System.out.println("Record Saved");

			entityTransaction.commit();
		}catch(Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
	}//end of main method
}//end of class