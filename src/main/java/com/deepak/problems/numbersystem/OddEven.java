package com.deepak.problems.numbersystem;

public class OddEven {

    public static void main(String[] args){
        int n = 61;
        System.out.println(isOdd(n));
    }

    public static boolean isOdd(int n){
        return (n & 1) == 1;
    }
}
