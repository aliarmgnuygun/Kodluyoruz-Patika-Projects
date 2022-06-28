package CCircle;

import java.util.Scanner;

public class CCircle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("***\tWelcome Program to Calculate Area and Perimeter of a Circle\t***");

        double perimeter, alphaArea;
        int alpha = 0, radius = 0;

        System.out.print("Please enter radius: ");
        radius = input.nextInt();
        System.out.print("Please enter alpha degree: ");
        alpha = input.nextInt();

        perimeter = 2 * (Math.PI) * radius;
        alphaArea = (Math.PI * radius * radius)*(alpha / 360);

        System.out.print("\nPerimeter of the circle: " + perimeter +
                "\nThe area of the circle given the alpha angle: " + alphaArea);
    }
}
