package GraphQL.television_service.controller;

import GraphQL.television_service.bo.Television;
import GraphQL.television_service.service.TelevisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.io.IOException;
import java.util.List;

/**
 * Television API is the rest service class that
 * holds the methods that need to be exposed as REST API.
 */
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/v2/television")
public class TelevisionAPI {
    @Autowired
    private TelevisionService televisionService;

    //Get request for all television in DB
    @GetMapping(value ={"/getAll"})
    public List<Television> getAll() {
        return televisionService.getAll();
    }
    //Get request for specific television with matching media id
    @GetMapping(value ={"/getMedia/{id}"})
    public List<Television> findMedia(@PathVariable("id") String id) {
        return televisionService.findMedia(id);
    }
    //Post request to add new television data
    @PostMapping(value = {"/addTelevision"})
    public Television add(@RequestBody Television television) throws IOException {
        return televisionService.add(television);
    }
    //Put request to update current television data
    @PutMapping(value = {"/updateTelevision"})
    public Television update(@RequestBody Television television) throws IOException {
        return televisionService.update(television);
    }
}
