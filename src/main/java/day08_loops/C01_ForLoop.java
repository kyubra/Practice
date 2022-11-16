package day08_loops;

import java.util.Scanner;

public class C01_ForLoop {
    public static void main(String[] args) {

     //Kullanicidan baslangic , bitis ve artis miktarini alarak
        // aradaki tum sayilari aralarina virgul koyarak yazdirin

        Scanner input = new Scanner(System.in);
        System.out.println("BASLANGIC , BITIS VE ARTIS MIKTARINI");
        int baslangic = input.nextInt();
        int bitis = input.nextInt();
        int artis= input.nextInt();


        for( int i = baslangic ; i<=bitis ; i=i+artis){
            if(i<bitis){
                System.out.print(i+",");

            }else System.out.println(i);

        }


    }
}
