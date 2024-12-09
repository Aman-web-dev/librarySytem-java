package src.models;

public class Book {
    private String name;
    private String ISBN;
    private String author;
    private int quantity;

    public Book(String name, String ISBN, String author, Integer quantity) {
        this.name = name;
        this.ISBN = ISBN;
        this.author = author;
        this.quantity = quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

}
