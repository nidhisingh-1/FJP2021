package DP;

import java.util.Scanner;

public class climbStairs {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(cs_memo(n, new int[n+1]));
    }

    static int cs_memo(int n, int [] strg){

        if(n ==1 || n == 0){
            return 1;
        }

        if(n < 0){
            return 0;
        }

        if(strg[n] != 0){
            return strg[n];
        }

        int step1 = cs_memo(n-1, strg);
        int step2 = cs_memo(n-2, strg);
        int step3 = cs_memo(n-3, strg);
        int steps = step1 + step2 + step3;

        strg[n] = steps;

        return steps;
    }

    static int cs_tab(int n){

        int [] strg = new int[n+1];

        strg[0] = 1;
        for(int i = 0 ; i <= n ; i++){
            if(i-1 >= 0){
                strg[i] += strg[i-1];
            }

            if(i-2 >= 0){
                strg[i] += strg[i-2];
            }

            if(i-3 >= 0){
                strg[i] += strg[i-3];
            }
        }

        return strg[n];
    }
}
