package com.company.predicates;

@FunctionalInterface
public interface Predicates<T> {
    public boolean test(T t);
}
