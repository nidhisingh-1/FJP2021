package Lec5;

import java.util.Scanner;

public class GCDandLCM {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n1 = scn.nextInt();

        int n2 = scn.nextInt();

        int tn1 = n1;

        int tn2 = n2;

        while (tn1 % tn2 != 0){

            int rem = tn1 % tn2 ;

            //ab kon divide hoga

            tn1 = tn2;

            //ab kon divide karega

            tn2 = rem;

        }

        int gcd = tn2;

        int lcm = (n1 * n2 )/gcd;

        System.out.println(gcd);

        System.out.println(lcm);
    }
}
