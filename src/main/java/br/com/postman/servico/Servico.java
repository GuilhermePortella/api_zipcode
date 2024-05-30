package br.com.postman.servico;

import br.com.postman.domain.model.Principal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author Guilherme
 */
@Service
public class Servico {

    private RestTemplate restTemplate;
    private static  final String URL = "https://api.postmon.com.br/v1/cep/14680000";

    
    public Servico(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }
    
    public Principal consumidor(){
        return restTemplate.getForObject(URL, Principal.class);
    }
}