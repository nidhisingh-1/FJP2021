package Nov12;

import java.util.Scanner;

public class targetsumtriplet {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        int target = scn.nextInt();

        for (int i = 0; i < arr.length; i++) {

            int ntar = target - arr[i];

            int j = i + 1;
            int k = arr.length - 1;

            if (arr[j] + arr[k] < ntar) {
                j++;
            } else if (arr[j] + arr[k] > ntar) {
                k--;
            } else {
                System.out.println(arr[i] + "," + arr[j] + "," + arr[k]);
                j++;
                k--;

            }
        }
    }
}
