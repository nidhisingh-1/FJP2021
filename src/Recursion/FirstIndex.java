package Recursion;

import java.util.Scanner;

public class FirstIndex {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = scn.nextInt();
        }
        int x = scn.nextInt();
        System.out.println(firstIndex(arr, 0,x));
    }

    private static int firstIndex(int[] arr, int idx, int x) {

        if(arr.length== idx){
            return -1;
        }

       if(arr[idx] == x){
           return idx;
       } else {
           int fi = firstIndex(arr, idx+1, x);
           return fi;
       }

    }
}
