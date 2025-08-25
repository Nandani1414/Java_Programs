
import java.util.Scanner;
class Book {
    
	
    static int totalNoOfBooks; 
    String author ;
    String title;
    String isbn;
    
    boolean isBorrowed;
    // static blocks runs only once
    static {
        totalNoOfBooks = 0;
    }
    {
        totalNoOfBooks++;
    }
    
    Book( String isbn , String title, String author)
    {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        // increment book count
    }
    
    Book(String isbn ) {
        this(isbn, "unknown", "unknown");
    }
    
    static int getTotalNoOfBooks()
    {
        return totalNoOfBooks;
    }
    
    void borrowBook()
    {
        if(isBorrowed)
        {
            System.out.println("Book \""+title +"\"is already borrowed:");
        }
        else {
           this.isBorrowed  = true;
           System.out.println("enjoy  reading\""+ title + "\"!");
        }
       
    }
    // method to return the book
    void returnBook()
    {
        if(isBorrowed)
        {
          isBorrowed = false;
            System.out.println(" Hope you enjoyed \"" + title + "\", please leave a review.");
        }
        else {
            
          System.out.println(" The book \"" + title + "\" is already in the library.");
        }
    }
    
    // main method to test the class
    public static void main(String[] args)
    {
        Book designBook = new Book("1" , "Design","Author");
        Book myBook = new Book("2");
       System.out.println(" Total number of books: " + Book.getTotalNoOfBooks());
        designBook.borrowBook();
        myBook.borrowBook();
     designBook.borrowBook(); // already borrowed
      designBook.returnBook();
        designBook.returnBook(); // already returned
    }
    
	
	
  
	
}