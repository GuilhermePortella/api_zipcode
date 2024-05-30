package br.com.postman.servico;

import br.com.postman.domain.model.CidadeInfo;
import br.com.postman.domain.model.EstadoInfo;
import br.com.postman.domain.model.Principal;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 *
 * @author Guilherme
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class ServicoIT {
    
    @Autowired
    private Servico servico;
    
    @Test
    public void consumerTest(){
        Principal principal = servico.consumidor();
        
        CidadeInfo cidadeInfo = principal.getCidadeInfo();
        EstadoInfo estadoInfo = principal.getEstadoInfo();
        
        Assert.assertEquals("501.87", cidadeInfo.getArea());
        Assert.assertEquals("3525102", cidadeInfo.getCodigoIbge());
        
        Assert.assertEquals("248.221,996", estadoInfo.getArea());
        Assert.assertEquals("35", estadoInfo.getCodigoIbge());
        Assert.assertEquals("São Paulo", estadoInfo.getNome());
        
        Assert.assertEquals("", principal.getBairro());
        Assert.assertEquals("Jardinópolis", principal.getCidade());
        Assert.assertEquals("SP", principal.getEstado());    
        
    }
    
}
