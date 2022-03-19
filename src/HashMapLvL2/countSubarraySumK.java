package HashMapLvL2;

import java.util.HashMap;
import java.util.Scanner;

public class countSubarraySumK {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        int k = scn.nextInt();

        System.out.println(count(arr, k));
    }

    private static long count(int[] arr, int k) {

        int ans = 0;
        int sum = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(sum, 1);

        for (int val : arr) { //2 5 7 1 6
            sum += val;

            if (map.containsKey(sum - k)) {
                ans += map.get(sum - k);
            }

            if (map.containsKey(sum)) {
                map.put(sum, map.get(sum) + 1);
            } else {
                map.put(sum, 1);
            }

        }

        return ans;
    }
}
