package com.example.javaexs.multithreading;

public class Demmo {

    public static void main(String[] args) {
        FeeThread feeThread = new FeeThread();
        feeThread.start(); //asking office boy to get water
       // feeThread.run();//it will runn on the main thread

    }
}
