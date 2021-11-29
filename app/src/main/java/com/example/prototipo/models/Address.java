package com.example.prototipo.models;

import java.io.Serializable;

public class Address implements Serializable {
    private String cep;
    private String completeAddress;

    public void setCep(String cep){
        this.cep = cep;
    }

    public String getCep(){
        return this.cep;
    }

    public void setCompleteAddress(String completeAddress){
        this.completeAddress = completeAddress;
    }

    public String getCompleteAddress(){
        return this.completeAddress;
    }
}
