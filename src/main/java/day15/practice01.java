package day15;

import java.util.Arrays;

public class practice01 {
    public static void main(String[] args) {

        String str[] = {"Elli","Susan","Michael","George","Tom"};

        String name = "George";

        int counter = 0;

        for (String w : str){
            if (w == name) {
               counter++;
            }
        }
        if (counter>0){
            System.out.println(name + " "+ counter + " times exist in the array");
        }else {
            System.out.println(name + " does not exist in the array");
        }
// 2. way

        Arrays.sort(str);
      int idx = Arrays.binarySearch(str, "George");
        System.out.println(idx);
        int idxa = Arrays.binarySearch(str, "Sally");
        System.out.println(idxa);
    }
}
