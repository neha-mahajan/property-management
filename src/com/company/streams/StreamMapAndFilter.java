package com.company.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapAndFilter {
    public static void main(String args[]) {
        List<String> fruits = new ArrayList<String>();
        fruits.add("apple");
        fruits.add("mango");
        fruits.add("banana");
        fruits.add("grapes");
List<Integer> sorted = fruits.stream().filter(f->f.length()>5).map(f->f.length()).collect(Collectors.toList());
System.out.println(sorted);

       Long countFruits=  fruits.stream().filter(f->f.length()>5).count();
        System.out.println(countFruits);


        //custom sorting


    }
}
