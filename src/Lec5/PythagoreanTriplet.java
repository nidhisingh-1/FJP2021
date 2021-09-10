package Lec5;

import java.util.Scanner;

public class PythagoreanTriplet {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();

//        int max = a ;
//
//        if(b >= max){
//            b = max;
//
//            System.out.println(max * max == (a * a) + (c * c));
//        }
//
//        else if(c >= max){
//            c = max;
//
//            System.out.println(max * max == (a * a) + (b * b));
//        }
//
//        else {
//            System.out.println(max * max == (b * b) + (c * c));
//        }

        System.out.println(((a * a) == (b * b) + (c * c)) || ((b * b) == (a * a) + (c * c)) || ((c * c) == (b * b) + (a * a)));
    }
}
