package practice05;

public class Q03_Overloading {
    //Küp, kare prizma ve dikdörtgen prizmanın hacmini hesaplayan bir method oluşturunuz.
    // (Method overloading kullanınız)

    public static void main(String[] args) {

        Hacim hacim = new Hacim();
        int kare = hacim.hacimHesapla(5,6)+50;
        int dikdorgen=hacim.hacimHesapla(5,6,1);

        System.out.println(kare);//200
        System.out.println(dikdorgen);//30
        System.out.println(hacim.hacimHesapla(10));//1000
    }
}
