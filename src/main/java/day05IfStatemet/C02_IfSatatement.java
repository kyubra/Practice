package day05IfStatemet;

import java.util.Scanner;

public class C02_IfSatatement {
    public static void main(String[] args) {
        // Kullanicidan yasini isteyin// 65 veya daha buyukse emekli olabilirsin
       // 65'den kucukse emekli olamazsin "? sene daha calisman lazim" yazdirin

        Scanner input = new Scanner(System.in);
        System.out.println("yasinizi giriniz");
        int yas = input.nextInt();

        if(yas>=65){
            System.out.println("emekli olabilsin");
        }else{
            System.out.print("emekli olamazsin = ");
            System.out.println(65-yas + "sene daha calismalisn");



        }
    }
}
