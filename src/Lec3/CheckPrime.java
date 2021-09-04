package Lec3;

import java.util.Scanner;

public class CheckPrime {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int t = scn.nextInt();

        for (int i = 0; i < t; i++) {

            int x = scn.nextInt();

            boolean isPrime = true;
            int div = 2;

            while (div * div <= x) {
                int rem = x % div;

                if(rem == 0){
                    isPrime = false;

                    break;
                }

                div++;

            }

            if(isPrime){
                System.out.println(x + " is prime");
            }

            else {

                System.out.println(x + " is not prime");
            }
        }
    }
}
