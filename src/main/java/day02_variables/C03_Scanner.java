package day02_variables;

import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {

//        Scanner scan = new Scanner(System.in);
//        System.out.println("Lutfen Isminizi Giriniz...");
//        String isim = scan.nextLine();
        //Soru 1 ) Kullanicidan yaricap isteyip cemberin cevresini ve dairenin alanini hesaplatan bir program yazdirin
//( CEMBERIN CEVRESI = 2*3.14*r  DAIRENIN ALANI = 3.14*r*r  )

//        Scanner input = new Scanner(System.in);
//        System.out.println("Cemberin yari capini giriniz");
//        double r = input.nextDouble();
//        System.out.println("cemberin cevresi = "+2*314*r/100);
//
//        System.out.println("cemberin alani = " + 3.14*r*r);

        //Soru 2 )  Kullanicidan bir dikdortgenin uzun ve kisa kenarlarini isteyip o dikdortgenin alan ve
// cevre hesabini yapan bir program yaziniz.


//        Scanner input2 = new Scanner(System.in);
//        System.out.println("diktorgenin kisa kenar uzunlugunu giriniz");
//        double kisaKenar= input2.nextDouble();
//
//        System.out.println("uzun kenar uzunlugu");
//        double uzunKenar = input2.nextDouble();
//
//        System.out.println("Diktorgenin alani = " + kisaKenar*uzunKenar);
//        System.out.println("diktorgenin cevresi = " + (2*kisaKenar+2*uzunKenar));

//Soru 3) Kenar uzunluklari kullanicidan alinana bir ucgenin cevresini hesaplayan bir program yaziniz.(byte kullanin)
// Ucgenin cevresi=a+b+c


//        Scanner scan2 = new Scanner(System.in);
//        System.out.println("ucegin kenar uzunluklarini giriniz...");
//        byte a= scan2.nextByte();
//        byte b = scan2.nextByte();
//        byte c= scan2.nextByte();
//         int cevre = a+b+c;
//        System.out.println("ucgenin cevresi = " + cevre);


        Scanner scan3 = new Scanner(System.in);
        System.out.println("bir harf giriniz");
        char harf = scan3.next().charAt(0);

        System.out.println("   "+ harf + "  " );
        System.out.println("  " + harf + " " + harf);
        System.out.println(" " + harf + " " + harf + " " + harf);





    }
}
