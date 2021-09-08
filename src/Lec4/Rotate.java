package Lec4;

import java.util.Scanner;

public class Rotate {

    // num = 562984 k = 3 rr = 984562

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();
        int k = scn.nextInt();

        int count = 0;
        int temp = num;

        while(temp != 0){
            temp = temp /10;
            count ++;
        }

        k = k%count;

        if(k<1){

            k = k + count;
        }


        int rr = 0;
        while (k > 0){
            int rem = num % 10;
            int quo = num / 10 ;
            rr = rem * (int) Math.pow(10, count-1) + quo;
            num = rr;
            k--;
        }
        System.out.println(rr);
    }
}
