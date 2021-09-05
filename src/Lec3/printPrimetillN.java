package Lec3;

import java.util.Scanner;

public class printPrimetillN {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int low = scn.nextInt();
        int hi = scn.nextInt();

        for(int i = low ; i <= hi ; i++){

            int div = 2 ;

            boolean isPrime = true;

            while (div * div <= i){

                int rem = i % div ;

                if (rem == 0){

                    isPrime = false;
                    break;
                }

                div++;
            }

            if(isPrime){
                System.out.println(i);
            }
        }

    }}
