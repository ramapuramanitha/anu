package com.jspiders2;

public class Atm
{
	Money dispense()
	{
		Money m=new Money();
		System.out.println("Atm Dispense Money");
		return m;
	}
	public static void main(String[] args)
	{
		Atm a1=new Atm();
		a1.dispense();
	}
		
	
	

}
