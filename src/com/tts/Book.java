package com.tts;

public class Book {

    private String title;
    private boolean borrowed;
	

    public void setTitle(String title) {
		this.title = title;
	}

	public void setBorrowed(boolean borrowed) {
		this.borrowed = borrowed;
	}

	// Creates a new Book
    public Book(String bookTitle) {
        // Implement this method
    	setTitle(bookTitle);
    	this.title = getTitle();
    	
    }
   
    // Marks the book as rented
    public void borrowed() {
        // Implement this method
    	this.borrowed = true;
    }
   
    // Marks the book as not rented
    public void returned() {
        // Implement this method
    	this.borrowed = false;
    	
    }
   
    // Returns true if the book is rented, false otherwise
    public boolean isBorrowed() {
        // Implement this method
    	
    	return this.borrowed;
    }
   
    // Returns the title of the book
    public String getTitle() {
        // Implement this method
    	return this.title;
    }

	@Override
	public String toString() {
		return "Book [title=" + title + ", borrowed=" + borrowed + "]";
	}
    
    

} 
