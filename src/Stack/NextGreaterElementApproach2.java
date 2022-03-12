package Stack;

import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElementApproach2 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println(nge2(arr));
    }

    private static int[] nge2(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int [] ans = new int[arr.length];

        st.push(0);
        for(int i = 0 ; i < arr.length; i++){
            while(st.size() > 0 && arr[st.peek()] < arr[i]){
                int pidx = st.pop();
                ans[i] = pidx;
            }

            st.push(i);
        }

        while(st.size()>0){
            int pidx = st.pop();
            ans[pidx] = -1;
        }

        return ans;

    }
}
