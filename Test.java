//Test.java

import java.util.ArrayList;

public class Test {
    
    public static void main(String[] args) {

        // Create 3 array lists to store the books, authors, and patrons

        ArrayList<Book> books = new ArrayList<Book>();
        ArrayList<Author> authors = new ArrayList<Author>();
        ArrayList<Patron> patrons = new ArrayList<Patron>();

        // Create 5 authors
        Author author1 = new Author("Andrey Kurkov", "21/04/1961");
        Author author2 = new Author("Ivan Kotlyarevsky", "15/09/1769");
        Author author3 = new Author("Andriy Liubka", "12/12/1980");
        Author author4 = new Author("Taras Shevchenko", "04/03/1814");
        Author author5 = new Author("Lesya Ukrainka", "19/02/1871");

        // Add the authors to the Author array list

        authors.add(author1);
        authors.add(author2);
        authors.add(author3);
        authors.add(author4);
        authors.add(author5);

        // Create 15 books
        Book book1 = new Book("Pride", "Andrey Kurkov", "200", "Ababagalamaga", 2);
        Book book2 = new Book("Price", "Andrey Kurkov", "201", "Ababa", 14);
        Book book3 = new Book("Praha", "Andrey Kurkov", "202", "Maga", 8);

        Book book4 = new Book("Eneida", "Ivan Kotlyarevsky", "300", "Maga", 3);
        Book book5 = new Book("Natalka Poltavka", "Ivan Kotlyarevsky", "301", "Mego", 6);
        Book book6 = new Book("Moskal", "Ivan Kotlyarevsky", "302", "Lev", 10);


        Book book7 = new Book("Karbid", "Andriy Liubka", "400", "Lev", 12);
        Book book8 = new Book("Kiler", "Andriy Liubka", "401", "Deva", 4);
        Book book9 = new Book("Chio-Chio", "Andriy Liubka", "402", "Kassel", 1);


        Book book10 = new Book("Kobzar", "Taras Shevchenko", "500", "Old Town", 5);
        Book book11 = new Book("Kateryna", "Taras Shevchenko", "501", "Old City",7);
        Book book12 = new Book("Dream", "Taras Shevchenko", "502", "Downtown", 9);


        Book book13 = new Book("Contra Spem Spero", "Lesya Ukrainka", "600", "Odesa", 1);
        Book book14 = new Book("Zbirka", "Lesya Ukrainka", "601", "Chernivtsi", 5);
        Book book15 = new Book("Lisova Pisnya", "Lesya Ukrainka", "602", "Krym", 7);


       
        // Add the books to the Book array list

        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        books.add(book6);
        books.add(book7);
        books.add(book8);
        books.add(book9);
        books.add(book10);
        books.add(book11);
        books.add(book12);
        books.add(book13);
        books.add(book14);
        books.add(book15);


      // Create 5 patrons

        Patron patron1 = new Patron("Kate Mill", "123 Main St", "123-456-7890");
        Patron patron2 = new Patron ("Mike Green", "456 Main St", "123-456-5490");
        Patron patron3 = new Patron ("John  Cave", "789 Main St", "123-456-7812");
        Patron patron4 = new Patron ("Olha Gor", "101 Main St", "123-456-7833");
        Patron patron5 = new Patron ("Maria Balab", "202 Main St", "123-456-7220");


        // Add the patrons to the Patron array list

        patrons.add(patron1);
        patrons.add(patron2);
        patrons.add(patron3);
        patrons.add(patron4);
        patrons.add(patron5);

        // Add books to the list of books written by the authors

        author1.addBook(book1);
        author1.addBook(book2);
        author1.addBook(book3);

        author2.addBook(book4);
        author2.addBook(book5);
        author2.addBook(book6);

        author3.addBook(book7);
        author3.addBook(book8);
        author3.addBook(book9);

        author4.addBook(book10);
        author4.addBook(book11);
        author4.addBook(book12);

        author5.addBook(book13);
        author5.addBook(book14);
        author5.addBook(book15);

        // Add books to the list of books borrowed by the patrons

        patron1.addBook(book1);
        patron1.addBook(book2);
        patron1.addBook(book3);

        patron2.addBook(book4);
        patron2.addBook(book5);
        patron2.addBook(book6);

        patron3.addBook(book7);
        patron3.addBook(book8);
        patron3.addBook(book9);

        patron4.addBook(book10);
        patron4.addBook(book11);
        patron4.addBook(book12);

        patron5.addBook(book13);
        patron5.addBook(book14);
        patron5.addBook(book15);

        // Create a library

        Library library = new Library();

        // Add the books, authors, and patrons to the library

        library.setBooks(books);
        library.setAuthors(authors);
        library.setPatrons(patrons);

        // Search for a book by title
       
        System.out.println(library.searchBookByTitle("Pride").toString()); 
        System.out.println();
        // Search for a book by author
         System.out.println(library.searchBookByAuthor("Lesya Ukrainka").toString()); 
         System.out.println();

        // Search for a book by ISBN
         System.out.println(library.searchBookByIsbn("501").toString()); 
         System.out.println();

        // Borrow a book
        library.borrowBook(patron1, book1);
        System.out.println(book1.getCopies()); // 1
        System.out.println();

        // Return a book
        library.returnBook(patron1, book1);
        System.out.println(book1.getCopies()); // 2
        System.out.println();


        //Author class testing

        System.out.println();
        System.out.println("Author class testing:");
        System.out.println();
        System.out.println(author1.getName()); // Andrey Kurkov
        System.out.println(author1.getDOB()); // 21/04/1961
        System.out.println(author1.getBooksWritten().toString()); // [Title: Pride, Title: Price, Title: Praha]
        System.out.println();

        author1.setName("Andriy Liubka");
        author1.setDOB("12/12/1980");
        author1.setBooksWritten(books);
        System.out.println(author1.toString()); // Author Andriy Liubka, DOB 12/12/1980

        author1.addBook(book10);
        System.out.println(author4.getBooksWritten().toString()); // Title: Kobzar, Author: Taras Shevchenko, ISBN: 500, Publisher: Old Town, Copies: 5

        author1.removeBook(book1);
        System.out.println(author1.getBooksWritten().toString()); // [Title: Price, Title: Praha, Title: Pride]

        // Book class testing

        System.out.println();
        System.out.println("Book class testing:");
        System.out.println();
        System.out.println(book1.getTitle()); // Pride
        System.out.println(book1.getAuthor()); // Andrey Kurkov
        System.out.println(book1.getIsbn()); // 200
        System.out.println(book1.getPublisher()); // Ababagalamaga
        System.out.println(book1.getCopies()); // 2

        book1.setTitle("Pride");
        book1.setAuthor("Andrey Kurkov");
        book1.setIsbn("200");
        book1.setPublisher("Ababagalamaga");
        book1.setCopies(2);
        System.out.println(book1.toString()); // Title: Pride, Author: Andrey Kurkov, ISBN: 200, Publisher: Ababagalamaga, Copies: 2

        book1.borrowBook();
        System.out.println(book1.getCopies()); // 1

        book1.returnBook();
        System.out.println(book1.getCopies()); // 2

        //Patron class testing

        System.out.println();
        System.out.println("Patron class testing:");
        System.out.println();
        System.out.println(patron1.getName()); // Kate Mill
        System.out.println(patron1.getAddress()); // 123 Main St
        System.out.println(patron1.getPhoneNumber()); // 123-456-7890
        System.out.println(patron1.getBooksBorrowed().toString()); // Title: Pride, Title: Price, Title: Praha]

        patron1.setName("Kate Mill");
        patron1.setAddress("123 Main St");
        patron1.setPhoneNumber("123-456-7890");
        patron1.setBooksBorrowed(books);
        System.out.println(patron1.toString()); // Patron: Kate Mill, 123 Main St, 123-456-7890

        patron1.addBook(book1);
        System.out.println(patron1.getBooksBorrowed().toString()); // [Title: Pride, Title: Price, Title: Praha, Title: Pride]

        patron1.removeBook(book1);
        System.out.println(patron1.getBooksBorrowed().toString()); // [Title: Price, Title: Praha, Title: Pride]

        //Library class testing
        
        System.out.println();
        System.out.println("Library class testing:");
        System.out.println();
        System.out.println(library.getBooks().toString()); // [Title: Pride, Title: Price, Title: Praha, Title: Eneida, Title: Natalka Poltavka, Title: Moskal, Title: Karbid, Title: Kiler, Title: Chio-Chio, Title: Kobzar, Title: Kateryna, Title: Dream, Title: Contra Spem Spero, Title: Zbirka, Title: Lisova Pisnya]
        System.out.println(library.getAuthors().toString()); // [Author Andrey Kurkov, DOB 21/04/1961, Author Ivan Kotlyarevsky, DOB 15/09/1769, Author Andriy Liubka, DOB 12/12/1980, Author Taras Shevchenko, DOB 04/03/1814, Author Lesya Ukrainka, DOB 19/02/1871]
        System.out.println(library.getPatrons().toString()); // [Patron: Kate Mill, 123 Main St, 123-456-7890, Patron: Mike Green, 456 Main St, 123-456-5490, Patron: John  Cave, 789 Main St, 123-456-7812, Patron: Olha Gor, 101 Main St, 123-456-7833, Patron: Maria Balab, 202 Main St, 123-456-7220]

        library.setBooks(books);
        library.setAuthors(authors);
        library.setPatrons(patrons);

        library.borrowBook(patron1, book1);
        System.out.println(book1.getCopies()); // 1

        library.returnBook(patron1, book1);
        System.out.println(book1.getCopies()); // 2





    }
}
