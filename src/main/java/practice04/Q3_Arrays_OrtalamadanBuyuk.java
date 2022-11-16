package practice04;

public class Q3_Arrays_OrtalamadanBuyuk {
    public static void main(String[] args) {


        //Elemetlerin ortalamasından büyük elementleri yazdıran bir kod yazınız.
        int[] arr = {5, 9, 15, 1, 8, 11, 3,78,45,24};

        int toplam = 0;

        for (int w : arr) {
            toplam += w;
        }
        double ortalam = toplam/arr.length;
        System.out.println(ortalam);
        for(int w :arr){
            if (w>ortalam){
                System.out.print(w + " ");
            }

        }

    }
}