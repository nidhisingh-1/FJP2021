package Lec4;

import java.util.Scanner;

public class Inverse {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int pos = 0;

        int num = scn.nextInt();

        int inv = 0;

        while (num != 0) {
            int rem = num % 10;
            pos++;

            num = num/10;

            inv = inv + pos * (int) Math.pow(10, rem - 1);


        }

        System.out.println(inv);


    }
}
