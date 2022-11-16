package day04_ifStatement;

public class C02_IfStatement {
    public static void main(String[] args) {
        /*Ogrenci asagidaki gibi notlar aldiginda karsisindaki degerleri yazdiran bir kod yaziniz
        not hesaplayici
        90 ~100 => A  Cok Iyi
        80 ~ 89 => B  Iyi
        70 ~ 79 => C  Orta
        60 ~ 69 => D  Gecer
        0 ~ 59  => F  Zayif
         */

        byte note = 87;
         if(note>=90 && note<=100){
             System.out.println("A");
         }else if (note >= 80 && note <= 89){
             System.out.println("B");
         }else if (note >= 70 && note <= 79){
             System.out.println("C");
         }else if (note >= 60 && note <= 69){
             System.out.println("D");
         }else if (note >= 0 && note <= 59){
             System.out.println("E");
         }else{
             System.out.println("hicbiri");
         }



    }
}
