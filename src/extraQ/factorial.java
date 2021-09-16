package extraQ;

import java.util.Scanner;

public class factorial {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        long factorial = 1;

        for (int i = n ; i>= 1; i--){

            factorial = factorial * i;
        }

        System.out.println(factorial);
    }
}
