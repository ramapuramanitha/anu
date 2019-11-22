package com.ustglobal.collectionframework.list;

import java.util.ArrayList;

public class TestJ {

	public static void main(String[] args) {

		ArrayList<Student> al=new ArrayList<Student>();

		Student s1=new Student(1,"ani",45.67);
		Student s2=new Student(2,"anu",85.67);
		Student s3=new Student(3,"ankit",95.67);

		al.add(s1);
		al.add(s2);
		al.add(s3);

		
		System.out.println("=============Using For Loop=====================");
		for(int i=0;i<al.size();i++) {
			Student s=al.get(i);
			System.out.println("Id is "+s.id);
			System.out.println("Name is "+s.name);
			System.out.println("Percentage is "+s.percentage);
}
		
		
		System.out.println("====== Using for each Loop=============");
		for(Student s:al) {
			System.out.println(s);
		}
	}
}
