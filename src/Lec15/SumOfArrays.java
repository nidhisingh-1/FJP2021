package Lec15;

import java.util.Scanner;

public class SumOfArrays {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scn.nextInt();
        }
        int n2 = scn.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = scn.nextInt();
        }

        int[] sum = new int[Math.max(n2, n1)];

        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = sum.length - 1;
        int c = 0;

        while (k >= 0) {
            int d = c;

            if (i >= 0) {
                d = d + arr1[i];
            }

            if (j >= 0) {
                d = d + arr2[j];
            }

            c = d / 10;
            d = d % 10;

            sum[k] = d;

            i--;
            j--;
            k--;


        }

        if (c > 0) {
            System.out.println(c);
        }

        for (int l = 0; l < sum.length; l++) {
            System.out.println(sum[l]);
        }


    }
}
