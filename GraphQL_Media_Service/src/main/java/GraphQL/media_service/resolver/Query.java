package GraphQL.media_service.resolver;

import GraphQL.media_service.pojo.*;
import GraphQL.media_service.service.*;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * GraphQL Query class lists all methods that can be
 * called in that can read or fetch values and then read data.
 */
@Component
public class Query implements GraphQLQueryResolver {
    @Resource
    private MediaService mediaService;
    @Resource
    private BookService bookService;
    @Resource
    private MovieService movieService;
    @Resource
    private TelevisionService televisionService;
    @Resource
    private SequentialService sequentialService;

    //GraphQL Query to fetch all media
    public List <Media> allMedia(){
        return mediaService.getAllMedia();
    }
    //GraphQL Query to fetch all books
    public List<Book> allBooks(){
        return bookService.getAllBooks();
    }
    //GraphQL Query to fetch all movies
    public List<Movie> allMovies() { return movieService.getAllMovies();}
    //GraphQL Query to fetch all television
    public List<Television> allTelevision() {
        return televisionService.getAllTelevision();
    }
    //GraphQL Query to fetch all specific media
    public List<Sequential> allSequential(String id) {
        return sequentialService.findAllMedia(id);
    }
}
