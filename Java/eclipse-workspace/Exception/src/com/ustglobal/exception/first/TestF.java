package com.ustglobal.exception.first;

public class TestE {
	public static void main(String[] args) {
		String s="hello";
		int[]a= {10,20,40};
		int b=10;
		try {
			String s1=s.toUpperCase();
			System.out.println(s1);
			System.out.println(a[2]);
			System.out.println(b/0);
		}catch(NullPointerException |ArrayIndexOutOfBoundException |ArithmeticException e) {
			System.out.println("dont play with null");

		}catch(ArrayIndexOutOfBoundsException ai) {
			System.out.println("array index not present");
			
		}catch(ArithmeticException ae) {
			System.out.println("number divided by zero error");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	

		System.out.println("main ended");
	}
}