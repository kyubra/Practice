package day03_ifStatement;

import java.sql.SQLOutput;

public class C02_AsciiDegerleri {
    public static void main(String[] args) {

        char harf= 'a';
        char harf1= 'A';

        System.out.println("harf>harf1 = " + (harf > harf1));//true karsilastirma islemlerinin sonucunu true-false olur.(boolean)

        //buyuk harflerin Ascii degerleri kucuk harflerin Ascii degerlerinden kucuktur.

        //herhangi bir char veriablenin ascii degerini bulun.

        char harf2= 'M';
        System.out.println(harf2 + 0);

        //1.yol
        char space = ' ';
        System.out.println("space in ascii deger " + (space + 0));// 0'in bir degeri yok 0la toplyrak degeri bulabiliriz]

        //2.yol
        int harf3='m';//charlarda java char karaktere int'da atayabiliriz.cunku char'in bir resim karakteri birde sayisal
                      //matematiksel degeri vardir. bu nedenle ASCII degerlerini hesaplayabiliriz.
        System.out.println("harf3 = " + harf3);

        //kiyaslaram

        byte b1 =12;
        byte b2 =-125;

        System.out.println("b1>b2 = " +(b1>b2));

        float f1 = 2.4567f;
        float f2 = 5.2345f;
        System.out.println("f1>f2 = " + (f1>f2));
        System.out.println("b1>f1 = "+ (b1>f1));

        long lng1= 8764567898765L;
        System.out.println("b1<lng1 = " + (b1<lng1));

        char ch = 'h';
        System.out.println("b1>ch = " + (b1>ch));

    }
}
