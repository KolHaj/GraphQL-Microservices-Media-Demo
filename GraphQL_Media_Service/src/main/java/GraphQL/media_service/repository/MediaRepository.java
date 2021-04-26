package GraphQL.media_service.repository;

import GraphQL.media_service.pojo.Media;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Mechanism for encapsulating storage, retrieval, and search behavior which
 * emulates a collection of objects for the "MongoDB - Media_DB" database.
 */
@Repository
public interface MediaRepository extends MongoRepository<Media, String> {
}
