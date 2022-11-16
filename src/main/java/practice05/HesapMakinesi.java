package practice05;

public class HesapMakinesi {

    public void toplama(int... a) {
        int toplam = 0;

        for (int w : a) {
            toplam += w;
        }

        System.out.println("toplam = " + toplam);
    }

    public void cikarma(int a, int b) {
        System.out.println("fark= " + (a - b));
    }

    int carpim = 1;

    public void carpma(int... a) {
        for (int w : a) {
            carpim *= w;
        }
        System.out.println("Carpim = " + carpim);

    }

    public void bolme(double a, double b) {
        if (b == 0) {
            System.out.println("Bolen sayi 0 olamaz");
        } else {

            System.out.println("Bolum = " + a / b);


        }
    }
}
