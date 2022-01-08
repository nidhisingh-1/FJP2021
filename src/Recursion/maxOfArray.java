package Recursion;

import java.util.Scanner;

public class maxOfArray {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = scn.nextInt();
        }
        System.out.println(max(arr,0));
    }

    private static int max(int[] arr, int idx) {

        if(idx == arr.length){
            return 0;
        }

        int maxElement = arr[idx];
        int recAns = max(arr, idx+1);
        maxElement = Math.max(maxElement, recAns);

        return maxElement;
    }
}
