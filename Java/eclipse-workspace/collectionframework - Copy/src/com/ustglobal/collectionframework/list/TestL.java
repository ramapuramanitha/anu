
package com.ustglobal.collectionframework.list;

import java.util.ArrayList;

public class TestL {
	public static void main(String[] args) {
		ArrayList<Teacher> al=new ArrayList<Teacher>();

		Teacher s1=new Teacher(1,"ani",20000);
		Teacher s2=new Teacher(2,"anu",30000);
		Teacher s3=new Teacher(3,"ankit",50000);

		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		
		
		System.out.println("=============Using For Loop=====================");
		for(int i=0;i<al.size();i++) {
            Teacher s=al.get(i);
			System.out.println("Id is "+s.id);
			System.out.println("Name is "+s.name);
			System.out.println("Percentage is "+s.salary);

}
		
		
		System.out.println("====== Using for each Loop=============");
		for(Teacher s:al) {
			System.out.println(s);
		}
		
		
	}
}

