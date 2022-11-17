package com.company.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {

public static void main(String args[]){
List<String> flats= Arrays.asList("B101","Bwe","B05");
Optional<String> result = flats.stream().filter(flat->flat.startsWith("Y")).findFirst();
result.ifPresent(System.out::println);
System.out.println(result.orElse("not found"));
}

}
