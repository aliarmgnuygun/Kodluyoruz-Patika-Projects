package Sorting;

import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {

        int n1,n2,n3;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter n1: ");
        n1 = input.nextInt();
        System.out.print("Please enter n2: ");
        n2 = input.nextInt();
        System.out.print("Please enter n3: ");
        n3 = input.nextInt();

        if ((n1 > n2) && (n1 > n3)){
            if (n2 > n3) {
                System.out.println("n1 > n2 > n3");
            }else {
                System.out.println("n1 > n3 > n2");
            }
        }else if ((n1 < n2) && (n3 < n2 )){
            if (n1 > n3) {
                System.out.println("n2 > n1 > n3");
            }else {
                System.out.println("n2 > n3 > n1");
            }
        }else {
            if (n2 > n1) {
                System.out.println("n3 > n2 > n1");
            }else
            System.out.println("n3 > n1 > n2");
        }
        input.close();
    }
}
