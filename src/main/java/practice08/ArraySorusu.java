package practice08;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.sort;

public class ArraySorusu {
    public static void main(String[] args) {
        //verilen bir tam syai dizisinin en buyuk ve en kucuk elemanlari arasindaki sayilarin
//toplamini bulunuz

//input={10,13,56,20,40,60,56,32}
//output=13+56+20+40

        int arr[] = {10, 13, 56, 20, 40, 60, 56, 32};

        Arrays.sort(arr);

        int [] brr = new int [arr.length];

        int idx = 0;
        for ( int w: arr){

            brr[idx]= arr[w];
            idx++;
            }

        }

//        int idx = 0;
//        for (int w : arr ){
//            brr[idx]=w;
//            idx++;

        }
        //System.out.println(Arrays.toString(brr));





