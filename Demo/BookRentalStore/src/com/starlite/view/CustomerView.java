package com.starlite.view;
import  com.starlite.model.Customer;
import com.starlite.service.CustomerService;
import com.starlite.service.dao.CustomerAdo2;

import java.util.Scanner;



public class CustomerView {
	
	static Scanner sc = new Scanner(System.in);
	@SuppressWarnings("resource")
	public static boolean addCust() {

	

	
System.out.println("enter customer name");
	String cusname =sc.nextLine();
	System.out.println("enter cust ID");
	String cusID =sc.nextLine();
	System.out.println("enter moblie no ");
     String mob = sc.nextLine();
	System.out.println("bookcharges");
	int bookCharges =sc.nextInt();
	sc.nextLine();
	System.out.println("bookname");
	String bookName =sc.nextLine();
	
	Customer cust = new Customer(cusname, cusID,mob,bookCharges,bookName);
	CustomerService.addcust(cust);
	return true;
	
	}
	public static CustomerAdo2 displayCust() {
		return CustomerService.displayCustInfo();
	
	}
		
}
		
		
		
		
		