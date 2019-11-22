package com.ustglobal.objectclass;

public class TestH {
	public static void main(String[] args) {
		

		 Product p1=new Product(1, "bag","luggage",(double) 10000,"hp");
		 Product p2=new Product(2, "laptop","touch",(double) 100000,"dell");
		 Product p3=new Product(1,"bag","luggage",(double) 10000,"hp"); 
		 Product p4=p3;
		 
		 boolean isEqual=p1.equals(p2);
		 System.out.println(p1.equals(p2));
		 System.out.println(p3.equals(p4));
		 
		 System.out.println(isEqual);
		 
		}
}
