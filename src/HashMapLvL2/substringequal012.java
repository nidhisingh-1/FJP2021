package HashMapLvL2;

import java.util.HashMap;
import java.util.Scanner;

public class substringequal012 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        System.out.println(count(str));
    }

    private static long count(String str) {

        int c0 = 0;
        int c1 = 0;
        int c2 = 0;
        long ans = 0;
        String key = "0#0";

        HashMap<String, Integer> map = new HashMap<>();
        map.put(key, 1);

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == '0') {
                c0++;
            } else if (ch == '1') {
                c1++;
            } else if (ch == '2') {
                c2++;
            }

            key = (c1 - c0) + "#" + (c2 - c1);

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
