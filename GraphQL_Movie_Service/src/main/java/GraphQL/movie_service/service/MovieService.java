package GraphQL.movie_service.service;

import GraphQL.movie_service.bo.Movie;
import GraphQL.movie_service.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Television holds webClient methods to call different rest requests
 * that provide read data or change data for the book microservice.
 */
@Service
public class MovieService {
    @Autowired
    MovieRepository movieRepository;

    //Method to find movies that holds matching media id
    public List<Movie> findMedia (String id){
        System.out.println(id);
        return movieRepository.findAll().stream().filter(movie -> movie
                .getMedia()
                //.getId()
                .equalsIgnoreCase(id))
                .collect(Collectors.toList());
    }
    //Method to get all movie data
    public List<Movie> getAll() {
        return movieRepository.findAll();
    }
    //Method to add movie data
    public Movie add(Movie movie) {
        return movieRepository.save(movie);
    }
    //Method to update movie data
    public Movie update(Movie movie) {
        return movieRepository.save(movie);
    }
}
