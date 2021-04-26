package GraphQL.movie_service.controller;

import GraphQL.movie_service.bo.Movie;
import GraphQL.movie_service.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.io.IOException;
import java.util.List;

/**
 * Movie API is the rest service class that
 * holds the methods that need to be exposed as REST API.
 */
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/v2/movie")
public class MovieAPI {
    @Autowired
    private MovieService movieService;

    //Get request for all movies in DB
    @GetMapping(value ={"/getAll"})
    public List<Movie> getAll() {
        return  movieService.getAll();
    }
    //Get request for specific movies with matching media id
    @GetMapping(value ={"/getMedia/{id}"})
    public List<Movie> findMedia(@PathVariable("id") String id) {
        return movieService.findMedia(id);
    }
    //Post request to add new movie data
    @PostMapping(value = {"/addMovie"})
    public Movie add(@RequestBody Movie movie) throws IOException {
        return movieService.add(movie);
    }
    //Put request to update current movie data
    @PutMapping(value = {"/updateMovie"})
    public Movie update(@RequestBody Movie movie) throws IOException {
        return movieService.update(movie);
    }
}
