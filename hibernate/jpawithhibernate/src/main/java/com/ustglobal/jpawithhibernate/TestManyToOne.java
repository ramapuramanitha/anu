package com.ustglobal.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.manytoone.Pencil;
import com.ustglobal.jpawithhibernate.manytoone.PencilBox;

public class TestManyToOne {
	public static void main(String[] args) {
		PencilBox pb=new PencilBox();
		pb.setBid(2);
		pb.setBname("Natraj");
		
		Pencil p=new Pencil();
         p.setPid(22);
        p.setPname("black");
         p.setPencilBox(pb);
         
         Pencil p1=new Pencil();
         p1.setPid(33);
        p1.setPname("black");
         p1.setPencilBox(pb);
        
		EntityTransaction entityTransaction = null;
		EntityManager entityManager=null;

		try {
			EntityManagerFactory entitymanagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
			entityManager= entitymanagerFactory.createEntityManager();
			entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
		
		entityManager.persist(p);
			System.out.println("Record Saved");
			entityTransaction.commit();
		}catch(Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
	}
}
