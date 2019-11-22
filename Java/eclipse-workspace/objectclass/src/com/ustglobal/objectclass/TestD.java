package com.ustglobal.objectclass;

public class TestD {
	public static void main(String[] args) {
		Student s1=new Student(10,"ani",85.57);
		Student s2=new Student(11,"anjali",75.57);


		int h= s1.hashCode();
		System.out.println(h);
		//s1.printDetails(s1);
		System.out.println(s1);
		System.out.println(s2);

	}
}
