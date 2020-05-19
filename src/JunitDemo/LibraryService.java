package JunitDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LibraryService {

    private static List<Book> listOfBooks = new ArrayList<>();

    public void addBook(Book book) {
        listOfBooks.add(book);

    }

    public List<Book> books() {
        return Collections.unmodifiableList(listOfBooks);
    }

    public Book getBookById(String bookId) {
        for (Book book : listOfBooks) {

            //compare just bookId
            if (bookId.equals(book.getBookId())) {
                return book;
            }
        }
        return null;

    }

    public static String [] getBookIdsByPublisher(String publisher){
        List<String> bookIds=new ArrayList<>();
        for (Book book:listOfBooks){
            if(publisher.equals(book.getPublisher())){
                bookIds.add(book.getBookId());
            }
        }
        return bookIds.toArray(new String[bookIds.size()]);

    }



    public static Book getBookByTitel(String bookTitel) throws BookNotFoundException {
        for (Book book : listOfBooks) {

            //compare just booktitel
            if (bookTitel.equals(book.getTitel())) {
                return book;
            }
        }
        throw new BookNotFoundException("Book not founf in Bookstore !");

    }
}
