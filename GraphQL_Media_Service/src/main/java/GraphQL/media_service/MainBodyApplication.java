package GraphQL.media_service;

import GraphQL.media_service.repository.MediaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

/**
 * The application is a POC to show the usability of GraphQL
 * in communicating with multiple databases and microservices
 * to fetch and manipulate data
 */
@SpringBootApplication
public class MainBodyApplication {
	@Autowired
	MediaRepository mediaRepository;
	/**
	 * Configure a base URL for requests performed through the client.
	 * @return
	 */
	@Bean
	public WebClient.Builder getWebClientBuilder(){
		return WebClient.builder();
	}
	/**
	 * 	Main method to run application
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(MainBodyApplication.class, args);
	}
}
