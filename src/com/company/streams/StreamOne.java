package com.company.streams;

import com.company.predicates.Predicates;
import com.company.predicates.Predicatesdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamOne {

    public static void main(String args[]) {
        ArrayList<Integer> no = new ArrayList<Integer>();
        no.add(1);
        no.add(2);
        no.add(3);
        no.add(4);
        no.add(5);
        System.out.println("no");


        //until java8

        List<Integer> oddnos =no.stream().filter(num -> num % 2 != 0).collect(Collectors.toList());
        System.out.println("Odd nos are"+oddnos);
    }
}
