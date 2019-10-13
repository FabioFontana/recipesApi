package com.project.recipes.domain.model;

public class Ingredients {

    private Long id;
    private String name;
    private Long qtt;

    public Ingredients(Long id, String name, Long qtt) {
        this.id = id;
        this.name = name;
        this.qtt = qtt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getQtt() {
        return qtt;
    }

    public void setQtt(Long qtt) {
        this.qtt = qtt;
    }
}
