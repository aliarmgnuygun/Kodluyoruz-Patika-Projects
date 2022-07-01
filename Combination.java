package Loops.Combination;

import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, r, c, nFac = 1, rFac = 1, nRFac = 1;

            System.out.print("Please enter \"n\": ");
            n = input.nextInt();
            for (int i = 1; i <= n; i++) {
                nFac *= i;
            }

            System.out.print("Please enter \"r\": ");
            r = input.nextInt();
            for (int i = 1; i <= r; i++) {
                rFac *= i;
            }

            for (int i = 1; i <= n - r; i++) {
                nRFac *= i;
            }

            c = (nFac) / (rFac * nRFac);

            System.out.println("Combination C(" + n + "," + r + "): " + c);
    }
}

