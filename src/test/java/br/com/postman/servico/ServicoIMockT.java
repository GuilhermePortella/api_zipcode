package br.com.postman.servico;

import br.com.postman.domain.model.CidadeInfo;
import br.com.postman.domain.model.EstadoInfo;
import br.com.postman.domain.model.Principal;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.mockito.Mock;
import static org.mockito.Mockito.times;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author Guilherme
 */

@RunWith(MockitoJUnitRunner.class)
public class ServicoIMockT {
    
    private Servico servico;
    private static  final String URL = "https://api.postmon.com.br/v1/cep/14680000";
    
    @Mock
    private RestTemplate restTemplate;
    
    @Before
    public void before(){
        servico = new Servico(restTemplate);
    }
    
    @Test
    public void bucaInfoCep(){
        
        Principal principal = retornoAPI();
        
        BDDMockito.given(restTemplate
                .getForObject(URL, Principal.class))
                .willReturn(principal);
        
        servico.consumidor();
        
        BDDMockito.verify(restTemplate, times(1)).getForObject(URL, Principal.class);
    }
    
    private Principal retornoAPI(){
        Principal principal = new Principal();
        CidadeInfo cidadeInfo = new CidadeInfo();
        EstadoInfo estadoInfo = new EstadoInfo();
    
        cidadeInfo.setArea("501.87");
        cidadeInfo.setCodigoIbge("3525102");
        
        estadoInfo.setArea("248.221,996");
        estadoInfo.setCodigoIbge("35");
        estadoInfo.setNome("São Paulo");
        
        principal.setBairro("");
        principal.setCidade("Jardinópolis");
        principal.setEstado("SP");
        
        principal.setCidadeInfo(cidadeInfo);
        principal.setEstadoInfo(estadoInfo);
        
        return principal;
    }
    
}
