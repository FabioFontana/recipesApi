package com.project.recipes.domain.repository;

import com.project.recipes.domain.model.Ingredients;

import java.util.List;
import java.util.Optional;

public interface IngredientsRepository {

    List<Ingredients> getAll();

    Optional<Ingredients> getById(Long id);

    Optional<Ingredients> save (Ingredients recipes);
}
