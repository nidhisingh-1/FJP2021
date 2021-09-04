package Lec2;

import java.util.Scanner;

public class PrintevenOdd {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int i = 1;

        int n = scn.nextInt();

        while (i <= n) {

            if (i % 2 == 0) {
                System.out.println(i + " is even");
            } else {
                System.out.println(i + " is odd");
            }

            i++;
        }
    }
}
