package com.ustglobal.jpawithhibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JpqlInsertDynamicQuery {
	public static void main(String[] args) {

		EntityTransaction entityTransaction = null;
		EntityManager entityManager=null;
		try {
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");


			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			String jpql= "insert into product values(?,?,?)";
			Query query= entityManager.createQuery(jpql);
			query.setParameter("name", "mobile");
			query.setParameter("id",104);
			query.setParameter("quantity",15);
			int result=query.executeUpdate();
			System.out.println(result);
			entityTransaction.commit();
		} catch(Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}finally {
			entityManager.close();

		}
		}
}
