package com.ustglobal.objectclass;

public class TestE {
	public static void main(String[] args) {
		Car c1=new Car(1000000,"tata","blue");
		Car c2=new Car(200001,"BMW","red");


		int h= c1.hashCode();
		System.out.println(h);
		//s1.printDetails(c1);
		System.out.println(c1);
		

		int h1= c2.hashCode();
		System.out.println(h1);
		//s1.printDetails(c1);
		System.out.println(c2);
		
	}
}
