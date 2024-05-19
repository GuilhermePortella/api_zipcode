package br.com.postman.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author Guilherme
 */
public class Principal {
    
    @JsonProperty("bairro")
    private String Bairro;
    
    @JsonProperty("cep")
    private String Cep;
    
    @JsonProperty("cidade")
    private String Cidade;
    
    @JsonProperty("cidade_info")
    private CidadeInfo cidadeInfo; 
    
    @JsonProperty("estado")
    private String estado;
    
    @JsonProperty("estado_info")
    private EstadoInfo estadoInfo;

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    public String getCep() {
        return Cep;
    }

    public void setCep(String Cep) {
        this.Cep = Cep;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public CidadeInfo getCidadeInfo() {
        return cidadeInfo;
    }

    public void setCidadeInfo(CidadeInfo cidadeInfo) {
        this.cidadeInfo = cidadeInfo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public EstadoInfo getEstadoInfo() {
        return estadoInfo;
    }

    public void setEstadoInfo(EstadoInfo estadoInfo) {
        this.estadoInfo = estadoInfo;
    }

    @Override
    public String toString() {
        return "Principal{" + "Bairro=" + Bairro + ", Cep=" + Cep + ", Cidade=" + 
                Cidade + ", cidadeInfo=" + cidadeInfo + ", estado=" + 
                estado + ", estadoInfo=" + estadoInfo + '}';
    }
}
