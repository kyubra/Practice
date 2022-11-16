package day05IfStatemet;

import java.util.Scanner;

public class C05_IfStatement {

//Kullanicidan iki sayi alin buyuk olmayan sayiyi yazdirin.
public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.println("lutfen iki sayi giriniz");

    double sayi1= scan.nextDouble();
    double sayi2 = scan.nextDouble();

    if (sayi1 < sayi2){
        System.out.println("buyuk olmayan sayi " +sayi1);
    }else if(sayi1>sayi2){
        System.out.println("buyuk olmayan sayi " + sayi2);
    }else System.out.println("sayilar bir birine esit");

    System.out.println(sayi1==sayi2 ? "sayilar esit" : sayi1>sayi2 ? sayi2 : sayi1);
}
}
