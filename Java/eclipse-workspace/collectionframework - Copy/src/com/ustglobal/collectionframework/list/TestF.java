package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestF {

	public static void main(String[] args) {

		ArrayList<String> a1=new ArrayList<String>();
		a1.add("ankitha");
		a1.add("anjali");
		a1.add("anjitha");
		a1.add("arpitha");

		String name=a1.get(0);
		System.out.println(name.toUpperCase());
		
		Iterator<String> li =a1.iterator();
		
		System.out.println("================ Using Iterator Forward Loop=================");
		while(li.hasNext()) {
			String s=li.next();
			System.out.println(s);
			}
		
		
		System.out.println("===============Using List Iterator Forward Loop============");
		ListIterator<String> l =a1.listIterator();
		while(l.hasNext()) {
			String s=l.next();
			System.out.println(s);
		}
		
		System.out.println("=======Using for each Loop==============");
          
		for(String n:a1) {
			System.out.println(n);
		}
	}

}


