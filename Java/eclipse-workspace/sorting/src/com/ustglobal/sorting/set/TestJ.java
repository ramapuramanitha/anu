package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.NavigableMap;//
import java.util.TreeSet;

public class TestJ {
public static void main(String[] args) {
		
	SortByName1 sn=new SortByName1();
	TreeSet<Customer> ts=new TreeSet<Customer>(sn);
		
		
		
		Customer c1= new Customer("ani", 1,6768689);
		Customer c2= new Customer("sasi", 2,98989);
		Customer c3= new Customer("chinnu", 6,765678);
		Customer c4= new Customer("anu", 4,123456);


		ts.add(c1);
		ts.add(c2);
		ts.add(c3);
		ts.add(c4);

		System.out.println("================Using Iterator==========");
		Iterator<Customer> it=ts.iterator();
		while(it.hasNext()) {
			Customer c= it.next();
			System.out.println("Name1 is "+c.name1);
			System.out.println("Id is "+c.id);
			System.out.println("Salary is" +c.salary);
			System.out.println("===========================================");
		}

	}
}


