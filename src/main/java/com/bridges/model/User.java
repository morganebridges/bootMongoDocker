package com.bridges.model;

import org.springframework.data.annotation.Id;

public class User {

    @Id
    private Long id;
    private String name;


    public User(String name){
        this.name = name;
    }
    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }
}
