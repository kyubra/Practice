package practice09.Q03_AbstactionAlanHesaplama;

public class Runner {
    //Dikdörtgen ve üçgenin alanlarını hesaplayan bir kod yazınız.(abstraction kullanın)


    public static void main(String[] args) {
        Ucgen ucgen = new Ucgen();
        System.out.println(ucgen.alanHesapla(4,2));
        //System.out.println(new Diktorgen().alanHesapla(5,4));
        Diktorgen diktorgen = new Diktorgen();
        System.out.println( diktorgen.alanHesapla(5,4));

    }
}
