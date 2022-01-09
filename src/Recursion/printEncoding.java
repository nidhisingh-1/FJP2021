package Recursion;

import java.util.Scanner;

public class printEncoding {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        printEncodings(str);

    }

    public static void printEncodings(String str) {

        String ans = "";

        if(str.length() == 0){
            System.out.println(ans);
            return;
        }

        if(str.charAt(0) == 0){
            return;
        }




    }
}
