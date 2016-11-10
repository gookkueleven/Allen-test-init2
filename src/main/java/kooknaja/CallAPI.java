package kooknaja;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

/**
 * Created by ratchasit.amo on 10/18/2016.
 */

@SpringBootApplication
public class CallAPI {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    @Bean
    RestTemplate restTemplate(){
        return  new RestTemplate();
    }

    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
        return args -> {

            testAPI();
            testPost();
            // log.info(gook.toString());
        };
    }

    @Autowired
    RestTemplate restTemplate;

    public String testAPI(){

        final String uri = "http://localhost:8080/Gookku/Eleven";

        //RestTemplate restTemplate = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

        HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);

        //< -->return class >
        ResponseEntity<String> result = this.restTemplate.exchange(uri, HttpMethod.GET, entity, String.class);
        return result.getBody();
    }

    public void testPost(){

        final String uri = "http://localhost:8080/test/api";

        //RestTemplate restTemplate = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

        HttpEntity<String> entity = new HttpEntity<String>("This is body. When start, this will be shown", headers);

        ResponseEntity<String> result = this.restTemplate.exchange(uri, HttpMethod.POST, entity, String.class);
        log.info(result.getBody());
    }
}
