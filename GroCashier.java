package Grocery;

import java.util.Scanner;

public class GroCashier {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome Grocery Cashier Program");

        float amount, pPear = 2.14f, pApple = 3.67f, pTomatoes = 1.11f, pBanana = 0.95f, pEggplant = 5.00f;
        int kgP, kgA, kgT, kgB, kgE;

        System.out.print("How many kilos of pears: ");
        kgP = input.nextInt();
        System.out.print("How many kilos of apples: ");
        kgA = input.nextInt();
        System.out.print("How many kilos of tomatoes: ");
        kgT = input.nextInt();
        System.out.print("How many kilos of bananas: ");
        kgB = input.nextInt();
        System.out.print("How many kilos of eggplants: ");
        kgE = input.nextInt();

        amount = (kgP*pPear) + (kgA*pApple) + (kgT*pTomatoes) + (kgB*pBanana) + (kgE*pEggplant);
        System.out.println("Amount to be paid: " + amount + " tl");


    }
}
