package day05IfStatemet;

import java.util.Scanner;

public class C01_IfStatement {
    public static void main(String[] args) {
        /*Soru 6) Kullanicidan iki sayi isteyin,
 sayilarin ikisi de pozitif ise "sayilarin toplamini "yazdirin,
 sayilarin ikisi de negative ise "sayilarin carpimini" yazdirin,
 sayilarin ikisi farkli isaretlere sahipse "farkli isaretlerde sayilarla islem yapamazsin" yazdirin,
 sayilardan sifira esit olan varsa "sifir carpmaya gore yutan elemandir" yazdirin.*/


        Scanner input = new Scanner(System.in);
        System.out.println("iki sayi giriniz");
        int a = input.nextInt();
        int b = input.nextInt();

        if (a > 0 && b > 0) {
            System.out.println(a + b);
        } else if (a < 0 && b < 0) {
            System.out.println(a * b);
        } else if (a < 0 && b > 0 || a > 0 && b < 0) {
            // a*b < 0
            System.out.println("farkli isaretler");
        } else if (a == 0 || b == 0) {
            System.out.println("sifir yutn elemen");

        }
    }
}
