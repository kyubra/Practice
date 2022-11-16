package practice04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q2_List_EkleCkar {
     /*
Kullanıcdan aldığınız bir sayıyı bir list'e ekleyen,
list'ten çıkaran yada mevcut bir elementi o sayı ile güncelleyen bir kod yazınız.
 */
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         List<Integer> list = new ArrayList<Integer>();

         while (true){
             System.out.println("Ekleme yapmak icin 'add' \n"+
                     "Guncelmme yapmak icin 'update' \n"+
                     "Silmek icin 'delete'\n"+
                     "Cikmak icin 'QUIT' komutunu giriniz");

             String option = input.next();

             if(option.equalsIgnoreCase("add")){
                 System.out.println("Ekleme yapmak istediginiz sayiyi giriniz");
                 int eklenenSayi = input.nextInt();
                 list.add(eklenenSayi);
             }else if (option.equalsIgnoreCase("update")) {
                 System.out.println("Update etmek istediginiz sayiyi giriniz");
                 int updateEdilicekSayi = input.nextInt();
                 System.out.println("Girmek istediginiz yeni sayiyi giriniz");
                 int yeniSayi = input.nextInt();
                 list.set(list.indexOf(updateEdilicekSayi), yeniSayi);
             }else if (option.equalsIgnoreCase("delete")){
                     System.out.println("Silmek istedginiz sayiyi giriniz");
                     int deleteEdilicekSayi = input.nextInt();
                     list.remove((Integer) deleteEdilicekSayi);//deleteEdiliecekssayi 'yi burda Object'e degistirdik.
                 }else if (option.equalsIgnoreCase("quit")){
                 break;
             }else {
                 System.out.println("Gecerli bir komut giriniz");
             }
             System.out.println(list);
             }
         System.out.println("Bye-bye!");

         }

     }

