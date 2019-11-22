package com.jspiders2;

public class Tap{
	Water open () {
	Water w=new Water();
	System.out.println("open tap water flows");
	return w;
	
}
	public static void main(String[] args) {
		Tap t1=new Tap();
		t1.open();
		
	}

	

}
 class Water {

}

