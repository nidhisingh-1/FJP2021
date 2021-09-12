package Lec9;

import java.util.Scanner;

public class Pattern18 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int nst = n;
        int nsp = 0;

        for (int i = 1; i <= n; i++) {

            for (int j = 0; j <= nsp; j++) {
                System.out.print("\t");
            }

            for (int j = 1; j <= nst; j++) {

                if (i > 1 && i < n / 2) {

                    if (j == 1 || j == nst) {
                        System.out.print("*\t");
                    } else {
                        System.out.print("\t");
                    }

                } else {
                    System.out.print("*\t");
                }

            }


            System.out.println();

            if (i <= n / 2) {
                nsp++;
                nst -= 2;
            } else {
                nsp--;
                nst += 2;
            }
        }
    }
}
