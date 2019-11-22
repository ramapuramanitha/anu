package com.ustglobal.arrays;

public class TestE {
	public static void main(String[] args) {
		
	String[] prdts= {"laptop","bag","mobile","refrigerator"};
	//System.out.println(nums[laptop]);
	  receive1(prdts);
	 String[] values1=getArray1();
	 
	for(String val1:values1) {
		System.out.println(val1);
	}

}
static void receive1(String[] products){

	for(String prdts:products) {
		System.out.println(prdts);
	}

}
static String[] getArray1() {
	String[] values1= {"bag","mobile","refrigerator"};
	return values1;
}
}
