package GraphQL.movie_service.repository;

import GraphQL.movie_service.bo.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Mechanism for encapsulating storage, retrieval, and search behavior which
 * emulates a collection of objects for the "MongoDB - Movie_DB" database.
 */
@Repository
public interface MovieRepository extends MongoRepository<Movie, String> {
}
