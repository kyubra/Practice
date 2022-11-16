package practice05;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Q01_Ascii {
    //Kullanıcıdan aldığınız iki karakterin arasında bulunan tüm karakterleri yazdıran bir kod yazınız.

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Ilk karakteri giriniz...");

        char char1 = input.next().charAt(0);
        System.out.println("Ikinci karakteri giriniz...");
        char char2 = input.next().charAt(0);

        int ilk = Math.min(char1, char2);
        int ikinci = Math.max(char1, char2);


        for(int i = ilk+1; i<ikinci; i++){
            System.out.print((char)i + " ");

        }



    }
}
