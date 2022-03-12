package Stack;

import java.util.Scanner;
import java.util.Stack;

public class duplicateBrackets {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        Stack<Character> st = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if(ch == ')'){
                if(st.peek() == '('){
                    System.out.println(true);
                    return;
                } else {
                    while(st.size() > 0 && st.peek() != '('){
                        st.pop();
                    }
                    st.pop();
                }

            } else {
                st.push(ch); // opening bracket or some char
            }
        }

        System.out.println(false);

    }
}

