package com.ustglobal.beanobject.bean;

public class TestA {
	public static void main(String[] args) {
		Student s=new Student();
		s.setId(12);
		s.setName("sanjay");
		s.setRollNo(123);

		Database db=new Database();
		db.receive(s);
		Employee e =new Employee();
		e.setId(11);
		e.setName("ani");
		e.setSalary(12000);

		db.save(e);
	}
}
