package Exercises;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner grade = new Scanner(System.in);

        System.out.println("\tWelcome to Calculating Grade Average Program\t");
        System.out.print("Please enter Math Grade: ");
        int mathGrade = grade.nextInt();

        System.out.print("Please enter Pyhsic Grade: ");
        int pyhsicGrade = grade.nextInt();

        System.out.print("Please enter Turkish Grade: ");
        int turkishGrade = grade.nextInt();

        System.out.print("Please enter Checimal Grade: ");
        int checimalGrade = grade.nextInt();

        System.out.print("Please enter History Grade: ");
        int historyGrade = grade.nextInt();

        System.out.print("Please enter Music Grade: ");
        int musicGrade = grade.nextInt();;


        float average = (mathGrade + pyhsicGrade + checimalGrade + turkishGrade + historyGrade + musicGrade) / 6;

        if (average >= 60 ){
            System.out.print("\nPassed the class!\nGrade average: " + average);
        }else{
            System.out.println("\nFailed the class!");
        }

    }
}

