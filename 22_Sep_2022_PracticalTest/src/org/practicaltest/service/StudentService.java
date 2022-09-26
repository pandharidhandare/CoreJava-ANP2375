package org.practicaltest.service;



import org.practicaltest.model.Student;
import org.practicaltest.dao.StudentDAO;

public class StudentService {

	StudentDAO studentDAO=new StudentDAO();
	public boolean addStudent(Student student) {
	 
	 studentDAO.addStudent(student);
	 return true;
	 
	}

	public void addSerDisplay() {
		// TODO Auto-generated method stub
		studentDAO.printStudent();
			
		
	}

	
}