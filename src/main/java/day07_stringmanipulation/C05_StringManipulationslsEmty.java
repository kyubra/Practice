package day07_stringmanipulation;

import java.util.Scanner;

public class C05_StringManipulationslsEmty {
    public static void main(String[] args) {
        String str1="Hi";
        System.out.println(str1.isEmpty());

        String str2 = "";
        System.out.println(str2.isEmpty());

        String str3 = " ";
        System.out.println(str3.isEmpty());

        // Kullanicidan alacaginiz bir stringde bosluk karakterinin olup olmadigini kontrol ediniz.

        Scanner scan = new Scanner(System.in);
        System.out.println("bir kelime giriniz");
        String str4 = scan.next();
         if (str4.isEmpty()){
             System.out.println("bosluk var");

         }else System.out.println("bosluk yok ");
    }
}
