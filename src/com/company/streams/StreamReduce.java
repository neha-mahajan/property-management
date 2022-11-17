package com.company.streams;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class StreamReduce {

    public static void main(String args[]){
        OptionalInt sum= IntStream.rangeClosed(1,10).reduce((a,b)->a+b);
System.out.println(sum.getAsInt());
    }
}
