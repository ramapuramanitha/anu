package com.ustglobal.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestG {
	public static void main(String[] args) {
		
		Employee s1=new Employee(2,"divya",20000);
		Employee s2=new Employee(1,"ani",370000);
		Employee s3=new Employee(9,"uma",770000);
		Employee s4=new Employee(2,"chinnu",270009);
		Employee s5=new Employee(7,"teju",470000);
		Employee s6=new Employee(6,"dinesh",55000);
		Employee s7=new Employee(5,"baskar",850000);
		Employee s8=new Employee(3,"radha",95000);
		Employee s9=new Employee(8,"mani",900009);
		
		//System.out.println(s6);
		
		ArrayList<Employee> al=new ArrayList<>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		
		ArrayList<Employee> al1=new ArrayList<>();
		al1.add(s4);
		al1.add(s5);
		al1.add(s6);
		
		ArrayList<Employee> al2=new ArrayList<>();
		al2.add(s7);
		al2.add(s8);
		al2.add(s9);
		
		HashMap<String ,ArrayList<Employee>> hm=new HashMap<>();
		hm.put("first", al);
		hm.put("second",al1);
		hm.put("third",al2);
		
		ArrayList<Employee> second = hm.get("second");
		
		Iterator<Employee> it=second.iterator();
		
		while(it.hasNext()) {
			Employee s=it.next();
			System.out.println("Id is"+s.id);
			System.out.println("Name is"+s.name);
			System.out.println("Salary is"+s.salary);
			System.out.println("==================================");
			
		}
	}
	}

