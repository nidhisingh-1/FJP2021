package Lec11Test.Sir;

import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		printPattern(n);
	}

	public static void printPattern(int n) {
		// For Odd
		if (n % 2 != 0) {
			int k = 0;
			for (int i = 1; i <= n; i++) {
				int startingValue = n * k + 1;
				if (i == 1 || i == n) {
					for (int j = 1; j <= n; j++) {

						System.out.print(startingValue + " ");
						startingValue++;
					}
				} else {
					for (int j = 1; j <= n; j++) {
						if (j == 1 || j == n)
							System.out.print(startingValue + " ");
						else
							System.out.print("* ");
						startingValue++;
					}
				}

				if (i <= (n / 2)) {
					k = k + 2;
				} else if (i == ((n / 2) + 1)) {
					k = k - 1;
				} else {
					k = k - 2;
				}
				System.out.println();

			}
		} else { // For even
			int k = 0;
			for (int i = 1; i <= n; i++) {
				int startingValue = n * k + 1;
				if (i == 1 || i == n) {
					for (int j = 1; j <= n; j++) {

						System.out.print(startingValue + " ");
						startingValue++;
					}
				} else {
					for (int j = 1; j <= n; j++) {
						if (j == 1 || j == n)
							System.out.print(startingValue + " ");
						else
							System.out.print("* ");
						startingValue++;
					}
				}

				if (i < (n / 2)) {
					k = k + 2;
				} else if (i == (n / 2)) {
					k = k + 1;
				} else {
					k = k - 2;
				}

				System.out.println();

			}

		}
	}

}
