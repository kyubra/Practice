package day04_ifStatement;

import java.util.Scanner;

public class C03_IfStatement {
    public static void main(String[] args) {
        //Kullanicidan bir gun alin
        // eger gun “Cuma” ise ekrana “Muslumanlar icin kutsal  gun” yazdirin.
        // “Cumartesi” ise ekrana “Yahudiler icin kutsal gun” yazdirin.
        // “Pazar”  ise ekrana “Hiristiyanlar icin kutsal gun” yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Gun ismini giriniz");
        String gun = scan.next();

        if(gun.equalsIgnoreCase("cuma")){
            System.out.println("muslumanlar icin kutsal gun");
        }else if (gun.equalsIgnoreCase("cumartesi")){
            System.out.println("yahudiler icin kutsal gun");
        }else if (gun.equalsIgnoreCase("pazar")){
            System.out.println("hiristiyanlar icin kutsal gun");
        }else{

           System.out.println("gecerli gun giriniz");


        }



    }
}
