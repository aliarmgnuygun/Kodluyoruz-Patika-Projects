package Hypotenuse;

import java.util.Scanner;

public class CHypotenuse {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("\nWelcome to the program that calculates the hypotenuse of a triangle given its sides");
        System.out.print("Please enter one edge of the triangle: ");
        int edge1 = input.nextInt();
        System.out.print("Please enter another edge of the triangle: ");
        int edge2 = input.nextInt();

        double hypotenuse = Math.sqrt((edge1*edge1) + (edge2*edge2));
        System.out.println("\nThe hypotenuse of a triangle is: " + hypotenuse);

    }
}
