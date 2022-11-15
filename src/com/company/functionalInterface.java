package com.company;


@FunctionalInterface
public interface functionalInterface {
      public void show();
      public default void details(){
          System.out.println("Inside details method");
      }
}


