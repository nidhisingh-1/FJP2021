package Lec15;

import java.util.Scanner;

public class InverseOfArray {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i< arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int [] inv = new int[n];

        for(int i = 0 ; i < arr.length; i++){
            inv[arr[i]] = i;
        }

        for (int j : inv) {
            System.out.print(j + " ");
        }
    }
}
