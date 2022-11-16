package day07_stringmanipulation;

public class C04_StringManipulationsStartWith {
    /**
     * startsWith()
     *  Metnin bas kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
     *
     * endsWith()
     * Metnin son kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
     */
    public static void main(String[] args) {


        String cumle = "Kazananlar hic hata yapmayanlar degil vazgecmeyenlerdir";

        System.out.println(cumle.startsWith("Ka"));
        System.out.println(cumle.endsWith("dir"));
    }

}
