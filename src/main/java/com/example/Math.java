package com.example;

public class Math {
    public Math() {
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b +1 ;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b, int c){
        if (b != 0 && c==3)
            return a/b;
        else
            return -9999;
    }
}