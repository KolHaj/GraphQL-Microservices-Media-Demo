package GraphQL.book_service.service;

import GraphQL.book_service.bo.Book;
import GraphQL.book_service.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Television holds webClient methods to call different rest requests
 * that provide read data or change data for the book microservice.
 */
@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;

    //Method to find book that holds matching media id
    public List<Book> findMedia (String id){
        System.out.println(id);
        return bookRepository.findAll().stream().filter(book -> book
                .getMedia()
                //.getId()
                .equalsIgnoreCase(id))
                .collect(Collectors.toList());
    }
    //Method to get all book data
    public List <Book> getAll() {
//        System.out.println("Part One");
//        Iterable<Book> books = bookRepository.findAll();
//        System.out.println("Part Two");
//        List<Book> bookList = new ArrayList<Book>();
//        books.forEach(bookList::add);
//        System.out.println("Part Three");
        return bookRepository.findAll();
    }
    //Method to add bok data
    public Book add(Book book) {
        return bookRepository.save(book);
    }
    //Method to update book data
    public Book update(Book book) {
        return bookRepository.save(book);
    }
}
