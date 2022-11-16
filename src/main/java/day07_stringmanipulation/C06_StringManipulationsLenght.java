package day07_stringmanipulation;

import java.util.Scanner;

public class C06_StringManipulationsLenght {
    public static void main(String[] args) {
        /**
         * Length()
         * length() method'u girilen String'in uzunlugunu verir
         * butun karakterlerin adedi (bosluklar da birer karakterdir)
         */
        // Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("isim soyisim");
        String isim = scan.nextLine();
        String soyIsim = scan.nextLine();

        if(isim.length()>soyIsim.length()){
            System.out.println("ismi daha uzun ");

        }else System.out.println("soyisminiz uzun");

        // Kullanicidan 4 harfli bir kelime isteyin
// ve girilen kelimeyi tersten yazdirin

        System.out.println("4 harfli kelime giriniz");
        String kelime = scan.nextLine();
        System.out.println(kelime.length());
        if(kelime.length()==4){
            char bir = kelime.charAt(0);
            char iki = kelime.charAt(1);
            char uc = kelime.charAt(2);
            char dort = kelime.charAt(3);
            System.out.println("" + dort + uc + iki + bir);

        }else if (kelime.length()>4){
            System.out.println("4 harfli degil");
        }else if (kelime.length()<4) {
            System.out.println("kisa kelime");
        }


    }
}
