package com.bookstore;


public class Inventory {
    private Book[] books; //declare a private 1D array of Book objects.
    private int currentIndex;  // represents the current number of books in the inventory.

    // Constructor to initialize the array and other variables
    public Inventory ( int size) {
        books = new Book[size];
        currentIndex = 0;
    }

    //Method to add a book object to the array
    public void addBook (Book book) {
        if (currentIndex < books.length) {
            books[currentIndex] = book;
            currentIndex++;
            System.out.println("Book added to the Inventory: " + book.getTitle());
        } else {
            System.out.println("Inventory is full. Cannot add more books");
        }
    }
    // Method to remove a Book object from the array based on the title
    public void removeBook (String title) { // It takes a String argument title, which represents the title of the book you want to remove from the inventory
        for (int i = 0; i < currentIndex; i++) {
            if (books[i] != null && books[i].getTitle().equals(title)) {
                books[i] = null;
                // Shift remaining books to fill the gab left
                for (int j=i; j<currentIndex-1; j++) {
                    books[j] = books[j+1]; // overwriting the book at index j with the book at index j + 1.
                    // This effectively moves the book from the next position in the array to the current position,
                    // shifting all remaining books one slot to the left
                    // The loop will continue as long as j is less than currentIndex - 1. currentIndex represents the
                    // current number of books in the inventory. The loop continues until one less than the current index to avoid going out of bounds.
                }
                books[currentIndex-1] = null;
                currentIndex--;
                System.out.println("Book removed from Inventory: " + title);
                return; // Exit the method after removing the book. This ensures that the method doesn't continue
                // checking the remaining elements in the array once the book has been removed.
            }
        }
        System.out.println("Book not found in Inventory: " + title);
    }

    // Method to display the current inventory
    public void displayInventory() {
        System.out.println("Current Inventory:");
        for(int i=0; i<currentIndex; i++) {
            if (books[i] != null) {
                System.out.println(books[i]);
            }
        }
    }


}
