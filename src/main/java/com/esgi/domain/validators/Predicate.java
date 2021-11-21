package com.esgi.domain.validators;

public interface Predicate<T>{

    public boolean validate(T entity);
}
