package day06_nestedifswitch;

import java.util.Scanner;

public class C01_Ternary {
    public static void main(String[] args) {
        /*
TASK :
 Kullanıcıdan sifirdan buyuk pozitif bir tamsayı girmesini isteyin.
 Girilen pozitif tamsayı 3 basamaklı ise ekrana "3 Basamaklı" yazdırın.
 3 basamaklı degilse çift olup olmadigini kontrol edin.
 Çift ise "3 basamaklı olmayan çift sayı" yazdırın.
 Çift sayı degilse "3 basamaklı olmayan tek sayı yazdırın."
 */

        Scanner scan = new Scanner(System.in);
        System.out.println("0 dan buyuk bir tam sayi girin");
        int num = scan.nextInt();
//
//        String sonuc = (num > 0) ? (num>99 && num<1000) ? ("3 basamakli 0 dan buyuk sayi") :
//                (num%2==0) ? ("uc basamakli olmayan cift sayi") : ("uc basamakli olmayan tek sayi")  :
//                ("lutfen buyuk bir sayi giriniz");
//        System.out.println(sonuc);

        if (num > 0){
            if(num<1000 && num>99){
                System.out.println("uc basamkli sayi");
            }else if (num%2==0){
                System.out.println("uc basamakli olmayan  cift sayi");
            }else System.out.println("uc basamakli olmayan tek sayi");

        }else System.out.println("sifirdan buyuk sayi giriniz");
    }
}
