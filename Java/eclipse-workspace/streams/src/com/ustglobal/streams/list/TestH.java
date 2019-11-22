package com.ustglobal.streams.list;

import java.util.ArrayList;

public class TestH {
public static void main(String[] args) {
	
	ArrayList<Student> al=new ArrayList<Student>();
	al.add(new Student(5,"vikram",56.7));
	al.add(new Student(3,"aniikram",66.7));
	al.add(new Student(2,"cikram",46.7));
	al.add(new Student(6,"dhinnu",86.7));
	al.add(new Student(9,"trikram",26.7));
	
	Helper h=new Helper();
	//h.displayAllStudent(al);
	//h.displayFailedStudents(al);
	//h.displaPassedStudents(al);
	h.TopperOfClass(al);
}
}
