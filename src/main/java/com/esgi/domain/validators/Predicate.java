package com.esgi.domain.validators;

public interface Predicate<T> {

    boolean validate(T entity);
}
