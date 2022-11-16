package practice04;

public class Q05_StringBuilderPalindrome {
    //Bir String degerin palindrome olup olmadigini kontrol eden bir kod yaziniz.
    public static void main(String[] args) {
//        String str = "nazan";
//        String strReverse = "";
//        for (int i= str.length()-1;i>-1;i--){
//
//            strReverse += str.charAt(i);
//
//        }
//        System.out.println(strReverse);
//
//        if(str.equalsIgnoreCase(strReverse)){
//            System.out.println("Palindrome");
//
//        }else
//            System.out.println("Palondrome Degil");

        String stb = "nazan";
        StringBuilder stb5= new StringBuilder(stb);
        stb5.reverse();
        String stbReverse = stb.toString();
        System.out.println(stb5);

        if (stb.equals(stbReverse)){
            System.out.println("Palindrome");
        }else
            System.out.println("Palindrom Degil");


    }
}
