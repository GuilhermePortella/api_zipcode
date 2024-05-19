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

    @Autowired
    private RestTemplate restTemplate;
    
    public Principal consumidor(){
        String url = "https://api.postmon.com.br/v1/cep/14680000";
        Principal principal = restTemplate.getForObject(url, Principal.class);
        
        return principal;
    }

}
