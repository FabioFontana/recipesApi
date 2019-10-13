package com.project.recipes.domain.model;

import com.project.recipes.adapter.repository.jooq.tables.Category;
import com.project.recipes.adapter.web.dto.IngredientsDto;
import com.project.recipes.adapter.web.dto.PrepationMethodDto;

import java.util.List;

public class Recipes {

    private Long id;
    private String name;
    private List<IngredientsDto> ingredientsList;
    private PrepationMethodDto prepationMethod;
    private Category category;

    public Recipes(Long id, String name, List<IngredientsDto> ingredientsList, PrepationMethodDto prepationMethod, Category category) {
        this.id = id;
        this.name = name;
        this.ingredientsList = ingredientsList;
        this.prepationMethod = prepationMethod;
        this.category = category;
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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Recipes{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ingredientsList=" + ingredientsList +
                ", prepationMethod=" + prepationMethod +
                '}';
    }
}
