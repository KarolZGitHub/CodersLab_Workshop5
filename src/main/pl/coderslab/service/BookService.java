package pl.coderslab.service;

import pl.coderslab.Book;

import java.util.List;

public interface BookService<O> {

    void addBook(O o);
    List<Book> ListOfBooks();

    Book getBook(long id);

    void deleteBook(long id);

    void updateBook(O o);

}
