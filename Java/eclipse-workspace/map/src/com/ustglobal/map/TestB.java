package com.ustglobal.map;

import java.util.HashMap;

public class TestB {
	public static void main(String[] args) {
		HashMap hm=new HashMap();
		hm.put("kuku",998014);
		hm.put("mala",678941);
		hm.put("sheela",789789);

		HashMap hm1=new HashMap();
		hm1.put("deepu",789099);
		hm1.put("riya",678909);
		hm1.put("kirti",467787);

		boolean hasKey= hm.containsKey("mala");
		System.out.println("Has key"+hasKey);

		boolean hasValue= hm.containsValue(467797);
		System.out.println("Has Value"+hasValue);

		hm.putAll(hm1);

		System.out.println("After put all"+hm);
		System.out.println(hm.size());

		boolean isEmpty = hm.isEmpty();
		System.out.println("After clear"+hm);

		hm.clear();
		System.out.println(hm);
	}
}
