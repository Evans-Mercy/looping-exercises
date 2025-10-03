package com.pluralsight;

public class ForLoop {
    public static void main(String[] args) throws InterruptedException {

        for(int i = 10; i >= 1; i--){       //counts down from 10 to 1
            System.out.println(i);          //prints current value of i
            Thread.sleep(1000);        //pauses program for 1000 milliseconds (1 second)
        }
        System.out.println("Launch!");       //displays launch at the end
    }
}
