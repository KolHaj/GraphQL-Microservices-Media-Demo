package GraphQL.media_service.pojo;

import lombok.Data;

/**
 * Book variables with Lombok java library to remove
 * unnecessary getter, setter, and constructor for cleaner
 * overall code look.
 */
@Data
public class Book {
    private String id;
    private String name;
    private String author;
    private boolean available;
    private String media;
    //private Media media;
}
