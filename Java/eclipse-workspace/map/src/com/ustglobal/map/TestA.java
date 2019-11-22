package com.ustglobal.map;

import java.util.HashMap;

public class TestA {
	public static void main(String[] args) {

		HashMap hm=new HashMap();
		hm.put("kuku",998014);
		hm.put("mala",678941);
		hm.put("sheela",789789);
		hm.put(null, 456789);
		hm.put(null, 987890);

		System.out.println("Data"+hm);

		hm.put("mala",989899);
		System.out.println("After modify"+hm);

		hm.put("dimple",989899);
		System.out.println("After dimple"+hm);

		System.out.println("After null"+hm);
		System.out.println("================");
		System.out.println("After adding duplicate null");
		System.out.println(hm);
		System.out.println("=======================================");


		Object phoneno=hm.get("sheela");
		System.out.println("Value"+phoneno);

		System.out.println("==================================================");

		Object phoneno1=hm.get("sheela");
		System.out.println("Value"+phoneno1);
		System.out.println("=============================================");

		Object value=hm.remove("sheela");
		System.out.println("Value"+value);

		System.out.println("After remove---->"+hm);


	}
}
