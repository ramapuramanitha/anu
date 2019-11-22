package com.ustglobal.accessmodifiers.pkg2;

import com.ustglobal.accessmodifiers.pkg1.Sample;

public class Run {
	public static void main(String[] args) {
		Demo d= new Demo();
		//System.out.println(d.a);//not possible
		//default
	//	System.out.println("d.b");
	//	d.sub();//
		Sample s= new Sample();
		System.out.println(d.c);
		d.mul();
		//public
		System.out.println(d.name);
		d.div();
		
	}

}
