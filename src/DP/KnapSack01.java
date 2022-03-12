package DP;

import java.util.Scanner;

public class KnapSack01 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] items = new int[n];
        int [] wts = new int[n];

        for(int i = 0; i < items.length ; i++){
            items[i] = scn.nextInt();
        }

        for(int i = 0; i < wts.length ; i++){
            wts[i] = scn.nextInt();
        }

        int cap = scn.nextInt();
        int [][] dp = new int[n+1][cap + 1];
        for(int i = 0 ; i < dp.length ; i++){
            for(int j = 0 ; j < dp[0].length ; j++){

            }
        }
    }
}
