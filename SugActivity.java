package SugActivity;

import java.util.Scanner;

public class SugActivity {
    public static void main(String[] args) {
        int temperature;

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Suggestion Program for Events by Air Temperature ");
        System.out.print("Please enter the current air temperature: ");
        temperature = input.nextInt();

        if (temperature < 5){
            System.out.println("You can Ski");
        }
        if ((temperature < 15) && (temperature > 5)){
            System.out.println("You can go Cinema");
        }
        if ((temperature < 25) && (temperature > 10)){
            System.out.println("You can go Picnic");
        }
        if (temperature > 25){
            System.out.println("You can Swim");
        }

        input.close();
    }
}
