package com;

import com.bookstore.Book;

public class Main {

  public static void main(String[] args) {

    Book myBook = new Book("Harry Potter", "J.K. Rowling", 39.99, 10);
    System.out.println(myBook.toString());

  }
}
