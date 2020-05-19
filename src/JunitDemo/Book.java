package JunitDemo;

public class Book {
    private String bookId;
    private String titel;
    private String publisher;


    public Book(String bookId, String titel, String publisher) {
        this.bookId = bookId;
        this.titel = titel;
        this.publisher = publisher;
    }

    public String getBookId() {
        return bookId;
    }

    public String getTitel() {
        return titel;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
