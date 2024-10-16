package com.bptn.course._20_junit_books;

public class Book {
	
	//Declare instance variables
	  private String title;
	  private double price;

	  //Define a constructor
	  public Book(String title, double price) {
	    this.title = title;
	    this.price = price;
	  }
	   

	  //Define a getter method
	  public String getTitle() {
	    return title;
	  }

	  public String getBookInfo() {
	    return title + "-" + price;
	  }

}
