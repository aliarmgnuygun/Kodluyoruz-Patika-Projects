package Loops.Series;

import java.util.Scanner;

public class HarmonicSe {
    public static void main(String[] args) {
        int num;
        double formula,sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        num = input.nextInt();

        for (int i = num; i > 0; i--) {
            // calculating harmonic values
            formula = (double) 1 / i;
            sum += formula;

            System.out.print(sum + ", ");
        }
        System.out.println("\nOutput of Harmonic Series : "+sum);
    }
}
