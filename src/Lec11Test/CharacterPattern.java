package Lec11Test;

import java.util.Scanner;

public class CharacterPattern {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        char ch = 'A';

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {

                if (j == i || j == 1) {
                    System.out.print(ch);
                } else {
                    System.out.print("*");
                }


            }

            System.out.println();

            ch++;

        }
    }
}
