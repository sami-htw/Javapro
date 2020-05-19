package JunitDemo;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AssertFalseDemo {

    @Test
    public void assertFalseWithNoMessage() {
        LibraryService object = new LibraryService();

        Book firstBook = new Book("12343", "Effective Java", "Alex Meier");
        object.addBook(firstBook);
        List<Book> listOfBooks = object.books();
        //  listOfBooks.add(firstBook);
        assertFalse(listOfBooks.isEmpty());
    }


    @Test
    public void assertFalseWithMessage() {
        LibraryService object = new LibraryService();

        Book firstBook = new Book("12343", "Effective Java", "Alex Meier");
        object.addBook(firstBook);
        List<Book> listOfBooks = object.books();
        //  listOfBooks.add(firstBook);
        assertFalse(listOfBooks.isEmpty(), "List of Books is not empty");
    }


    @Test
    public void assertFalseWithMessageSupplier() {
        LibraryService object = new LibraryService();

        Book firstBook = new Book("12343", "Effective Java", "Alex Meier");
        object.addBook(firstBook);
        List<Book> listOfBooks = object.books();
        // listOfBooks.add(firstBook);
        assertFalse(listOfBooks.isEmpty(), () -> "List of books is not empty!");
    }


    @Test
    public void assertFalseWithBooleanSupplierAndNoMessage() {
        LibraryService object = new LibraryService();

        Book firstBook = new Book("12343", "Effective Java", "Alex Meier");
        object.addBook(firstBook);
        List<Book> listOfBooks = object.books();
        //  listOfBooks.add(firstBook);
        assertFalse(() -> listOfBooks.isEmpty());
    }

    @Test
    public void assertFalseWithBooleanSupplierMessage() {
        LibraryService object = new LibraryService();

        Book firstBook = new Book("12343", "Effective Java", "Alex Meier");
        object.addBook(firstBook);
        List<Book> listOfBooks = object.books();
        //  listOfBooks.add(firstBook);
        assertFalse(() -> listOfBooks.isEmpty(), "List of Books is not empty!");
    }


    @Test
    public void assertFalseWithBooleanSupplierAndMessageSupplier() {
        LibraryService object = new LibraryService();

        Book firstBook = new Book("12343", "Effective Java", "Alex Meier");
        object.addBook(firstBook);
        List<Book> listOfBooks = object.books();
        //listOfBooks.add(firstBook);
        assertFalse(() -> listOfBooks.isEmpty(), () -> "List of Books is not Empty!");
    }

}