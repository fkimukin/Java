package day14;

import java.util.Arrays;

public class Arrays02 {


    public static void main(String[] args) {
        int[] arr= {0, 2, 3, 0, 12, 0};
        int[] brr= new int[arr.length];
        int a =0;
        for (int j : arr) {
            if (j != 0) {
                brr[a] = j;
                a++;
            }
        }
        System.out.println(Arrays.toString(brr));




    }
}
