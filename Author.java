//Author.java

import java.util.ArrayList;
import java.util.List;

public class Author{
    private String name;
    private String DOB;
    private List<Book> booksWritten;
  
    // Constructors

    public Author(String name, String DOB) {
        this.name = name;
        this.DOB = DOB;
        this.booksWritten = new ArrayList<Book>();
    }

// Getters

    public String getName() {
        return name;
    }

    public String getDOB() {
        return DOB;
    }

    public List<Book> getBooksWritten() {
        return booksWritten;
    }

    // Setter Methods

    public void setName(String name) {
        this.name = name;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public void setBooksWritten(List<Book> booksWritten) {
        this.booksWritten = booksWritten;
    }


  
    // Add book method
    public void addBook(Book book) {
        this.booksWritten.add(book);
    }

    // Remove book method

    public void removeBook(Book book) {
        this.booksWritten.remove(book);
    }


   
    // toString method
    
public String toString() {
    return "Author " + name + ", DOB " + DOB;
}


}