package CalculateKDV;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the KDV Calculation Program");
        System.out.print("Please enter price: ");
        int price = input.nextInt();

        float kdv1 = 1.18f, kdv2 = 1.08f, newPrice = 0;

        if (price > 1000){
            newPrice = price*kdv2;
            System.out.println("Price without KDV: " + price +
                    "\nPrice with KDV: " + newPrice +
                    "\nKDV amount: " + kdv2);


        }else if( 0 < price && price <= 1000){
            newPrice = price*kdv1;
            System.out.println("Price without KDV: " + price +
                    "\nPrice with KDV: " + newPrice +
                    "\nKDV amount: " + kdv1);

        }else
            System.out.println("Invalid value! Please enter a value greater than 0.");

    }
}
