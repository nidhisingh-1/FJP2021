package Lec4;

import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int revNum = 0;

        while (n != 0) {
            int r = n % 10;
            revNum = revNum * 10 + r;
            n = n / 10;
        }

        System.out.println(revNum);

    }
}
