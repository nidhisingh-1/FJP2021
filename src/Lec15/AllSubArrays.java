package Lec15;

import java.util.Scanner;

public class AllSubArrays {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        char[] arr = new char[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (char) scn.nextInt();
        }

        for (int si = 0; si < arr.length; si++) {
            for (int ei = si; ei < arr.length; ei++) {
                for (int i = si; i <= ei; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }

            System.out.println("-----------------------");
        }
    }
}
