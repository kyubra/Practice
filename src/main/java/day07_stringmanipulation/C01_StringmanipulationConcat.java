package day07_stringmanipulation;

import java.util.Scanner;

public class C01_StringmanipulationConcat {
      /*

    ONEMLI NOT=JAVA YUKARIDAN ASAGI ; SOLDAN SAGA CALISIR.

     */

    public static void main(String[] args) {


        System.out.println(15 + 20 + "Merhaba");
        System.out.println("Merhaba" + 15 + 20);
        System.out.println("Merhaba" + (15 + 20));
        System.out.println("Merhaba" + 15 * 20);

        //Kullanicidan ismini ve soyisimi girmesini isteyin, sonrasinda konsola kullanici nasil girerse girsin
        //tam isminin buyuk harfle yazilmasini saglayin.

        Scanner scan = new Scanner(System.in);
        System.out.println("isminizi ve soyisminizi giriniz");
        String isim = scan.nextLine() , soyIsim = scan.nextLine();
        String tamIsim = isim.concat(" " + soyIsim).toUpperCase();
        System.out.println(tamIsim);

    }
}
