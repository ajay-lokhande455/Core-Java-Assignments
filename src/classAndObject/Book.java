package classAndObject;
import java.util.ArrayList;
//Write a Java program to create a class called "Book" with attributes for title, author, and ISBN, and methods
// to add and remove books from a collection.
public class Book {
    public String tittle;
    public String author;
    public String ISBN;
    private static ArrayList<Book> bookCollection = new ArrayList<Book>();

    public Book(String tittle, String author, String ISBN) {
        this.tittle = tittle;
        this.author = author;
        this.ISBN = ISBN;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
}
