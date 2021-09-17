package Lec13;

import java.util.Scanner;

public class AnyBaseAddition {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int res = anyBaseAddition(b, n1, n2);
        System.out.println(res);
    }

    public static int anyBaseAddition(int b, int n1, int n2) {

        int carry = 0;
        int mul = 1;
        int ans = 0;

        while (n1 > 0 || n2 > 0 || carry > 0) {

            int rem1 = n1 % 10;
            int rem2 = n2 % 10;

            int temp = rem1 + rem2 + carry;

            int dig = temp % b;
            carry = temp / b;

            ans = ans + dig * mul;
            mul = mul * 10;

            n1 = n1 / 10;
            n2 = n2 / 10;
        }

        return ans;

    }


}
