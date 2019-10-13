package com.project.recipes.adapter.repository;

import com.project.recipes.domain.model.Ingredients;
import com.project.recipes.domain.repository.PreparationMethodRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class PreparationMethodJooqRepository implements PreparationMethodRepository {
    @Override
    public List<Ingredients> getAll() {
        return null;
    }

    @Override
    public Optional<Ingredients> getById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<Ingredients> save(Ingredients recipes) {
        return Optional.empty();
    }
}
