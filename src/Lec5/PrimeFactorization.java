package Lec5;

import java.util.Scanner;

public class PrimeFactorization {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();

        for (int f = 2 ; f * f <= num; f++){ //f*f isliye coz number ke factors uske sqaure root tak miljate hain uske baad factors repeat hi hote
            while (num % f == 0){
                System.out.println(f);
                num = num/f;


            }

        }

        if (num > 1){
            System.out.println(num);
        }

    }
}
