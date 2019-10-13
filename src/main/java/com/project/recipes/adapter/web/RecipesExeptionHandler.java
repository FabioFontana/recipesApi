package com.project.recipes.adapter.web;

import com.project.recipes.adapter.web.dto.ExceptionDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Map;
import java.util.stream.Collectors;

@RestControllerAdvice
public class RecipesExeptionHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(RecipesExeptionHandler.class);

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ExceptionDto> handleFieldsValidation(MethodArgumentNotValidException ex) {
        LOGGER.error("Field validation error - Returning 400 BAD REQUEST", ex);

        Map<String, String> errors = ex.getBindingResult().getFieldErrors().stream()
                .collect(Collectors.toMap(FieldError :: getField, FieldError :: getDefaultMessage));

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ExceptionDto("Há erros" , errors));

    }
}
