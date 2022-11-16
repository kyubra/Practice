package practice06;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Q05_Inheritance_HacimHesaplama {
    //Kare prizma, silindir ve koninin hacmini hesaplayan bir kod yazınız.(Inheritance kullanınız)
    public static void main(String[] args) {

        KarePrizma karePrizma = new KarePrizma();
        double karePrizmaHacmi = karePrizma.hacimHespla(5,6);
        System.out.println("karePrizmaHacmi = " + karePrizmaHacmi);

        Koni koni = new Koni();
        double koniHacmi = koni.hacimHespla(9,8);
        NumberFormat obj = new DecimalFormat("0.00");
        System.out.println("koni = " + obj.format(koniHacmi));

        Silindir silindir = new Silindir();
        double silindirHacmi = silindir.hacimHespla(5,8);
        System.out.println("silindir = " + obj.format(silindirHacmi));


    }




}
