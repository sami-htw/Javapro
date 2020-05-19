package JunitDemo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class assertNotEqualsDemo {
    @Test
    public void assertNotEqualWithNoMessage() {
        LibraryService object = new LibraryService();
        Book firstBook = new Book("1", "Java von Kopf bis Füß", "Lars Schulten");
        Book secondBook = new Book("2", "Das Reichtum der Nationen", "Adam Smith");
        object.addBook(firstBook);
        object.addBook(secondBook);

        Book actulBook = object.getBookById("2");
        assertNotEquals("4",actulBook.getBookId());


    }


    @Test
    public void assertNotEqualWithMessage() {
        LibraryService object = new LibraryService();
        Book firstBook = new Book("1", "Java von Kopf bis Füß", "Lars Schulten");
        Book secondBook = new Book("2", "Das Reichtum der Nationen", "Adam Smith");
        object.addBook(firstBook);
        object.addBook(secondBook);

        Book actulBook = object.getBookById("1");
        assertNotEquals("Das Reichtum der Nationen",actulBook.getTitel(),"The actual value matches to the expected value !");
        assertNotEquals("2",actulBook.getBookId(),"The actual bookId is not equal to expected");

    }


    @Test
    public void assertNotEqualWithSupplierMessage() {
        LibraryService object = new LibraryService();
        Book firstBook = new Book("1", "Java von Kopf bis Füß", "Lars Schulten");
        Book secondBook = new Book("2", "Das Reichtum der Nationen", "Adam Smith");
        object.addBook(firstBook);
        object.addBook(secondBook);

        Book actulBook = object.getBookById("1");
        assertNotEquals("5",actulBook.getBookId(),()->"The actual value matches to the expected value !");


    }
}

