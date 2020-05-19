package JunitDemo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class AssertThrowsDemo {
    @Test
    public void assertThrowsWithNoMessage() {
        LibraryService object = new LibraryService();
        Book firstBook = new Book("1", "Java von Kopf bis Füß", "Lars Schulten");
        Book secondBook = new Book("2", "Das Reichtum der Nationen", "Adam Smith");
        object.addBook(firstBook);
        object.addBook(secondBook);

        assertThrows(BookNotFoundException.class, () -> LibraryService.getBookByTitel("Javascript in 21 Days"));

    }

    @Test
    public void assertThrowsWithMessage() {
        LibraryService object = new LibraryService();
        Book firstBook = new Book("1", "Java von Kopf bis Füß", "Lars Schulten");
        Book secondBook = new Book("2", "Das Reichtum der Nationen", "Adam Smith");
        object.addBook(firstBook);
        object.addBook(secondBook);
        //even if use the father class instead of the child ,it makes no difference and the Test passed also
        assertThrows(Exception.class, () -> LibraryService.getBookByTitel("Javascript in 21 Days"), "Different Exception is Thrown!");

    }

    @Test
    public void assertThrowsWithMessagesupplier() {
        LibraryService object = new LibraryService();
        Book firstBook = new Book("1", "Java von Kopf bis Füß", "Lars Schulten");
        Book secondBook = new Book("2", "Das Reichtum der Nationen", "Adam Smith");
        object.addBook(firstBook);
        object.addBook(secondBook);

        assertThrows(BookNotFoundException.class, () -> LibraryService.getBookByTitel("Javascript in 21 Days"), () -> "Different Exception is Thrown!");

    }


}
