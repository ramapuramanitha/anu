package com.ustglobal.jpawithhibernate.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ustglobal.jpawithhibernate.dto.Product;

public class JpqlNamesDisplay {
	public static void main(String[] args) {



		EntityManagerFactory entitymanagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager= entitymanagerFactory.createEntityManager();
		String jpql="select pname from Product";
		Query query=entityManager.createQuery(jpql);
		List<String> products=query.getResultList();
		entityManager.close();
		for(String s:products) {
		//	System.out.println(product.getPid());
			System.out.println(s);
		//	System.out.println(product.getQuantity());
		}

}
}
