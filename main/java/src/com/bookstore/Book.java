package com.bookstore;

public class Book {

    // declare private attributes for title, author, price, and quantity in stock.
    // private access modifier is used to make these attributes private. This means that they are only accessible
    // within the Book class itself.
    private String title;
    private String author;
    private double price;
    private int quantityInStock;


    //  Include a constructor to initialize these attributes
    public Book (String title, String author, double price, int quantityInStock){
        this.title = title;
        this.author = author;
        this.price = price;
        this.quantityInStock = quantityInStock;
    }

    // getters to access and modify these attributes
    public String getTitle ( ){
        return title;
    }
    public String getAuthor (){
        return author;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantityInStock() {
        return quantityInStock;
    }

    // setters to access and modify these attributes
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }


    // toString method to display the book information.
    @Override
    public String toString() {
        return "Book Information:\n\n" +
        "Title: " + title + "\n" +
        "Author: " + author + "\n" +
        "Price: $" + price + "\n" +
        "Quantity in Stock: " + quantityInStock + "\n" ;
        //"\n" is an escape sequence that represents a newline character. It is used to create a new line and \n\n for 2 lines
        // or line break in a string
    }


}
