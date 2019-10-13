package com.project.recipes.application.service;

import com.project.recipes.application.exception.RecipeNotSaveException;
import com.project.recipes.domain.model.Recipes;
import com.project.recipes.domain.repository.RecipesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RecipesService {

    private final RecipesRepository recipesRepository;

    @Autowired
    public RecipesService(RecipesRepository recipesRepository) {
        this.recipesRepository = recipesRepository;
    }

    @Transactional
    public Recipes save(Recipes recipes) {
        return  saveIntoDatabase(recipes);
    }

    @Transactional
    public Recipes saveIntoDatabase(Recipes recipes) {

       return recipesRepository.save(recipes).orElseThrow(() -> new RecipeNotSaveException(recipes));
    }
}
