package GraphQL.book_service.repository;

import GraphQL.book_service.bo.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Mechanism for encapsulating storage, retrieval, and search behavior which
 * emulates a collection of objects for the "OracleSQL" database.
 */
@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
