/*
 * This file is generated by jOOQ.
 */
package com.project.recipes.adapter.repository.jooq.tables;


import com.project.recipes.adapter.repository.jooq.DefaultSchema;
import com.project.recipes.adapter.repository.jooq.Indexes;
import com.project.recipes.adapter.repository.jooq.tables.records.RecipesRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.12"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Recipes extends TableImpl<RecipesRecord> {

    private static final long serialVersionUID = 270337335;

    /**
     * The reference instance of <code>recipes</code>
     */
    public static final Recipes RECIPES = new Recipes();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RecipesRecord> getRecordType() {
        return RecipesRecord.class;
    }

    /**
     * The column <code>recipes.ID</code>.
     */
    public final TableField<RecipesRecord, Long> ID = createField("ID", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>recipes.NAME</code>.
     */
    public final TableField<RecipesRecord, String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>recipes.INGREDIENTS</code>.
     */
    public final TableField<RecipesRecord, String> INGREDIENTS = createField("INGREDIENTS", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>recipes.PREPARATION_METHOD</code>.
     */
    public final TableField<RecipesRecord, String> PREPARATION_METHOD = createField("PREPARATION_METHOD", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>recipes.CATEGORY</code>.
     */
    public final TableField<RecipesRecord, String> CATEGORY = createField("CATEGORY", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * Create a <code>recipes</code> table reference
     */
    public Recipes() {
        this(DSL.name("recipes"), null);
    }

    /**
     * Create an aliased <code>recipes</code> table reference
     */
    public Recipes(String alias) {
        this(DSL.name(alias), RECIPES);
    }

    /**
     * Create an aliased <code>recipes</code> table reference
     */
    public Recipes(Name alias) {
        this(alias, RECIPES);
    }

    private Recipes(Name alias, Table<RecipesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Recipes(Name alias, Table<RecipesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return DefaultSchema.DEFAULT_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.RECIPES_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<RecipesRecord, Long> getIdentity() {
        return Internal.createIdentity(com.project.recipes.adapter.repository.jooq.tables.Recipes.RECIPES, com.project.recipes.adapter.repository.jooq.tables.Recipes.RECIPES.ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<RecipesRecord> getPrimaryKey() {
        return Internal.createUniqueKey(com.project.recipes.adapter.repository.jooq.tables.Recipes.RECIPES, "KEY_recipes_PRIMARY", com.project.recipes.adapter.repository.jooq.tables.Recipes.RECIPES.ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<RecipesRecord>> getKeys() {
        return Arrays.<UniqueKey<RecipesRecord>>asList(
              Internal.createUniqueKey(com.project.recipes.adapter.repository.jooq.tables.Recipes.RECIPES, "KEY_recipes_PRIMARY", com.project.recipes.adapter.repository.jooq.tables.Recipes.RECIPES.ID)
        );
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Recipes as(String alias) {
        return new Recipes(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Recipes as(Name alias) {
        return new Recipes(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Recipes rename(String name) {
        return new Recipes(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Recipes rename(Name name) {
        return new Recipes(name, null);
    }
}
