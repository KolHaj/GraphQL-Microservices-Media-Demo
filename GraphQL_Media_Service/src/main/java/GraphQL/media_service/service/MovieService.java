package GraphQL.media_service.service;

import GraphQL.media_service.pojo.Movie;
import GraphQL.media_service.pojo.MovieInput;
import GraphQL.media_service.pojo.Media;
import GraphQL.media_service.repository.MediaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Movie holds webClient methods to call different rest requests
 * that provide read data or change data for the book microservice.
 */
@Service
public class MovieService {
    @Autowired
    private MediaRepository mediaRepository;
    @Autowired
    private WebClient.Builder webClientBuilder;

    //Get request for all books in the book microservice
    public List<Movie> getAllMovies(){
        return webClientBuilder
                .build()
                .get()
                .uri("http://localhost:8082/v2/movie/getAll")
                .retrieve()
                .bodyToFlux(Movie.class)
                .collect(Collectors.toList())
                .block();
        }
    //Post request to add new movie to database
    public Movie addMovie(MovieInput movieInput, String id) {
        Media media = mediaRepository.findById(id).get();
        movieInput.setMedia(id);
        //movieInput.setMedia(media);
        return webClientBuilder
                .build()
                .post()
                .uri("http://localhost:8082/v2/movie/addMovie")
                .body(Mono.just(movieInput), Movie.class)
                .retrieve()
                .bodyToMono(Movie.class)
                .block();
    }
}
