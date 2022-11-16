package day06_nestedifswitch;

import java.util.Scanner;

public class C02_Ternary {
    /*
Kullanicidan Final notunu 'A' ,'B' ,'C' seklinde  girmesini isteyiniz,
'A'  ->  "Cok Basarili"
'B'  ->  "Basarili"
'C'  ->  "Orta"    bu notlar disindakilere de
         Digerleri..
            yazdiriniz.Nested Ternary ile cozunuz
 */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("notunuzu giriniz");

        String finalNotu = input.next();

        String result = (finalNotu.equalsIgnoreCase("A"))  ? "cok basarili"  :
                        (finalNotu.equalsIgnoreCase("B"))  ? "basarili" :
                        (finalNotu.equalsIgnoreCase("C"))  ? "orta" :
                                "Digerleri";
        System.out.println(result);
    }
}
