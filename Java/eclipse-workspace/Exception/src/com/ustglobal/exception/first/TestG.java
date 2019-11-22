package com.ustglobal.exception.first;

public class TestG {
	public static void main(String[] args) {

		System.out.println("main started");
		PayTm p=new PayTm();
		try {
			p.book();
			
		}catch(ArithmeticException ae){
			System.out.println("Exception caught in main");
			
		}finally {
			System.out.println("Executing finally");
		}
		
			System.out.println("main ended");
		}
	}

