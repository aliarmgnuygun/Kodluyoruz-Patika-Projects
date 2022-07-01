package Loops.Pyramid;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        int row;
        Scanner input = new Scanner(System.in);
        System.out.print("How many rows will the pyramid consist of: ");
        row = input.nextInt();
        String star = "*";

        /*for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }*/

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= (row - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print(star);
            }
            System.out.println();
        }
        for (int i = row-1; i >= 0; i--) {
            for (int space = row-i; space >= 1; space--) {
                System.out.print(" ");
            }

            for (int j = (2 * i)- 1 ; j >= 1 ; j--) {
                System.out.print(star);
            }
            System.out.println();
        }
    }
}
