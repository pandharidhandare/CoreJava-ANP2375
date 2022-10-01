package org.anudip.service;

import org.anudip.dao.StudentDAO;
import org.anudip.model.Student;

public class StudentService {
	StudentDAO studDAO = new StudentDAO();
 public boolean addStudentService(Student student) {
	 studDAO.addStudet(student);
	 
	 return true;
 }
	public boolean getStudent(){
		
		studDAO.getStudents();
		
		return true;
	}

}
