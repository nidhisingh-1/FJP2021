package Lec4;

import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();

        int temp = num;

        int div = 1;

        while(temp >= 10){

            temp = temp/10;

            div = div * 10;

        }

        int rn = 0;

        int pos = 0;

        while (div >= 1){

            int quo = num / div ;

            pos ++;

            int rem = num % div ;

            rn = rn + quo * (int) Math.pow(10, pos -1);

            num = rem;

            div = div/10;

        }

        System.out.println(rn);

    }
}
