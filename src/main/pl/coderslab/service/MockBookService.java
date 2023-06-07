package pl.coderslab.service;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import pl.coderslab.Book;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

@Service
public class MockBookService implements BookService<Book> {
    private final List<Book> list;

    public MockBookService() {
        list = new ArrayList<>();
        list.add(new Book(1L, "9788324631766", "Thiniking	in	Java", "Bruce	Eckel", "Helion", "programming"));
        list.add(new Book(2L, "9788324627738", "Rusz	glowa	Java.", "Sierra	Kathy,	Bates	Bert", "Helion",
                "programming"));
        list.add(new Book(3L, "9780130819338", "Java	2.	Podstawy", "Cay	Horstmann,	Gary	Cornell", "Helion",
                "programming"));
    }

    //Adding new book
    @Override
    public void addBook(Book book) {
        list.add(book);
    }

    //Getting list of books
    @Override
    public List<Book> ListOfBooks() {
        return list;
    }

    //Getting single book
    @Override
    public Book getBook(long id) {
        Iterator<Book> iterator = list.listIterator();
        Book bookToReturn = new Book();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (id == book.getId()) {
                bookToReturn = book;
            }
        }
        return bookToReturn;
    }

    //Deleting book
    @Override
    public void deleteBook(long id) {
        Iterator<Book> iterator = list.listIterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getId() == id) {
                iterator.remove();
            }
        }
    }

    //Updating book
    @Override
    public void updateBook(Book book) {
        long index = book.getId();
        list.set(Math.toIntExact(index), book);
    }
}
