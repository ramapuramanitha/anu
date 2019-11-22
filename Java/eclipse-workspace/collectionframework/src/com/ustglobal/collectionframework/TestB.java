package com.ustglobal.collectionframework;

import java.util.ArrayList;

public class TestB {
 public static void main(String[] args) {
	
	 ArrayList al =new ArrayList();
	 al.add(10);
	 al.add(79.27);
	 al.add(true);
	 al.add("chinnodu");
	 
	 System.out.println("=============Using For Loop Each Loop=========================");
	 
	 for(Object o:al) {
		 System.out.println(o);
	 }
}
}
