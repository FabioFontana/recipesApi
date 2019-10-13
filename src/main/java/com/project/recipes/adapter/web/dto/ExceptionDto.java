package com.project.recipes.adapter.web.dto;

import java.time.LocalDateTime;
import java.util.Map;

public class ExceptionDto {

    private LocalDateTime time;
    private String message;
    private Map<String, String> errors;

    public ExceptionDto(String message, Map<String, String> errors) {
        this.time = LocalDateTime.now();
        this.message = message;
        this.errors = errors;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Map<String, String> getErrors() {
        return errors;
    }

    public void setErrors(Map<String, String> errors) {
        this.errors = errors;
    }
}
