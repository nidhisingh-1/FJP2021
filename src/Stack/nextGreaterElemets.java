package Stack;

import java.util.Scanner;
import java.util.Stack;

public class nextGreaterElemets {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        nge(arr);
    }

    private static void nge(int[] arr) {
        int[] ans = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        ans[arr.length - 1] = -1;
        st.push(arr[arr.length - 1]);

        for (int i = arr.length - 2; i >= 0; i--) {
            int val = arr[i];
            while (st.size() > 0 && st.peek() < val) {
                st.pop();
            }
            if(st.size() == 0){
                ans[i] = -1;
            }
            else{
              ans[i] = st.peek();
            }

            st.push(val);
        }


    }
}
