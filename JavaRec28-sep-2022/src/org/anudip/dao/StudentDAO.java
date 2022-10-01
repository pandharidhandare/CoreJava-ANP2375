package org.anudip.dao;

import java.util.HashSet;

import org.anudip.model.Student;

public class StudentDAO {

	
private	static HashSet<Student> hmStud =new HashSet<>();

public void addStudet(Student student) {
	hmStud.add(student);
}
	public HashSet<Student> getStudents() {
		return hmStud;
	}
	
}
