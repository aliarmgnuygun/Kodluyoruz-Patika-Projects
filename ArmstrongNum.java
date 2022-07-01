package Loops.Armstrong;

import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num, digitValue, digit = 0,digitPow, sum = 0;
        System.out.print("Please enter a number: ");
        num = input.nextInt();
        int tempNum = num;


        // finding number of digits
        while (tempNum != 0) {
            tempNum /= 10;
            digit++;
        }
        tempNum = num;


        while (tempNum != 0) {
            digitValue = tempNum % 10;
            digitPow = 1;
            for (int i = 0; i < digit; i++) {
                digitPow *= digitValue;
            }
            sum +=digitPow;
            tempNum /= 10;
        }

        if (sum == num) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }

    }
}
