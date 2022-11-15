package com.company.predicates;

public class PredicateAndExample {
    public  static void main(String args[]){
        Predicates<Integer> isOdd = n->n%2!=0;
        System.out.println(isOdd.test(3));
    }
}
