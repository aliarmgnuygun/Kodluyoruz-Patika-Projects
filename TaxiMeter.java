package TaxiMeter;

import java.util.Scanner;

public class TaxiMeter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("***\t Welcome TaxiMeter Program\t***" +
                "\nTaxi opening fee is 10 TL." +
                "\nTaximeter spends 2.20 TL per kilometer."+
                "\nThe minimum amount to be paid is 20 TL. Even if the fee is less than 20 TL, 20 TL will be charged.");

        float perKm = 2.20f, km = 0, amount = 20, control = 0;
        int openingFee = 10, minPrice = 20;

        System.out.print("\nPlease write down how many kilometers you have traveled: ");
        km = input.nextFloat();

        // without if-else block
        amount = km*perKm + openingFee;
        control = (amount < 20) ? 20 : amount;

        System.out.println("Amount to be paid: " + control);

    }
}
