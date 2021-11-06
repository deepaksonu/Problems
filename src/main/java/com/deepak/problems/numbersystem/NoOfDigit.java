package com.deepak.problems.numbersystem;

public class NoOfDigit {
    public static void main(String[] args) {
        int num = 8;
        int base = 2;
        int noOfDigit = (int) (Math.log(num) / Math.log(base));
        System.out.println(noOfDigit);
    }
}
