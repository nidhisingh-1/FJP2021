package extraQ;

import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int temp = n;

        boolean isArmStrong = true;

        int ans = 0 ;

        while (temp != 0){

            int rem = temp % 10;

            ans = ans + (int)Math.pow(rem,3);

            temp = temp/10;

        }

        if(ans != n)
            isArmStrong = false;
            System.out.println(isArmStrong);

    }
}
