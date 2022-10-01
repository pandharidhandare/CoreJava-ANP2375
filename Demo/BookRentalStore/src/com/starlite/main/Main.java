package com.starlite.main;

import java.util.Scanner;

import com.starlite.model.Customer;
import com.starlite.view.CustomerView;


public class Main {
static Scanner scanner=new Scanner(System.in);
	
	static void displaySubMenu() {
		System.out.println("1. Add customer");
		System.out.println("2. Display All customer");
		System.out.println("Enter your choice");
		int subMenuChoice=scanner.nextInt();
		scanner.nextLine();
		switch(subMenuChoice) {
		case 1:
			if(CustomerView.addCust())
				System.out.println("costomer Added Sucessfully");
			break;
		case 2:
			Customer cust[]=CustomerView.displayCust;
			for(Customer local:cust) {
				if(local!=null)
				System.out.println(local);
				else
					break;
			}
			break;
			default: 
				System.out.println("Not a valid input");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int choice;
		do {
			
			System.out.println("1. Start Application");
			System.out.println("2. Stop Application");
			System.out.println("Enter your choice");
			choice=scanner.nextInt();
			scanner.nextLine();
			switch(choice) {
			case 1:
				displaySubMenu();
				break;
			case 2:
				System.exit(0);
				break;
				default:
					System.out.println("Not a valid input");
			}
		}while(true);
	}



}

