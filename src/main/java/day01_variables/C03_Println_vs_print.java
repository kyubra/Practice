package day01_variables;

public class C03_Println_vs_print {

/*
konsolda
1
2
3
4
5
yazdiriniz
sonrasinda da  yanyana 12345 yazdiriniz
 */

    public static void main(String[] args) {
        System.out.println("*******ptintln******");
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");

        System.out.println("******print******");
        System.out.print("1");
        System.out.print("2");
        System.out.print("3");
        System.out.print("4");
        System.out.print("5");



        // int 3 variable olusturun ve toplamini yazdirin

        int a=2, b=3, c=4;

        System.out.println("a+b+b = "+ (a+b+c));
    }

}