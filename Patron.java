//Patron.java

import java.util.ArrayList;
import java.util.List;

public class Patron {
    private String name;
    private String address;
    private String phoneNumber;    
    private List<Book> booksBorrowed;

    // Constructors

    public Patron(String name, String address, String phoneNumber) {
    this.name = name;
    this.address = address;
    this.phoneNumber = phoneNumber;
    this.booksBorrowed = new ArrayList<Book>();
    }


    // Getters
   
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public List<Book> getBooksBorrowed() { // Get the list of books borrowed by the patron
        return booksBorrowed;
    }



    // Setter Methods
    
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setBooksBorrowed(List<Book> booksBorrowed) {    // Set the list of books borrowed by the patron
        this.booksBorrowed = booksBorrowed;
    }

  
    // Other Methods

// Add a book to the list of books borrowed by the patron

   public void addBook(Book book) { 
        this.booksBorrowed.add(book);
    }

 // Remove a book from the list of books borrowed by the patron

    public void removeBook(Book book) {
        this.booksBorrowed.remove(book);
    }


    // toString method

    public String toString() {  return "Patron: " + "\nName: " + name +"\nAddress: " + address +  "\nPhone Number: " + phoneNumber + "\nBooks Borrowed: " + booksBorrowed;
    }
    

    
    
}
