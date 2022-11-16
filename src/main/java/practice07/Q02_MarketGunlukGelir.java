package practice07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q02_MarketGunlukGelir {
    static List<String> gunler = new ArrayList<>(Arrays.asList("Pazartesi", "Sali", "Carsamba", "Persembe", "Cuma", "Cumartesi", "Pazar"));
    static List<Double> gunlukGelir = new ArrayList<>();
    static double toplamGelir = 0;


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int gun = 0;
        while (gun < 7) {
            System.out.println(gunler.get(gun) + "gelirini giriniz");
            double gununGleliri = input.nextDouble();
            gunlukGelir.add(gununGleliri);
            toplamGelir += gununGleliri;
            gun++;


        }
        System.out.println("Gunluk Gelir " + gunlukGelir);
        System.out.println("Ortalama Gelir" + toplamGelir);
        System.out.println("Gelir ortalamasi " + gelirOrtalamasi());
        System.out.println("Ortalama ustu Gunler " + ortalamaUstuGunler());
        System.out.println("Ortalama alti Gunler " + ortalamaAltiGunler());


    }

    static double gelirOrtalamasi() {
        return toplamGelir / gunler.size();
    }

    static String ortalamaUstuGunler() {
        String str = "";
        for (int i = 0; i < gunlukGelir.size(); i++) {
            if (gunlukGelir.get(i) > gelirOrtalamasi()) {
                str += gunler.get(i) + " ";


            }

        }
        return str;
    }

    static String ortalamaAltiGunler() {
        String str = "";
        for (int i = 0; i < gunlukGelir.size(); i++) {
            if (gunlukGelir.get(i) < gelirOrtalamasi()) {
                str += gunler.get(i) + " ";


            }

        }
        return str;
    }
}
