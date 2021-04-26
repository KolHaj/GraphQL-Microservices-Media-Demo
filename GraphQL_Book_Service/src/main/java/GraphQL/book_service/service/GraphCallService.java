package GraphQL.book_service.service;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * Java method that makes a GraphQL query. The overall
 * idea is still not finished or tested but is a simple
 * idea to test capabilities of GraphQL.
 */
public class GraphCallService {
    public void graphData(){
        RestTemplate restTemplate = restTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.add("Authorization", "Bearer *************");
        headers.add("content-type", "application/graphql"); // maintain graphql

        // query is a GraphQL query wrapped into a String
        String query1 = "{\n" +
                "    locationTypes: {\n" +
                "      edges: \n" +
                "        {\n" +
                "          node: \n" +
                "        {\n" +
                "          name\n" +
                "        }\n" +
                "        }\n" +
                "    }\n" +
                "  }";
        String URL = "https://staging.joinswoop.com/graphql";
        ResponseEntity<String> response = restTemplate.postForEntity("http://localhost:8080/graphql", new HttpEntity<>(query1, headers), String.class);
        System.out.println("The response================="+response);
    }
    private RestTemplate restTemplate() {
        return null;
    }
}
