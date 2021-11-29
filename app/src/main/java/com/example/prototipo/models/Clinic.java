package com.example.prototipo.models;

import java.io.Serializable;

public class Clinic  implements Serializable {
    private String name;
    private String phone;

    private Address address;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

    public String getPhone(){
        return this.phone;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getAddress(){
        return address;
    }
}
