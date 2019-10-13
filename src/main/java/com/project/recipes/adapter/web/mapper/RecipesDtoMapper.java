package com.project.recipes.adapter.web.mapper;


import com.project.recipes.adapter.web.dto.RecipesDto;
import com.project.recipes.domain.model.Recipes;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface RecipesDtoMapper {

    RecipesDto recipesToRecipesDto(Recipes recipes);
    Recipes recipesDtoToRecipes(RecipesDto recipesDto);
}
