package com.ustglobal.lamdaexpressions;

public class TestGreet {


	public static void main(String[] args) {
   
	GreetInterface gi=(message)->
	{
		System.out.println("Hello");
		 System.out.println(message);
	}; 
		 gi.greet("ani");
	}
}
