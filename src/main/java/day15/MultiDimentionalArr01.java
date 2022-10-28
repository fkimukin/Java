package day15;

import java.util.Arrays;

public class MultiDimentionalArr01 {
    public static void main(String[] args) {


        int arr[][]=new int[4][2];

arr[0][0]=1;
        arr[1][0]=1;
        arr[1][1]=1;
        arr[2][0]=1;
        arr[3][0]=1;
        arr[3][1]=1;

        System.out.println(Arrays.deepToString(arr));
        
        String[][] arr01= {{"Tom","Mia"},{"Betül","Ali"},{"Fatih","Emine"}};
        System.out.println(Arrays.deepToString(arr01));
        System.out.println(Arrays.toString(arr01[2]));
        System.out.println(arr01[2][0]);

        for (String[] w : arr01) {
            System.out.println(Arrays.toString(w));
        }
        
        
    }
}
