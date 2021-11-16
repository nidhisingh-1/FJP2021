package Nov13;

import java.util.ArrayList;
import java.util.Scanner;

public class printSubsequence {

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        ArrayList<String> ss = gss(str);
        System.out.println(ss);
    }

    // xyz = ---, --z, -y-, -yz, x--, x-z, xy-, xyz
    // yz = --, -z, y-, yz
    public static ArrayList<String> gss(String str){
        if(str.length() == 0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        char ch = str.charAt(0); // x
        String ros = str.substring(1); //yz
        ArrayList<String> rres = gss(ros);// --, -z, y-, yz
        ArrayList<String> mres = new ArrayList<>();

        for(String rstr: rres){
            String mstr = rstr;
            mres.add(mstr);
        } // ---, --z, -y-, -yz

        for(String rstr: rres){
            String mstr = ch + rstr;
            mres.add(mstr);
        } // x--, x-z, xy-, xyz

        return mres;
    }
}
