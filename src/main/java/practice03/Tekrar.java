package practice03;

public class Tekrar {
    public static void main(String[] args) {


    int arr3[][]={ {1,2}, {3,4,5}, {6} };
    int arr4[][]={ {7,8,9}, {10,11}, {12} };
    int sonuc  =0;
    int minUzunluk = Math.min(arr3.length,arr4.length);
        for (int i =0; i<minUzunluk;i++){
        for (int k =0;k<arr3[i].length;k++){
            if (k<arr4[i].length){
                sonuc = arr3[i][k]+arr4[i][k];
                System.out.println(" "+i+" .indeksi ile  "+k+ " indeksi toplami :" + sonuc);
            }
        }
    }
}
}
