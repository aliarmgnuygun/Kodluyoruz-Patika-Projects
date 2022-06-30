package Leap;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
       /*Artık yıl, Miladî takvimde 365 yerine 366 günü olan yıl.
         Bu fazladan gün (artık gün), normalde 28 gün olan şubat ayına 29 Şubat’ın eklenmesi ile elde edilir.
       */


        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a year: ");
        int year = input.nextInt();

        if (((year % 4 == 0) && (year % 100!= 0)) || (year % 400 == 0)){
            System.out.println(year + " year is a leap year");
        } else
            System.out.println(year +" year is not a leap year");
    }
}
