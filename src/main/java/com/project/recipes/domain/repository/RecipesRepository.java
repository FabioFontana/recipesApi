package com.project.recipes.domain.repository;

import com.project.recipes.domain.model.Recipes;

import java.util.List;
import java.util.Optional;

public interface RecipesRepository {

    List<Recipes> getAll();

    Optional<Recipes> getById(Long id);

    Optional<Recipes> save (Recipes recipes);
}
