package day08_loops;

import java.util.Scanner;

public class C04_ForLoop {
    /*
EX :Kullanicidan bir kelime isteyiniz
 alinan kelimenin karakter dizisinin her harfi ve
 bu harfin karakter dizisi içindeki indexini birer satıra yazdirin

         ORNEK
  Bir kelime giriniz:istanbul

   Karakter        Index
     i              0
     s              1
     t              2
     a              3
     n              4
     b              5
     u              6
     l              7



 */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("kelime giriniz");
        String kelime = scan.nextLine();

        int index = 0;
        System.out.println("Karakter " + "\tIndex");
        for (int i = 0; i < kelime.length(); i++) {
            System.out.println();
            System.out.println(kelime.charAt(i)+"\t\t"+index);
            index++;
        }



    }
}
