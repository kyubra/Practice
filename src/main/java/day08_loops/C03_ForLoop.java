package day08_loops;

import java.util.Scanner;

public class C03_ForLoop {

/*
  Kullanicidan bir cumle ve bir harf alin,
  Cumlede verilen harfin kac kere
  kullanildigini bulup, yazdirin

  ORNEK:

  INPUT : Cumle: Java ogrenmek cok guzel. ==> Harf :e

  OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
 */
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("cumle giriniz");
    String cumle = scan.nextLine().toLowerCase();

    System.out.println("Lutfen saydirmak istedginiz harfi giriniz");
    char harf = scan.next().charAt(0);

    int sum = 0;

    for(int i = 0; i < cumle.length(); i++) {
        if(cumle.charAt(i) == harf) {
            sum++;
        }
    }
    System.out.println("girdiginiz cumlede " + harf+ "  harfi " +sum + " tanedir");


}
}
