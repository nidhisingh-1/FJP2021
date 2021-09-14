package Lec11Test;

import java.util.Scanner;

public class HollowSquareNos {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = 0;
        int val;

        for (int i = 1; i <= n; i++) {

            if (n % 2 == 0) {

                if (i <= n / 2) {
                    val = n * k + 1;
                    k = k + 2;
                } else {
                    k = k - 2;
                    val = n * k + 1;

                }

            } else {

                if (n / 2 + 1 > i) {

                    val = n * k + 1;
                    k = k + 2;

                } else if (i == n / 2 + 1) {
                    val = n * k + 1;
                    k = k - 1;

                } else {
                    val = n * k + 1;
                    k = k - 2;
                }
            }

            for (int j = 1; j <= n; j++) {

                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print(val + " ");
                } else {
                    System.out.print("* ");
                }
                val++;
            }

            System.out.println();

        }


    }
}
