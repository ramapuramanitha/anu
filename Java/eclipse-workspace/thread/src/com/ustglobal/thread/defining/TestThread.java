package com.ustglobal.thread.defining;

public class TestThread {
	public static void main(String[] args) {
		System.out.println("main started");

		MyThread t1=new MyThread();
// Dont call run() method, it behaves like normal program
		
	//	All code will be executed inside main thread only
		t1.start();
	//	t1.start(); Illegal Thread State Exception 
		for(int i=0;i<10;i++) {
			System.out.println("main thread");
		}
		System.out.println("main ended");
	}
}
