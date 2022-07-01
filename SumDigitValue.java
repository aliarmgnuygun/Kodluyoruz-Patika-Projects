package Loops.SumDigitValue;

import java.util.Scanner;

public class SumDigitValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, digitValue = 0, digit = 0,digitPow, sum = 0, originalNum;
        System.out.print("Please enter a number: ");
        num = input.nextInt();
        originalNum = num;

        while (originalNum != 0) {
            originalNum /= 10;
            digit++;
        }

        originalNum = num;
        while (originalNum!= 0) {
            for (int i =0; i < digit;i++ ){
                digitValue = originalNum % 10;
            }
            sum += digitValue;
            originalNum/= 10;
        }
        System.out.println("Sum of place values of "+ num + ": " +sum);
    }
}
