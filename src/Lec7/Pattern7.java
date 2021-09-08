package Lec7;

import java.util.Scanner;

public class Pattern7 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int nsp = 0;

        for(int i = 1 ; i <= n ; i++) {

            for(int j = 0 ; j<=nsp ; j++){

                System.out.print(" ");


            }

            System.out.println("*");

            nsp++;

        }




    }
}
