package com.tts;

import java.util.*;

public class Library {

// VARIABLES
	private String address;
	private ArrayList<Book> inventory;
	private String openingHours;

// GETTERS AND SETTERS
	public String getOpeningHours() {
		return openingHours;
	}

	public void setOpeningHours() {
		this.openingHours = "9am to 5pm";
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public ArrayList<Book> getInventory() {
		return inventory;
	}

	public void setInventory() {
		this.inventory = new ArrayList<Book>();
	}

// Constructor
	public Library(String address) {
		setAddress(address);
		setOpeningHours();
		setInventory();
		this.address = getAddress();
		this.openingHours = getOpeningHours();
		this.inventory = getInventory();

	}

//	METHODS
	public void addBook(Book newBook) {
		this.inventory.add(newBook);

	}

	public String printOpeningHours() {
		return "Libraries are open daily from" + " " + this.openingHours;
	}

	public String printAddress() {
		return this.address;
	}

	public String borrowBook(String bookTitle) {
		String phrase = "";
		for (Book book : this.getInventory()) {
			if (bookTitle.equals(book.getTitle())) {
				if (book.isBorrowed() == false) {
					book.borrowed();
					phrase = "You successfully borrowed The Lord of the Rings";
				} else {
					phrase = "Sorry, this book is already borrowed.";
				}

			} else {
				phrase = "Sorry, this book is not in our catalog.";
			}

		}

		return phrase;
	}

	public void printAvailableBooks() {
		if (this.getInventory().isEmpty()) {
			System.out.println("No books in this catalog");
		}

		for (Book book : this.getInventory()) {
			System.out.println(book.getTitle());
		}

	}

	public String returnBook(String title) {
		for (Book book : this.inventory) {
			if (title.equals(book.getTitle())) {
				book.returned();
				break;
			}
		}

		return "You have successfully returned" + " " + title;

	}

	@Override
	public String toString() {
		return "Library [address=" + address + ", inventory=" + inventory + "]";
	}

}
