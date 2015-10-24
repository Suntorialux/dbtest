package com.egorov;

/**
 * Created by Uzed on 17.10.2015.
 */
public class User {
    public int Id;
    public String name;
    public Double number;

    public User(int id, String name, Double number) {
        Id = id;
        this.name = name;
        this.number = number;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getNumber() {
        return number;
    }

    public void setNumber(Double number) {
        this.number = number;
    }
}
