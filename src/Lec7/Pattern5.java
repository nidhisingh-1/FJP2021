package Lec7;

import java.util.Scanner;

public class Pattern5 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int nst = 1;
        int nsp = n/2;

        for(int i = 1 ; i <= n ; i++){

            for(int j = 1 ; j <= nsp ; j++){
                System.out.print("\t");
            }

            for (int k = 1 ; k <= nst ; k++){
                System.out.print("\t*");
            }

            if(i <= n/2){
                nst = nst +2;
                nsp = nsp -1;
            }
            else {
                nst = nst -2;
                nsp = nsp + 1;
            }

            System.out.println();
        }
    }
}
