package com.starlite.view;

import java.util.Scanner;

import com.starlite.model.Book;
import com.starlite.service.BookService;
public class BookView {
	static Scanner scanner=new Scanner(System.in);
public static boolean addBook() {
	System.out.println("Book add method");
	System.out.println("Enter a book id");
	int bookId=scanner.nextInt();
	scanner.nextLine();
	System.out.println("Enter a book name");
	String bookName=scanner.nextLine();
	System.out.println("Enter a author name");
	String authorName=scanner.nextLine();
	System.out.println("Enter a publisher name");
	String publisher=scanner.nextLine();
	System.out.println("Enter a book rental price");
	int rentalPrice=scanner.nextInt();
	scanner.nextLine();
	
	Book book=new Book(bookId,bookName,authorName,publisher,rentalPrice);
	BookService.addBook(book);
	return true;
}

	public static Book[] displayBooks() {
		return BookService.displayBooks();
	}
}

