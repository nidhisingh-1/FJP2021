package extraQ;

import java.util.Scanner;

public class Mpattern {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {

                if (j == 1 || j == n || (i + j == n + 1 && i <= n / 2 + 1) || (i == j && i <= n / 2 + 1)) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }

            System.out.println();
        }
    }
}
