package org.practicaltest.view;

import org.practicaltest.service.BookService;

import java.util.ArrayList;
import java.util.Scanner;


import org.practicaltest.model.Book;
public class BOOKView {
	BookService bookSer = new BookService();
	
Book book = new Book();

	Scanner sc = new Scanner(System.in);
	int addOtherBook = 0;
	
	public void addBook() {
		
		do
		{

		System.out.println("enter  the BookId start with B and lenght is 4");
		String bookId = sc.nextLine();
		String startWithB = "B";
		if(!(startWithB.equals(bookId.charAt(0)) )&&!(4==bookId.length()))
		System.out.println("invalid");
	
		System.out.println("Enter the book title");
		String title = sc.nextLine();
		System.out.println("enter the author name");
		String author = sc.nextLine();
		System.out.println("enter the category like as SCIENCE, FICTION ,TECHNOLOGY,OTHERS");
	   String category= sc.nextLine();
	   category = category.toUpperCase();
	   BookCategory cheakCategory= BookCategory.valueOf(category);


//         sc.next();
	   System.out.println("enter the price");
		float  price= sc.nextFloat();
		if(price<0){
		System.out.println("invalide price");
		}
		
		
		System.out.println("after price");
		
		Book addBooks= new Book(bookId, title, author, category, price);
	     System.out.println("addBOokview");
//		BookService bookSer = new BookService();
		
		bookSer.addSerBook(addBooks);
		System.out.println("add bok then enter 1");
		addOtherBook = sc.nextInt();
		sc.nextLine();
		
	
//		public Book searchByAuthor() {
//		 return	BookService.searchByTitle(String author);
//		}
		
	}while(addOtherBook>0);
	
	
		
   }


	public static ArrayList<Book> dispalyAllBook() {
		// TODO Auto-generated method stub
		return BookService.displayAll();
	
	}
	public Book searchByTitle(String title) {
		return bookSer.searchByTitle( title);
	}
	public Book searchByAuthor(String author) {
	 return	bookSer.searchByTitle( author);
	}

    }




