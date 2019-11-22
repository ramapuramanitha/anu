package com.ustglobal.sorting.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class TestB {
	public static void main(String[] args) {

		LinkedList<Laptop> ll=new LinkedList<Laptop>();
		Laptop lp1=new Laptop(85000,4,"HP");
		Laptop lp2=new Laptop(45000,8,"Dell");
		Laptop lp3=new Laptop(35000,2,"Lenovo");
		Laptop lp4=new Laptop(95000,12,"Asus");

		ll.add(lp1);
		ll.add(lp2);
		ll.add(lp3);
		ll.add(lp4);
		ll.add(new Laptop(20000, 2, "acer"));
		
		System.out.println("Before sorting--------->");
		dispalyLaptopDetails(ll);
		Collections.sort(ll);
	    System.out.println("After sorting------------>");
		dispalyLaptopDetails(ll);
}

	static void dispalyLaptopDetails(LinkedList<Laptop> l) {

		Iterator<Laptop> it=l.iterator();
		while(it.hasNext()) {
			Laptop lp=it.next();
			System.out.println("Brand is " +lp.name);
			System.out.println("Price is "+lp.price);
			System.out.println("Ram is "+lp.ram);
			System.out.println("=============================>");

		}
	}

}


