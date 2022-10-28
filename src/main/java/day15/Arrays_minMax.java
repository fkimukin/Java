package day15;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Arrays_minMax {
    public static void main(String[] args) {
//        int arr[]= {23,12,34,25,14,78};
//        Arrays.sort(arr);
//        int minValue= arr[0];
//        int maxValue = arr[arr.length-1];
//
//        System.out.println(minValue);
//        System.out.println(maxValue);


        Scanner input = new Scanner(System.in);
        System.out.println("enter the number of employees to store in the arry");
        int length = input.nextInt();
        String arrEmployee[] = new String[length];

        for (int counter = 0; length > counter; counter++) {
            System.out.println("enter " + (counter + 1) + ". employee name. press Q to quit");
            arrEmployee[counter] = input.next().toUpperCase();
            if (arrEmployee[counter].equals("Q")) {
                arrEmployee[counter] = "";
                break;
            }

        }
        System.out.println(Arrays.toString(arrEmployee));


    }
}
