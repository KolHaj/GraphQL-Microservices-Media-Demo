package GraphQL.movie_service;

import GraphQL.movie_service.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MovieBodyApplication {
	@Autowired
	MovieRepository movieRepository;
	/**
	 * Main method to run application
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(MovieBodyApplication.class, args);
	}
}
