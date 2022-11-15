package com.company.Lambda.thread;

public class ThreadMain {

    public static  void main(String args[]){

       Runnable rnn= ()-> {
               for(Integer count=1;count<=5;count++) {
                   System.out.println("main thread counter value is" + count);
               }
        };

        Thread thread = new Thread(rnn);
        thread.start();
        for(Integer count=1;count<=5;count++){
            System.out.println("main thread counter value is"+count);
        }
    }
}
