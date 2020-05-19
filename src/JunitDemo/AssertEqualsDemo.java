package JunitDemo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AssertEqualsDemo {
    @Test
    public void assertEqualsWithNoMessage() {
        LibraryService object = new LibraryService();
        Book firstBook = new Book("1", "Java von Kopf bis Füß", "Lars Schulten");
        Book secondBook = new Book("2", "Das Reichtum der Nationen", "Adam Smith");
        object.addBook(firstBook);
        object.addBook(secondBook);

        Book actulBook = object.getBookById("2");
        assertEquals("2",actulBook.getBookId());


    }


    @Test
    public void assertEqualsWithMessage() {
        LibraryService object = new LibraryService();
        Book firstBook = new Book("1", "Java von Kopf bis Füß", "Lars Schulten");
        Book secondBook = new Book("2", "Das Reichtum der Nationen", "Adam Smith");
        object.addBook(firstBook);
        object.addBook(secondBook);

        Book actulBook = object.getBookById("1");
        assertEquals("Java von Kopf bis Füß",actulBook.getTitel(),"titel is not match");


    }


    @Test
    public void assertEqualsWithSupplierMessage() {
        LibraryService object = new LibraryService();
        Book firstBook = new Book("1", "Java von Kopf bis Füß", "Lars Schulten");
        Book secondBook = new Book("2", "Das Reichtum der Nationen", "Adam Smith");
        object.addBook(firstBook);
        object.addBook(secondBook);

        Book actulBook = object.getBookById("1");
       assertEquals("1",actulBook.getBookId());
       assertEquals("Lars Schulten",actulBook.getPublisher(),()->"Publisher is not match");


    }
}
