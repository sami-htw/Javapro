package JunitDemo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

public class AssertNotNullDemo {
    @Test
    public void assertNotNullWithNoMessage() {
        LibraryService object = new LibraryService();
        Book firstBook = new Book("1", "Java von Kopf bis Füß", "Lars Schulten");
        Book secondBook = new Book("2", "Das Reichtum der Nationen", "Adam Smith");
        object.addBook(firstBook);
        object.addBook(secondBook);

        Book actulBook = object.getBookById("2");
        assertNotNull(actulBook);


    }


    @Test
    public void assertNotNullWithMessage() {
        LibraryService object = new LibraryService();
        Book firstBook = new Book("1", "Java von Kopf bis Füß", "Lars Schulten");
        Book secondBook = new Book("2", "Das Reichtum der Nationen", "Adam Smith");
        object.addBook(firstBook);
        object.addBook(secondBook);

        Book actulBook = object.getBookById("1");
        assertNotNull(actulBook, "Book is Null !");


    }


    @Test
    public void assertNotNullWithSupplierMessage() {
        LibraryService object = new LibraryService();
        Book firstBook = new Book("1", "Java von Kopf bis Füß", "Lars Schulten");
        Book secondBook = new Book("2", "Das Reichtum der Nationen", "Adam Smith");
        object.addBook(firstBook);
        object.addBook(secondBook);

        Book actulBook = object.getBookById("1");
        assertNotNull(actulBook, () -> "Book is Null !");


    }

}
