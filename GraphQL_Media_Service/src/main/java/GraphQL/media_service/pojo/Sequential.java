package GraphQL.media_service.pojo;

import lombok.Data;

/**
 * Sequential variables of class objects with Lombok java library to remove
 * unnecessary getter, setter, and constructor for cleaner
 * overall code look.
 */
@Data
public class Sequential {
    private Media media;
    private Book book;
    private Television television;
    private Movie movie;
}