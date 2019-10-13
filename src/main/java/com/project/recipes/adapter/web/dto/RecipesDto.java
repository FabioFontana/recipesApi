package com.project.recipes.adapter.web.dto;

import java.util.List;

public class RecipesDto {

    private Long id;
    private String name;
    private List<IngredientsDto> ingredientsList;
    private PrepationMethodDto prepationMethod;

    public RecipesDto(Long id, String name, List<IngredientsDto> ingredientsList, PrepationMethodDto prepationMethod) {
        this.id = id;
        this.name = name;
        this.ingredientsList = ingredientsList;
        this.prepationMethod = prepationMethod;
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

    public List<IngredientsDto> getIngredientsList() {
        return ingredientsList;
    }

    public void setIngredientsList(List<IngredientsDto> ingredientsList) {
        this.ingredientsList = ingredientsList;
    }

    public PrepationMethodDto getPrepationMethod() {
        return prepationMethod;
    }

    public void setPrepationMethod(PrepationMethodDto prepationMethod) {
        this.prepationMethod = prepationMethod;
    }
}
