package evaluation.q1;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private int isbn;
    private String bookName;
    private String author;

    public Book(){

    }

    public Book(int isbn, String bookName, String author) {
        this.isbn = isbn;
        this.bookName = bookName;
        this.author = author;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

class Library{
    public List<Book> addBook(Book book) throws BookException{
        int count=0;

        List<Book> bookList = new ArrayList<>();
        bookList.add(book);
       return bookList;
    }

    List viewAllBooks() throws BookException{
        Library l1 = new Library();
        return viewAllBooks();
    }

    List viewbooksBtAuthor(String author) throws BookException{
        return viewAllBooks();
    }
    Book getBookByISBN(int isbn)throws BookException{
        Book b1 = new Book();
        Book b = null;
        if(isbn==b1.getIsbn()){
            return b;

        }
        return b;
    }
}




class BookException extends Exception{
    BookException(String error){
        super(error);
    }
}
