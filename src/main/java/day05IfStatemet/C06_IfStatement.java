package day05IfStatemet;

import java.util.Scanner;

public class C06_IfStatement {
   // Kullanıcıdan 4 basamakli bir sayi girmesini isteyin.
// Girdiği sayi 5’e  bölünüyorsa son rakamını kontrol edin.
// Son rakamı 0 ise ekrana "5’e bölünen çift sayı" yazdırın.
// Son rakamı 0 değil ise "5’e bölünen tek sayı" yazdırın.
// Girdiği password 5’e bölünmüyorsa ekrana "Tekrar deneyin" yazdırın.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("4 basamakli sayi giriniz");
        int sayi = scan.nextInt();

        if(sayi<1000 || sayi>9999){
            System.out.println("4 basamakli sayi griniz");
        }else if (sayi%5==0){
            if(sayi%10==0){
                System.out.println("5e bolunebilen cift sayi");
            }else{
                System.out.println("5e bolunen tek sayi");
            }
        }else{
            System.out.println("tekrar deneyin");
        }
    }
}
