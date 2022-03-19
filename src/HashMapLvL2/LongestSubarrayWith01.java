package HashMapLvL2;

import java.util.HashMap;
import java.util.Scanner;

public class LongestSubarrayWith01 { //count subarray with equal number of 0s and 1s

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.println(countSubrray(arr));
    }

    private static int countSubrray(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int sum = 0, maxlen = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + (arr[i] == 1 ? 1 : -1);

            if (map.containsKey(sum)) {
                maxlen = Math.max(sum, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }

        return maxlen;
    }
}
