package practice06;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi = input.nextInt();

        for (int i = 0; i < sayi; i++) {
            for (int j = 0; j < sayi; j++) {
                System.out.print((int) (Math.random() * 2) + " ");

            }
            System.out.println();

        }
    }
}
