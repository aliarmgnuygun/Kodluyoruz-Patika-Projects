package Loops.SwitchATM;

import java.util.Scanner;

public class AtmSwitch {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String password = "1234", name = "patika", userPass, userName;
        int rightOfEntry = 3, select;
        double balance = 1500;

        while (rightOfEntry > 0) {
            System.out.print("Please enter your username: ");
            userName = input.nextLine();
            System.out.print("Please enter your password: ");
            userPass = input.nextLine();

            if (userPass.equals(password) && userName.equals(name)) {
                System.out.println("Welcome ATM Program");

                do {
                    System.out.print("1. Bakiye Öğrenme" +
                            "\n2. Para Yatırma " +
                            "\n3. Para Çekme " +
                            "\n4. Çıkış");
                    System.out.print("\nPlease choice what you want: ");
                    select = input.nextInt();

                    switch (select) {
                        case 1:
                            System.out.println("Balance amount in your account: " + balance);
                            break;
                        case 2:
                            System.out.print("The amount you want to deposit into your account: ");
                            int price = input.nextInt();
                            balance += price;
                            System.out.println("New balance amount in your account: " + balance);
                            break;
                        case 3:
                            System.out.print("The amount you want to withdraw from your account: ");
                            int amount = input.nextInt();
                            if (amount > balance) {
                                System.out.println("There is not enough balance in your account! Your current balance: " + balance);
                            } else {
                                balance -= amount;
                                System.out.println("New balance amount in your account: " + balance);
                            }
                            break;
                        default:
                            if (select == 4) {
                                System.out.println("See you soon.");
                            } else {
                                System.out.println("You entered an invalid value!");
                            }
                    }
                } while (select != 4);
                break;
            } else {
                rightOfEntry--;
                if (rightOfEntry == 0) {
                    System.out.println("Your account has been blocked! Please contact your bank.");
                } else {
                    System.out.println("Invalid username or password! Please try again.");
                    System.out.println("Your right: " + rightOfEntry);
                }
            }
        }
    }
}
