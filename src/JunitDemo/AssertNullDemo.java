package JunitDemo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNull;

public class AssertNullDemo {

    @Test
    public void assertNullWithNoMessage() {
        LibraryService object = new LibraryService();
        Book firstBook = new Book("1", "Java von Kopf bis Füß", "Lars Schulten");
        Book secondBook = new Book("2", "Das Reichtum der Nationen", "Adam Smith");
        object.addBook(firstBook);
        object.addBook(secondBook);

        Book actulBook = object.getBookById("3");
        assertNull(actulBook);


    }


    @Test
    public void assertNullWithMessage() {
        LibraryService object = new LibraryService();
        Book firstBook = new Book("1", "Java von Kopf bis Füß", "Lars Schulten");
        Book secondBook = new Book("2", "Das Reichtum der Nationen", "Adam Smith");
        object.addBook(firstBook);
        object.addBook(secondBook);

        Book actulBook = object.getBookById("3");
        assertNull(actulBook, "Book is not Null !");


    }


    @Test
    public void assertNullWithSupplierMessage() {
        LibraryService object = new LibraryService();
        Book firstBook = new Book("1", "Java von Kopf bis Füß", "Lars Schulten");
        Book secondBook = new Book("2", "Das Reichtum der Nationen", "Adam Smith");
        object.addBook(firstBook);
        object.addBook(secondBook);

        Book actulBook = object.getBookById("3");
        assertNull(actulBook, () -> "Book is not Null !");


    }
}
