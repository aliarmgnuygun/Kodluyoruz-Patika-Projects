package Flight;

import java.util.Scanner;

public class TicketPrice {

    public static void main(String[] args) {
        int distance, age;
        float perKmPrice = 0.10f,totalAmount, normAmount,rate;
        String select, tripType = "1 => One Way, 2 => Round Trip";

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Flight Ticket Price Calculation Program ");

        System.out.print("Please enter your flight distance (km): ");
        distance = input.nextInt();
        System.out.print("Please enter your age: ");
        age = input.nextInt();
        input.nextLine();
        System.out.print(tripType + "\nPlease select trip type: ");
        select = input.nextLine();

        normAmount = distance * perKmPrice;

        if (select.equals("1")) {
            if ((age > 0)) {
                if ((age < 12)) {
                    rate = 0.5f;
                    normAmount *= rate;
                    System.out.println("Your new ticket price with (0-12)Age Discount applied: " + normAmount + " tl");
                } else if (age >= 12 && age <= 24) {
                    rate = 0.9f;
                    normAmount *= rate;
                    System.out.println("Your ticket price with (12-24)Age Discount applied: " + normAmount + " tl");
                } else if (age > 65) {
                    rate = 0.7f;
                    normAmount *= rate;
                    System.out.println("Your ticket price with (65 < age )Age Discount applied: " + normAmount + " tl");
                } else {
                    System.out.println("Your ticket price: " + normAmount + " tl");
                }
            }else {
                System.out.println("Invalid age value! Please enter an age value greater than 0.");
            }
        } else if (select.equals("2")) {
            totalAmount = normAmount * 2;
            if ((age > 0)) {
                if ((age < 12)) {
                    rate = 0.5f * 0.8f;
                    totalAmount *= rate;
                    System.out.println("Your new ticket price with (0-12)Age Discount and Round trip Discount applied: " + totalAmount + " tl");
                } else if (age >= 12 && age <= 24) {
                    rate = 0.9f * 0.8f;
                    totalAmount *= rate;
                    System.out.println("Your ticket price with (12-24)Age Discount and Round trip Discount applied: " + totalAmount + " tl");
                } else if (age > 65) {
                    rate = 0.7f * 0.8f;
                    totalAmount *= rate;
                    System.out.println("Your ticket price with (65 < age )Age Discount and Round trip Discount applied: " + totalAmount + " tl");
                } else {
                    System.out.println("Your ticket price: " + (totalAmount) + " tl");
                }
            } else {
                System.out.println("Invalid age value! Please enter an age value greater than 0.");
            }
        }else{
            System.out.println("You entered an invalid or wrong value ");
        }
    }
}
