package Horoscope;

import java.util.Scanner;

public class FindHoroscope {
    public static void main(String[] args) {
        String date;
        Scanner input = new Scanner(System.in);

        System.out.print("1. 21 Mart - 20 Nisan" +
                "\n2. 21 Nisan - 21 Mayıs" +
                "\n3. 22 Mayıs - 22 Haziran" +
                "\n4. 23 Haziran - 22 Temmuz" +
                "\n5. 23 Temmuz - 22 Ağustos" +
                "\n6. 23 Ağustos - 22 Eylül" +
                "\n7. 23 Eylül - 22 Ekim" +
                "\n8. 23 Ekim - 21 Kasım" +
                "\n9. 22 Kasım - 21 Aralık" +
                "\n10. 22 Aralık - 21 Ocak" +
                "\n11. 22 Ocak - 19 Şubat" +
                "\n12. 20 Şubat - 20 Mart" +
                "\nPlease select your date of birth range: ");
        date = input.nextLine();

        if (date.equals("1")){
            System.out.println("Your horoscope is: Koç");
        }else if (date.equals("2")){
            System.out.println("Your horosope is: Boğa");
        }else if (date.equals("3")){
            System.out.println("Your horosope is: İkizler");
        }else if (date.equals("4")){
            System.out.println("Your horosope is: Yengeç");
        }else if (date.equals("5")){
            System.out.println("Your horosope is: Aslan");
        }else if (date.equals("6")){
            System.out.println("Your horosope is: Başak");
        }else if (date.equals("7")){
            System.out.println("Your horosope is: Terazi");
        }else if (date.equals("8")){
            System.out.println("Your horosope is: Akrep");
        }else if (date.equals("9")){
            System.out.println("Your horosope is: Yay");
        }else if (date.equals("10")){
            System.out.println("Your horosope is: Oğlak");
        }else if (date.equals("11")){
            System.out.println("Your horosope is: Kova");
        }else if (date.equals("12")){
            System.out.println("Your horosope is: Balık");
        }else
            System.out.println("Invalid value!");
        input.close();
    }
}
