package day07_stringmanipulation;

public class C08_StringManipulations {
    public static void main(String[] args) {
        //Soru 1) Kullanicidan email adresini girmesini isteyin,
// mail @gmail.com icermiyorsa  "lutfen gmail adresi giriniz",
// @gmail.com ile bitiyorsa  "Email adresiniz kaydedildi " ,
// @gmail.com ile bitmiyorsa "lutfen yazimı kontrol edin" yazdırın

        String mail = "1234";
        String aranan = "@gmail.com";
        if(!mail.contains(aranan)){
            System.out.println("lutfen gmail adresi giriniz");

        }else if (mail.endsWith(aranan)){
            System.out.println("Email adresiniz kaydedildi");

        }else System.out.println("yazimi kontrol et");
    }
}
