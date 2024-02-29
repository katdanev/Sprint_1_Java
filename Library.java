//Library.java

import java.util.ArrayList;

public class Library {

    protected ArrayList<Book> books; // List to store books in the library
    protected ArrayList<Author> authors; // List to store authors in the library
    protected ArrayList<Patron> patrons; // List to store patrons in the library

    // Constructor

    public Library() {
        this.books = new ArrayList<>();
        this.authors = new ArrayList<>();
        this.patrons = new ArrayList<>();
    }

    // Getters

    public ArrayList<Book> getBooks() {
        return books;
    }

    public ArrayList<Author> getAuthors() {
        return authors;
    }

    public ArrayList<Patron> getPatrons() {
        return patrons;
    }

    // Setters

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public void setAuthors(ArrayList<Author> authors) {
        this.authors = authors;
    }

    public void setPatrons(ArrayList<Patron> patrons) {
        this.patrons = patrons;
    }

    // Search book by title

    public Book searchBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }

    // Search book by author

    public ArrayList<Book> searchBookByAuthor(String author) {
        ArrayList<Book> booksByAuthor = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                booksByAuthor.add(book);
            }
        }
        return booksByAuthor;
    }

    // Search book by ISBN

    public Book searchBookByIsbn(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }

    // Borrow a book

    public void borrowBook(Patron patron, Book book) {
        if (book.getCopies() > 0) {
            book.borrowBook();
            patron.addBook(book);
        }
    }

    // Return a book

    public void returnBook(Patron patron, Book book) {
        book.returnBook();
        patron.removeBook(book);
    }
        
        //toString method
        
        public String toString() {
            return "Library: " + books + authors + patrons;
        }


        
}


    
   