package day17;

import java.util.Arrays;

public class FindEleInMiddle {

    public static void main(String[] args) {


        int[] arr1 = {12, 5, 8, 21, 13, 15};
        Arrays.sort(arr1);

        int middleIdx= arr1.length/2;
        if (arr1.length %2 !=0){
            System.out.println(middleIdx);
        }else {
            System.out.println(arr1[middleIdx] + arr1[middleIdx-1]/2);
        }
//        System.out.println(Arrays.toString(arr1));
//        System.out.println(middleIdx);





    }
}
