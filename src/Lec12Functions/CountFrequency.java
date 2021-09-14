package Lec12Functions;

import java.util.Scanner;

public class CountFrequency {

    public static int getFrequency(int num, int dig) {

        int freq = 0;

        while (num != 0) {
            int rem = num % 10;
            if (rem == dig) {
                freq++;
            }

            num = num / 10;
        }

        return freq;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        int dig = scn.nextInt();

        int res = getFrequency(num, dig);
        System.out.println("The frequency of " + dig + " is: " + res);
    }
}
