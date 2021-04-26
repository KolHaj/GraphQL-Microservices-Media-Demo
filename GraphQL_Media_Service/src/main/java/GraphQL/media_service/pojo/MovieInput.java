package GraphQL.media_service.pojo;

import lombok.Data;

/**
 * MovieInput variables for GraphQL data input with Lombok java
 * library to remove unnecessary getter, setter, and constructor
 * for cleaner overall code look.
 */
@Data
public class MovieInput {
    private String name;
    private String writers;
    private boolean available;
    private String media;
    //private Media media;
}
