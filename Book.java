
package librarysystemm;

public class Book {
   private String bookTitle;
    private String author;
    private int ISBN;
    boolean avS;

    public Book() {
        
    }

    public Book(String bookTitle, String author, int ISBN, boolean avS) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.ISBN = ISBN;
        this.avS = avS;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public boolean isAvS() {
        return avS;
    }

    public void setAvS(boolean avS) {
        this.avS = avS;
    }
    
    @Override
    public String toString() {
        return "Book{" + "bookTitle=" + bookTitle + ", author=" + author + ", ISBN=" + ISBN + ", avS=" + avS + '}';
    }  
}
