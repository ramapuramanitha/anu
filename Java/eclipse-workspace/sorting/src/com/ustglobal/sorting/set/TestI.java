package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestI {
	public static void main(String[] args) {
		
		SortByName sb=new SortByName();
		TreeSet<Bank> ts=new TreeSet<Bank>(sb);
        
//		SortByMicr sm=new SortByMicr();
//		TreeSet<Bank> ts1=new TreeSet<Bank>(sm);
		
	
//		SortByPincode sp=new SortByPincode();
//		TreeSet<Bank> ts2=new TreeSet<Bank>(sp);
		
		
		
		Bank b1= new Bank("HDFC", 56008,6768689);
		Bank b2= new Bank("SBI", 560071,98989);
		Bank b3= new Bank("CITI", 560054,765678);
		Bank b4= new Bank("CANARA", 560076,123456);


		ts.add(b1);
		ts.add(b2);
		ts.add(b3);
		ts.add(b4);

		System.out.println("================Using Iterator==========");
		Iterator<Bank> it=ts.iterator();
		while(it.hasNext()) {
			Bank b= it.next();
			System.out.println("Name is "+b.name);
			System.out.println("Pincode is "+b.pincode);
			System.out.println("MICR is" +b.micr);
			System.out.println("===========================================");
		}

	}
}
