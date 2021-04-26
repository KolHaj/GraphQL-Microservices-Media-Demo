package GraphQL.book_service;

import GraphQL.book_service.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookBodyApplication {
	@Autowired
	BookRepository bookRepository;
	/**
	 * Main method to run application
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(BookBodyApplication.class, args);
	}
}
