package com.company.predicates;

public class Predicatesdemo implements  Predicates<Integer> {


    @Override
    public boolean test(Integer age) {
        if (age > 18) {
            return true;
        } else {
            return false;
        }
    }
}
