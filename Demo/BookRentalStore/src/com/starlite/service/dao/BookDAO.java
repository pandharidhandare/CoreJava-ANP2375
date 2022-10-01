package com.starlite.service.dao;

import com.starlite.model.Book;

public class BookDAO {
static Book bookArray[]=new Book[100];
public static boolean addBook(Book book) {
	boolean result=false;
	
	for(int i=0;i<bookArray.length;i++)
	{
		if(bookArray[i]==null) {
			bookArray[i]=book;
			result=true;
			break;
		}
	}
	
	return result;
}
public static Book[] displayBooks() {
	return bookArray;
}
}
