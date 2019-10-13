package com.project.recipes.application.exception;

import com.project.recipes.domain.model.Recipes;

public class RecipeNotSaveException extends RuntimeException{

    public RecipeNotSaveException(Recipes recipes) {
        super("Could not save recipe" + recipes.toString());
    }

}
