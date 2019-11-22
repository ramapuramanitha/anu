package com.ustglobal.jpawithhibernate.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ustglobal.jpawithhibernate.dto.Product;

public class SelectJpql {
	public static void main(String[] args) {



		EntityManagerFactory entitymanagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager= entitymanagerFactory.createEntityManager();
		String jpql="from Product";
		Query query=entityManager.createQuery(jpql);
		List<Product> products=query.getResultList();
		entityManager.close();
		for(Product product:products) {
			System.out.println(product.getPid());
			System.out.println(product.getPname());
			System.out.println(product.getQuantity());
		}

	}//end of main method
}//end of class
