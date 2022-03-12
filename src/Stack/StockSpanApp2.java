package Stack;

import java.util.Scanner;
import java.util.Stack;

public class StockSpanApp2 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        stockSpan(arr);
    }


    private static void stockSpan(int[] arr) {
        int[] ans = new int[arr.length];
        Stack<Integer> st = new Stack<>();


        st.push(arr.length-1);

        for (int i = arr.length-2 ; i >= 0; i--) {
            int val = arr[i];

            while (st.size() > 0 && arr[i] >= arr[st.peek()]) {
                int pidx = st.pop();
                ans[pidx] = pidx - i;
            }

            st.push(i);
        }
        while (st.size() > 0) {
            int pidx = st.pop();
            ans[pidx] = pidx + 1;
        }


    }
}
