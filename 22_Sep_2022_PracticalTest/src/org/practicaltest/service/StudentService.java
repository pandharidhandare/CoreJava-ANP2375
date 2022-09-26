package org.practicaltest.service;



import org.practicaltest.model.Student;
import org.practicaltest.dao.StudentDAO;

public class StudentService {

	
	public boolean addStudent(Student student) {
	 StudentDAO studentDAO=new StudentDAO();
	 studentDAO.addStudent(student);
	 return true;
	 
	}
}