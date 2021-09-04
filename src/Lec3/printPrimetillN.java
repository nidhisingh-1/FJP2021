package Lec3;

import java.util.Scanner;

public class printPrimetillN {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int div = 2;

        for (int i = 1 ; i <= n ; i++){

            while ( div * div <= i){

                if(i % div != 0){

                    System.out.println(i);
                }

                div ++;
            }
        }
    }


}
