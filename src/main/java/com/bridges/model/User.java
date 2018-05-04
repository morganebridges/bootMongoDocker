package com.bridges.model;

import org.springframework.data.annotation.Id;
import java.time.LocalDate;

public class User {

    @Id
    private Long id;
    private String name;

    private LocalDate createdDate;
    private LocalDate updatedDate;


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

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDate getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(LocalDate updatedDate) {
        this.updatedDate = updatedDate;
    }
}
