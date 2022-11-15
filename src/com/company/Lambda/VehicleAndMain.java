package com.company.Lambda;

public class VehicleAndMain {

    public void multiply() {
        System.out.println("I am a normal function");
    }

    public static void main(String args[]) {
        Multiplyinterface ml = () -> System.out.println("I am a lambda function");
        ml.multiply();
    }
}
