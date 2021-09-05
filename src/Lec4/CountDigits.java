package Lec4;

import java.util.Scanner;

public class CountDigits {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();

        int count = 0;

        while (num != 0){

            int quo = num / 10;

            count ++;

            num = quo;
        }

        System.out.println(count);
    }
}
