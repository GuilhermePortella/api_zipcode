/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.postman.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author Guilherme
 */
public class CidadeInfo {
    
    @JsonProperty("area")
    private String area;
    
    @JsonProperty("codigo_ibge")
    private String codigoIbge;

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCodigoIbge() {
        return codigoIbge;
    }

    public void setCodigoIbge(String codigoIbge) {
        this.codigoIbge = codigoIbge;
    }
    

}
