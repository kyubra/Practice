package day04_ifStatement;

import java.util.Scanner;

public class C01_IfStatement {
    public static void main(String[] args) {
        /*
         * Kullanicidan Y/N ikilisinden birisini girdiginde girdigi degeri
         * ekrana yazdiran java kodunu yaziniz.
         *
         * INPUT  ==>  OUTPUT
         *  Y     ==>   YES ;
         *  N     ==>   NO
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Y ya da N giriniz");
         char harf = scan.next().charAt(0);
        if(harf=='Y' || harf =='y'){
            System.out.println("yes");
        }else if (harf=='N' || harf == 'n'){
            System.out.println("no");
        }else{
            System.out.println("y ve n harflerinden brini giriniz");
        }
    }
}
