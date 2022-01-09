package Recursion;

import java.util.Scanner;

public class LastIndex {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = scn.nextInt();
        }
        int x = scn.nextInt();
        System.out.println(lastIndex(arr, 0,x));
    }

    private static int lastIndex(int[] arr, int idx, int x) {

        if(idx == arr.length){
            return -1;
        }

        int liisa = lastIndex(arr, idx + 1, x);
        if(liisa != -1){
            return liisa;
        } else if(arr[idx] == x){
            return idx;
        } else {
            return -1;
        }

    }
}
