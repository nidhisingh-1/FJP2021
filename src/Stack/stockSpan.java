package Stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class stockSpan {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.println(Arrays.toString(stockspan2(arr)));
    }



    public static int[] stockspan2(int[] arr) {

        int[] ans = new int[arr.length];
        Stack<Integer> st = new Stack<>();

        ans[0] = 1;
        st.push(0); // pushing the index in stack

        for(int i = 1; i < arr.length; i++){
            while(st.size() > 0 && arr[st.peek()] < arr[i]){
                st.pop();
            }

            if(st.size() == 0){
                ans[i] = i + 1;
            } else {
                ans[i] = i - st.peek();
            }

            st.push(i);
        }


        return ans;


    }


}
