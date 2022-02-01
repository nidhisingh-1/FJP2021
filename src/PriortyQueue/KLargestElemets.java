package PriortyQueue;

import java.util.PriorityQueue;
import java.util.Scanner;

public class KLargestElemets {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 1; i <= k; i++) {
            pq.add(arr[i]);
        }


    }

}
