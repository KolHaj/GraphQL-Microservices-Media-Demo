package GraphQL.media_service.service;

import GraphQL.media_service.pojo.Book;
import GraphQL.media_service.pojo.BookInput;
import GraphQL.media_service.pojo.Media;
import GraphQL.media_service.repository.MediaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import java.util.List;
import java.util.stream.Collectors;

/**
 * BookService holds webClient methods to call different rest requests
 * that provide read data or change data for the book microservice.
 */
@Service
public class BookService {
    @Autowired
    private MediaRepository mediaRepository;
    @Autowired
    private WebClient.Builder webClientBuilder;

    //Get request for all books in the book microservice
    public List<Book> getAllBooks(){
        return webClientBuilder
                .build()
                .get()
                .uri("http://localhost:8083/v2/book/getAll")
                .retrieve()
                .bodyToFlux(Book.class)
                .collect(Collectors.toList())
                .block();
    }
    //Post request to add new book to database
    public Book addBook(BookInput bookInput, String id) {
        Media media = mediaRepository.findById(id).get();
        bookInput.setMedia(id);
        //bookInput.setMedia(media);
        return webClientBuilder
                .build()
                .post()
                .uri("http://localhost:8083/v2/book/addBook")
                .body(Mono.just(bookInput), Book.class)
                .retrieve()
                .bodyToMono(Book.class)
                .block();
    }
}