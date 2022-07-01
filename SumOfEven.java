package Loops.EvenNum;

import java.util.Scanner;

public class SumOfOdd {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num = 0, sum = 0;

        // Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden
        // ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazın

        do {
            if (num % 2 == 1) {
                break;

            } else {
                System.out.print("PLease enter a number: ");
                num = input.nextInt();

                if ((num % 2 == 0) && (num % 4 == 0)) {
                    sum += num;
                }
            }

        } while (num > 0);

        System.out.println("Sum of numbers: " + sum);



        /* A program that accepts input from the user until a negative value is entered with Java loops and prints it on the screen by adding odd numbers from the entered values.
        do {
            if (num < 0) {

            } else {
                System.out.print("PLease enter a number: ");
                num = input.nextInt();

                if (num % 2 == 1) {
                    sum += num;
                }
            }

        } while (num > 0);

        System.out.println("Sum of odd numbers: " + sum);
        */

    }
}
