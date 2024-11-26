package com.xworkz.Exception;

public class BookRunner {
	    public static void main(String[] args) {

	        String myString = null;
	        if (myString != null) {
	            System.out.println("String is not null");
	        } else {
	            System.out.println("String is null");
	        }

	        
	        ScieneceBook scienceBook = new ScieneceBook();
	        Object obj = scienceBook;

	        
	        if (obj instanceof ScieneceBook) {
	        	ScieneceBook sciBook = (ScieneceBook) obj;
	            sciBook.read();
	        } else {
	            System.out.println("Downcasting not possible.");
	        }

	       
	        if (obj instanceof Book) {
	            Book book = (Book) obj; 
	            book.read();
	        } else {
	            System.out.println("Downcasting not possible.");
	        }
	    }

}
