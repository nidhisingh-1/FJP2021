package Nov12;

import java.util.Arrays;
import java.util.Scanner;

public class checkDuplicate {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];

        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = scn.nextInt();
        }

        Arrays.sort(arr); //nlogn

        boolean duplicate = false;

        for(int i = 0 ; i< arr.length-1 ; i++){
            if (arr[i] == arr[i + 1]) {
                duplicate = true;
                System.out.println(arr[i]);
                break;
            }
        }

        if(!duplicate){
            System.out.println(-1);
        }
    }
}
