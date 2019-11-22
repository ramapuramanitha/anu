package com.ustglobal.jpawithhibernateassignment;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateassignment.dto.Bag;

public class ReadDemo {
	public static void main(String[] args) {
		EntityManagerFactory entitymanagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager= entitymanagerFactory.createEntityManager();
		Bag bagDetail=entityManager.find(Bag.class, 100);
	System.out.println("ID----"+bagDetail.getId());
	System.out.println("Brand---"+bagDetail.getBrand());
	System.out.println("Cost---"+bagDetail.getCost());
	entityManager.close();

	}//end of main method
}//end of class
