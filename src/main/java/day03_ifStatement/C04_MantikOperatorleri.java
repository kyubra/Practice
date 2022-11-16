package day03_ifStatement;

public class C04_MantikOperatorleri {

    public static void main(String[] args) {

        //&& ilk buldugu hata durur & tum satiri tarar. && daha hizli alisir.

        System.out.println(5+2==8);

        boolean sonuc1 = 5>4 && 7<9 && 6+3==9 && 5+2!=8;
        System.out.println("sonuc 1 = " + sonuc1);

        boolean sonuc2 = 5>4 && 7>9 && 6+3==9 && 5+2!=8;
        System.out.println("sonuc2 = " + sonuc2);

        int sayi1=15;

        //sayi1'un 10 ile 20 araliginda odugunu true diyerek dondurelim
        //10<sayi1<20 java uclu karsilastirma yapmaz
        //ikili karsilastirmalar yapip Mantiksal Operaroelerle birlestirmeliyiz

        System.out.println(10<sayi1 && sayi1<20);

        //sayi2 nin 10 ile 20 nin arasinda olmadigini ture diyerek donduren bir kod yazdiriniz.

        int sayi2=5;

        System.out.println(sayi2<10 || sayi2>20);

    }
}
