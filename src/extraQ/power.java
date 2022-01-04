package extraQ;

import java.util.Scanner;

public class power {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int x = scn.nextInt();
        int res = power(n,x);
        System.out.println(res);
    }

    public static int power(int x, int n){

        if(x == 0){
            return 1;
        }

        int pow = power(x, n-1);
        int ans = pow * x;

        return ans;
    }

}