package Nov12;

import java.util.Arrays;
import java.util.Scanner;

public class targetsumpair {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        int target = scn.nextInt();

        Arrays.sort(arr);

        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            if (arr[i] + arr[j] > target) {
                j--;
            } else if (arr[i] + arr[j] < target) {
                i++;
            } else {
                System.out.println(arr[i] + " and " + arr[j]);
                i++;
                j--;
            }
        }


    }
}
