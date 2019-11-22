package com.ustglobal.collectionframework.list;



public class EmployeeAssnmt {
	int id;
	String name;
	long salary;
	String role;
	String state;
	public EmployeeAssnmt(int id, String name, long salary, String role, String state) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.role = role;
		this.state = state;
	}

	@Override
	public String toString() {
		return "EmployeeAssnmt [id=" + id + ", name=" + name + ", salary=" + salary + ", role=" + role + ", state="
				+ state + "]";
	}


}
