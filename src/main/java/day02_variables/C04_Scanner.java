package day02_variables;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
//  Soru 1)   Kullanicinin  girdigi 4 basamakli sayinin ilk ve son rakaminin toplamini ekrana yazdiran programi yazdiriniz

//        Scanner scan = new Scanner(System.in);
//        System.out.println("4 basamakali sayi giriniz");
//
//        int sayi1 = scan.nextInt();
//
//        //bir sayiin birler basamagindaki rakami %10 ile hesaplatabilir.
//
//        int sonRakam = sayi1%10;
//        int ilkRakam = sayi1/1000;
//
//        System.out.println("ilk rakam + son rakam " + (sonRakam+ilkRakam));

// Soru 2) Kullanicidan uc basamakli bir sayi alin ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin

        Scanner input = new Scanner(System.in);
        System.out.println("uc basamakli sayi girniz");

        int sayi2 = input.nextInt();



        //** 1 l34 basamagindaki sayiyi bulmak icin

        int birler= sayi2%10;
        System.out.println("girdiginiz sayinin birler basamagi " + birler);

        int yeniSayi=sayi2/10;

        System.out.println("yeniSayi = "+ yeniSayi);



        //  Soru 3) Kullanicidan alacaginiz 5 basamakli sayinin ilk 2 ve son 2 basamagindaki rakamlarin toplamini bulunuz
        //         *   Ex :
        //         *   input  : 12345==>1+2+4+5=12
        //         *   output : 12

        //10 lar basamagi

        int onlar= (sayi2/10)%10;
        System.out.println("girdiginiz sayinin onlar basamagi " + onlar);

        int yuzler =(sayi2/10)/10%10;
        System.out.println("girdiginiz sayinin yzuler basamagi " + yuzler);

        //  Soru 3) Kullanicidan alacaginiz 5 basamakli sayinin ilk 2 ve son 2 basamagindaki
//  rakamlarin toplamini bulunuz
//         *   Ex :
//         *   input  : 12345==>1+2+4+5=12
//         *   output : 12

//        Scanner scan = new Scanner(System.in);
//        System.out.println("5 basamakli bir sayi giriniz");
//
//        int sayi3 = input.nextInt();
//
//        int birler1 = sayi3%10;
//        System.out.println("birler1 = " + birler1);
//        int onlar1 = (sayi3/10)%10;
//        System.out.println("onlar1 = " + onlar1);
//        int binler = (sayi3/1000)%10;
//        System.out.println("binler = " + binler);
//        int onBinler = (sayi3/10000)%10;
//        System.out.println("onBinler = " + onBinler);
//
//        int toplam = birler1 + onlar1 + binler + onBinler;
//        System.out.println("sayilarin toplami = " + toplam);



        Scanner input5 = new Scanner(System.in);
        System.out.println("5 bsamakli sayi giriniz");

        int num = input5.nextInt();
        int ikiRakam=num/1000;
        System.out.println("ikiRakam = " + ikiRakam);

        int ikiRakamToplam = (ikiRakam%10)+(ikiRakam/10);
        System.out.println("ikiRakamToplam = " + ikiRakamToplam);

        int sonIkiRakam = num%100;
        System.out.println("sonIkiRakam = " + sonIkiRakam);

        int sonIki = (sonIkiRakam%10)+(sonIkiRakam/10);
        System.out.println("son iki top = " + sonIki);

        int toplam = ikiRakamToplam + sonIki;
        System.out.println("toplam = " + toplam);







    }
}
