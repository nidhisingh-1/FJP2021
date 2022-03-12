package DP;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(feb_mem(n, new int[n+1]));
    }

    static int feb_mem(int n, int [] strg){

        if(n == 0 || n== 1){
            return n;
        }

        if(strg[n] != 0){
            return strg[n];
        }

        int fbnm1 = feb_mem(n-1, strg);
        int fbnm2 = feb_mem(n-2, strg);
        int fb = fbnm1 + fbnm2;

        strg[n] = fb;

        return fb;

    }
}
