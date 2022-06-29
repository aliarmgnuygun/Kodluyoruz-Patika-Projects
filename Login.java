package Login;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // default password
        String password = "12345", userPass, select, newPass = "";

        System.out.println("Welcome UserPasswordLogin Program");
        System.out.print("Please enter your password: ");
        userPass = input.nextLine();

        if (userPass.equals(password)){
            System.out.println("Welcome! ");
        }else{
            System.out.print("The password you entered is incorrect. Do you want to reset your password?" +
                    "\nyes or no : ");
            select = input.nextLine();

            switch (select){
                case "yes" :

                    System.out.print("Please enter new password: ");
                    newPass = input.nextLine();

                    if ((newPass != userPass) && (newPass != password)){
                        System.out.println("New password is created");
                        password = newPass;
                        System.out.println("New password is: " + password);
                    }else{
                        System.out.println("Could not create password, please enter another password!");
                    }
                    break;
                case "no" :
                    System.out.println("Please re-enter password!");
                    break;

                default :
                    System.out.println("Please select \"yes or no\"");
            }
        }

    }
}
