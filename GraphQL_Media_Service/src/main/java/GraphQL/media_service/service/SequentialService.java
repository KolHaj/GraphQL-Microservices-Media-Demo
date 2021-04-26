package GraphQL.media_service.service;

import GraphQL.media_service.pojo.*;
import GraphQL.media_service.repository.MediaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * SerialService holds webClient methods to call different rest requests
 * that provide read data or change data for the book microservice.
 */
@Service
public class SequentialService {
    @Autowired
    private MediaRepository mediaRepository;
    @Autowired
    private WebClient.Builder webClientBuilder;
    @Resource
    private MediaService mediaService;

//    public List<Movie> allMovie(){
//        return webClientBuilder
//                .build()
//                .get()
//                .uri("http://localhost:8083/v2/movie/getAll")
//                .retrieve()
//                .bodyToFlux(Dental.class)
//                .collect(Collectors.toList())
//                .block();
//    }

    /**
     * The method makes a get request in a Sequential order to pull
     * any television, movie, and books that have matching
     * media id variable. As the method progresses it uses
     * the last get request to pull the needed id data.
     * @param id
     * @return
     */
    public List<Sequential> findAllMedia (String id) {
        Sequential sequential = new Sequential();
        sequential.setMedia(mediaService.getById(id));
        //First get request for television
        List <Sequential> sequentialList = new ArrayList<>();
        System.out.println("Media ID: " + id);
        List <Television> televisionList = webClientBuilder
                .build()
                .get()
                .uri("http://localhost:8081/v2/television/getTelevision/" + id)
                .retrieve()
                .bodyToFlux(Television.class)
                .collect(Collectors.toList())
                .block();
        //Second get request for movies
        Television television = televisionList.get(0);
        sequential.setTelevision(television);
        List <Movie> movieList = webClientBuilder
                .build()
                .get()
                .uri("http://localhost:8082/v2/movie/getMovie/" + television.getMedia())
                .retrieve()
                .bodyToFlux(Movie.class)
                .collect(Collectors.toList())
                .block();
        //Third get request for books
        Movie movie = movieList.get(0);
        sequential.setMovie(movie);
        List <Book> bookList = webClientBuilder
                .build()
                .get()
                .uri("http://localhost:8083/v2/book/getBook/" + movie.getMedia())
                .retrieve()
                .bodyToFlux(Book.class)
                .collect(Collectors.toList())
                .block();
        Book book = bookList.get(0);
        sequential.setBook(book);
        sequentialList.add(sequential);
        return sequentialList;
    }
}