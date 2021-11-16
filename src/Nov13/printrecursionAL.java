package Nov13;

import java.util.ArrayList;
import java.util.Scanner;

public class printrecursionAL {

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        ArrayList<String> acont = new ArrayList<>();
        pss(str, "", acont);
        System.out.println(acont);
    }

    // xyz, .
    public static void pss(String ques, String asf, ArrayList<String> acont){
        if(ques.length() == 0){
            acont.add(asf);
            return;
        }

        char ch = ques.charAt(0); // x
        String roq = ques.substring(1); // yz

        pss(roq, asf + ch, acont);
        pss(roq, asf + "-", acont);
    }
}
