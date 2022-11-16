package practice09;

public class Q02_Varargs_NotOrtalamasi {
    //4 öğrencinin not ortalamasını sırasıyla 6, 4, 3 ve 5 sınav olacak şekilde hesaplayan bir method yazınız.
    public static void main(String[] args) {
        ortalamaHesapla("ALi",96.9,96.7,96,100,100,96,95);
        ortalamaHesapla("Ayse",77,88,90,100,100);
        ortalamaHesapla("Fatma",10,5,67);
        ortalamaHesapla("Can",100,32,56,78,45);
    }

    public static void ortalamaHesapla(String isim ,double... not ){

        double sum = 0;
        for(double w:not){

            sum+=w;

        }
        System.out.println(isim +"'nin ortalamasi: " +String.format("%.2f",sum/ not.length));

    }
}
