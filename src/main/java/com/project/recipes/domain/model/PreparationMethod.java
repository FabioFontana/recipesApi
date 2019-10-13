package com.project.recipes.domain.model;

public class PreparationMethod {

    private Long id;
    private String method;

    public PreparationMethod(Long id, String method) {
        this.id = id;
        this.method = method;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }
}
