package com.deepak.problems.numbersystem;

public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 7;
        boolean isPowerOfTwo = (n & (n-1)) == 0;
        System.out.println(isPowerOfTwo);
    }
}
