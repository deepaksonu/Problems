package com.deepak.problems.numbersystem;

public class RangeXor {
    public static void main(String[] args) {
        int a = 3;
        int b = 9;

        int ans = xor(b) ^ xor(a-1);
        System.out.println(ans);

        int ans2 = 0;
        for (int i = a ; i <= b ; i++){
            ans2 = ans2 ^ i;
        }

        System.out.println(ans2);

    }

    static int xor(int n){
        if(n % 4 == 0){
            return n;
        }

        if(n % 4 == 1){
            return 1;
        }
        if(n % 4 == 2){
            return n+1;
        }
        if(n % 4 == 3){
            return 0;
        }

        return 0;
    }
}
