package com.deepak.problems.numbersystem;

public class Setbits {
    public static void main(String[] args) {
        int n = 197;
        System.out.println(Integer.toBinaryString(n));

        System.out.println(setBits(n));
    }

    private static int setBits(int n) {
        int count = 0;

        while(n > 0){
            //System.out.println("last set bit : " +  (n &(-n)));
            n = n - (n & (-n));
            count++;
            //System.out.println(n + " in  binary " + Integer.toBinaryString(n));
        }

        /*while(n > 0){
            n = n & (n-1);
            count++;
        }*/
        return count;
    }
}
