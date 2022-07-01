package Loops.Armstrong3Digit;

import java.util.Scanner;

public class FindNDigitArms {
    public static void main(String[] args) {

        int low, high;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter lower range: ");
        low = input.nextInt();
        System.out.print("Enter upper range: ");
        high = input.nextInt();


        for(int number = low + 1; number < high; ++number) {
            int digits = 0,digitPow,digitValue;
            int result = 0;
            int originalNumber = number;

            // number of digits calculation
            while (originalNumber != 0) {
                originalNumber /= 10;
                ++digits;
            }

            originalNumber = number;

            // result contains sum of nth power of its digits
            while (originalNumber != 0) {
                digitValue = originalNumber % 10;
                digitPow = 1;
                for (int i = 0; i < digits; i++) {
                    digitPow *= digitValue;
                }
                result +=digitPow;
                originalNumber /= 10;
            }

            if (result == number) {
                System.out.print(number + " ");
            }
        }
    }
}

