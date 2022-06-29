package Calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int n1,n2, select;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter first number: ");
        n1 = input.nextInt();
        System.out.print("Please enter second number: ");
        n2 = input.nextInt();

        System.out.print("1- Addition" +
                "\n2- Subtraction" +
                "\n3- Multiplication" +
                "\n4- Division" +
                "\nPlease select the action you want to take: ");

        select = input.nextInt();

        switch (select){
            case 1 :
                System.out.println("Result: " + (n1+n2));
                break;
            case 2 :
                System.out.println("Result: " + (n1-n2));
                break;
            case 3 :
                System.out.println("Result: " + (n1*n2));
                break;
            case 4 :
                System.out.println("Result: " + (n1/n2));
                break;
            default:
                System.out.println("Invalid value! Please select \"1,2,3,4\" ");
        }

    }
}
