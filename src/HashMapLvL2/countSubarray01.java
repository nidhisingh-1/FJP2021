package HashMapLvL2;

import java.util.HashMap;
import java.util.Scanner;

public class countSubarray01 { //count subarray with equal number of 0s and 1s

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

        int ans = 0;
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(sum, 1);

        for (int val : arr) {
            if (val == 0) {
                sum += -1;
            } else if( val == 1){
                sum += 1;
            }

            if(!map.containsKey(sum)){
                map.put(sum, 1);
            }
            else{
                ans += map.get(sum);
                map.put(sum, map.get(sum) + 1);
            }
        }

        return ans;
    }
}
