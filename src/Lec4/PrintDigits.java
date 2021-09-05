package Lec4;

import java.util.Scanner;

public class PrintDigits {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();

        int temp = num;

        int div = 1;

       while (temp >= 10){

           temp = temp /10;

           div = div * 10;
       }

       while (div >= 1){

           int quo = num / div;

           int rem = num % div ;

           System.out.println(quo);

           num = rem;

           div = div / 10;


       }
    }
}
