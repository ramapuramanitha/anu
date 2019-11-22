package com.ustglobal.lamdaexpressions;

public class TestSayHi {
	public static void main(String[] args) {
		SayHiInterface  si=()->
		System.out.println("Hi");
		si.sayHi();
	}
}

