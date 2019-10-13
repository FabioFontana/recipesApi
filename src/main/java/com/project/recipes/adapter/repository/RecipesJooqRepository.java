package com.project.recipes.adapter.repository;

import com.project.recipes.adapter.repository.jooq.tables.records.RecipesRecord;
import com.project.recipes.domain.model.Ingredients;
import com.project.recipes.domain.model.PreparationMethod;
import com.project.recipes.domain.model.Recipes;
import com.project.recipes.domain.repository.RecipesRepository;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

import static com.project.recipes.adapter.repository.jooq.tables.Recipes.RECIPES;


@Repository
public class RecipesJooqRepository implements RecipesRepository {

   private final DSLContext dslContext;

    @Autowired
    public RecipesJooqRepository(DSLContext dslContext) {
        this.dslContext = dslContext;
    }

    @Override
    public List<Recipes> getAll() {
        return null;
    }

    @Override
    public Optional<Recipes> getById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<Recipes> save(Recipes recipes) {

        return Optional.empty();
    }
}
