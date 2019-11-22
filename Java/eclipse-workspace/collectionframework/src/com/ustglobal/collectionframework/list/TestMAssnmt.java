package com.ustglobal.collectionframework.list;

import java.util.ArrayList;

public class TestMAssnmt {

	public static void main(String arg)
	{
	Employee e1=new Employee(100,"ani",5000);
	Employee e2=new Employee(102,"uma",6000);
	Employee e3=new Employee(103,"yashu",8000);
	Employee e4=new Employee(104,"mahi",9000);
	ArrayList<Employee> lst=new ArrayList<Employee>();
	lst.add(e1);
	lst.add(e2);
	lst.add(e3);
	lst.add(e4);
	System.out.println("");
	for(int i=0;i<=lst.size();i++)
	{
	Employee emp=lst.get(i);
	System.out.println(emp);
	}
	for(Employee emp :lst) 
	{
	System.out.println(emp);	
	}
	}
}
