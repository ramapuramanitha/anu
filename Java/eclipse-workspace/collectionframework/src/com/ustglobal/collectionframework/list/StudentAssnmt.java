package com.ustglobal.collectionframework.list;

public class StudentAssnmt {
 int id;
 String name;
 String branch;
public StudentAssnmt(int id, String name, String branch) {
	super();
	this.id = id;
	this.name = name;
	this.branch = branch;
}
@Override
public String toString() {
	return "StudentAssnmt [id=" + id + ", name=" + name + ", branch=" + branch + "]";
}

}
