package day01_variables;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz");
        String isim = scan.nextLine();
        System.out.println(isim);

        System.out.println("Lutfen soyadinizi giriniz");
        String soyad= scan.nextLine();
        System.out.println(soyad);

        System.out.println("Lutfen memeleketinizi giriniz");
        String memleket= scan.nextLine();
        System.out.println(memleket);

        System.out.println("Lutfen konumunuzu giriniz");
        String konum = scan.nextLine();
        System.out.println(konum);

        System.out.println("Lutfen Yasinizi Giriniz");
        byte yas = scan.nextByte();
        System.out.println(yas);

        System.out.println("Lutfen boyunuzu giriniz");
        short boy = scan.nextShort();

        System.out.println("Lutfen javayi sevip sevmediginizi yaziniz");
        boolean seviyormu =scan.hasNextBoolean();


    }



}
