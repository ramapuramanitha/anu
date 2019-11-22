package com.ustglobal.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.dto.Product;

public class GetReference {
	public static void main(String[] args) {
		EntityTransaction entityTransaction=null;
		EntityManager entityManager=null;


		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
		entityManager = entityManagerFactory.createEntityManager();
		
		//	Product product=entityManager.find(Product.class, 100);
		
		Product product=entityManager.find(Product.class,100 );
		System.out.println(product.getClass());
		
		//	System.out.println("Id is--"+product.getPid());
		//	System.out.println("Name is--"+product.getPname());
		//	System.out.println("Sal is--"+product.getQuantity());

		entityManager.close();
	}//end of main method
}//end of class
