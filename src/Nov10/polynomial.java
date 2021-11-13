package Nov10;

import java.util.Scanner;

public class polynomial {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int x = scn.nextInt();
        int res = polysum(n,x);
        System.out.println(res);
    }

    private static int polysum(int n, int x) {

        int poly = 0;
        int pox = x;
        for(int i = n ; i >= 1 ; i--){
            poly += i*pox;
            pox *= x;
        }
        return poly;
    }
}
