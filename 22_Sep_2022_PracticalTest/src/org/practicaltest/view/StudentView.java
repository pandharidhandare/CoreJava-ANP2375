package org.practicaltest.view;
import java.util.Scanner;
import org.practicaltest.model.Student;
import org.practicaltest.service.StudentService;

public class StudentView {

	static Scanner scanner=new Scanner(System.in);
	StudentService ser = new StudentService();
	public boolean addInfo() {
		System.out.println("Enter 10 Student Details"); 
		for(int i=0;i<2;i++) { 
		System.out.println("Add Student");
		System.out.println("Enter Student Details");
		System.out.println();
		System.out.println("Enter Student Id");
		int id=scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter Student Name");
		String name =scanner.nextLine();
		
		System.out.println(ser.addStudent(new Student(id,name)));
		}
		return true;
	}

	public void addView() {
		// TODO Auto-generated method stub
		ser.addSerDisplay();
		
	}



	
	
}