package day07_stringmanipulation;

import java.util.Scanner;

public class C09_StringManipulations {
    public static void main(String[] args) {
         /*
       Bir password'un gecerli olup olmadigini asagidaki kurallara gore kontrol eden kodu yaziniz.
                   i)En az 8 character icermeli
                   ii)Space characteri icermemeli
                   iii)Buyuk harf icermemeli
                   iv)Son characteri "." olmali

*/
        Scanner input = new Scanner(System.in);
        System.out.println("Sifre gir");

        String pwd = input.nextLine();
        if(pwd.length()>7){
            System.out.println("yanlis");






        }


    }
}
