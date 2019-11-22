package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestE {
	public static void main(String[] args) {

		TreeSet  ts=new TreeSet();
		ts.add(34);
		ts.add(45);
		ts.add(12);
		ts.add(9);
		ts.add(39);
		
		
	//	ts.add("ankitha"); Class Cast Exception
		//ts.add(null); NullPointer Exception

		System.out.println("=========Using for Each========");
		for(Object s:ts) {
			System.out.println(s);
		}

		System.out.println("====================Using Iterator==================");
		Iterator<Object> it=ts.iterator();
		while(it.hasNext()) {
			Object p=it.next();
			System.out.println(p);

		}
	}
}
