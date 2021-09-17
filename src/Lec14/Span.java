package Lec14;

import java.util.Scanner;

public class Span {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0 ; i < arr.length ; i++){
            arr[i] = scn.nextInt();
        }
        int res = span(arr);
        System.out.println(res);

    }

    public static int span(int[] arr) {
        int span ;
        int max = arr[0];
        int min = arr[0];

        for (int i = 1 ; i < arr.length ; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }


            if (arr[i] < min) {
                min = arr[i];
            }

        }

        System.out.println(max);
        System.out.println(min);

        span = max - min;

        return span;
    }
}
