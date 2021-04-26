package GraphQL.movie_service.bo;

import lombok.Data;

/**
 * Media variables with Lombok java library to remove
 * unnecessary getter, setter, and constructor for cleaner
 * overall code look.
 */
@Data
public class Media {
    private String id;
    private String type;
    private String region;
    private int release;
    private int sales;
}
