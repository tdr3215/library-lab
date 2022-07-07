package com.tts;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hello World");
		Book example = new Book("The Da Vinci Code");
		System.out.println("Title (should be The Da Vinci Code): " + example.getTitle());
		System.out.println("Borrowed? (should be false): " + example.isBorrowed());
		example.borrowed();
		System.out.println("Borrowed? (should be true): " + example.isBorrowed());
		example.returned();
		System.out.println("Borrowed? (should be false): " + example.isBorrowed());

		// Create two libraries
		Library firstLibrary = new Library("10 Main St.");
		Library secondLibrary = new Library("228 Liberty St.");
//		System.out.println(firstLibrary);

		// Add four books to the first library
		firstLibrary.addBook(new Book("The Da Vinci Code"));
		firstLibrary.addBook(new Book("Le Petit Prince"));
		secondLibrary.addBook(new Book("A Tale of Two Cities"));
		firstLibrary.addBook(new Book("The Lord of the Rings"));
//
//		System.out.println(firstLibrary);
//
//		// Print opening hours and the addresses
//		System.out.println("Library hours:");
//		System.out.println(firstLibrary.printOpeningHours());
//
//		System.out.println("Library addresses:");
//		System.out.println(firstLibrary.printAddress());
//		System.out.println(secondLibrary.printAddress());

		// Try to borrow The Lords of the Rings from both libraries
		System.out.println("Borrowing The Lord of the Rings:");
//		  System.out.println(firstLibrary.borrowBook("The Lord of the Rings"));
		System.out.println(firstLibrary.borrowBook("The Lord of the Rings"));
//		 System.out.println(secondLibrary.borrowBook("The Lord of the Rings"));
//		  secondLibrary.borrowBook("The Lord of the Rings");

		// Print the titles of all available books from both libraries

		System.out.println("Books available in the first library:");
		firstLibrary.printAvailableBooks();
		System.out.println("Books available in the second library:");
		secondLibrary.printAvailableBooks();

		// Return The Lords of the Rings to the first library
		System.out.println("Returning The Lord of the Rings:");
		System.out.println(firstLibrary.returnBook("The Lord of the Rings"));

		// Print the titles of available from the first library
		System.out.println("Books available in the first library:");
		firstLibrary.printAvailableBooks();
	}

}
