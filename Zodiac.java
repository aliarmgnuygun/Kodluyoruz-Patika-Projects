package Chinese;

import java.util.Scanner;

public class Zodiac {
    public static void main(String[] args) {
        /*
        4000 bin yıldır kullanılan bir astroloji çeşididir.
        Çin astrolojisi ve insanları 12 değişik burç ve sembollerle tanımlar.
        Çin Zodyağı bu 12 burcun eşit aralıklarla(10 derece genişliğinde) sıralandığı bir hayvan halkasıdır ve yıldızlarla pek bir ilgisi yoktur.
        */

        Scanner input = new Scanner(System.in);
        int birthYear, calculation;
        String month;

        System.out.print("Please enter what year you were born: ");
        birthYear = input.nextInt();
        calculation = birthYear % 12;

        switch (calculation){
            case 0 :
                month = "Monkey";
                System.out.println("Your Chinese Zodiac Sign: " + month);
                break;
            case 1 :
                month = "Rooster";
                System.out.println("Your Chinese Zodiac Sign: " + month);
                break;
            case 2 :
                month = "Dog";
                System.out.println("Your Chinese Zodiac Sign: " + month);
                break;
            case 3 :
                month = "Pig";
                System.out.println("Your Chinese Zodiac Sign: " + month);
                break;
            case 4 :
                month = "Mice";
                System.out.println("Your Chinese Zodiac Sign: " + month);
                break;
            case 5 :
                month = "Ox";
                System.out.println("Your Chinese Zodiac Sign: " + month);
                break;
            case 6 :
                month = "Tiger";
                System.out.println("Your Chinese Zodiac Sign: " + month);
                break;
            case 7 :
                month = "Rabbit";
                System.out.println("Your Chinese Zodiac Sign: " + month);
                break;
            case 8 :
                month = "Dragon";
                System.out.println("Your Chinese Zodiac Sign: " + month);
                break;
            case 9 :
                month = "Snake";
                System.out.println("Your Chinese Zodiac Sign: " + month);
                break;
            case 10 :
                month = "Horse";
                System.out.println("Your Chinese Zodiac Sign: " + month);
                break;
            case 11 :
                month = "Sheep";
                System.out.println("Your Chinese Zodiac Sign: " + month);
                break;
        }
    }
}
