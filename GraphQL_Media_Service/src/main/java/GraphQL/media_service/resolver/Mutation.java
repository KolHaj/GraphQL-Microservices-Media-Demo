package GraphQL.media_service.resolver;

import GraphQL.media_service.pojo.*;
import GraphQL.media_service.service.*;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;

/**
 * GraphQL Mutations class lists all methods that can be
 * called in that can cause operations change state and then
 * return the changed state of the data.
 */
@Component
public class Mutation implements GraphQLMutationResolver {
    @Resource
    private MediaService mediaService;
    @Resource
    private MovieService movieService;
    @Resource
    private BookService bookService;
    @Resource
    private TelevisionService televisionService;
    @Resource
    private SequentialService sequentialService;

    //GraphQL Mutation to add Media data
    public Media addMedia(Media media){
        return mediaService.addMedia(media);
    }
    //GraphQL Mutation to update Media data
    public Media updateMedia(Media media) {
        return mediaService.updateMedia(media);
    }
    //GraphQL Mutation used as query for specific media data
    public Media getMediaById(String id) {
        return mediaService.getById(id);
    }
    //GraphQL Mutation to add Movie data
    public Movie addMovie(MovieInput movieInput, String id) {
        return movieService.addMovie(movieInput, id);
    }
    //GraphQL Mutation to add Book data
    public Book addBook(BookInput bookInput, String id) {
        return bookService.addBook(bookInput, id);
    }
    //GraphQL Mutation to add Television data
    public Television addTelevision(TelevisionInput televisionInput, String id) {
        return televisionService.addTelevision(televisionInput, id);
    }
}
