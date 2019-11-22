package com.ustglobal.map;

import java.util.Map;
import java.util.TreeMap;

public class TestE {
	public static void main(String[] args) {

		TreeMap <String,Integer> lh=new TreeMap<String, Integer>();
		lh.put("Patna",560068);
		lh.put("Hariyana",134203);
		lh.put("Banglore",880000);
		// lh.put(null,456789); Null Pointer Exception
		
		System.out.println(lh);
		
		for(Map.Entry<String ,Integer> m: lh.entrySet()) {
			String Key =m.getKey();
			Integer value=m.getValue();
			
			System.out.println("Key is "+Key);
			System.out.println("Value is"+value);
			System.out.println("===============================");
		}
	}
}
