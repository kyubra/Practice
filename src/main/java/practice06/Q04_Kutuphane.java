package practice06;

public class Q04_Kutuphane {
    //Kütüphaneye eklemek istediğiniz kitapları, adı, yazar adı, sayfa sayısı, seri numarası ile yazdıran bir kod yazınız.

    public static void main(String[] args) {

        Kitap kitap1 = new Kitap("Harry Poter","j k rowling ",500);
        kitap1.kitapBilgileri();

        Kitap kitap2 = new Kitap ("1984","GeorgeOrwell", 353);
        kitap2.kitapBilgileri();
    }
}
