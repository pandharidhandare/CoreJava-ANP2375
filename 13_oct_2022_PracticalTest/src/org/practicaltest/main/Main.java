package org.practicaltest.main;


import java.util.ArrayList;
import java.util.Scanner;

import org.practicaltest.model.Book;
import org.practicaltest.view.BOOKView;

public class Main {

public static void main(String[] args) {
	
    Book book = new Book();
	BOOKView bookObj = new BOOKView();
	bookObj.addBook();
	
 ArrayList<Book> PrintBook =BOOKView.dispalyAllBook();
	System.out.println(PrintBook);
	
	System.out.println("search by tittle type 1  or author then type 2 or enter 3 for Break");
	Scanner sc = new Scanner(System.in);
	int search= sc.nextInt();
	
	switch(search) {
	
	case 1: System.out.println("enter the title");
	sc.nextLine();
		String title= sc.nextLine();
	book = bookObj.searchByTitle(title);
	System.out.println(book); 
	break;
	
	case 2: System.out.println("enter the author");
	String author = sc.nextLine();
	   book = bookObj.searchByAuthor(author);
	case 3:  break;  
	}
	
}
}
