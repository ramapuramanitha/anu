package com.ustglobal.collectionframework;

import java.awt.List;
import java.util.ArrayList;
import java.util.ListIterator;

public class TestD {
	public static void main(String[] args) {

		ArrayList a1=new ArrayList();
		a1.add(10);
		a1.add(45.6);
		a1.add("yashu");
		a1.add(true);

		ListIterator li= a1.listIterator();
		
		System.out.println("=================List Iterator Using Forward Loop=====================");
		while(li.hasNext()) {
			Object ob=li.next();
			System.out.println(ob);
			}


		System.out.println("================List Iterator Using Backwared Loop================");
		
		while(li.hasPrevious()) {
			Object o=li.previous();
			System.out.println(o);
			}
	}
}