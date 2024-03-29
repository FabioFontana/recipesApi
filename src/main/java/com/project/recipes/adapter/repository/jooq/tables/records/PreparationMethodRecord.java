/*
 * This file is generated by jOOQ.
 */
package com.project.recipes.adapter.repository.jooq.tables.records;


import com.project.recipes.adapter.repository.jooq.tables.PreparationMethod;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


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
public class PreparationMethodRecord extends UpdatableRecordImpl<PreparationMethodRecord> implements Record2<Long, String> {

    private static final long serialVersionUID = 1634252683;

    /**
     * Setter for <code>preparation_method.ID</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>preparation_method.ID</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>preparation_method.METHOD</code>.
     */
    public void setMethod(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>preparation_method.METHOD</code>.
     */
    public String getMethod() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Long, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Long, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return PreparationMethod.PREPARATION_METHOD.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return PreparationMethod.PREPARATION_METHOD.METHOD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getMethod();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getMethod();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PreparationMethodRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PreparationMethodRecord value2(String value) {
        setMethod(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PreparationMethodRecord values(Long value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PreparationMethodRecord
     */
    public PreparationMethodRecord() {
        super(PreparationMethod.PREPARATION_METHOD);
    }

    /**
     * Create a detached, initialised PreparationMethodRecord
     */
    public PreparationMethodRecord(Long id, String method) {
        super(PreparationMethod.PREPARATION_METHOD);

        set(0, id);
        set(1, method);
    }
}
