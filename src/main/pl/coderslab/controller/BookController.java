package pl.coderslab.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.Book;
import pl.coderslab.service.MockBookService;

import java.util.List;

@RestController
public class BookController {
    private MockBookService mockBookService;

    public BookController(MockBookService mockBookService) {
        this.mockBookService = mockBookService;
    }

    //Shows one book
    @RequestMapping("/helloBook")
    public Book helloBook() {
        return new Book(1L, "9788324631766", "Thinking in Java",
                "Bruce Eckel", "Helion", "programming");
    }

    //Shows all books
    @GetMapping(path = "/books")
    public List<Book> getBooks(){
        return mockBookService.ListOfBooks();
    }

    //Creating new book through form
    @PostMapping("/books")
    public List<Book> saveBook(@ModelAttribute("book") Book book){
        mockBookService.addBook(book);
        return mockBookService.ListOfBooks();
    }
    //Shows book at given ID
    @GetMapping(path = "/books/{id}")
    public Book getBook(@PathVariable int id){
        return mockBookService.getBook(id);
    }
    //Replacing a book
    @PutMapping(path ="/books")
    public List<Book> replaceBook(@RequestBody Book book){
        mockBookService.updateBook(book);
        return mockBookService.ListOfBooks();
    }
    //Deleting book
    @DeleteMapping("/books/{id}")
    public List<Book> deleteBook(@PathVariable int id){
        mockBookService.deleteBook(id);
        return mockBookService.ListOfBooks();
    }
}