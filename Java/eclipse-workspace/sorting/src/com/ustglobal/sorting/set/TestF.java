package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestF {
public static void main(String[] args) {
	 TreeSet<String> ts=new TreeSet<String>();
	 ts.add("ani");
	 ts.add("sai");
     ts.add("mani");
      ts.add("sushma");
      ts.add("sree");
      
      System.out.println("=============Using For Each==================");
		for(String s: ts) {
			System.out.println(s);
		}

		System.out.println("====================Using Iterator==================");
		Iterator<String> it=ts.iterator();
		while(it.hasNext()) {
			String p=it.next();
			System.out.println(p);

		}

}
}
