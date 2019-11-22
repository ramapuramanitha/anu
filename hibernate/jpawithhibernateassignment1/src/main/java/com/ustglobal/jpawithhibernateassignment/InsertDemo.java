package com.ustglobal.jpawithhibernateassignment;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateassignment.dto.Bag;



public class InsertDemo {
	public static void main(String[] args) {
		Bag bag = new Bag();
		bag.setId(100);
		bag.setBrand("hp");
		bag.setCost(10);

		EntityManagerFactory entitymanagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager= entitymanagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(bag);
		System.out.println("Record Saved");
		entityTransaction.commit();
		entityManager.close();

	}//end of main method

}//end of class
