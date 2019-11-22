package com.ustglobal.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class TestD {
	public static void main(String[] args) {

		LinkedHashMap <String,Integer> lh=new LinkedHashMap<String,Integer>();
		lh.put("Banglore",560068);
		lh.put("Hariyana",134203);
		lh.put("Patna",880000);

		for(Map.Entry<String,Integer> m:lh.entrySet()) {
			String Key=m.getKey();
			Integer value=m.getValue();
			System.out.println("Key is"+Key+"---------------"+"Value"+value);
			System.out.println("=================================");
		}
	}
}
