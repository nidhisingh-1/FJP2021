package HashMapLvL2;

import java.util.HashMap;
import java.util.Scanner;

public class subArraySumDivbyK {

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

    private static int count(int[] arr, int k) {


        int ans = 0;
        int sum = 0;
        int key = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(key, 1);

        for (int val : arr) {
            sum += val;

            key = sum % k;

            if (key < 0) {
                while (!(key >= 0)) {
                    key += k;
                }
            }

            if (map.containsKey(key)) {
                ans += map.get(key);
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }


        }

        return ans;

    }


}
