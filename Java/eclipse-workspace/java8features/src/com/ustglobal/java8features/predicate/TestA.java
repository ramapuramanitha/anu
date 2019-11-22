package com.ustglobal.java8features.predicate;

import java.util.function.Predicate;



public class TestA {
public static void main(String[] args) {
	Predicate<Employee> p=s->{
		if(s.salary>=35) {
			return true;
		}else {
			return false;
		}
	};
	
	Employee s=new Employee(1,"ani",45000);
	boolean res= p.test(s);
	System.out.println("Result "+res);
}
}
