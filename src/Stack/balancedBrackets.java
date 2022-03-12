package Stack;

import java.util.Scanner;
import java.util.Stack;

public class balancedBrackets {

    public static void main(String[] args) {

        Stack<Character> st = new Stack<>();
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else if (ch == ')') {
                 if(st.size() == 0) {
                    System.out.println(false);
                    return;
                } else if (st.peek() != '(') {
                    System.out.println(false);
                    return;
                } else {
                    st.pop();
                }
            }
            else if (ch == ']') {
                if (st.size() == 0) {
                    System.out.println(false);
                    return;
                }
                if (st.peek() != '[') {
                    System.out.println(false);
                    return;
                } else {
                    st.pop();
                }
            }
            else if (ch == '}') {
                if (st.size() == 0) {
                    System.out.println(false);
                    return;
                }
                if (st.peek() != '{') {
                    System.out.println(false);
                    return;
                } else {
                    st.pop();
                }
            }

            System.out.println(st.size() == 0);

        }
    }
}
