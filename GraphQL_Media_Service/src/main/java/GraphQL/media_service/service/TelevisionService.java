package GraphQL.media_service.service;

import GraphQL.media_service.pojo.Media;
import GraphQL.media_service.pojo.Television;
import GraphQL.media_service.pojo.TelevisionInput;
import GraphQL.media_service.repository.MediaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import java.util.List;
import java.util.stream.Collectors;

/**
 * TelevisionService holds webClient methods to call different rest requests
 * that provide read data or change data for the book microservice.
 */
@Service
public class TelevisionService {
    @Autowired
    private MediaRepository mediaRepository;
    @Autowired
    private WebClient.Builder webClientBuilder;

    //Get request for all books in the book microservice
    public List<Television> getAllTelevision(){
        return webClientBuilder
                .build()
                .get()
                .uri("http://localhost:8081/v2/television/getAll")
                .retrieve()
                .bodyToFlux(Television.class)
                .collect(Collectors.toList())
                .block();
    }
    //Post request to add new television to database
    public Television addTelevision(TelevisionInput televisionInput, String id) {
        Media media = mediaRepository.findById(id).get();
        televisionInput.setMedia(id);
        //televisionInput.setMedia(media);
        return webClientBuilder
                .build()
                .post()
                .uri("http://localhost:8081/v2/television/addTelevision")
                .body(Mono.just(televisionInput), Television.class)
                .retrieve()
                .bodyToMono(Television.class)
                .block();
    }
}