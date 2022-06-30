package Flight;

import java.util.Scanner;

public class TicketPrice {

    public static void main(String[] args) {
        int distance, age;
        float perKmPrice = 0.10f,totalAmount, normAmount,rate;
        String select, tripType = "1 => One Way, 2 => Round Trip";
        
        /*
        Values received from the user must be valid (distance and age are positive numbers, trip type is 1 or 2). 
        Otherwise, "You Have Entered Wrong Data!" A warning should be given.
        If the person is younger than 12 years old, 50% discount is applied on the ticket price.
        If the person is between the ages of 12-24, a 10% discount is applied on the ticket price.
        If the person is over 65 years old, a 30% discount is applied on the ticket price.
        If the person has chosen the "Journey Type" round trip, 20% discount is applied on the ticket price.
        */

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
