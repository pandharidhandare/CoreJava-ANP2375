package org.practicaltest.dao;


import java.util.TreeSet;

import org.practicaltest.model.Student;


public class StudentDAO {

	
	private	TreeSet<Student> treeSet=new TreeSet<>();
		
		public boolean addStudent(Student student) {
			// TODO Auto-generated method stub

			treeSet.add(student);
	
			return true;
		}
		public void printStudent() {

			System.out.println(treeSet);
		}
	
}