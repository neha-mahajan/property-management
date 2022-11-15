package com.company.predicates;

public class PredicateAndDemoMainJava8 {

    public  static void main(String args[]){
        Predicates<Integer> predicate = age->age>18;
        System.out.println(predicate.test(3));
    }
}
