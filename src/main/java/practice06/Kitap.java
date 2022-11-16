package practice06;

public class Kitap {

    String kitapAdi;
    String yazarAdi;
    int sayfaSayasi;
    String seriNo;
    static int kitapSayisi;

    public Kitap(String kitapAdi, String yazarAdi, int sayfaSayasi){
        this.kitapAdi = kitapAdi;
        this.yazarAdi = yazarAdi;
        this.sayfaSayasi = sayfaSayasi;

        kitapSayisi++;
        seriNo= yazarAdi.substring(0,2)+kitapAdi.substring(0,2)+kitapSayisi;
    }

    public void kitapBilgileri (){
        System.out.print("Kitap Adi: " + kitapAdi+ "\nYazar Adi:" +yazarAdi+ "\nSayfa Sayisi:"+sayfaSayasi+"\nSeri No:" +seriNo);

        System.out.print("===================");
    }

}
