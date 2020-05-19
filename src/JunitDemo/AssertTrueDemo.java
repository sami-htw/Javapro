package JunitDemo;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AssertTrueDemo {

    @Test
    public void assertTrueWithNoMessage() {
        LibraryService object = new LibraryService();

        Book firstBook = new Book("12343", "Effective Java", "Alex Meier");
        //  object.addBook(firstBook);
        List<Book> listOfBooks = object.books();
        //  listOfBooks.add(firstBook);
        assertTrue(listOfBooks.isEmpty());
    }


    @Test
    public void assertTrueWithMessage() {
        LibraryService object = new LibraryService();

        Book firstBook = new Book("12343", "Effective Java", "Alex Meier");
        //  object.addBook(firstBook);
        List<Book> listOfBooks = object.books();
        //  listOfBooks.add(firstBook);
        assertTrue(listOfBooks.isEmpty(), "List of Books is not empty");
    }


    @Test
    public void assertTrueWithMessageSupplier() {
        LibraryService object = new LibraryService();

        Book firstBook = new Book("12343", "Effective Java", "Alex Meier");
        //  object.addBook(firstBook);
        List<Book> listOfBooks = object.books();
        // listOfBooks.add(firstBook);
        assertTrue(listOfBooks.isEmpty(), () -> "List of books is not empty!");
    }


    @Test
    public void assertTrueWithBooleanSupplierAndNoMessage() {
        LibraryService object = new LibraryService();

        Book firstBook = new Book("12343", "Effective Java", "Alex Meier");
        //  object.addBook(firstBook);
        List<Book> listOfBooks = object.books();
        //  listOfBooks.add(firstBook);
        assertTrue(() -> listOfBooks.isEmpty());
    }

    @Test
    public void assertTrueWithBooleanSupplierMessage() {
        LibraryService object = new LibraryService();

        Book firstBook = new Book("12343", "Effective Java", "Alex Meier");
        //  object.addBook(firstBook);
        List<Book> listOfBooks = object.books();
        //  listOfBooks.add(firstBook);
        assertTrue(() -> listOfBooks.isEmpty(), "List of Books is not empty!");
    }


    @Test
    public void assertTrueWithBooleanSupplierAndMessageSupplier() {
        LibraryService object = new LibraryService();

        Book firstBook = new Book("12343", "Effective Java", "Alex Meier");
        //  object.addBook(firstBook);
        List<Book> listOfBooks = object.books();
        //listOfBooks.add(firstBook);
        assertTrue(() -> listOfBooks.isEmpty(), () -> "List of Books is not Empty!");
    }


}