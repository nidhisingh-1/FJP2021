package Lec9;

import java.util.Scanner;

public class Pattern16 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nst = 1;
        int nsp = 2 * n - 3;

        for (int i = 1; i <= n; i++) {

            for (int k = 1; k <= nst; k++) {
                System.out.print(k + "\t");

            }

            for (int j = 1; j <= nsp; j++) {
                System.out.print("\t");
            }

            if (i == n) {
                nst--;
            }

            for (int k = nst; k >= 1; k--) {
                System.out.print(k + "\t");


            }

            nsp -= 2;
            nst++;

            System.out.println();
        }
    }
}
