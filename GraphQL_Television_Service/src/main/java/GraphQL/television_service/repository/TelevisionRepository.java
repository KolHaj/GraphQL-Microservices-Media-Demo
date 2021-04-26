package GraphQL.television_service.repository;

import GraphQL.television_service.bo.Television;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Mechanism for encapsulating storage, retrieval, and search behavior which
 * emulates a collection of objects for the "OracleSQL" database.
 */
@Repository
public interface TelevisionRepository extends JpaRepository<Television, Long> {
}
