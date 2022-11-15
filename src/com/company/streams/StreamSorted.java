package com.company.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSorted {

    public static void main(String args[]) {
        ArrayList<Integer> no = new ArrayList<Integer>();
        no.add(13);
        no.add(24);
        no.add(3);
        no.add(43);
        no.add(5);
        System.out.println("no");

        List<Integer> output = no.stream().sorted((elem1,elem2)->elem2.compareTo(elem1)).collect(Collectors.toList());

        System.out.println(output);


    }
}
