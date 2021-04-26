package GraphQL.television_service;

import GraphQL.television_service.repository.TelevisionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TelevisionBodyApplication {
	@Autowired
	TelevisionRepository televisionRepository;
	/**
	 * Main method to run application
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(TelevisionBodyApplication.class, args);
	}
}
