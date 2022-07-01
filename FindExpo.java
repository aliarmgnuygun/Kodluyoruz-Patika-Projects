package Loops.Exponential;

import java.util.Scanner;

public class FindExpo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1,n2,i =1,result = 1;

        System.out.print("Which number do you want to calculate the power of?: ");
        n1 = input.nextInt();
        System.out.print("What power do you want to calculate?: ");
        n2 = input.nextInt();

        // result = Math.pow(n1,n2);
        
        /*while (i <= n2){
            result *= n1;
            i++;
        }
        System.out.println("Result is: " + result);*/

        for (i = 1; i <= n2; i++){
            result *=n1;
        }
        System.out.println("Result is: " + result);

    }
}
