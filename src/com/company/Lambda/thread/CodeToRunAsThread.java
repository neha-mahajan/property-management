package com.company.Lambda.thread;

public class CodeToRunAsThread implements Runnable{
    @Override
    public void run() {
        for(Integer count=1;count<=5;count++){
System.out.println("child thread counter value is"+count);
        }
    }
}
