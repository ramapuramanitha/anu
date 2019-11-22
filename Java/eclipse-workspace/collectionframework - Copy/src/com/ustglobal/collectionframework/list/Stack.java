package com.ustglobal.collectionframework.list;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;
public class Stack {
	public static void main(String[] args) {
		
		Stack li=new Stack();
		li.push(12);
	    li.push(34.5);
		li.push(true);
		li.push(null);
		
		System.out.println("=============Using For Loop=======");
		for(int i=0;i<li.size();i++) {
			Object o=li.get(i);
			System.out.println(o);
		}
		
		
		
		System.out.println("=======Using for each==============");
	      for(Object n:li) {
			System.out.println(n);
		}
	      
		
		System.out.println("=====Using Iterator Forward Loop==================");
		Iterator it1=li.iterator();
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
		

		System.out.println("================ Using List Iterator Backwared Loop=========");
	    while(lt.hasPrevious()) {
			Object o=lt.previous();
			System.out.println(o);
	      }
	    
	}

	
	}
		