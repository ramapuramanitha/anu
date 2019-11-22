package com.ustglobal.map;

import java.util.Hashtable;

public class TestH {
public static void main(String[] args) {
	
	Hashtable<Integer , String> ht=new Hashtable<Integer,String>();
	ht.put(101,"ani");
	ht.put(104,"suji");
	ht.put(103,"bnkit");
	ht.put(100,"cidha");
	ht.put(501,"ani");
	ht.put(401,"anu");
	ht.put(301,"ankit");
	// ht.put(null,"tini");  Null Pointer Exception
	//ht.put(106,null); Null Pointer Exception
	System.out.println("Dta "+ht);
}
}
