package GraphQL.media_service.pojo;

import lombok.Data;

/**
 * Movie variables with Lombok java library to remove
 * unnecessary getter, setter, and constructor for cleaner
 * overall code look.
 */
@Data
public class Movie {
    private String id;
    private String name;
    private String writers;
    private boolean available;
    private String media;
    //private Media media;
}
