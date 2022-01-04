package Nov18;

import java.util.Scanner;

public class sort012 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];

        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = scn.nextInt();
        }

        int i = 0;
        int j = 0;
        int k = arr.length-1;

        while(i < k){
            if(arr[i] == 1){
                i++;
            } else if(arr[i] == 2){
                swap(arr, i,k);
                k--;
            } else {

            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
    }
}
