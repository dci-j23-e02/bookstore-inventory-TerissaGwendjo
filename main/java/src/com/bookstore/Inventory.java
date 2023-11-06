package com.bookstore;


public class Inventory {
    private Book[] books; //declare a private 1D array of Book objects.
    //private List<Book> books; is more flexible to be able to instantiate by either 'ArrayList' or 'LinkedList'
    private int currentIndex;  // represents the current number of books in the inventory.

    // Constructor to initialize the array and other variables
    public Inventory ( int size) {
        // initializes an array of Book objects called books. books is an instance variable of the Inventory class,
        // which was declared earlier in the class to hold an array of Book objects. The constructor initializes it.
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
                 //if (this.books.get(i) != null && this.books.get(i).getTitle().equals(title)){...}
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

    // Method to search for a book by title or author
   public Book searchBook (String title, String author) {
        for (int i=0; i<currentIndex; i++) {
            Book book = books[i];
            if (book != null && (book.getTitle().equals(title)) || book.getAuthor().equals(author)){
                return book; // Match found, return book
                //for(Book book:this.books)if(book.getTitle().toLowerCase().equals(title.toLowerCase()){return book;}
            }
        }
        return null; // no match found
   }

   // Method to calculate and display the total inventory value
    public double calculateTotalInventoryValue() {
        double totalValue = 0.0;
        for (int i=0; i<currentIndex; i++) {
            Book book = books[i];
            if (book != null) {
                totalValue += book.getPrice() * book.getQuantityInStock();
                // This line combines all the above elements. It calculates the total value of a book and adds it to
                // the cumulative total value of the inventory using the += operator. This way, the total value of each
                // book is summed up as the loop iterates through the inventory.
            }
        }
        return totalValue;
    }

}


//So, this.books.add(book); adds the book object to the books collection within the current class.
// The specific implementation and type of the collection can vary, but it's a common pattern for adding items to a collection in Java.

// more complicated approach for searchbook! Just here for future reference!
/* public Book searchBook(String searchString) {
        for (int i = 0; i < currentIndex; i++) {
            Book book = books[i];
            if (book != null && (book.getTitle().equalsIgnoreCase(searchString) || book.getAuthor().equalsIgnoreCase(searchString))) {
                return book; // Match found, return the book
            }*/

/*
Constructors and methods are both integral components of object-oriented programming in languages like Java. However,
they serve different purposes and have distinct characteristics. Here's a comparison of constructors and methods:

Constructors:

Purpose: Constructors are special methods used to initialize objects when they are created. They set the initial state
of an object and allocate any necessary resources.
Naming: Constructors have the same name as the class in which they are defined.
Return Type: Constructors have no return type. They do not return any value; their primary role is to perform setup tasks.
Invoked Automatically: Constructors are called automatically when you create an instance (object) of a class using
the new keyword. You don't call constructors explicitly.*/

/*Methods:

Purpose: Methods are functions or procedures defined within a class that perform specific tasks or operations.
They are used to encapsulate behavior and actions that objects can perform.
Naming: Methods have distinct names that describe the action they perform. The method names are chosen to reflect
the purpose of the operation.
Return Type: Methods have a return type that specifies the data type of the value they return. They can return values
or perform actions without returning anything.
Invoked Explicitly: Methods are called explicitly in your code. To execute a method, you use the method name, provide
any required arguments, and invoke it in your code.*/