package day15;

import java.util.Arrays;

public class MultiDimentionalArr03 {
    public static void main(String[] args) {

        String[][] arr01= {{"Mia","Betül","Ali"},{"Fatih","Emine"}};

        int sum = 0;
        for (String[] a : arr01){
            sum = sum + a.length;
        }
        String[] dimArrToArr = new String[sum];
        int counter = 0;
        for (String[] c : arr01){
            for (String d : c){
                dimArrToArr[counter]=d;
                counter++;
            }
        }
        System.out.println(Arrays.toString(dimArrToArr));

    }
}
