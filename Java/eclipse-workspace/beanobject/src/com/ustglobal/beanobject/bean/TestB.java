package com.ustglobal.beanobject.bean;
import java.util.Scanner;

public class TestB {
	public static void main(String[] args) {
		System.out.println("Scanner class");

		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter age");
		int age =sc.nextInt();
		System.out.println("Age is"+age);
		
		Scanner s1 =new Scanner(System.in);
		System.out.println("Enter name");
		String name =s1.nextLine();
		System.out.println("name is"+name);
		
		Scanner s2 =new Scanner(System.in);
		System.out.println("Enter color");
		String color =s2.next();
		System.out.println("Color is"+color);
		
		Scanner s3=new Scanner(System.in);
		System.out.println("Enter num");
		byte num =s3.nextByte();
		System.out.println("Num is"+num);

		Scanner s4=new Scanner(System.in);
		System.out.println("Enter num");
		short num1 =s4.nextShort();
		System.out.println("Num1 is"+num1);
		
		Scanner s5 =new Scanner(System.in);
		System.out.println("Enter num2");
		double num2 =s5.nextDouble();
		System.out.println("Num2 is"+num2);
		
		Scanner s6 =new Scanner(System.in);
		System.out.println("Enter num");
		float num3 =s6.nextFloat();
		System.out.println(" num3 is"+num3);
		
		Scanner s7 =new Scanner(System.in);
		System.out.println("Are you female");
		boolean num4 =s7.nextBoolean();
		System.out.println("num4 is"+num4);
		sc.close();
	}
}
