package JunitDemo;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class AssertArrayEqualsDemo {

    @Test
    public void assertArrayEqualsWithNoMessage() {
        LibraryService object = new LibraryService();
        Book firstBook = new Book("1", "Java von Kopf bis Füß", " Schulten");
        Book secondBook = new Book("2", "Das Reichtum der Nationen", "Adam Smith");
        Book thirdBook = new Book("3", "JavaScript von kopf bis Füß", " Schulten");

        object.addBook(firstBook);
        object.addBook(secondBook);
        object.addBook(thirdBook);

        String[] actualBookIds=LibraryService.getBookIdsByPublisher(" Schulten");
       assertArrayEquals(new String[]{"1","3"},actualBookIds);


    }




    @Test
    public void assertArrayEqualsWithMessage() {
        LibraryService object = new LibraryService();
        Book firstBook = new Book("1", "Java von Kopf bis Füß", " Schulten");
        Book secondBook = new Book("2", "Das Reichtum der Nationen", "Adam Smith");
        Book thirdBook = new Book("3", "JavaScript von kopf bis Füß", " Schulten");

        object.addBook(firstBook);
        object.addBook(secondBook);
        object.addBook(thirdBook);

        String[] actualBookIds=LibraryService.getBookIdsByPublisher(" Schulten");
        assertArrayEquals(new String[]{"1","3"},actualBookIds,"bookIds didnot match !");

    }


    @Test
    public void assertArrayEqualsWithSupplierMessage() {
        LibraryService object = new LibraryService();
        Book firstBook = new Book("1", "Java von Kopf bis Füß", "Lars Schulten");
        Book secondBook = new Book("2", "Das Reichtum der Nationen", "Adam Smith");
        Book thirdBook = new Book("3", "JavaScript von kopf bis Füß", "Lars Schulten");

        object.addBook(firstBook);
        object.addBook(secondBook);
        object.addBook(thirdBook);

        String[] actualBookIds=LibraryService.getBookIdsByPublisher("Lars Schulten");
        assertArrayEquals(new String[]{"1","3"},actualBookIds,()->"booksId didnot match");


    }
}
