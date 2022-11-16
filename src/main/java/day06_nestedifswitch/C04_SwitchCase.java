package day06_nestedifswitch;

import java.util.Scanner;

public class C04_SwitchCase {
    // Kullanıcının yasadıgı güne  göre;
// Kullanicinin verecegi gun kadar sonraki günun  hangi gün olduğunu yazdırınız.
// pazartesi hafta başlangıcı
//BulunanGun = (kacGunSonrasi + kacıncıGun) % 7;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Pazartesi : 1 \t Sali : 2 \t carsamba : 3 \t persembe : 4 \n" + "haftanin kacinci gununde oldugunuzu giriniz");
        int kacinci = scan.nextInt();
         if (kacinci<=0 || kacinci>7){
             System.out.println("hatali veri");
         }else{

             System.out.println("kac gun sonrsini bilmek istiyorsunuz");
             int sonrasi = scan.nextInt();
             int  bulunanGun= (kacinci + sonrasi)%7;

             switch (bulunanGun){
                 case 1 :
                     System.out.println(sonrasi + " gun sonra gunlerden pazartesi");
                     break;
                 case 2 :
                     System.out.println(sonrasi + "gun sonra gunlerden sali");
                     break;
                 case 3 :
                     System.out.println(sonrasi + " gun sonra gunlerden carsamba");
                     break;
                 case 4 :
                     System.out.println(sonrasi + "gun sonra gunlerden persembe");
                     break;
                     case 5 :
                     System.out.println(sonrasi + " gun sonra gunlerden cuma");
                     break;
                 case 6 :
                     System.out.println(sonrasi + "gun sonra gunlerden cumartesi");
                     break;
                 case 0 :
                     System.out.println(sonrasi + " gun sonra gunlerden pazar");
                     break;
                 default:
                     System.out.println("gecersiz veri");
             }

         }


    }
}
