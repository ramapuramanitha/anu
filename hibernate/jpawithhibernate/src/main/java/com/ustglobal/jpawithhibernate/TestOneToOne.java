package com.ustglobal.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


import com.ustglobal.jpawithhibernate.onetoone.Person;
import com.ustglobal.jpawithhibernate.onetoone.VoterCard;

public class TestOneToOne {
	public static void main(String[] args) {
		
		VoterCard vc=new VoterCard();
		vc.setVid(30);
		vc.setVname("chinnu");
		
		Person p=new Person();
         p.setPid(2);
        p.setPname("chinnu");
        p.setVoterCard(vc);
		EntityTransaction entityTransaction = null;
		EntityManager entityManager=null;

		try {
			EntityManagerFactory entitymanagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
			entityManager= entitymanagerFactory.createEntityManager();
			entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			
			VoterCard vCard= entityManager.find(VoterCard.class, 2);
		
			System.out.println(vCard.getPerson().getPid());
		//	entityManager.persist(p);
			System.out.println("Record Saved");
			entityTransaction.commit();
		}catch(Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();


	}//end of main method
}//end of class
