package com.project.recipes.adapter.web.dto;

public class PrepationMethodDto {

    private Long id;
    private String method;

    public PrepationMethodDto(String method) {
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
