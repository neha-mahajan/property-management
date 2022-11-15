package com.company.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMap {
    public static void main(String args[]) {
        ArrayList<Integer> no = new ArrayList<Integer>();
        no.add(1);
        no.add(2);
        no.add(3);
        no.add(4);
        no.add(5);
        System.out.println("no");
        List<Integer> output = no.stream().map(a->a*3).collect(Collectors.toList());
        System.out.println(output);

    }
}
