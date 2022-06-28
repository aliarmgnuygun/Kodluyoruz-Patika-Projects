package Bmi;

import java.util.Scanner;

public class CalculateBMI {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome Program to Calculate BMI");

        float height, bmi;
        System.out.print("Please enter your weight: ");
        int weight = input.nextInt();
        System.out.print("Please enter your height (meter like 1.72): ");
        height = input.nextFloat();

        bmi = weight / (height*height);
        System.out.println("Your BMI is: " + bmi);

    }
}
