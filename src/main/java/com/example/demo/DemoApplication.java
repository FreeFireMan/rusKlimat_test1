package com.example.demo;

import com.example.demo.model.Mtp;
import com.example.demo.rusKlimat.api.RusKlimatResponse;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.io.File;

import static java.lang.System.exit;
import static java.lang.System.setErr;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {


    public static void main(String[] args)  {
        SpringApplication.run(DemoApplication.class, args);
        SpringApplication app = new SpringApplication(DemoApplication.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);

    }
    @Override
    public void run(String... args) throws Exception {

        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "WnIxZDhsNDY2WHdZd00xZWRGMks0Zz09");
        HttpEntity<String> entity = new HttpEntity<>("paramters",headers);
        String url = "http://api.rusklimat.ru/rest/Contentplatform/mtp/a0a7de95-9a5c-4eb2-8000-7c3136e5efe7?$format=json";
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
        ResponseEntity<RusKlimatResponse> response = restTemplate.exchange(url,HttpMethod.GET,entity,RusKlimatResponse.class);

        Mtp node = new Mtp();



        JsonNode jsonNode = mapper.readValue(response.getBody().getData().toString(), JsonNode.class);
        System.out.println(jsonNode.toString());
        /*System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");

        String jsonWriter = mapper.writerWithDefaultPrettyPrinter()
                .writeValueAsString(node);
        System.out.println(jsonWriter);*/

        exit(0);
    }

}
