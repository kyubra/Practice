package day06_nestedifswitch;

import java.util.Scanner;

public class C03_SwitchCase {

    /* Hangi gun hangi dersin oldugunu gosteren bir program yaziniz

    Pazartesi ve Sali ise: Java

    Persembe ve Cuma ise: Selenyum

    Carsamba ve Cumartesi ise: SQL

    aksi halde: izin gunu=Day Off

     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("gun ismi giriiz");

        String gun = scan.next().toLowerCase();

        switch (gun) {
            case "pazartesi" :
            case "sali" :
                System.out.println("Java");
                break;
            case "persembe" :
            case "cuma" :
                System.out.println("Selenyum");
                break;
            case "carsamba" :
            case "cumartesi" :
                System.out.println("SQL");
                break;
            default:
                System.out.println("day off");

        }

    }
}
