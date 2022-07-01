package Loops.Combination;

import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        // A program that calculates combinations is written.

        Scanner input = new Scanner(System.in);
        int n, r, c, nFac = 1, rFac = 1, nRFac = 1;

        //Factorial for n
        System.out.print("Please enter \"n\": ");
        n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            nFac *= i;
        }

        //Factorial for r
        System.out.print("Please enter \"r\": ");
        r = input.nextInt();
        for (int i = 1; i <= r; i++) {
            rFac *= i;
        }

        //Factorial for n-r
        for (int i = 1; i <= n - r; i++) {
            nRFac *= i;
        }

        //formula
        c = (nFac) / (rFac * nRFac);

        System.out.println("Combination C(" + n + "," + r + "): " + c);
    }
}

