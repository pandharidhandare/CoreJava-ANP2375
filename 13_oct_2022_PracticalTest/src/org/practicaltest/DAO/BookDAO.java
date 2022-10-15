package org.practicaltest.DAO;




import java.util.ArrayList;
import java.util.Iterator;

import org.practicaltest.model.Book;

public class BookDAO {
   
  Book book  = new Book();
 static ArrayList<Book> list = new ArrayList<>();



	public void addBookDAO(Book addBooks) {
		// TODO Auto-generated method stub
		list.add(addBooks);
    	System.out.println(list);
	
	}


	public static ArrayList<Book> displayAll() {
		return list;
	
	}
	public Book searchByTitle(String title) {
		  for(Book bookLocal :list) {
			  if(bookLocal.getTitle().equals(title)) {
				book = bookLocal;
			  }
			 
		   }
		  return book;
	
	}
	public Book searchByAuthor(String author) {
		 for (Book bookLocal :list) {
			 if(bookLocal.getAuthor().equals(author)){
				book = bookLocal;
			 }
		 }
		return book;
	}
}
	

