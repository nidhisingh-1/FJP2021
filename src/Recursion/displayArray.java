package Recursion;

import java.util.Scanner;

public class displayArray {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = scn.nextInt();
        }
        int idx = scn.nextInt();
        display(arr, idx);

    }

    private static void display(int[] arr, int idx) {

        if(arr.length == 0 || idx >= arr.length){
            return;
        }
        System.out.println(arr[idx]);
        display(arr, idx + 1);

    }
}
