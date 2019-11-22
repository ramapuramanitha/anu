package com.ustglobal.arrays;

public class TestA {
	public static void main(String[] args) {
		int[] nums=new int[5];
		nums[0]=10;
		nums[1]=20;
		nums[2]=30;
		nums[3]=40;
		nums[4]=50;

		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}

		System.out.println("=============================================");
		for(int num:nums) {
			System.out.println(num);
		}
		System.out.println("=============================================");
		char[] ch= {'a','b','c','d'};
		for(int i=0;i<ch.length;i++) {
			System.out.println(ch[i]);
		}
		System.out.println("=====================================");
		for(int c :ch) {
			System.out.println(c);
		}
		System.out.println("==================================");
		boolean[] b= {true,false,true,false,true,true};
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
		System.out.println("==================================");
		byte[] by= {1,2,3,4,5};
		for(int i=0;i<by.length;i++) {
			System.out.println(by[i]);
		}
		System.out.println("===========================");
		for(int bo :by) {
			System.out.println(bo);

			System.out.println("==================================");
			double[] db= {46.6,67.9,78.6,356.7};
			for(int i=0;i<db.length;i++) {
				System.out.println(db[i]);
			}
			System.out.println("==================================");
			//for each//
			for(double d :db) {
				System.out.println(d);
			}
		}
	}
}
