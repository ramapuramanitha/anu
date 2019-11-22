package com.ustglobal.sorting.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class TestE {
	public static void main(String[] args) {

		LinkedList<Pen> ll=new LinkedList<Pen>();
		Pen p1=new Pen(1000,"parker","blue");
		Pen p2=new Pen(500,"Elchos","black");
		Pen p3=new Pen(300,"Cello","black");
		
		ll.add(p1);
		ll.add(p2);
		ll.add(p3);
	
		ll.add(new Pen(20000,"acer","red"));
		
		System.out.println("Before sorting--------->");
		dispalyPenDetails(ll);
		Collections.sort(ll);
	    System.out.println("After sorting------------>");
	    dispalyPenDetails(ll);

}

	

	static void  dispalyPenDetails(LinkedList<Pen> l) {

		Iterator<Pen> it=l.iterator();
		while(it.hasNext()) {
			Pen lp=it.next();
			
			System.out.println("Price is "+lp.price);
			System.out.println("Brand is " +lp.brand);
			System.out.println("Color is "+lp.color);
			System.out.println("=============================>");

		}
	}

}




