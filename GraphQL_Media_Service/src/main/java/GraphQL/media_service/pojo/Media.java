package GraphQL.media_service.pojo;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import javax.persistence.Id;

/**
 * Media variables with Lombok java library to remove
 * unnecessary getter, setter, and constructor for cleaner
 * overall code look.
 */
@Data
@Document(collection = "Media")
public class Media {
    @Id
    private String id;
    private String type;
    private String region;
    private int release;
    private int sales;
}
