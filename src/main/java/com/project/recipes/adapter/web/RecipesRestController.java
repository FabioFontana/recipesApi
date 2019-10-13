package com.project.recipes.adapter.web;

import com.project.recipes.adapter.web.dto.RecipesDto;
import com.project.recipes.adapter.web.mapper.RecipesDtoMapper;
import com.project.recipes.application.service.RecipesService;
import com.project.recipes.domain.model.Recipes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("recipes")
public class RecipesRestController {

    private static final Logger LOGGER = LoggerFactory.getLogger(RecipesRestController.class);

    private final RecipesService recipesService;
    private final RecipesDtoMapper recipesDtoMapper;

    @Autowired
    public RecipesRestController(RecipesService recipesService, RecipesDtoMapper recipesDtoMapper) {
        this.recipesService = recipesService;
        this.recipesDtoMapper = recipesDtoMapper;
    }

    @PostMapping
    public ResponseEntity<RecipesDto> create(@Valid @RequestBody RecipesDto recipesDto) {

        Recipes recipes = recipesDtoMapper.recipesDtoToRecipes(recipesDto);
        LOGGER.info("Received request to create a recipe");
        Recipes savedRecipe = recipesService.save(recipes);
        RecipesDto responseBody = recipesDtoMapper.recipesToRecipesDto(savedRecipe);


        return ResponseEntity.status(HttpStatus.CREATED).body(responseBody);
    }
}
