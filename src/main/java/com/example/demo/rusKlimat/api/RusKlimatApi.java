package com.example.demo.rusKlimat.api;

import com.example.demo.rusKlimat.api.RusKlimatResponse;
import com.example.demo.unit.RequestResponseLoggingInterceptor;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import lombok.Data;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.Collections;
import java.util.Optional;

@Data
@Component
public class RusKlimatApi {

    private static RestTemplate makeRestTemplate() {
        RestTemplate t = new RestTemplate();
        t.setInterceptors(Collections.singletonList(new RequestResponseLoggingInterceptor()));
        return t;
    }
    private RestTemplate restTemplate = makeRestTemplate();

    public ObjectNode fetchPage(String url) {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "WnIxZDhsNDY2WHdZd00xZWRGMks0Zz09");
        HttpEntity<String> entity = new HttpEntity<>("paramters",headers);
        ObjectMapper mapper = new ObjectMapper();
        ResponseEntity<RusKlimatResponse> response = restTemplate.exchange(url, HttpMethod.GET,entity,RusKlimatResponse.class);
        ObjectNode jnode = null;
        try {
            jnode = mapper.readValue(response.getBody().getData().toString(), ObjectNode.class);
            System.out.println(response.getBody());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return jnode;
    }
}
