package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestC {
	public static void main(String[] args) {

		LinkedHashSet ls=new LinkedHashSet();
		ls.add(34);
		ls.add("nikitha");
		ls.add(89.9);
		ls.add(34);
		ls.add("bhavya");
		ls.add(null);
		ls.add(null);

		System.out.println("=========================For Each Loop=================");
		for(Object s: ls) {
			System.out.println(s);
		}

		System.out.println("====================Using Iterator==================");
		Iterator<Object> it=ls.iterator();
		while(it.hasNext()) {
			Object p=it.next();
			System.out.println(p);

		}
	}
}
