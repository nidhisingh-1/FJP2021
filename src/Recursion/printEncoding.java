package Recursion;

import java.util.Scanner;

public class printEncoding {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        printEncodings(str, "");

    }

    public static void printEncodings(String str, String asf) {

        if(str.length() == 0){
            System.out.println(asf);
            return;
        }

        char ch = str.charAt(0);
        if(ch == '0'){
            return;
        }

        String ros = str.substring(1);
        int n = ch - '0';
        char tobeadded = (char) (ch + n - 1);
        printEncodings(ros , asf + tobeadded);

        if(str.length() > 1){
           char ch2 = str.charAt(1);
           int num = n*10 + (ch2 - '0');

           if(num <= 26){
               char tobeadded2 = (char) ('a'+ num -1);
               printEncodings(str.substring(2), asf + tobeadded2);
           }

        }

    }
}
