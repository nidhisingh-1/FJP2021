package Stack;

import java.util.Scanner;
import java.util.Stack;

public class slidingWindowMax {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int[] nge = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        nge[arr.length - 1] = -1;
        st.push(arr[arr.length - 1]);

        for (int i = arr.length - 2; i >= 0; i--) {
            int val = arr[i];
            while (st.size() > 0 && st.peek() < val) {
                st.pop();
            }
            if (st.size() == 0) {
                nge[i] = -1;
            }
            if (st.peek() > val) {
                nge[i] = st.peek();
            }

            st.push(val);
        }
        int k = scn.nextInt();
        int[] ans = new int[arr.length - k + 1];
        int j = 0;
        for (int l = 0; l <= arr.length - k; l++) {
            if (j < l) {
                j = l;
            }

            while (nge[j] < l + k) {
                j = nge[j];
            }

            ans[l] = arr[j];
        }

        for (int m : ans) {
            System.out.println(m);
        }

    }
}
