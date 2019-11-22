package com.ustglobal.singleton;

public class Singleton {

	private static Singleton instance =null;
	String s;


	private Singleton() {

	}
	public static Singleton getDbConnection() {

		if(instance == null) {
			instance =new Singleton();
			return instance;
		}else {
			return instance;
		}
	}
}
