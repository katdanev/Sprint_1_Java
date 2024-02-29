// Book.java

interface Borrowable {
    void borrowBook();
    void returnBook();
}    

public class Book implements Borrowable{

    private String title;
    private String author;
    private String  isbn;
    private String publisher;
    private int copies;

    // Constructor

    public Book(String title, String author, String isbn, String publisher, int copies) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publisher = publisher;
        this.copies = copies;
    }  
    
    // Getters

    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String getIsbn() {
        return isbn;
    }
    public String getPublisher() {
        return publisher;
    }
    public int getCopies() {
        return copies;
    }

    // Setters

    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    
    public void setCopies(int copies) {
        this.copies = copies;
    }

    
    // Borrow method

    public void borrowBook() {
        if (copies > 0) {
            copies--;
            System.out.println("Book borrowed successfully");
        } else {
            System.out.println("Book is not available today, try again later");
        }
    }

    // Return method

    public void returnBook() {
        copies++;
        System.out.println("Book returned successfully");
    }

    // toString method

    public String toString() {
        return "Title: " + title + "\nAuthor: " + author + "\nISBN: " + isbn + "\nPublisher: " + publisher  + "\nCopies: " + copies;
    }


};


