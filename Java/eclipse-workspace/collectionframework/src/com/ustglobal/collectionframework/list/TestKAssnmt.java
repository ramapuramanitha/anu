
package com.ustglobal.collectionframework.list;

import java.util.ArrayList;

public class TestKAssnmt {
	public static void main(String[] args) {
		ArrayList<Employee> al=new ArrayList<Employee>();

		Employee s1=new Employee(1,"ani",20000);
		Employee s2=new Employee(2,"anu",30000);
		Employee s3=new Employee(3,"ankit",50000);

		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		
		System.out.println("=============Using For Loop=====================");
		for(int i=0;i<al.size();i++) {
            Employee s=al.get(i);
			System.out.println("Id is " +s.id);
			System.out.println("Name is " +s.name);
			System.out.println("Salary is " +s.salary);
}
		
		
		System.out.println("======for each=============");
		for(Employee s:al) {
			System.out.println(s);
		}
	
	}
	
	
}

