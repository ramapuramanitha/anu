package com.ustglobal.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.dto.Product;

public class UpdateDemo {
public static void main(String[] args) {
	EntityTransaction entityTransaction=null;
	EntityManager entityManager=null;
	
	try {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
	entityManager = entityManagerFactory.createEntityManager();
	entityTransaction=entityManager.getTransaction();
	entityTransaction.begin();
	Product product=entityManager.find(Product.class, 100);
	product.setPname("Mobile");
	product.setQuantity(12);
	System.out.println("Update Record");
	entityTransaction.commit();
	}catch(Exception e) {
		e.printStackTrace();
		entityTransaction.rollback();
	}
	entityManager.close();
}//end of main method

}//end of class
