package GraphQL.movie_service.bo;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Movie variables with Lombok java library to remove
 * unnecessary getter, setter, and constructor for cleaner
 * overall code look.
 */
@Data
@Document(collection = "Movie")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String name;
    private String writers;
    private boolean available;
    private String media;
    //private Media media;
}
