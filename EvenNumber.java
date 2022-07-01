package Loops.FindEven;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number, k = 0, sum = 0, count = 0;
        number = input.nextInt();

        System.out.println("Even numbers: ");

        /*for (int i = 0; i <= number; i++) {
            if (i % 2 == 0) {
                System.out.print(i + ", ");
            }
        }
        System.out.println("\n*** while loops ***");

        while (k <= number) {
            if (k % 2 == 0) {
                System.out.print(k + ", ");
            }
            k++;
        }
*/
        System.out.println("\nNumbers divisible by 3 and 4");
        //this code calculates the average of numbers from 0 to the number entered, divisible by 3 and 4
        for (int i = 1; i <= number; i++) {
            if (i % 12 == 0) {
                sum += i;
                count++;
                System.out.print(i + ", ");
            }

        }
        System.out.println("\nMean: " + (sum / count ));
    }
}

