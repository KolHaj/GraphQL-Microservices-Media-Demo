package GraphQL.media_service.pojo;

import lombok.Data;

/**
 * MediaInput variables for GraphQL data input with Lombok java library
 * to remove unnecessary getter, setter, and constructor for cleaner
 * overall code look.
 */
@Data
public class MediaInput {
    private String id;
    private String type;
    private String region;
    private int release;
    private int sales;
}
