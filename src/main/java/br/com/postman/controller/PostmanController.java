package br.com.postman.controller;

import br.com.postman.domain.model.Principal;
import br.com.postman.servico.Servico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Guilherme
 */

@RestController
@RequestMapping("api/minhaApi")
public class PostmanController {
    
    @Autowired
    private Servico servico;
        
    @GetMapping("consumidor")
    public ResponseEntity consumer(){
        Principal principal = servico.consumidor();
        return ResponseEntity.ok(principal);
    }
}
