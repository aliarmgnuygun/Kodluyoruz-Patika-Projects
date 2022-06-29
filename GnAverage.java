package GAverage;

import java.util.Scanner;

public class GnAverage {
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

        float average, count = 0;

        if ((mathGrade >= 0) && (mathGrade <= 100)) {
            count  += mathGrade;
        } else {
            count += 0;
            System.out.println("Since your math grade is not between 0-100, it is not included in the average. ");
        }

        if ((pyhsicGrade >= 0) && (pyhsicGrade <= 100)) {
            count  += pyhsicGrade;
        } else {
            count += 0;
            System.out.println("Since your Pyhsic grade is not between 0-100, it is not included in the average. ");
        }

        if ((turkishGrade > 0) && (turkishGrade < 100)) {
            count += turkishGrade;
        } else {
            count += 0;
            System.out.println("Since your Turkish grade is not between 0-100, it is not included in the average. ");
        }

        if ((checimalGrade > 0) && (checimalGrade < 100)) {
            count += checimalGrade;
        } else {
            count += 0;
            System.out.println("Since your Checimal grade is not between 0-100, it is not included in the average. ");
        }

        if ((historyGrade > 0) && (historyGrade < 100)) {
            count += historyGrade;
        } else {
            count += 0;
            System.out.println("Since your History grade is not between 0-100, it is not included in the average. ");
        }
        if ((musicGrade > 0) && (musicGrade < 100)) {
            count += musicGrade;
        } else {
            count += 0;
            System.out.println("Since your Music grade is not between 0-100, it is not included in the average. ");
        }

        average = count /6;

        if (average >= 55 && average <=100 ){
            System.out.print("\nPassed the class!");
        }else{
            System.out.println("\nFailed the class!");
        }

        System.out.println("Grade average: " + average);

    }
}

