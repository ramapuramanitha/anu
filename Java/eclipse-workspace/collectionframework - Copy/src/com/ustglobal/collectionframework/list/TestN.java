package com.ustglobal.collectionframework.list;

import java.util.ArrayList;

public class TestN {
	public static void main(String[] args) {

		ArrayList<Object> li=new ArrayList<Object>();
		li.add("ankitha");
		li.add("anjali");
		li.add("anjitha");
		li.add("arpitha");

		System.out.println("=============Using For Loop=======");
		for(int i=0;i<li.size();i++) {

			Object o=li.get(i);
			System.out.println(o);
		}


		System.out.println("=======Using for each Loop==============");
		for(Object n:li) {
			System.out.println(n);
		}


		ArrayList<String> al=new ArrayList<String>();
		al.add("ankitha");
		al.add("anjali");
		al.add("anjitha");
		al.add("arpitha");

		System.out.println("=============Using For Loop=======");
		for(int i=0;i<al.size();i++) {
			String s=al.get(i);
			System.out.println(s);
		}


		System.out.println("=======Using for each Loop==============");
		for(String n:al) {
			System.out.println(n);
		}
	}
}
