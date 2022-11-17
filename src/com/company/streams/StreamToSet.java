package com.company.streams;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamToSet {

    public static void main(String[] args){
Set<Integer> numSet = new HashSet<>();
numSet.add(1);
numSet.add(3);
numSet.add(15);
Set<Integer> filteredSet = numSet.stream().filter(a->a>3).collect(Collectors.toSet());
System.out.println(filteredSet);

    }
}
