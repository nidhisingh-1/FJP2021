package Lec7;

import java.util.Scanner;

public class Pattern4 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int nsp = 0;

        int nst = n;

        for(int i =1 ; i <= n; i++){


            for(int k = 1 ; k <= nsp ; k++){
                System.out.print("\t");
            }

            for(int j = 1; j <= nst ; j++){

                System.out.print("\t*");
            }


            System.out.println();
            nsp++;
            nst--;


        }
    }
}
