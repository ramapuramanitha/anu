package com.ustglobal.singleton;

public class Test {
	public   static void main(String[] args) {
		Singleton  st =Singleton.getDbConnection();
		st.s ="Hello";
		System.out.println("Hashcode of st" +st.hashCode());

		Singleton  st1 =Singleton.getDbConnection();
		st1.s="Hi";
		System.out.println("Hashcode of st1" +st1.hashCode());
		
		System.out.println(st.s);
		System.out.println(st1.s);
	}
}
