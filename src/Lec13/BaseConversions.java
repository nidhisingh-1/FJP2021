package Lec13;

import java.util.Scanner;

public class BaseConversions {

    public static int DecimalToAny(int num, int db) {

        int dn = 0; // destination number
        int tp = 1;

        while (num != 0) {

            int rem = num % db;

            dn = dn + rem * tp;

            tp = tp * 10;

            num = num / db;

        }

        return dn;

    }

    public static int anyToDecimal(int num, int b) {

        int dn = 0;
        int bp = 1;

        while (num != 0) {

            int rem = num % 10;

            dn = dn + rem * bp;

            bp *= b;

            num = num / 10;

        }

        return dn;
    }


    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int b = scn.nextInt();

        int res1 = anyToDecimal(n, b);
//
//         System.out.println(res1);
        int b2 = scn.nextInt();

        int res2 = DecimalToAny(res1,b2);

        System.out.println(res2);




    }
}
