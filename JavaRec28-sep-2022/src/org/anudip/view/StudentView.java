package org.anudip.view;

import java.util.Scanner;

import org.anudip.exception.StudentValidationException;
import org.anudip.model.Gender;

import org.anudip.service.StudentService;
public class StudentView {
	
     StudentService student = new  StudentService();
     int countId = 1;
	Scanner sc = new Scanner(System.in);
	private boolean result;
	
	    private boolean validateGender(String gender) {
		boolean result = false;
		System.out.println(gender);
		for(Gender localG : Gender.values()) {
	    System.out.println(localG);
		if(gender.toUpperCase().equals(localG.toString())) {
	    System.out.println("true block");
		result = true;
			break;
		}
		}
		return result;
		}
			
	public boolean addStudentDetail() {
		result = false;
		System.out.println("Enter Student Detail ");
		System.out.println("Enter Student Name ");
	String sname = sc.nextLine();
		System.out.println("  ENTER THE GENDER  ");
		String gender =sc.nextLine();
		if(!validateGender(gender)) 
			throw new StudentValidationException("give the aprroprite gender");
	else 
			return true;
	
	}	

	
}
