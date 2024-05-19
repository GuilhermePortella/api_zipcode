package br.com.postman.confg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author Guilherme
 */
@Configuration
public class Confg {
    
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
    
}
