package GraphQL.book_service.controller;

import GraphQL.book_service.bo.Book;
import GraphQL.book_service.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

/**
 * Book API is the rest service class that
 * holds the methods that need to be exposed as REST API.
 */
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/v2/book")
public class BookAPI {
    @Autowired
    private BookService bookService;

    //Get request for all book in DB
    @GetMapping(value ={"/getAll"})
    public List<Book> getAll() {
        return  bookService.getAll();
    }
    //Get request for specific book with matching media id
    @GetMapping(value ={"/getMedia/{id}"})
    public List<Book> findMedia(@PathVariable("id") String id) {
        return bookService.findMedia(id);
    }
    //Post request to add new book data
    @PostMapping(value = {"/addBook"})
    public Book add(@RequestBody Book book) throws IOException {
        System.out.println("called");
        return bookService.add(book);
    }
    //Put request to update current book data
    @PutMapping(value = {"/updateBook"})
    public Book update(@RequestBody Book book) throws IOException {
        return bookService.update(book);
    }
}
