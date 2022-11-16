package practice09;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Q02_Map_UrunFiyatlariniTopla {
   // Bir map içerisinde verilen fiyatların toplamını bulan bir kod yazınız.(for each loop kullanınız)
   //Örn: {Kemer=19.99, Gömlek=29.99, Ayakkabı=89.99, Kazak=24.99, Kravat=19.99} ==> Toplam: 184.95
   public static void main(String[] args) {

      Map<String, Double> urunler = new HashMap<String, Double>();
      urunler.put("Kemer", 19.99);
      urunler.put("Gömlek", 29.99);
      urunler.put("Ayakkabı", 89.99);
      urunler.put("Kazak", 24.99);
      urunler.put("Kravat", 19.99);

      System.out.println(fiyatToplami(urunler));
      }




   public static double fiyatToplami(Map<String, Double> map) {
      System.out.println("Urunler ve fiyatlari :" + map);

      double toplam = 0;
      for (double w : map.values()) {
         toplam += w;
      }
      return toplam;
   }
}





