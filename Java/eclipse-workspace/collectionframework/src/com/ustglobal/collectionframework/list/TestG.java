
package com.ustglobal.collectionframework.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestG {


public static void main(String[] args) {
	
	LinkedList li=new LinkedList();
	li.add(12);
	li.add(34.5);
	li.add(true);
	li.add(null);
	
	System.out.println("=============Using For Loop=======");
	for(int i=0;i<li.size();i++) {

		Object o=li.get(i);
		System.out.println(o);
	}
	
	
	System.out.println("=======Using for each==============");
      for(Object n:li) {
		System.out.println(n);
	}
	
      Iterator it1=li.iterator();
      
    System.out.println("=====Using Iterator Forward Loop==================");
	while(it1.hasNext()) {
		Object o=it1.next();
		System.out.println(o);
	}
	
	
	System.out.println("===============Using List Iterator Forward Loop============");
	ListIterator<Object> lt =li.listIterator();
	while(lt.hasNext()) {
		Object s=lt.next();
		System.out.println(s);
	}
	
	
	
	System.out.println("================ListIteratorBackwared Loop------------------>");

	while(lt.hasPrevious()) {
		Object o=lt.previous();
		System.out.println(o);
	}
}
}