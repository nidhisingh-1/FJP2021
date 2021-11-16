package Nov13;

import java.util.Scanner;

public class printssRecursion {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        pss(str, "");
    }

    // xyz, .
    public static void pss(String ques, String asf) {
        if (ques.length() == 0) {
            System.out.println(asf);
            return;
        }

        char ch = ques.charAt(0); // x
        String roq = ques.substring(1); // yz

        pss(roq, asf + ch);
        pss(roq, asf + "-");
    }


}
