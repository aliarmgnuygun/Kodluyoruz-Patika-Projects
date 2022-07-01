package Loops.FindPower;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num;


        System.out.print("Please enter a number: ");
        num = input.nextInt();

        for (int i = 1; i <= num; i *= 2){
                System.out.print(i + " ");
        }
        System.out.println("");
        for (int i = 1; i <= num; i *= 4){
            System.out.print(i + " ");
        }
        System.out.println("");
        for (int i = 1; i <= num; i *= 5){
            System.out.print(i + " ");
        }
    }
}
