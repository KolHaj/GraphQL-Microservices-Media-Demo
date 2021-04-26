package GraphQL.television_service.service;

import GraphQL.television_service.bo.Television;
import GraphQL.television_service.repository.TelevisionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Television holds webClient methods to call different rest requests
 * that provide read data or change data for the book microservice.
 */
@Service
public class TelevisionService {
    @Autowired
    TelevisionRepository televisionRepository;

    //Method to find television that holds matching media id
    public List<Television> findMedia (String id){
        System.out.println(id);
        return televisionRepository.findAll().stream().filter(script -> script
                .getMedia()
                //.getId()
                .equalsIgnoreCase(id))
                .collect(Collectors.toList());
    }
    //Method to get all television data
    public List <Television> getAll() {
        return televisionRepository.findAll();
    }
    //Method to add television data
    public Television add(Television television) {
        return televisionRepository.save(television);
    }
    //Method to update television data
    public Television update(Television television) {
        return televisionRepository.save(television);
    }
}