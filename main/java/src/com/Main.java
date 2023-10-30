package com;

import com.bookstore.Book;
import com.bookstore.Inventory;
import org.w3c.dom.ls.LSOutput;

public class Main {

  public static void main(String[] args) {

    /*Book myBook = new Book("Harry Potter", "J.K. Rowling", 39.99, 10);
    System.out.println(myBook.toString());*/

    // Create an instance of the Inventory class with a capacity of 4 books
    Inventory myInventory = new Inventory(4);

    // Add some books to the inventory and the size must be 4 books in total
    myInventory.addBook(new Book("Harry Potter", "J. K. Rowling", 39.99 ,10));
    myInventory.addBook(new Book("The Hobbit", "J.R.R. Tolkien", 20.99 , 8));
    myInventory.addBook(new Book("Limbe To Lagos", "Emmanuel Iduma", 10.99 , 5));
    myInventory.addBook(new Book("The Latte Factor", "David Bach", 30.99 , 20));

    // inventory after current inventory
    System.out.println("Inventory after adding books:");
    myInventory.displayInventory();

    // Remove a book from the inventory
    myInventory.removeBook("The Hobbit");

    // Display the inventory again
    System.out.println("Inventory after removing a book:");
    myInventory.displayInventory();

    // Search for a book by title or author
    Book foundBook = myInventory.searchBook("Limbe", "Emmanuel Iduma");
    if (foundBook != null) {
      System.out.println("Book found: " + foundBook.toString());
    } else {
      System.out.println("Book not found.");
    }

    double totalValue = myInventory.calculateTotalInventoryValue();
    System.out.println("Total Inventory value:\n$" + totalValue);
  }

}
