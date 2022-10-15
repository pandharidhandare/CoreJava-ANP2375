package org.practicaltest.service;

import java.util.ArrayList;


import org.practicaltest.DAO.BookDAO;
import org.practicaltest.model.Book;

public class BookService {

	BookDAO bookDAO = new BookDAO();

	public void addSerBook(Book addBooks) {
		
		System.out.println("pass Book obj in DAO");
		bookDAO.addBookDAO(addBooks);
		
	}

	public static ArrayList<Book> displayAll() {
		// TODO Auto-generated method stub
		
		return BookDAO.displayAll();
		
	}
	public Book searchByTitle(String title) {
		return bookDAO.searchByTitle(title);
	}
	public Book searchByAuthor(String author) {
	 return	bookDAO.searchByTitle(author);
	}
	
}


