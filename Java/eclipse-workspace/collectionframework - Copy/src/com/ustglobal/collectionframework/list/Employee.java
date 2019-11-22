package com.ustglobal.collectionframework.list;

public class Employee {
	int id;
	String name;
	long salary;
	public  Employee (int id, String name, long salary) {
		super();
		this.id = id;
		this.name = name;
		this. salary=  salary;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setPercentage(double salary) {
		this.salary = (long) salary;
	}
	
}


